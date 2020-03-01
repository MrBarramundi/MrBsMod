package com.mrbarramundi.mrbsmod.world.gen;

import com.mrbarramundi.mrbsmod.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;



public class BsOreGen {	
	
	public static void generateOres()
	{
		generateBardiOre();
	}	
	
	// Generates a random number based on min max	
	private static int getRandomNumber(int min, int max) {
		
		int range = max - min + 1;
		
		int result = (int)(Math.random() * range) + min;
		
		System.out.println("Number Gen: " + result);		
		
		return result;
	}
	
	private static void generateBardiOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
			if (biome == Biomes.OCEAN || biome == Biomes.COLD_OCEAN || biome == Biomes.DEEP_COLD_OCEAN
				|| biome == Biomes.DEEP_FROZEN_OCEAN || biome == Biomes.DEEP_LUKEWARM_OCEAN
				|| biome == Biomes.DEEP_OCEAN || biome == Biomes.DEEP_WARM_OCEAN || biome == Biomes.FROZEN_OCEAN
				|| biome == Biomes.LUKEWARM_OCEAN || biome == Biomes.WARM_OCEAN)
			{
				ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(2, 0, 0, 200));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
					 .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
					 BlockInit.bardi_ore.getDefaultState(), getRandomNumber(5, 30))).withPlacement(customConfig));
			}
		}
	}	
}