package com.mrbarramundi.mrbsmod.world.gen;

import com.mrbarramundi.mrbsmod.util.GetRandom;
import com.mrbarramundi.mrbsmod.world.biome.BsBiomeFeatures;
import com.mrbarramundi.mrbsmod.world.gen.feature.BsOreGen;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.registries.ForgeRegistries;

public class BsWorldGen {
	
	public static void generateModStuff()
	{
		for(Biome biome : ForgeRegistries.BIOMES)
		{			
			//Every vanilla ocean
			if (biome == Biomes.OCEAN || biome == Biomes.COLD_OCEAN || biome == Biomes.DEEP_COLD_OCEAN
					|| biome == Biomes.DEEP_FROZEN_OCEAN || biome == Biomes.DEEP_LUKEWARM_OCEAN
					|| biome == Biomes.DEEP_OCEAN || biome == Biomes.DEEP_WARM_OCEAN || biome == Biomes.FROZEN_OCEAN
					|| biome == Biomes.LUKEWARM_OCEAN || biome == Biomes.WARM_OCEAN)
				{
					BsOreGen.addBardiOre(biome);
				}
			//Savana
			if (biome == Biomes.SAVANNA)
			{		
				
				BsBiomeFeatures.addLemonTrees(Biomes.SAVANNA);
				if (GetRandom.getInt(1, 4) == 1)
				{
					
				}
			}
		}
	}
}