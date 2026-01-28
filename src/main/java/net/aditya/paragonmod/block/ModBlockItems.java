package net.aditya.paragonmod.block;

import net.aditya.paragonmod.ParagonFriendsAllInOneMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockItems {
    public static Item CITRINE_ORE_BLOCK_ITEM = new BlockItem(ModBlocks.CITRINE_ORE, new FabricItemSettings());

    public static void registerBlockItems() {
        Registry.register(Registries.ITEM,
                new Identifier(ParagonFriendsAllInOneMod.MOD_ID, "citrine_ore"), CITRINE_ORE_BLOCK_ITEM);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(ModBlockItems.CITRINE_ORE_BLOCK_ITEM));
    }
}
