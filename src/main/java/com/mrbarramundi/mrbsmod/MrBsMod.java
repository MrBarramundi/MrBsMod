package com.mrbarramundi.mrbsmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mrbarramundi.mrbsmod.client.ClientHandler;
import com.mrbarramundi.mrbsmod.init.ItemInit;
import com.mrbarramundi.mrbsmod.world.gen.BsOreGen;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("mrbsmod")
@Mod.EventBusSubscriber(modid = MrBsMod.MOD_ID, bus = Bus.MOD)
public class MrBsMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mrbsmod";
    public static MrBsMod instance;

    
    public MrBsMod() 
    {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
    	modEventBus.addListener(this::doClientStuff);
        
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    
    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }

    
    private void doClientStuff(final FMLClientSetupEvent event) 
    {
    	//RenderTypeLookup.setRenderLayer(BlockInit.diamond_stonecutter, RenderType.getCutout());
    	ClientHandler.setup();
    }    
    
    
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) 
    {
        
    }
    
    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event)
    {
    	BsOreGen.generateOres();
    }
    
    // Mod item groups
    // Edible mod items
    public static class MrBsBRMItemFood extends ItemGroup
    {
    	public static final MrBsBRMItemFood instance = new MrBsBRMItemFood(ItemGroup.GROUPS.length, "BsFood");
    	private MrBsBRMItemFood(int index, String label)
    	{
    		super(index, label);
    	}
    	@Override
    	public ItemStack createIcon()
    	{
    		return new ItemStack(ItemInit.peeled_boiled_egg);
    	}	

        // Mod tool items
        public static class MrBsBRMItemTools extends ItemGroup
        {
        	public static final MrBsBRMItemTools instance = new MrBsBRMItemTools(ItemGroup.GROUPS.length, "BsTools");
        	private MrBsBRMItemTools(int index, String label)
        	{
        		super(index, label);
        	}
        	@Override
        	public ItemStack createIcon()
        	{
        		return new ItemStack(ItemInit.bardi_hoe);
        	}
        }
        // Mod resource items
        public static class MrBsBRMItemResources extends ItemGroup
        {
        	public static final MrBsBRMItemResources instance = new MrBsBRMItemResources(ItemGroup.GROUPS.length, "BsResources");
        	private MrBsBRMItemResources(int index, String label)
        	{
        		super(index, label);
        	}
        	@Override
        	public ItemStack createIcon()
        	{
        		return new ItemStack(ItemInit.bardi_ingot);
        	}
        }
        // Mod resource items
        public static class MrBsBRMItemMisc extends ItemGroup
        {
        	public static final MrBsBRMItemMisc instance = new MrBsBRMItemMisc(ItemGroup.GROUPS.length, "BsMisc");
        	private MrBsBRMItemMisc(int index, String label)
        	{
        		super(index, label);
        	}
        	@Override
        	public ItemStack createIcon()
        	{
        		return new ItemStack(ItemInit.cork);
        	}
        }
    }
}
