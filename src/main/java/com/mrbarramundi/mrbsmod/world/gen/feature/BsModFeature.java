package com.mrbarramundi.mrbsmod.world.gen.feature;

import java.util.function.Function;

import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public abstract class BsModFeature extends Feature 
{
	//public static final BsModFeature LEMON_TREE = register("lemon_tree", new TreeFeature(TreeFeatureConfig::func_227338_a_));
	

	public BsModFeature(Function configFactoryIn) {
		super(configFactoryIn);
	}
	
}
