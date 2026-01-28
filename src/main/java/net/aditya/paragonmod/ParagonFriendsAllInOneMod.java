package net.aditya.paragonmod;

import net.aditya.paragonmod.block.ModBlockItems;
import net.aditya.paragonmod.block.ModBlocks;
import net.aditya.paragonmod.item.ModItems;
import net.aditya.paragonmod.world.biome.ModBiomes;
import net.aditya.paragonmod.world.gen.ModEntitySpawns;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParagonFriendsAllInOneMod implements ModInitializer {
	public static final String MOD_ID = "paragonmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModBlockItems.registerBlockItems();
		ModBiomes.registerBiomes();


        LOGGER.info("Hello Fabric world!");
	}
}