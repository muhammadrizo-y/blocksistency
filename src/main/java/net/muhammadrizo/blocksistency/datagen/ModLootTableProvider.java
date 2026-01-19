package net.muhammadrizo.blocksistency.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.muhammadrizo.blocksistency.block.ModStoneBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // ============== STONE ==============

        addDrop(ModStoneBlocks.STONE_WALL);
        addDrop(ModStoneBlocks.CHISELED_STONE);
        addDrop(ModStoneBlocks.MOSSY_CHISELED_STONE);
        addDrop(ModStoneBlocks.CRACKED_CHISELED_STONE);

        addDrop(ModStoneBlocks.SMOOTH_STONE_STAIRS);
        addDrop(ModStoneBlocks.SMOOTH_STONE_WALL);

        addDrop(ModStoneBlocks.POLISHED_STONE);
        addDrop(ModStoneBlocks.POLISHED_STONE_STAIRS);
        addDrop(ModStoneBlocks.POLISHED_STONE_SLAB, slabDrops(ModStoneBlocks.POLISHED_STONE_SLAB));
        addDrop(ModStoneBlocks.POLISHED_STONE_WALL);

        addDrop(ModStoneBlocks.MOSSY_CHISELED_STONE_BRICKS);

        addDrop(ModStoneBlocks.CRACKED_STONE_BRICK_STAIRS);
        addDrop(ModStoneBlocks.CRACKED_STONE_BRICK_SLAB, slabDrops(ModStoneBlocks.CRACKED_STONE_BRICK_SLAB));
        addDrop(ModStoneBlocks.CRACKED_STONE_BRICK_WALL);
        addDrop(ModStoneBlocks.CRACKED_CHISELED_STONE_BRICKS);

        addDrop(ModStoneBlocks.STONE_TILES);
        addDrop(ModStoneBlocks.STONE_TILE_STAIRS);
        addDrop(ModStoneBlocks.STONE_TILE_SLAB, slabDrops(ModStoneBlocks.STONE_TILE_SLAB));
        addDrop(ModStoneBlocks.STONE_TILE_WALL);

        addDrop(ModStoneBlocks.MOSSY_STONE_TILES);
        addDrop(ModStoneBlocks.MOSSY_STONE_TILE_STAIRS);
        addDrop(ModStoneBlocks.MOSSY_STONE_TILE_SLAB, slabDrops(ModStoneBlocks.MOSSY_STONE_TILE_SLAB));
        addDrop(ModStoneBlocks.MOSSY_STONE_TILE_WALL);

        addDrop(ModStoneBlocks.CRACKED_STONE_TILES);
        addDrop(ModStoneBlocks.CRACKED_STONE_TILE_STAIRS);
        addDrop(ModStoneBlocks.CRACKED_STONE_TILE_SLAB, slabDrops(ModStoneBlocks.CRACKED_STONE_TILE_SLAB));
        addDrop(ModStoneBlocks.CRACKED_STONE_TILE_WALL);

        addDrop(ModStoneBlocks.STONE_PILLAR);
        addDrop(ModStoneBlocks.MOSSY_STONE_PILLAR);
        addDrop(ModStoneBlocks.CRACKED_STONE_PILLAR);
    }
}
