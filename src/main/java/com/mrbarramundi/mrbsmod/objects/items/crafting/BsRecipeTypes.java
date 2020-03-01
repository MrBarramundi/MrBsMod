package com.mrbarramundi.mrbsmod.objects.items.crafting;

import com.mrbarramundi.mrbsmod.MrBsMod;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

/**
 * Author: MrCrayfish
 */
public class BsRecipeTypes
{
    public static final IRecipeType<DiamondBladedStonecuttingRecipe> diamondbladedstonecutting = register(new ResourceLocation(MrBsMod.MOD_ID, "diamondbladedstonecutting"));

    private static <T extends IRecipe<?>> net.minecraft.item.crafting.IRecipeType<T> register(final ResourceLocation resource)
    {
        return Registry.register(Registry.RECIPE_TYPE, resource, new IRecipeType<T>()
        {
            @Override
            public String toString()
            {
                return resource.toString();
            }
        });
    }
}
