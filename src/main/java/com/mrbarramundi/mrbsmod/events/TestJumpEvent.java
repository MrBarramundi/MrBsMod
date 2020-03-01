package com.mrbarramundi.mrbsmod.events;

import com.mrbarramundi.mrbsmod.MrBsMod;
import com.mrbarramundi.mrbsmod.init.BlockInit;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = MrBsMod.MOD_ID, bus = Bus.FORGE, value = Dist.CLIENT)
public class TestJumpEvent 
{
	private static boolean Enabled = false;
	
	
	@SubscribeEvent
	public static void testJumpEvent(LivingJumpEvent event)
	{
		if (Enabled == true)
		{
			MrBsMod.LOGGER.info("testJumpEvent fired");
			LivingEntity livingEntity = event.getEntityLiving();
			World world = livingEntity.getEntityWorld();
			world.setBlockState(livingEntity.getPosition().add(0, 5, 0), BlockInit.example_block.getDefaultState());
			livingEntity.addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 600, 255));
			livingEntity.setGlowing(true);
		}		
	}
}
