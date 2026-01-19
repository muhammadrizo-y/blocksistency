package net.muhammadrizo.blocksistency.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.TexturedModel;
import net.muhammadrizo.blocksistency.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // ============== STONE ==============

        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE)
                .wall(ModBlocks.STONE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_CHISELED_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_CHISELED_STONE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE)
                .stairs(ModBlocks.SMOOTH_STONE_STAIRS)
                .wall(ModBlocks.SMOOTH_STONE_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_STONE)
                .stairs(ModBlocks.POLISHED_STONE_STAIRS)
                .slab(ModBlocks.POLISHED_STONE_SLAB)
                .wall(ModBlocks.POLISHED_STONE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_CHISELED_STONE_BRICKS);

        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_STONE_BRICKS)
                .stairs(ModBlocks.CRACKED_STONE_BRICK_STAIRS)
                .slab(ModBlocks.CRACKED_STONE_BRICK_SLAB)
                .wall(ModBlocks.CRACKED_STONE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_CHISELED_STONE_BRICKS);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STONE_TILES)
                .stairs(ModBlocks.STONE_TILE_STAIRS)
                .slab(ModBlocks.STONE_TILE_SLAB)
                .wall(ModBlocks.STONE_TILE_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_STONE_TILES)
                .stairs(ModBlocks.MOSSY_STONE_TILE_STAIRS)
                .slab(ModBlocks.MOSSY_STONE_TILE_SLAB)
                .wall(ModBlocks.MOSSY_STONE_TILE_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRACKED_STONE_TILES)
                .stairs(ModBlocks.CRACKED_STONE_TILE_STAIRS)
                .slab(ModBlocks.CRACKED_STONE_TILE_SLAB)
                .wall(ModBlocks.CRACKED_STONE_TILE_WALL);

        blockStateModelGenerator.registerAxisRotated(ModBlocks.STONE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.MOSSY_STONE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.CRACKED_STONE_PILLAR, TexturedModel.CUBE_COLUMN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
