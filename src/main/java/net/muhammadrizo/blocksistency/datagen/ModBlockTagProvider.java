package net.muhammadrizo.blocksistency.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.muhammadrizo.blocksistency.block.ModStoneBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                // ============== STONE ==============

                .add(ModStoneBlocks.STONE_WALL)
                .add(ModStoneBlocks.CHISELED_STONE)
                .add(ModStoneBlocks.MOSSY_CHISELED_STONE)
                .add(ModStoneBlocks.CRACKED_CHISELED_STONE)

                .add(ModStoneBlocks.SMOOTH_STONE_STAIRS)
                .add(ModStoneBlocks.SMOOTH_STONE_WALL)

                .add(ModStoneBlocks.POLISHED_STONE)
                .add(ModStoneBlocks.POLISHED_STONE_STAIRS)
                .add(ModStoneBlocks.POLISHED_STONE_SLAB)
                .add(ModStoneBlocks.POLISHED_STONE_WALL)

                .add(ModStoneBlocks.MOSSY_CHISELED_STONE_BRICKS)

                .add(ModStoneBlocks.CRACKED_STONE_BRICK_STAIRS)
                .add(ModStoneBlocks.CRACKED_STONE_BRICK_SLAB)
                .add(ModStoneBlocks.CRACKED_STONE_BRICK_WALL)
                .add(ModStoneBlocks.CRACKED_CHISELED_STONE_BRICKS)

                .add(ModStoneBlocks.STONE_TILES)
                .add(ModStoneBlocks.STONE_TILE_STAIRS)
                .add(ModStoneBlocks.STONE_TILE_SLAB)
                .add(ModStoneBlocks.STONE_TILE_WALL)

                .add(ModStoneBlocks.MOSSY_STONE_TILES)
                .add(ModStoneBlocks.MOSSY_STONE_TILE_STAIRS)
                .add(ModStoneBlocks.MOSSY_STONE_TILE_SLAB)
                .add(ModStoneBlocks.MOSSY_STONE_TILE_WALL)

                .add(ModStoneBlocks.CRACKED_STONE_TILES)
                .add(ModStoneBlocks.CRACKED_STONE_TILE_STAIRS)
                .add(ModStoneBlocks.CRACKED_STONE_TILE_SLAB)
                .add(ModStoneBlocks.CRACKED_STONE_TILE_WALL)

                .add(ModStoneBlocks.STONE_PILLAR)
                .add(ModStoneBlocks.MOSSY_STONE_PILLAR)
                .add(ModStoneBlocks.CRACKED_STONE_PILLAR);

        valueLookupBuilder(BlockTags.WALLS)
                // ============== STONE ==============

                .add(ModStoneBlocks.STONE_WALL)
                .add(ModStoneBlocks.SMOOTH_STONE_WALL)
                .add(ModStoneBlocks.POLISHED_STONE_WALL)
                .add(ModStoneBlocks.CRACKED_STONE_BRICK_WALL)
                .add(ModStoneBlocks.STONE_TILE_WALL)
                .add(ModStoneBlocks.MOSSY_STONE_TILE_WALL)
                .add(ModStoneBlocks.CRACKED_STONE_TILE_WALL);
    }
}
