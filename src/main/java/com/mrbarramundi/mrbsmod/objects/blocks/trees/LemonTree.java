package com.mrbarramundi.mrbsmod.objects.blocks.trees;

import java.util.Random;

import com.mrbarramundi.mrbsmod.world.biome.BsBiomeFeatures;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class LemonTree extends Tree 
{

	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean p_225546_2_)
	{		
		return Feature.NORMAL_TREE.withConfiguration(p_225546_2_ ? BsBiomeFeatures.lemon_tree_config : BsBiomeFeatures.lemon_tree_config);
	}

}
