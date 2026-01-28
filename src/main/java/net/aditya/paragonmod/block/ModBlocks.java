package net.aditya.paragonmod.block;

import net.aditya.paragonmod.ParagonFriendsAllInOneMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CITRINE_ORE = new Block(
            FabricBlockSettings.create()
                    .strength(0.5f)
                    .requiresTool()
                    .burnable()
    );

    public static void registerBlocks() {
        Registry.register(Registries.BLOCK,
                new Identifier(ParagonFriendsAllInOneMod.MOD_ID,"citrine_ore"),
                CITRINE_ORE
        );
    }
}
