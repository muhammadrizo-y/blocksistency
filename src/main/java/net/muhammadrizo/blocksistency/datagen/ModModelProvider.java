package net.muhammadrizo.blocksistency.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.util.Identifier;
import net.muhammadrizo.blocksistency.block.*;
import net.muhammadrizo.blocksistency.block.model.ModModels;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator gen) {
        // ============== STONE ==============

        wallModel(gen, ModStoneBlocks.STONE_WALL, Blocks.STONE);

        cubeColumnModel(gen, ModStoneBlocks.CHISELED_STONE);
        cubeColumnModel(gen, ModStoneBlocks.MOSSY_CHISELED_STONE);
        cubeColumnModel(gen, ModStoneBlocks.CRACKED_CHISELED_STONE);

        stairsModel(gen, ModStoneBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);
        wallModel(gen, ModStoneBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);

        blockAndFormsModels(gen,
                ModStoneBlocks.POLISHED_STONE,
                ModStoneBlocks.POLISHED_STONE_STAIRS, ModStoneBlocks.POLISHED_STONE_SLAB, ModStoneBlocks.POLISHED_STONE_WALL);

        simpleCubeModel(gen, ModStoneBlocks.MOSSY_CHISELED_STONE_BRICKS);

        blockFormsModels(gen, ModStoneBlocks.CRACKED_STONE_BRICK_STAIRS, ModStoneBlocks.CRACKED_STONE_BRICK_SLAB, ModStoneBlocks.CRACKED_STONE_BRICK_WALL,
                Blocks.CRACKED_STONE_BRICKS);
        simpleCubeModel(gen, ModStoneBlocks.CRACKED_CHISELED_STONE_BRICKS);

        blockAndFormsModels(gen,
                ModStoneBlocks.STONE_PLATES,
                ModStoneBlocks.STONE_PLATE_STAIRS, ModStoneBlocks.STONE_PLATE_SLAB, ModStoneBlocks.STONE_PLATE_WALL);

        blockAndFormsModels(gen,
                ModStoneBlocks.MOSSY_STONE_PLATES,
                ModStoneBlocks.MOSSY_STONE_PLATE_STAIRS, ModStoneBlocks.MOSSY_STONE_PLATE_SLAB, ModStoneBlocks.MOSSY_STONE_PLATE_WALL);

        blockAndFormsModels(gen,
                ModStoneBlocks.CRACKED_STONE_PLATES,
                ModStoneBlocks.CRACKED_STONE_PLATE_STAIRS, ModStoneBlocks.CRACKED_STONE_PLATE_SLAB, ModStoneBlocks.CRACKED_STONE_PLATE_WALL);

        blockAndFormsModels(gen,
                ModStoneBlocks.STONE_TILES,
                ModStoneBlocks.STONE_TILE_STAIRS, ModStoneBlocks.STONE_TILE_SLAB, ModStoneBlocks.STONE_TILE_WALL);

        blockAndFormsModels(gen,
                ModStoneBlocks.MOSSY_STONE_TILES,
                ModStoneBlocks.MOSSY_STONE_TILE_STAIRS, ModStoneBlocks.MOSSY_STONE_TILE_SLAB, ModStoneBlocks.MOSSY_STONE_TILE_WALL);

        blockAndFormsModels(gen,
                ModStoneBlocks.CRACKED_STONE_TILES,
                ModStoneBlocks.CRACKED_STONE_TILE_STAIRS, ModStoneBlocks.CRACKED_STONE_TILE_SLAB, ModStoneBlocks.CRACKED_STONE_TILE_WALL);

        pillarBlockModel(gen, ModStoneBlocks.STONE_PILLAR);
        pillarBlockModel(gen, ModStoneBlocks.MOSSY_STONE_PILLAR);
        pillarBlockModel(gen, ModStoneBlocks.CRACKED_STONE_PILLAR);

        // ============== GRANITE ==============

        cubeColumnModel(gen, ModGraniteBlocks.CHISELED_GRANITE);
        cubeColumnModel(gen, ModGraniteBlocks.MOSSY_CHISELED_GRANITE);
        cubeColumnModel(gen, ModGraniteBlocks.CRACKED_CHISELED_GRANITE);

        blockAndFormsModels(gen,
                ModGraniteBlocks.COBBLED_GRANITE,
                ModGraniteBlocks.COBBLED_GRANITE_STAIRS, ModGraniteBlocks.COBBLED_GRANITE_SLAB, ModGraniteBlocks.COBBLED_GRANITE_WALL);

        blockAndFormsModels(gen,
                ModGraniteBlocks.MOSSY_COBBLED_GRANITE,
                ModGraniteBlocks.MOSSY_COBBLED_GRANITE_STAIRS, ModGraniteBlocks.MOSSY_COBBLED_GRANITE_SLAB, ModGraniteBlocks.MOSSY_COBBLED_GRANITE_WALL);

        blockAndFormsModels(gen,
                ModGraniteBlocks.SMOOTH_GRANITE,
                ModGraniteBlocks.SMOOTH_GRANITE_STAIRS, ModGraniteBlocks.SMOOTH_GRANITE_SLAB, ModGraniteBlocks.SMOOTH_GRANITE_WALL);

        wallModel(gen, ModGraniteBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
        pressurePlateModel(gen, ModGraniteBlocks.POLISHED_GRANITE_PRESSURE_PLATE, Blocks.POLISHED_GRANITE);
        buttonModel(gen, ModGraniteBlocks.POLISHED_GRANITE_BUTTON, Blocks.POLISHED_GRANITE);

        blockAndFormsModels(gen,
                ModGraniteBlocks.GRANITE_BRICKS,
                ModGraniteBlocks.GRANITE_BRICK_STAIRS, ModGraniteBlocks.GRANITE_BRICK_SLAB, ModGraniteBlocks.GRANITE_BRICK_WALL);
        simpleCubeModel(gen, ModGraniteBlocks.CHISELED_GRANITE_BRICKS);

        blockAndFormsModels(gen,
                ModGraniteBlocks.MOSSY_GRANITE_BRICKS,
                ModGraniteBlocks.MOSSY_GRANITE_BRICK_STAIRS, ModGraniteBlocks.MOSSY_GRANITE_BRICK_SLAB, ModGraniteBlocks.MOSSY_GRANITE_BRICK_WALL);
        simpleCubeModel(gen, ModGraniteBlocks.MOSSY_CHISELED_GRANITE_BRICKS);

        blockAndFormsModels(gen,
                ModGraniteBlocks.CRACKED_GRANITE_BRICKS,
                ModGraniteBlocks.CRACKED_GRANITE_BRICK_STAIRS, ModGraniteBlocks.CRACKED_GRANITE_BRICK_SLAB, ModGraniteBlocks.CRACKED_GRANITE_BRICK_WALL);
        simpleCubeModel(gen, ModGraniteBlocks.CRACKED_CHISELED_GRANITE_BRICKS);

        blockAndFormsModels(gen,
                ModGraniteBlocks.GRANITE_PLATES,
                ModGraniteBlocks.GRANITE_PLATE_STAIRS, ModGraniteBlocks.GRANITE_PLATE_SLAB, ModGraniteBlocks.GRANITE_PLATE_WALL);

        blockAndFormsModels(gen,
                ModGraniteBlocks.MOSSY_GRANITE_PLATES,
                ModGraniteBlocks.MOSSY_GRANITE_PLATE_STAIRS, ModGraniteBlocks.MOSSY_GRANITE_PLATE_SLAB, ModGraniteBlocks.MOSSY_GRANITE_PLATE_WALL);

        blockAndFormsModels(gen,
                ModGraniteBlocks.CRACKED_GRANITE_PLATES,
                ModGraniteBlocks.CRACKED_GRANITE_PLATE_STAIRS, ModGraniteBlocks.CRACKED_GRANITE_PLATE_SLAB, ModGraniteBlocks.CRACKED_GRANITE_PLATE_WALL);

        blockAndFormsModels(gen,
                ModGraniteBlocks.GRANITE_TILES,
                ModGraniteBlocks.GRANITE_TILE_STAIRS, ModGraniteBlocks.GRANITE_TILE_SLAB, ModGraniteBlocks.GRANITE_TILE_WALL);

        blockAndFormsModels(gen,
                ModGraniteBlocks.MOSSY_GRANITE_TILES,
                ModGraniteBlocks.MOSSY_GRANITE_TILE_STAIRS, ModGraniteBlocks.MOSSY_GRANITE_TILE_SLAB, ModGraniteBlocks.MOSSY_GRANITE_TILE_WALL);

        blockAndFormsModels(gen,
                ModGraniteBlocks.CRACKED_GRANITE_TILES,
                ModGraniteBlocks.CRACKED_GRANITE_TILE_STAIRS, ModGraniteBlocks.CRACKED_GRANITE_TILE_SLAB, ModGraniteBlocks.CRACKED_GRANITE_TILE_WALL);

        pillarBlockModel(gen, ModGraniteBlocks.GRANITE_PILLAR);
        pillarBlockModel(gen, ModGraniteBlocks.MOSSY_GRANITE_PILLAR);
        pillarBlockModel(gen, ModGraniteBlocks.CRACKED_GRANITE_PILLAR);

        // ============== DIORITE ==============

        cubeColumnModel(gen, ModDioriteBlocks.CHISELED_DIORITE);
        cubeColumnModel(gen, ModDioriteBlocks.MOSSY_CHISELED_DIORITE);
        cubeColumnModel(gen, ModDioriteBlocks.CRACKED_CHISELED_DIORITE);

        blockAndFormsModels(gen,
                ModDioriteBlocks.COBBLED_DIORITE,
                ModDioriteBlocks.COBBLED_DIORITE_STAIRS, ModDioriteBlocks.COBBLED_DIORITE_SLAB, ModDioriteBlocks.COBBLED_DIORITE_WALL);

        blockAndFormsModels(gen,
                ModDioriteBlocks.MOSSY_COBBLED_DIORITE,
                ModDioriteBlocks.MOSSY_COBBLED_DIORITE_STAIRS, ModDioriteBlocks.MOSSY_COBBLED_DIORITE_SLAB, ModDioriteBlocks.MOSSY_COBBLED_DIORITE_WALL);

        blockAndFormsModels(gen,
                ModDioriteBlocks.SMOOTH_DIORITE,
                ModDioriteBlocks.SMOOTH_DIORITE_STAIRS, ModDioriteBlocks.SMOOTH_DIORITE_SLAB, ModDioriteBlocks.SMOOTH_DIORITE_WALL);

        wallModel(gen, ModDioriteBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
        pressurePlateModel(gen, ModDioriteBlocks.POLISHED_DIORITE_PRESSURE_PLATE, Blocks.POLISHED_DIORITE);
        buttonModel(gen, ModDioriteBlocks.POLISHED_DIORITE_BUTTON, Blocks.POLISHED_DIORITE);

        blockAndFormsModels(gen,
                ModDioriteBlocks.DIORITE_BRICKS,
                ModDioriteBlocks.DIORITE_BRICK_STAIRS, ModDioriteBlocks.DIORITE_BRICK_SLAB, ModDioriteBlocks.DIORITE_BRICK_WALL);
        simpleCubeModel(gen, ModDioriteBlocks.CHISELED_DIORITE_BRICKS);

        blockAndFormsModels(gen,
                ModDioriteBlocks.MOSSY_DIORITE_BRICKS,
                ModDioriteBlocks.MOSSY_DIORITE_BRICK_STAIRS, ModDioriteBlocks.MOSSY_DIORITE_BRICK_SLAB, ModDioriteBlocks.MOSSY_DIORITE_BRICK_WALL);
        simpleCubeModel(gen, ModDioriteBlocks.MOSSY_CHISELED_DIORITE_BRICKS);

        blockAndFormsModels(gen,
                ModDioriteBlocks.CRACKED_DIORITE_BRICKS,
                ModDioriteBlocks.CRACKED_DIORITE_BRICK_STAIRS, ModDioriteBlocks.CRACKED_DIORITE_BRICK_SLAB, ModDioriteBlocks.CRACKED_DIORITE_BRICK_WALL);
        simpleCubeModel(gen, ModDioriteBlocks.CRACKED_CHISELED_DIORITE_BRICKS);

        blockAndFormsModels(gen,
                ModDioriteBlocks.DIORITE_PLATES,
                ModDioriteBlocks.DIORITE_PLATE_STAIRS, ModDioriteBlocks.DIORITE_PLATE_SLAB, ModDioriteBlocks.DIORITE_PLATE_WALL);

        blockAndFormsModels(gen,
                ModDioriteBlocks.MOSSY_DIORITE_PLATES,
                ModDioriteBlocks.MOSSY_DIORITE_PLATE_STAIRS, ModDioriteBlocks.MOSSY_DIORITE_PLATE_SLAB, ModDioriteBlocks.MOSSY_DIORITE_PLATE_WALL);

        blockAndFormsModels(gen,
                ModDioriteBlocks.CRACKED_DIORITE_PLATES,
                ModDioriteBlocks.CRACKED_DIORITE_PLATE_STAIRS, ModDioriteBlocks.CRACKED_DIORITE_PLATE_SLAB, ModDioriteBlocks.CRACKED_DIORITE_PLATE_WALL);

        blockAndFormsModels(gen,
                ModDioriteBlocks.DIORITE_TILES,
                ModDioriteBlocks.DIORITE_TILE_STAIRS, ModDioriteBlocks.DIORITE_TILE_SLAB, ModDioriteBlocks.DIORITE_TILE_WALL);

        blockAndFormsModels(gen,
                ModDioriteBlocks.MOSSY_DIORITE_TILES,
                ModDioriteBlocks.MOSSY_DIORITE_TILE_STAIRS, ModDioriteBlocks.MOSSY_DIORITE_TILE_SLAB, ModDioriteBlocks.MOSSY_DIORITE_TILE_WALL);

        blockAndFormsModels(gen,
                ModDioriteBlocks.CRACKED_DIORITE_TILES,
                ModDioriteBlocks.CRACKED_DIORITE_TILE_STAIRS, ModDioriteBlocks.CRACKED_DIORITE_TILE_SLAB, ModDioriteBlocks.CRACKED_DIORITE_TILE_WALL);

        pillarBlockModel(gen, ModDioriteBlocks.DIORITE_PILLAR);
        pillarBlockModel(gen, ModDioriteBlocks.MOSSY_DIORITE_PILLAR);
        pillarBlockModel(gen, ModDioriteBlocks.CRACKED_DIORITE_PILLAR);

        // ============== ANDESITE ==============

        cubeColumnModel(gen, ModAndesiteBlocks.CHISELED_ANDESITE);
        cubeColumnModel(gen, ModAndesiteBlocks.MOSSY_CHISELED_ANDESITE);
        cubeColumnModel(gen, ModAndesiteBlocks.CRACKED_CHISELED_ANDESITE);

        blockAndFormsModels(gen,
                ModAndesiteBlocks.COBBLED_ANDESITE,
                ModAndesiteBlocks.COBBLED_ANDESITE_STAIRS, ModAndesiteBlocks.COBBLED_ANDESITE_SLAB, ModAndesiteBlocks.COBBLED_ANDESITE_WALL);

        blockAndFormsModels(gen,
                ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE,
                ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_STAIRS, ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_SLAB, ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_WALL);

        blockAndFormsModels(gen,
                ModAndesiteBlocks.SMOOTH_ANDESITE,
                ModAndesiteBlocks.SMOOTH_ANDESITE_STAIRS, ModAndesiteBlocks.SMOOTH_ANDESITE_SLAB, ModAndesiteBlocks.SMOOTH_ANDESITE_WALL);

        wallModel(gen, ModAndesiteBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
        pressurePlateModel(gen, ModAndesiteBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, Blocks.POLISHED_ANDESITE);
        buttonModel(gen, ModAndesiteBlocks.POLISHED_ANDESITE_BUTTON, Blocks.POLISHED_ANDESITE);

        blockAndFormsModels(gen,
                ModAndesiteBlocks.ANDESITE_BRICKS,
                ModAndesiteBlocks.ANDESITE_BRICK_STAIRS, ModAndesiteBlocks.ANDESITE_BRICK_SLAB, ModAndesiteBlocks.ANDESITE_BRICK_WALL);
        simpleCubeModel(gen, ModAndesiteBlocks.CHISELED_ANDESITE_BRICKS);

        blockAndFormsModels(gen,
                ModAndesiteBlocks.MOSSY_ANDESITE_BRICKS,
                ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_STAIRS, ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_SLAB, ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_WALL);
        simpleCubeModel(gen, ModAndesiteBlocks.MOSSY_CHISELED_ANDESITE_BRICKS);

        blockAndFormsModels(gen,
                ModAndesiteBlocks.CRACKED_ANDESITE_BRICKS,
                ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_STAIRS, ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_SLAB, ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_WALL);
        simpleCubeModel(gen, ModAndesiteBlocks.CRACKED_CHISELED_ANDESITE_BRICKS);

        blockAndFormsModels(gen,
                ModAndesiteBlocks.ANDESITE_PLATES,
                ModAndesiteBlocks.ANDESITE_PLATE_STAIRS, ModAndesiteBlocks.ANDESITE_PLATE_SLAB, ModAndesiteBlocks.ANDESITE_PLATE_WALL);

        blockAndFormsModels(gen,
                ModAndesiteBlocks.MOSSY_ANDESITE_PLATES,
                ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_STAIRS, ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_SLAB, ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_WALL);

        blockAndFormsModels(gen,
                ModAndesiteBlocks.CRACKED_ANDESITE_PLATES,
                ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_STAIRS, ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_SLAB, ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_WALL);

        blockAndFormsModels(gen,
                ModAndesiteBlocks.ANDESITE_TILES,
                ModAndesiteBlocks.ANDESITE_TILE_STAIRS, ModAndesiteBlocks.ANDESITE_TILE_SLAB, ModAndesiteBlocks.ANDESITE_TILE_WALL);

        blockAndFormsModels(gen,
                ModAndesiteBlocks.MOSSY_ANDESITE_TILES,
                ModAndesiteBlocks.MOSSY_ANDESITE_TILE_STAIRS, ModAndesiteBlocks.MOSSY_ANDESITE_TILE_SLAB, ModAndesiteBlocks.MOSSY_ANDESITE_TILE_WALL);

        blockAndFormsModels(gen,
                ModAndesiteBlocks.CRACKED_ANDESITE_TILES,
                ModAndesiteBlocks.CRACKED_ANDESITE_TILE_STAIRS, ModAndesiteBlocks.CRACKED_ANDESITE_TILE_SLAB, ModAndesiteBlocks.CRACKED_ANDESITE_TILE_WALL);

        pillarBlockModel(gen, ModAndesiteBlocks.ANDESITE_PILLAR);
        pillarBlockModel(gen, ModAndesiteBlocks.MOSSY_ANDESITE_PILLAR);
        pillarBlockModel(gen, ModAndesiteBlocks.CRACKED_ANDESITE_PILLAR);

        // ============== DEEPSLATE ==============

        stairsModel(gen, ModDeepslateBlocks.DEEPSLATE_STAIRS, Blocks.DEEPSLATE);
        slabModel(gen, ModDeepslateBlocks.DEEPSLATE_SLAB, Blocks.DEEPSLATE);
        bottomTopWallModel(gen, ModDeepslateBlocks.DEEPSLATE_WALL, Blocks.DEEPSLATE, false);

        simpleCubeModel(gen, ModDeepslateBlocks.MOSSY_CHISELED_DEEPSLATE);
        simpleCubeModel(gen, ModDeepslateBlocks.CRACKED_CHISELED_DEEPSLATE);

        blockAndFormsModels(gen,
                ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE,
                ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS, ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB, ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_WALL);

        blockAndFormsModels(gen,
                ModDeepslateBlocks.SMOOTH_DEEPSLATE,
                ModDeepslateBlocks.SMOOTH_DEEPSLATE_STAIRS, ModDeepslateBlocks.SMOOTH_DEEPSLATE_SLAB, ModDeepslateBlocks.SMOOTH_DEEPSLATE_WALL);

        pressurePlateModel(gen, ModDeepslateBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Blocks.POLISHED_DEEPSLATE);
        buttonModel(gen, ModDeepslateBlocks.POLISHED_DEEPSLATE_BUTTON, Blocks.POLISHED_DEEPSLATE);

        cubeColumnModel(gen, ModDeepslateBlocks.CHISELED_DEEPSLATE_BRICKS);

        blockAndFormsModels(gen,
                ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICKS,
                ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_WALL);
        cubeColumnModel(gen, ModDeepslateBlocks.MOSSY_CHISELED_DEEPSLATE_BRICKS);

        blockFormsModels(gen,
                ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_WALL,
                Blocks.CRACKED_DEEPSLATE_BRICKS);
        cubeColumnModel(gen, ModDeepslateBlocks.CRACKED_CHISELED_DEEPSLATE_BRICKS);

        blockAndFormsModels(gen,
                ModDeepslateBlocks.DEEPSLATE_PLATES,
                ModDeepslateBlocks.DEEPSLATE_PLATE_STAIRS, ModDeepslateBlocks.DEEPSLATE_PLATE_SLAB, ModDeepslateBlocks.DEEPSLATE_PLATE_WALL);

        blockAndFormsModels(gen,
                ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATES,
                ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_STAIRS, ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_SLAB, ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_WALL);

        blockAndFormsModels(gen,
                ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATES,
                ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_STAIRS, ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_SLAB, ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_WALL);

        blockAndFormsModels(gen,
                ModDeepslateBlocks.MOSSY_DEEPSLATE_TILES,
                ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_STAIRS, ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_SLAB,  ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_WALL);

        blockFormsModels(gen,
                ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_SLAB, ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_WALL,
                Blocks.CRACKED_DEEPSLATE_TILES);

        pillarBlockModel(gen, ModDeepslateBlocks.DEEPSLATE_PILLAR);
        pillarBlockModel(gen, ModDeepslateBlocks.MOSSY_DEEPSLATE_PILLAR);
        pillarBlockModel(gen, ModDeepslateBlocks.CRACKED_DEEPSLATE_PILLAR);
    }

    public void simpleCubeModel(BlockStateModelGenerator gen, Block block) {
        gen.registerSimpleCubeAll(block);
    }

    public void pillarBlockModel(BlockStateModelGenerator gen, Block block) {
        gen.registerAxisRotated(block, TexturedModel.CUBE_COLUMN);
    }

    public void cubeColumnModel(BlockStateModelGenerator gen, Block block) {
        gen.registerSingleton(block, TexturedModel.CUBE_COLUMN);
    }

    public void stairsModel(BlockStateModelGenerator gen, Block block, Block baseBlock) {
        TextureMap texture = TextureMap.all(baseBlock);

        Identifier stairsModelId = Models.STAIRS.upload(
                block, texture, gen.modelCollector);

        Identifier innerStairsModelId = Models.INNER_STAIRS.upload(
                block, texture, gen.modelCollector);

        Identifier outerStairsModelId = Models.OUTER_STAIRS.upload(
                block, texture, gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createStairsBlockState(
                        block,
                        BlockStateModelGenerator.createWeightedVariant(innerStairsModelId),
                        BlockStateModelGenerator.createWeightedVariant(stairsModelId),
                        BlockStateModelGenerator.createWeightedVariant(outerStairsModelId)
                )
        );

        gen.registerParentedItemModel(
                block, stairsModelId);
    }

    public void slabModel(BlockStateModelGenerator gen, Block block, Block baseBlock) {
        TextureMap texture = TextureMap.all(baseBlock);

        Identifier bottomSlabId = Models.SLAB.upload(
                block, texture, gen.modelCollector);

        Identifier topSlabId = Models.SLAB_TOP.upload(
                block, texture, gen.modelCollector);

        Identifier fullBlockId = Models.CUBE_ALL.getBlockSubModelId(baseBlock);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createSlabBlockState(
                        block,
                        BlockStateModelGenerator.createWeightedVariant(bottomSlabId),
                        BlockStateModelGenerator.createWeightedVariant(topSlabId),
                        BlockStateModelGenerator.createWeightedVariant(fullBlockId)
                )
        );

        gen.registerParentedItemModel(block, bottomSlabId);
    }

    public void wallModel(BlockStateModelGenerator gen, Block block, Block baseBlock) {
        TextureMap texture = TextureMap.all(baseBlock);

        Identifier postId = Models.TEMPLATE_WALL_POST.upload(
                block, texture, gen.modelCollector);

        Identifier sideId = Models.TEMPLATE_WALL_SIDE.upload(
                block, texture, gen.modelCollector);

        Identifier sideTallId = Models.TEMPLATE_WALL_SIDE_TALL.upload(
                block, texture, gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createWallBlockState(
                        block,
                        BlockStateModelGenerator.createWeightedVariant(postId),
                        BlockStateModelGenerator.createWeightedVariant(sideId),
                        BlockStateModelGenerator.createWeightedVariant(sideTallId)
                )
        );

        Identifier inventroyId = Models.WALL_INVENTORY.upload(
                block, texture, gen.modelCollector);

        gen.registerParentedItemModel(block, inventroyId);
    }

    public void bottomTopWallModel(BlockStateModelGenerator gen, Block block, Block baseBlock, boolean cubeBottomTop) {
        TextureMap texture = cubeBottomTop ? TextureMap.wallSideTopBottom(baseBlock) : TextureMap.wallSideEnd(baseBlock);

        Identifier postId = ModModels.TEMPLATE_BOTTOM_TOP_WALL_POST.upload(
                block, texture, gen.modelCollector);

        Identifier sideId = ModModels.TEMPLATE_BOTTOM_TOP_WALL_SIDE.upload(
                block, texture, gen.modelCollector);

        Identifier sideTallId = ModModels.TEMPLATE_BOTTOM_TOP_WALL_SIDE_TALL.upload(
                block, texture, gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createWallBlockState(
                        block,
                        BlockStateModelGenerator.createWeightedVariant(postId),
                        BlockStateModelGenerator.createWeightedVariant(sideId),
                        BlockStateModelGenerator.createWeightedVariant(sideTallId)
                )
        );

        Identifier inventroyId = ModModels.BOTTOM_TOP_WALL_INVENTORY.upload(
                block, texture, gen.modelCollector);

        gen.registerParentedItemModel(block, inventroyId);
    }

    public void pressurePlateModel(BlockStateModelGenerator gen, Block block, Block baseBlock) {
        TextureMap texture = TextureMap.all(baseBlock);

        Identifier upId = Models.PRESSURE_PLATE_UP.upload(
                block, texture, gen.modelCollector);

        Identifier downId = Models.PRESSURE_PLATE_DOWN.upload(
                block, texture, gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createPressurePlateBlockState(
                        block,
                        BlockStateModelGenerator.createWeightedVariant(upId),
                        BlockStateModelGenerator.createWeightedVariant(downId)
                )
        );

        gen.registerParentedItemModel(block, upId);
    }

    public void buttonModel(BlockStateModelGenerator gen, Block block, Block baseBlock) {
        TextureMap texture = TextureMap.all(baseBlock);

        Identifier unpressedId = Models.BUTTON.upload(
                block, texture, gen.modelCollector);

        Identifier pressedId = Models.BUTTON_PRESSED.upload(
                block, texture, gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createButtonBlockState(
                        block,
                        BlockStateModelGenerator.createWeightedVariant(unpressedId),
                        BlockStateModelGenerator.createWeightedVariant(pressedId)
                )
        );

        Identifier inventroyId = Models.BUTTON_INVENTORY.upload(
                block, texture, gen.modelCollector);

        gen.registerParentedItemModel(block, inventroyId);
    }

    public void blockFormsModels(BlockStateModelGenerator gen, Block stairs, Block slab, Block wall, Block baseBlock) {
        stairsModel(gen, stairs, baseBlock);
        slabModel(gen, slab, baseBlock);
        wallModel(gen, wall, baseBlock);
    }

    public void blockAndFormsModels(BlockStateModelGenerator gen, Block block, Block stairs, Block slab, Block wall) {
        gen.registerCubeAllModelTexturePool(block)
                .stairs(stairs)
                .slab(slab)
                .wall(wall);
    }

    public void blockAndFormsModels(BlockStateModelGenerator gen, Block block, Block stairs, Block slab, Block wall, Block pressurePlate, Block button) {
        gen.registerCubeAllModelTexturePool(block)
                .stairs(stairs)
                .slab(slab)
                .wall(wall)
                .pressurePlate(pressurePlate)
                .button(button);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
