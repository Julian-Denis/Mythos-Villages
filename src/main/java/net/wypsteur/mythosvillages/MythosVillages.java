package net.wypsteur.mythosvillages;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MythosVillages implements ModInitializer {
	public static final String MOD_ID = "mythos-villages";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Mythos: Villages -- Init --");
	}
}