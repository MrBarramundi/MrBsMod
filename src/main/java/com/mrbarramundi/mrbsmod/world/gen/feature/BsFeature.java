package com.mrbarramundi.mrbsmod.world.gen.feature;

import java.util.function.Function;

import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public abstract class BsFeature extends Feature 
{
	// I think this is how I can get different tree looks
	// Not using yet
	//public static final BsModFeature LEMON_TREE = register("lemon_tree", new TreeFeature(TreeFeatureConfig::func_227338_a_));
	

	public BsFeature(Function configFactoryIn) {
		super(configFactoryIn);
	}
	
}
