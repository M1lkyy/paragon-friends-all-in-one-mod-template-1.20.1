package net.aditya.paragonmod;

import net.aditya.paragonmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParagonFriendsAllInOneMod implements ModInitializer {
	public static final String MOD_ID = "paragonmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerItems();

		LOGGER.info("Hello Fabric world!");
	}
}