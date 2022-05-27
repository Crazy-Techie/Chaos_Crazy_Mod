package net.fabricmc.chaos;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.chaos.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChaosCrazyMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final String MOD_ID = "chaos_crazy_mod";

	@Override
	public void onInitialize() {

		ModItems.registeredItems();
	}
}
