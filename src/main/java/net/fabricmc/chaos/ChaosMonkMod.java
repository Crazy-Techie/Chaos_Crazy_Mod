package net.fabricmc.chaos;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.chaos.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChaosMonkMod implements ModInitializer {

	public static final String MOD_ID = "chaos_monk_mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

		ModItems.registeredItems();
	}
}
