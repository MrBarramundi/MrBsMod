package com.mrbarramundi.mrbsmod.inventory.container;

import com.google.common.collect.Lists;
import com.mrbarramundi.mrbsmod.init.BlockInit;
import com.mrbarramundi.mrbsmod.init.BsContainers;
import com.mrbarramundi.mrbsmod.objects.items.crafting.BsRecipeTypes;
import com.mrbarramundi.mrbsmod.objects.items.crafting.DiamondBladedStonecuttingRecipe;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftResultInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.IntReferenceHolder;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

/**
 * Author: MrCrayfish
 */
public class DiamondBladedStonecutterContainer extends Container
{
    private final IWorldPosCallable worldPosCallable;
    private final IntReferenceHolder selectedRecipe;
    private final World world;
    private List<DiamondBladedStonecuttingRecipe> recipes;
    private ItemStack itemStackInput;
    private long lastOnTake;
    private final Slot inputInventorySlot;
    private final Slot outputInventorySlot;
    private Runnable inventoryUpdateListener = () -> {};
    private final IInventory inputInventory;
    private final CraftResultInventory inventory;

    public DiamondBladedStonecutterContainer(int windowId, PlayerInventory playerInventory)
    {
        this(windowId, playerInventory, IWorldPosCallable.DUMMY);
    }

    public DiamondBladedStonecutterContainer(int windowId, PlayerInventory playerInventory, final IWorldPosCallable callable)
    {
        super(BsContainers.diamondbladedstonecutting , windowId);
        this.selectedRecipe = IntReferenceHolder.single();
        this.recipes = Lists.newArrayList();
        this.itemStackInput = ItemStack.EMPTY;
        this.inputInventory = new Inventory(1)
        {
            @Override
            public void markDirty()
            {
                super.markDirty();
                DiamondBladedStonecutterContainer.this.onCraftMatrixChanged(this);
                DiamondBladedStonecutterContainer.this.inventoryUpdateListener.run();
            }
        };
        this.inventory = new CraftResultInventory();
        this.worldPosCallable = callable;
        this.world = playerInventory.player.world;
        this.inputInventorySlot = this.addSlot(new Slot(this.inputInventory, 0, 20, 33));
        this.outputInventorySlot = this.addSlot(new Slot(this.inventory, 1, 143, 33)
        {
            @Override
            public boolean isItemValid(ItemStack stack)
            {
                return false;
            }

            @Override
            public ItemStack onTake(PlayerEntity playerEntity, ItemStack stack)
            {
                ItemStack slotStack = DiamondBladedStonecutterContainer.this.inputInventorySlot.decrStackSize(1);
                if(!slotStack.isEmpty())
                {
                    DiamondBladedStonecutterContainer.this.updateRecipeResultSlot();
                }

                stack.getItem().onCreated(stack, playerEntity.world, playerEntity);
                callable.consume((world, pos) ->
                {
                    long gameTime = world.getGameTime();
                    if(DiamondBladedStonecutterContainer.this.lastOnTake != gameTime)
                    {
                        world.playSound(null, pos, SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundCategory.BLOCKS, 1.0F, 1.0F);
                        DiamondBladedStonecutterContainer.this.lastOnTake = gameTime;
                    }
                });
                return super.onTake(playerEntity, stack);
            }
        });

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for(int i = 0; i < 9; i++)
        {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }

        this.trackInt(this.selectedRecipe);
    }

    @OnlyIn(Dist.CLIENT)
    public int getSelectedRecipe()
    {
        return this.selectedRecipe.get();
    }

    @OnlyIn(Dist.CLIENT)
    public List<DiamondBladedStonecuttingRecipe> getRecipeList()
    {
        return this.recipes;
    }

    @OnlyIn(Dist.CLIENT)
    public int getRecipeListSize()
    {
        return this.recipes.size();
    }

