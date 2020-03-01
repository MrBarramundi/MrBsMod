package com.mrbarramundi.mrbsmod.init;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

import com.mrbarramundi.mrbsmod.MrBsMod;
import com.mrbarramundi.mrbsmod.objects.items.crafting.DiamondBladedStonecuttingRecipe;

/**
 * Author: MrCrayfish
 */
@Mod.EventBusSubscriber(modid = MrBsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BsModRecipeSerializers
{
    @SuppressWarnings("rawtypes")
	private static final List<IRecipeSerializer> RECIPES = new ArrayList<>();

    public static final IRecipeSerializer<DiamondBladedStonecuttingRecipe> diamondbladedstonecutting = register(MrBsMod.MOD_ID + ":diamondbladedstonecutting", new DiamondBladedStonecuttingRecipe.Serializer<>(DiamondBladedStonecuttingRecipe::new));

    private static <T extends IRecipeSerializer<? extends IRecipe<?>>> T register(String name, T t)
    {
        t.setRegistryName(new ResourceLocation(name));
        RECIPES.add(t);
        return t;
    }

    @SubscribeEvent
    @SuppressWarnings("unused")
    public static void registerItems(final RegistryEvent.Register<IRecipeSerializer<?>> event)
    {
        IForgeRegistry<IRecipeSerializer<?>> registry = event.getRegistry();
        RECIPES.forEach(item -> event.getRegistry().register(item));
        RECIPES.clear();
    }
}
