package com.mrbarramundi.mrbsmod.objects.items.enums;

import java.util.function.Supplier;

import com.mrbarramundi.mrbsmod.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyValue;
import net.minecraft.block.Blocks;

public enum BsItemTier implements IItemTier 
{
	//Bardi
	Bardi(6, 2784, 9.0f, 4.9f, 13, () -> { return Ingredient.fromItems(ItemInit.bardi_ingot);}),
	
	
	// IH = Iron handle
	// Iron handles gives a + 20 to maxUses
	IHWood(0, 79, 2.0f, 0.0f, 15, () -> { return Ingredient.fromTag(ItemTags.PLANKS);}),
	IHStone(1, 151, 4.0f, 1.0f, 5, () -> { return Ingredient.fromItems(Blocks.COBBLESTONE);}),
	IHIron(2, 270, 6.0f, 2.0f, 14, () -> { return Ingredient.fromItems(Items.IRON_INGOT);}),
	IHDiamond(3, 1581, 8.0f, 3.0f, 10, () -> { return Ingredient.fromItems(Items.DIAMOND);}),
	IHGold(0, 52, 12.0f, 0.0f, 22, () -> { return Ingredient.fromItems(Items.GOLD_INGOT);}),
	IHBardi(4, 2804, 9.0f, 4.9f, 13, () -> { return Ingredient.fromItems(ItemInit.bardi_ingot);});

	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final LazyValue<Ingredient> repairMaterial;
	
	
	BsItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = new LazyValue<>(repairMaterial);
	}

	@Override
	public int getMaxUses() {		
		return this.maxUses;
	}

	@Override
	public float getEfficiency() {		
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() {		
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() {		
		return this.harvestLevel;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {		
		return this.repairMaterial.getValue();
	}

}
