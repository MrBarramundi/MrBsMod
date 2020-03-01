package com.mrbarramundi.mrbsmod.init;

import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

import com.mrbarramundi.mrbsmod.MrBsMod;
import com.mrbarramundi.mrbsmod.inventory.container.DiamondBladedStonecutterContainer;

/**
 * Author: MrCrayfish
 */
@Mod.EventBusSubscriber(modid = MrBsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BsModContainers
{
    private static final List<ContainerType<?>> CONTAINER_TYPES = new ArrayList<>();

    public static final ContainerType<DiamondBladedStonecutterContainer> diamondbladedstonecutting = register(MrBsMod.MOD_ID + ":diamondbladedstonecutting", DiamondBladedStonecutterContainer::new);

    private static <T extends Container> ContainerType<T> register(String key, ContainerType.IFactory<T> factory)
    {
        ContainerType<T> type = new ContainerType<>(factory);
        type.setRegistryName(key);
        CONTAINER_TYPES.add(type);
        return type;
    }

    @SubscribeEvent
    public static void registerTypes(final RegistryEvent.Register<ContainerType<?>> event)
    {
        IForgeRegistry<ContainerType<?>> registry = event.getRegistry();
        CONTAINER_TYPES.forEach(registry::register);
        CONTAINER_TYPES.clear();
    }
}
