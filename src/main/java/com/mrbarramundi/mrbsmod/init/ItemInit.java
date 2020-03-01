package com.mrbarramundi.mrbsmod.init;

import com.mrbarramundi.mrbsmod.MrBsMod;
import com.mrbarramundi.mrbsmod.objects.items.enums.BsItemTier;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = MrBsMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(MrBsMod.MOD_ID)
public class ItemInit 
{
	// Food items
	public static final Item boiled_egg = null;
	public static final Item peeled_boiled_egg = null;
	public static final Item lemon_bar = null;
	public static final Item bread_slice_with_honey = null;
	public static final Item toast = null;
	public static final Item bread_with_honey = null;
	public static final Item toast_with_honey = null;
	public static final Item bread_dough = null; //Add
	// Food related
	public static final Item bucket_one_egg = null;
	public static final Item bucket_one_boiled_egg = null;	
	public static final Item bucket_two_eggs = null;
	public static final Item bucket_two_boiled_eggs = null;
	public static final Item peeled_egg_shell = null;
	public static final Item wheat_flour = null; //Add
	// Tools
		//Custom materials
			//Bardi
	public static final Item bardi_sword = null;
	public static final Item bardi_pickaxe = null;	
	public static final Item bardi_axe = null;
	public static final Item bardi_shovel = null;
	public static final Item bardi_hoe = null;	
		//Iron handled items aka ih
			//Wooden
	public static final Item wooden_sword_ih = null;
	public static final Item wooden_pickaxe_ih = null;
	public static final Item wooden_axe_ih = null;
	public static final Item wooden_shovel_ih = null;
	public static final Item wooden_hoe_ih = null;
			//Golden
	public static final Item golden_sword_ih = null;
	public static final Item golden_pickaxe_ih = null;
	public static final Item golden_axe_ih = null;
	public static final Item golden_shovel_ih = null;
	public static final Item golden_hoe_ih = null;
			//Stone
	public static final Item stone_sword_ih = null;
	public static final Item stone_pickaxe_ih = null;
	public static final Item stone_axe_ih = null;
	public static final Item stone_shovel_ih = null;
	public static final Item stone_hoe_ih = null;
			//Iron
	public static final Item iron_sword_ih = null;
	public static final Item iron_pickaxe_ih = null;
	public static final Item iron_axe_ih = null;
	public static final Item iron_shovel_ih = null;
	public static final Item iron_hoe_ih = null;
			//Diamond
	public static final Item diamond_sword_ih = null;
	public static final Item diamond_pickaxe_ih = null;
	public static final Item diamond_axe_ih = null;
	public static final Item diamond_shovel_ih = null;
	public static final Item diamond_hoe_ih = null;
			//Bardi
	public static final Item bardi_sword_ih = null;
	public static final Item bardi_pickaxe_ih = null;
	public static final Item bardi_axe_ih = null;
	public static final Item bardi_shovel_ih = null;
	public static final Item bardi_hoe_ih = null;
	
