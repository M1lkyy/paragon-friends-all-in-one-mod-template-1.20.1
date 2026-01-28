package net.aditya.paragonmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CITRINE_INGOT = new Item(new FabricItemSettings());

    public static void registerItems() {
        Registry.register(Registries.ITEM, new Identifier("paragonmod", "citrine_ingot"), CITRINE_INGOT);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(CITRINE_INGOT);
        });
    }
}
