package com.mrbarramundi.mrbsmod.init;

import com.mrbarramundi.mrbsmod.MrBsMod;
import com.mrbarramundi.mrbsmod.objects.blocks.DiamondBladedStonecutterBlock;
import com.mrbarramundi.mrbsmod.objects.blocks.trees.LemonTree;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LogBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(MrBsMod.MOD_ID)
@Mod.EventBusSubscriber(modid = MrBsMod.MOD_ID, bus = Bus.MOD)
public class BlockInit 
{
	public static final Block example_block = null;
	public static final Block clean_salt_block = null;
	public static final Block dirty_salt_block = null;
	public static final Block salt_block = null;
	//Ore blocks
	public static final Block bardi_ore = null;
	//Tree related
		//Saplings
	public static final Block lemon_sapling = null;
		//Logs
	public static final Block lemon_log = null;
	//Decoration blocks
		//Slabs
	public static final Block white_concrete_slab = null;
	public static final Block orange_concrete_slab = null;
	public static final Block magenta_concrete_slab = null;
	public static final Block light_blue_concrete_slab = null;
	public static final Block yellow_concrete_slab = null;
	public static final Block lime_concrete_slab = null;
	public static final Block pink_concrete_slab = null;
	public static final Block gray_concrete_slab = null;
	public static final Block light_gray_concrete_slab = null;
	public static final Block cyan_concrete_slab = null;
	public static final Block purple_concrete_slab = null;
	public static final Block blue_concrete_slab = null;
	public static final Block brown_concrete_slab = null;
	public static final Block green_concrete_slab = null;
	public static final Block red_concrete_slab = null;
	public static final Block black_concrete_slab = null;
	public static final Block iron_slab = null;
	public static final Block gold_slab = null;
	public static final Block obsidian_slab = null;
		//Walls
	public static final Block white_concrete_wall = null;
	public static final Block orange_concrete_wall = null;
	public static final Block magenta_concrete_wall = null;
	public static final Block light_blue_concrete_wall = null;
	public static final Block yellow_concrete_wall = null;
	public static final Block lime_concrete_wall = null;
	public static final Block pink_concrete_wall = null;
	public static final Block gray_concrete_wall = null;
	public static final Block light_gray_concrete_wall = null;
	public static final Block cyan_concrete_wall = null;
	public static final Block purple_concrete_wall = null;
	public static final Block blue_concrete_wall = null;
	public static final Block brown_concrete_wall = null;
	public static final Block green_concrete_wall = null;
	public static final Block red_concrete_wall = null;
	public static final Block black_concrete_wall = null;
	public static final Block iron_wall = null;
	public static final Block gold_wall = null;
	public static final Block obsidian_wall = null;
	//Machine blocks
	public static final Block diamond_bladed_stonecutter = null;
	
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event)
	{
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(0.0f, 0.0f).sound(SoundType.SAND)).setRegistryName("example_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.0f, 4.5f).sound(SoundType.STONE)).setRegistryName("clean_salt_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2f, 5.5f).sound(SoundType.STONE)).setRegistryName("dirty_salt_block"));
		event.getRegistry().register(new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(3).harvestTool(ToolType.PICKAXE)).setRegistryName("bardi_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2f, 5.5f).sound(SoundType.STONE)).setRegistryName("salt_block")); 
		//Decoration blocks
			//Slabs
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.WHITE_CONCRETE)).setRegistryName("white_concrete_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.ORANGE_CONCRETE)).setRegistryName("orange_concrete_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.MAGENTA_CONCRETE)).setRegistryName("magenta_concrete_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.LIGHT_BLUE_CONCRETE)).setRegistryName("light_blue_concrete_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.YELLOW_CONCRETE)).setRegistryName("yellow_concrete_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.LIME_CONCRETE)).setRegistryName("lime_concrete_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.PINK_CONCRETE)).setRegistryName("pink_concrete_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.GRAY_CONCRETE)).setRegistryName("gray_concrete_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.LIGHT_GRAY_CONCRETE)).setRegistryName("light_gray_concrete_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.CYAN_CONCRETE)).setRegistryName("cyan_concrete_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.PURPLE_CONCRETE)).setRegistryName("purple_concrete_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.BLUE_CONCRETE)).setRegistryName("blue_concrete_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.BROWN_CONCRETE)).setRegistryName("brown_concrete_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.GREEN_CONCRETE)).setRegistryName("green_concrete_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.RED_CONCRETE)).setRegistryName("red_concrete_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.BLACK_CONCRETE)).setRegistryName("black_concrete_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.IRON_BLOCK)).setRegistryName("iron_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.GOLD_BLOCK)).setRegistryName("gold_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.OBSIDIAN)).setRegistryName("obsidian_slab"));
			//Walls
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.WHITE_CONCRETE)).setRegistryName("white_concrete_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.ORANGE_CONCRETE)).setRegistryName("orange_concrete_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.MAGENTA_CONCRETE)).setRegistryName("magenta_concrete_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.LIGHT_BLUE_CONCRETE)).setRegistryName("light_blue_concrete_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.YELLOW_CONCRETE)).setRegistryName("yellow_concrete_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.LIME_CONCRETE)).setRegistryName("lime_concrete_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.PINK_CONCRETE)).setRegistryName("pink_concrete_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.GRAY_CONCRETE)).setRegistryName("gray_concrete_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.LIGHT_GRAY_CONCRETE)).setRegistryName("light_gray_concrete_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.CYAN_CONCRETE)).setRegistryName("cyan_concrete_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.PURPLE_CONCRETE)).setRegistryName("purple_concrete_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.BLUE_CONCRETE)).setRegistryName("blue_concrete_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.BROWN_CONCRETE)).setRegistryName("brown_concrete_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.GREEN_CONCRETE)).setRegistryName("green_concrete_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.RED_CONCRETE)).setRegistryName("red_concrete_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.BLACK_CONCRETE)).setRegistryName("black_concrete_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.IRON_BLOCK)).setRegistryName("iron_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.GOLD_BLOCK)).setRegistryName("gold_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.OBSIDIAN)).setRegistryName("obsidian_wall"));
		//Machine blocks
		event.getRegistry().register(new DiamondBladedStonecutterBlock(Block.Properties.from(Blocks.STONECUTTER)).setRegistryName("diamond_bladed_stonecutter"));
		//Tree related
			//Saplings
		//event.getRegistry().register(new SaplingBlock(new LemonTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName("lemon_sapling"));
			//Logs
		event.getRegistry().register(new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0f).sound(SoundType.WOOD)).setRegistryName("lemon_log"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event)
	{		
		event.getRegistry().register(new BlockItem(example_block, new Item.Properties().maxStackSize(16)).setRegistryName("example_block"));		
		event.getRegistry().register(new BlockItem(clean_salt_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("clean_salt_block"));
		event.getRegistry().register(new BlockItem(dirty_salt_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("dirty_salt_block"));
		event.getRegistry().register(new BlockItem(bardi_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("bardi_ore"));
		event.getRegistry().register(new BlockItem(salt_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("salt_block"));
		
		//Decoration blocks
			//Slabs
		event.getRegistry().register(new BlockItem(white_concrete_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("white_concrete_slab"));		
		event.getRegistry().register(new BlockItem(orange_concrete_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("orange_concrete_slab"));		
		event.getRegistry().register(new BlockItem(magenta_concrete_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("magenta_concrete_slab"));		
		event.getRegistry().register(new BlockItem(light_blue_concrete_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("light_blue_concrete_slab"));		
		event.getRegistry().register(new BlockItem(yellow_concrete_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("yellow_concrete_slab"));		
		event.getRegistry().register(new BlockItem(lime_concrete_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("lime_concrete_slab"));		
		event.getRegistry().register(new BlockItem(pink_concrete_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("pink_concrete_slab"));		
		event.getRegistry().register(new BlockItem(gray_concrete_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("gray_concrete_slab"));		
		event.getRegistry().register(new BlockItem(light_gray_concrete_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("light_gray_concrete_slab"));		
		event.getRegistry().register(new BlockItem(cyan_concrete_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("cyan_concrete_slab"));		
		event.getRegistry().register(new BlockItem(purple_concrete_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("purple_concrete_slab"));		
		event.getRegistry().register(new BlockItem(blue_concrete_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("blue_concrete_slab"));		
		event.getRegistry().register(new BlockItem(brown_concrete_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("brown_concrete_slab"));		
		event.getRegistry().register(new BlockItem(green_concrete_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("green_concrete_slab"));		
		event.getRegistry().register(new BlockItem(red_concrete_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("red_concrete_slab"));		
		event.getRegistry().register(new BlockItem(black_concrete_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("black_concrete_slab"));
		event.getRegistry().register(new BlockItem(iron_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("iron_slab"));
		event.getRegistry().register(new BlockItem(gold_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("gold_slab"));
		event.getRegistry().register(new BlockItem(obsidian_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("obsidian_slab"));
			//Walls
		event.getRegistry().register(new BlockItem(white_concrete_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("white_concrete_wall"));
		event.getRegistry().register(new BlockItem(orange_concrete_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("orange_concrete_wall"));		
		event.getRegistry().register(new BlockItem(magenta_concrete_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("magenta_concrete_wall"));		
		event.getRegistry().register(new BlockItem(light_blue_concrete_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("light_blue_concrete_wall"));		
		event.getRegistry().register(new BlockItem(yellow_concrete_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("yellow_concrete_wall"));		
		event.getRegistry().register(new BlockItem(lime_concrete_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("lime_concrete_wall"));		
		event.getRegistry().register(new BlockItem(pink_concrete_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("pink_concrete_wall"));		
		event.getRegistry().register(new BlockItem(gray_concrete_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("gray_concrete_wall"));		
		event.getRegistry().register(new BlockItem(light_gray_concrete_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("light_gray_concrete_wall"));		
		event.getRegistry().register(new BlockItem(cyan_concrete_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("cyan_concrete_wall"));		
		event.getRegistry().register(new BlockItem(purple_concrete_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("purple_concrete_wall"));		
		event.getRegistry().register(new BlockItem(blue_concrete_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("blue_concrete_wall"));		
		event.getRegistry().register(new BlockItem(brown_concrete_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("brown_concrete_wall"));		
		event.getRegistry().register(new BlockItem(green_concrete_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("green_concrete_wall"));		
		event.getRegistry().register(new BlockItem(red_concrete_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("red_concrete_wall"));		
		event.getRegistry().register(new BlockItem(black_concrete_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("black_concrete_wall"));
		event.getRegistry().register(new BlockItem(iron_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("iron_wall"));
		event.getRegistry().register(new BlockItem(gold_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("gold_wall"));
		event.getRegistry().register(new BlockItem(obsidian_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("obsidian_wall"));
		//Machine blocks
		event.getRegistry().register(new BlockItem(diamond_bladed_stonecutter, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("diamond_bladed_stonecutter"));
		//Tree related
			//Saplings
		event.getRegistry().register(new BlockItem(lemon_sapling, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("lemon_sapling"));
			//Logs
		event.getRegistry().register(new BlockItem(lemon_log, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("lemon_log"));
	}
}
