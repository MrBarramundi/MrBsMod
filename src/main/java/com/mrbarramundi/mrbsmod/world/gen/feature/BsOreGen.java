package com.mrbarramundi.mrbsmod.world.gen.feature;

import com.mrbarramundi.mrbsmod.init.BlockInit;
import com.mrbarramundi.mrbsmod.util.GetRandom;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;


public class BsOreGen {
	
	public static void addBardiOre(Biome biome)
	{		
				ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(2, 0, 0, 200));
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
					 .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
					 BlockInit.bardi_ore.getDefaultState(), GetRandom.getInt(5, 30))).withPlacement(customConfig));
	}
}