    @OnlyIn(Dist.CLIENT)
    public boolean hasItemsInInputSlot()
    {
        return this.inputInventorySlot.getHasStack() && !this.recipes.isEmpty();
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerEntity)
    {
        return isWithinUsableDistance(this.worldPosCallable, playerEntity, BlockInit.diamond_bladed_stonecutter);
    }

    @Override
    public boolean enchantItem(PlayerEntity playerEntity, int index)
    {
        if(index >= 0 && index < this.recipes.size())
        {
            this.selectedRecipe.set(index);
            this.updateRecipeResultSlot();
        }
        return true;
    }

    @Override
    public void onCraftMatrixChanged(IInventory inventory)
    {
        ItemStack stack = this.inputInventorySlot.getStack();
        if(stack.getItem() != this.itemStackInput.getItem())
        {
            this.itemStackInput = stack.copy();
            this.updateAvailableRecipes(inventory, stack);
        }
    }

    private void updateAvailableRecipes(IInventory inventory, ItemStack stack)
    {
        this.recipes.clear();
        this.selectedRecipe.set(-1);
        this.outputInventorySlot.putStack(ItemStack.EMPTY);
        if(!stack.isEmpty())
        {
            this.recipes = this.world.getRecipeManager().getRecipes(BsRecipeTypes.diamondbladedstonecutting, inventory, this.world);
        }
    }

    private void updateRecipeResultSlot()
    {
        if(!this.recipes.isEmpty())
        {
            //TODO fix this
        	DiamondBladedStonecuttingRecipe recipe = this.recipes.get(this.selectedRecipe.get());
            this.outputInventorySlot.putStack(recipe.getCraftingResult(this.inputInventory));
        }
        else
        {
            this.outputInventorySlot.putStack(ItemStack.EMPTY);
        }
        this.detectAndSendChanges();
    }

    @OnlyIn(Dist.CLIENT)
    public void setInventoryUpdateListener(Runnable runnable)
    {
        this.inventoryUpdateListener = runnable;
    }

    public boolean canMergeSlot(ItemStack stack, Slot slot)
    {
        return slot.inventory != this.inventory && super.canMergeSlot(stack, slot);
    }

    public ItemStack transferStackInSlot(PlayerEntity playerEntity, int index)
    {
        ItemStack copyStack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);
        if(slot != null && slot.getHasStack())
        {
            ItemStack slotStack = slot.getStack();
            Item item = slotStack.getItem();
            copyStack = slotStack.copy();
            if(index == 1)
            {
                item.onCreated(slotStack, playerEntity.world, playerEntity);
                if(!this.mergeItemStack(slotStack, 2, 38, true))
                {
                    return ItemStack.EMPTY;
                }

                slot.onSlotChange(slotStack, copyStack);
            }
            else if(index == 0)
            {
                if(!this.mergeItemStack(slotStack, 2, 38, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if(this.world.getRecipeManager().getRecipe(BsRecipeTypes.diamondbladedstonecutting, new Inventory(new ItemStack[]{slotStack}), this.world).isPresent())
            {
                if(!this.mergeItemStack(slotStack, 0, 1, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if(index < 29)
            {
                if(!this.mergeItemStack(slotStack, 29, 38, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if(index < 38 && !this.mergeItemStack(slotStack, 2, 29, false))
            {
                return ItemStack.EMPTY;
            }

            if(slotStack.isEmpty())
            {
                slot.putStack(ItemStack.EMPTY);
            }

            slot.onSlotChanged();
            if(slotStack.getCount() == copyStack.getCount())
            {
                return ItemStack.EMPTY;
            }

            slot.onTake(playerEntity, slotStack);
            this.detectAndSendChanges();
        }

        return copyStack;
    }

    public void onContainerClosed(PlayerEntity playerEntity)
    {
        super.onContainerClosed(playerEntity);
        this.inventory.removeStackFromSlot(1);
        this.worldPosCallable.consume((world, pos) -> this.clearContainer(playerEntity, playerEntity.world, this.inputInventory));
    }
}
