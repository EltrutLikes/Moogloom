package com.catscythe.moogloom.core.registry;

import com.catscythe.moogloom.core.Moogloom;
import com.minecraftabnormals.abnormals_core.common.items.AbnormalsSpawnEggItem;
import com.minecraftabnormals.abnormals_core.core.util.registry.ItemSubRegistryHelper;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Moogloom.MOD_ID, bus = Bus.MOD)
public class MoogloomItems {

	public static final ItemSubRegistryHelper HELPER = Moogloom.REGISTRY_HELPER.getItemSubHelper();
	
	public static final RegistryObject<AbnormalsSpawnEggItem> MOOGLOOM_SPAWN_EGG = HELPER.createSpawnEggItem("moogloom", () -> MoogloomEntities.MOOGLOOM.get(), 0xFFFFFF, 0x000000);
	
}
