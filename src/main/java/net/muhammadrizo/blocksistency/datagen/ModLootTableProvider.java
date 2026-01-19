package net.muhammadrizo.blocksistency.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.muhammadrizo.blocksistency.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // ============== STONE ==============

        addDrop(ModBlocks.STONE_WALL);
        addDrop(ModBlocks.CHISELED_STONE);
        addDrop(ModBlocks.MOSSY_CHISELED_STONE);
        addDrop(ModBlocks.CRACKED_CHISELED_STONE);

        addDrop(ModBlocks.SMOOTH_STONE_STAIRS);
        addDrop(ModBlocks.SMOOTH_STONE_WALL);

        addDrop(ModBlocks.POLISHED_STONE);
        addDrop(ModBlocks.POLISHED_STONE_STAIRS);
        addDrop(ModBlocks.POLISHED_STONE_SLAB);
        addDrop(ModBlocks.POLISHED_STONE_WALL);

        addDrop(ModBlocks.MOSSY_CHISELED_STONE_BRICKS);

        addDrop(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_STONE_BRICK_SLAB);
        addDrop(ModBlocks.CRACKED_STONE_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_CHISELED_STONE_BRICKS);

        addDrop(ModBlocks.STONE_TILES);
        addDrop(ModBlocks.STONE_TILE_STAIRS);
        addDrop(ModBlocks.STONE_TILE_SLAB);
        addDrop(ModBlocks.STONE_TILE_WALL);

        addDrop(ModBlocks.MOSSY_STONE_TILES);
        addDrop(ModBlocks.MOSSY_STONE_TILE_STAIRS);
        addDrop(ModBlocks.MOSSY_STONE_TILE_SLAB);
        addDrop(ModBlocks.MOSSY_STONE_TILE_WALL);

        addDrop(ModBlocks.CRACKED_STONE_TILES);
        addDrop(ModBlocks.CRACKED_STONE_TILE_STAIRS);
        addDrop(ModBlocks.CRACKED_STONE_TILE_SLAB);
        addDrop(ModBlocks.CRACKED_STONE_TILE_WALL);

        addDrop(ModBlocks.STONE_PILLAR);
        addDrop(ModBlocks.MOSSY_STONE_PILLAR);
        addDrop(ModBlocks.CRACKED_STONE_PILLAR);
    }
}
