package com.mrbarramundi.mrbsmod.client;

import com.mrbarramundi.mrbsmod.client.gui.screen.inventory.DiamondBladedStonecutterScreen;
import com.mrbarramundi.mrbsmod.init.BlockInit;
import com.mrbarramundi.mrbsmod.init.BsModContainers;

import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

/**
 * Author: MrCrayfish
 */
public class ClientHandler
{
    public static void setup()
    {
        RenderTypeLookup.setRenderLayer(BlockInit.diamond_bladed_stonecutter, RenderType.getCutout());
        ScreenManager.registerFactory(BsModContainers.diamondbladedstonecutting, DiamondBladedStonecutterScreen::new);
    }
}