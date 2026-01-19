package net.muhammadrizo.blocksistency.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.TexturedModel;
import net.muhammadrizo.blocksistency.block.ModStoneBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // ============== STONE ==============

        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE)
                .wall(ModStoneBlocks.STONE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModStoneBlocks.CHISELED_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModStoneBlocks.MOSSY_CHISELED_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModStoneBlocks.CRACKED_CHISELED_STONE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE)
                .stairs(ModStoneBlocks.SMOOTH_STONE_STAIRS)
                .wall(ModStoneBlocks.SMOOTH_STONE_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModStoneBlocks.POLISHED_STONE)
                .stairs(ModStoneBlocks.POLISHED_STONE_STAIRS)
                .slab(ModStoneBlocks.POLISHED_STONE_SLAB)
                .wall(ModStoneBlocks.POLISHED_STONE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModStoneBlocks.MOSSY_CHISELED_STONE_BRICKS);

        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_STONE_BRICKS)
                .stairs(ModStoneBlocks.CRACKED_STONE_BRICK_STAIRS)
                .slab(ModStoneBlocks.CRACKED_STONE_BRICK_SLAB)
                .wall(ModStoneBlocks.CRACKED_STONE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModStoneBlocks.CRACKED_CHISELED_STONE_BRICKS);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModStoneBlocks.STONE_TILES)
                .stairs(ModStoneBlocks.STONE_TILE_STAIRS)
                .slab(ModStoneBlocks.STONE_TILE_SLAB)
                .wall(ModStoneBlocks.STONE_TILE_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModStoneBlocks.MOSSY_STONE_TILES)
                .stairs(ModStoneBlocks.MOSSY_STONE_TILE_STAIRS)
                .slab(ModStoneBlocks.MOSSY_STONE_TILE_SLAB)
                .wall(ModStoneBlocks.MOSSY_STONE_TILE_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModStoneBlocks.CRACKED_STONE_TILES)
                .stairs(ModStoneBlocks.CRACKED_STONE_TILE_STAIRS)
                .slab(ModStoneBlocks.CRACKED_STONE_TILE_SLAB)
                .wall(ModStoneBlocks.CRACKED_STONE_TILE_WALL);

        blockStateModelGenerator.registerAxisRotated(ModStoneBlocks.STONE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModStoneBlocks.MOSSY_STONE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModStoneBlocks.CRACKED_STONE_PILLAR, TexturedModel.CUBE_COLUMN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