	// Other
	public static final Item example_item = null;
	public static final Item cork = null;
	public static final Item special_item = null;
	public static final Item iron_bar = null;
	//Natural resources
	public static final Item clean_salt_chips = null;
	public static final Item dirty_salt_chips = null;
	//Resources
	public static final Item bardi_ingot = null;
	public static final Item bardi_nugget = null;
	public static final Item clean_salt_pile = null;
	
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		// Food items
		event.getRegistry().register(new Item(new Item.Properties().maxStackSize(16).group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(1.2f).effect(new EffectInstance(Effects.INSTANT_DAMAGE, 20, 0), 0.7f).build())).setRegistryName("boiled_egg"));		
		event.getRegistry().register(new Item(new Item.Properties().maxStackSize(16).group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(1.2f).meat().build())).setRegistryName("peeled_boiled_egg"));		
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(1.2f).build())).setRegistryName("lemon_bar"));		
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(1.2f).build())).setRegistryName("bread_slice"));		
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(1.2f).build())).setRegistryName("toast"));		
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(1.2f).build())).setRegistryName("bread_slice_with_honey"));		
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(1.2f).build())).setRegistryName("toast_with_honey"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(0.15f).build())).setRegistryName("bread_dough"));
		// Food related
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)).setRegistryName("bucket_one_egg"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)).setRegistryName("bucket_one_boiled_egg"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)).setRegistryName("bucket_two_eggs"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)).setRegistryName("bucket_two_boiled_eggs"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("peeled_egg_shell"));
		event.getRegistry().register(new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.MISC)).setRegistryName("wheat_flour"));
		// Tools
			//Bardi
		event.getRegistry().register(new SwordItem(BsItemTier.Bardi, 33, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("bardi_sword"));
		event.getRegistry().register(new PickaxeItem(BsItemTier.Bardi, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("bardi_pickaxe"));
		event.getRegistry().register(new ShovelItem(BsItemTier.Bardi, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("bardi_shovel"));
		event.getRegistry().register(new HoeItem(BsItemTier.Bardi, 7, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("bardi_hoe"));
		event.getRegistry().register(new AxeItem(BsItemTier.Bardi, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("bardi_axe"));
			//With Iron Handle
				//Wooden
		event.getRegistry().register(new SwordItem(BsItemTier.IHWood, 33, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("wooden_sword_ih"));
		event.getRegistry().register(new PickaxeItem(BsItemTier.IHWood, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("wooden_pickaxe_ih"));
		event.getRegistry().register(new ShovelItem(BsItemTier.IHWood, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("wooden_shovel_ih"));
		event.getRegistry().register(new HoeItem(BsItemTier.IHWood, 7, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("wooden_hoe_ih"));
		event.getRegistry().register(new AxeItem(BsItemTier.IHWood, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("wooden_axe_ih"));
				//Golden
		event.getRegistry().register(new SwordItem(BsItemTier.IHGold, 0, -0.0f, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("golden_sword_ih"));
		event.getRegistry().register(new PickaxeItem(BsItemTier.IHGold, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("golden_pickaxe_ih"));
		event.getRegistry().register(new ShovelItem(BsItemTier.IHGold, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("golden_shovel_ih"));
		event.getRegistry().register(new HoeItem(BsItemTier.IHGold, 7, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("golden_hoe_ih"));
		event.getRegistry().register(new AxeItem(BsItemTier.IHGold, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("golden_axe_ih"));
				//Stone
		event.getRegistry().register(new SwordItem(BsItemTier.IHStone, 33, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("stone_sword_ih"));
		event.getRegistry().register(new PickaxeItem(BsItemTier.IHStone, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("stone_pickaxe_ih"));
		event.getRegistry().register(new ShovelItem(BsItemTier.IHStone, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("stone_shovel_ih"));
		event.getRegistry().register(new HoeItem(BsItemTier.IHStone, 7, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("stone_hoe_ih"));
		event.getRegistry().register(new AxeItem(BsItemTier.IHStone, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("stone_axe_ih"));
				//Iron
		event.getRegistry().register(new SwordItem(BsItemTier.IHIron, 33, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("iron_sword_ih"));
		event.getRegistry().register(new PickaxeItem(BsItemTier.IHIron, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("iron_pickaxe_ih"));
		event.getRegistry().register(new ShovelItem(BsItemTier.IHIron, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("iron_shovel_ih"));
		event.getRegistry().register(new HoeItem(BsItemTier.IHIron, 7, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("iron_hoe_ih"));
		event.getRegistry().register(new AxeItem(BsItemTier.IHIron, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("iron_axe_ih"));
				//Diamond
		event.getRegistry().register(new SwordItem(BsItemTier.IHDiamond, 33, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("diamond_sword_ih"));
		event.getRegistry().register(new PickaxeItem(BsItemTier.IHDiamond, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("diamond_pickaxe_ih"));
		event.getRegistry().register(new ShovelItem(BsItemTier.IHDiamond, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("diamond_shovel_ih"));
		event.getRegistry().register(new HoeItem(BsItemTier.IHDiamond, 7, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("diamond_hoe_ih"));
		event.getRegistry().register(new AxeItem(BsItemTier.IHDiamond, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("diamond_axe_ih"));
				//Bardi
		event.getRegistry().register(new SwordItem(BsItemTier.IHBardi, 33, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("bardi_sword_ih"));
		event.getRegistry().register(new PickaxeItem(BsItemTier.IHBardi, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("bardi_pickaxe_ih"));
		event.getRegistry().register(new ShovelItem(BsItemTier.IHBardi, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("bardi_shovel_ih"));
		event.getRegistry().register(new HoeItem(BsItemTier.IHBardi, 7, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("bardi_hoe_ih"));
		event.getRegistry().register(new AxeItem(BsItemTier.IHBardi, 7, -2.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("bardi_axe_ih"));
		// Other
		event.getRegistry().register(new Item(new Item.Properties()).setRegistryName("example_item"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("iron_bar"));
		//event.getRegistry().register(new SpecialItem(new Item.Properties().group(ItemGroup.MISC)));
		//Natural resources
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("clean_salt_chips"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("dirty_salt_chips"));
		//Resources
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("bardi_ingot"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("bardi_nugget"));
		event.getRegistry().register(new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.MATERIALS)).setRegistryName("clean_salt_pile"));
		//Misc
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("cork"));
	}
}
