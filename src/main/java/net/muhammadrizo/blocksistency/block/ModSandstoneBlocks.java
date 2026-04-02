package net.muhammadrizo.blocksistency.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.block.*;
import net.muhammadrizo.blocksistency.block.types.ModBlockSetTypes;

import static net.muhammadrizo.blocksistency.block.ModBlocks.*;

public class ModSandstoneBlocks {
    public static final Block CRACKED_CHISELED_SANDSTONE = register(
            "cracked_chiseled_sandstone", Block::new,
            copySettings(Blocks.CHISELED_SANDSTONE));

    public static final Block COBBLED_SANDSTONE = register(
            "cobbled_sandstone", Block::new,
            copySettings(Blocks.SANDSTONE)
                    .strength(1.3F, 0.8F));

    public static final Block COBBLED_SANDSTONE_STAIRS = register(
            "cobbled_sandstone_stairs",
            stairsOf(COBBLED_SANDSTONE),
            copySettings(COBBLED_SANDSTONE));

    public static final Block COBBLED_SANDSTONE_SLAB = register(
            "cobbled_sandstone_slab", SlabBlock::new,
            copySettings(COBBLED_SANDSTONE));

    public static final Block COBBLED_SANDSTONE_WALL = register(
            "cobbled_sandstone_wall", WallBlock::new,
            createWallSettings(COBBLED_SANDSTONE));

    public static final Block SMOOTH_SANDSTONE_WALL = register(
            "smooth_sandstone_wall", WallBlock::new,
            createWallSettings(Blocks.SMOOTH_SANDSTONE)
                    .strength(0.8F, 0.8F));

    public static final Block CUT_SANDSTONE_STAIRS = register(
            "cut_sandstone_stairs",
            stairsOf(Blocks.CUT_SANDSTONE),
            copySettings(Blocks.CUT_SANDSTONE));

    public static final Block CUT_SANDSTONE_WALL = register(
            "cut_sandstone_wall", WallBlock::new,
            createWallSettings(Blocks.CUT_SANDSTONE));

    public static final Block POLISHED_SANDSTONE = register(
            "polished_sandstone", Block::new,
            copySettings(Blocks.CUT_SANDSTONE));

    public static final Block POLISHED_SANDSTONE_STAIRS = register(
            "polished_sandstone_stairs",
            stairsOf(POLISHED_SANDSTONE),
            copySettings(POLISHED_SANDSTONE));

    public static final Block POLISHED_SANDSTONE_SLAB = register(
            "polished_sandstone_slab", SlabBlock::new,
            copySettings(POLISHED_SANDSTONE));

    public static final Block POLISHED_SANDSTONE_WALL = register(
            "polished_sandstone_wall", WallBlock::new,
            createWallSettings(POLISHED_SANDSTONE));

    public static final Block POLISHED_SANDSTONE_PRESSURE_PLATE = register(
            "polished_sandstone_pressure_plate",
            pressurePlateType(ModBlockSetTypes.POLISHED_SANDSTONE),
            createPressurePlateSettings(ModSandstoneBlocks.POLISHED_SANDSTONE));

    public static final Block POLISHED_SANDSTONE_BUTTON = register(
            "polished_sandstone_button",
            buttonType(ModBlockSetTypes.POLISHED_SANDSTONE),
            createButtonSettings());

    public static final Block SANDSTONE_BRICKS = register(
            "sandstone_bricks", Block::new,
            copySettings(POLISHED_SANDSTONE));

    public static final Block SANDSTONE_BRICK_STAIRS = register(
            "sandstone_brick_stairs",
            stairsOf(SANDSTONE_BRICKS),
            copySettings(SANDSTONE_BRICKS));

    public static final Block SANDSTONE_BRICK_SLAB = register(
            "sandstone_brick_slab", SlabBlock::new,
            copySettings(SANDSTONE_BRICKS));

    public static final Block SANDSTONE_BRICK_WALL = register(
            "sandstone_brick_wall", WallBlock::new,
            createWallSettings(SANDSTONE_BRICKS));

    public static final Block CHISELED_SANDSTONE_BRICKS = register(
            "chiseled_sandstone_bricks", Block::new,
            copySettings(SANDSTONE_BRICKS));

    public static final Block CRACKED_SANDSTONE_BRICKS = register(
            "cracked_sandstone_bricks", Block::new,
            copySettings(SANDSTONE_BRICKS));

    public static final Block CRACKED_SANDSTONE_BRICK_STAIRS = register(
            "cracked_sandstone_brick_stairs",
            stairsOf(CRACKED_SANDSTONE_BRICKS),
            copySettings(CRACKED_SANDSTONE_BRICKS));

    public static final Block CRACKED_SANDSTONE_BRICK_SLAB = register(
            "cracked_sandstone_brick_slab", SlabBlock::new,
            copySettings(CRACKED_SANDSTONE_BRICKS));

    public static final Block CRACKED_SANDSTONE_BRICK_WALL = register(
            "cracked_sandstone_brick_wall", WallBlock::new,
            createWallSettings(CRACKED_SANDSTONE_BRICKS));

    public static final Block CRACKED_CHISELED_SANDSTONE_BRICKS = register(
            "cracked_chiseled_sandstone_bricks", Block::new,
            copySettings(CHISELED_SANDSTONE_BRICKS));

    public static final Block SANDSTONE_PLATES = register(
            "sandstone_plates", Block::new,
            copySettings(SANDSTONE_BRICKS));

    public static final Block SANDSTONE_PLATE_STAIRS = register(
            "sandstone_plate_stairs",
            stairsOf(SANDSTONE_PLATES),
            copySettings(SANDSTONE_PLATES));

    public static final Block SANDSTONE_PLATE_SLAB = register(
            "sandstone_plate_slab", SlabBlock::new,
            copySettings(SANDSTONE_PLATES));

    public static final Block SANDSTONE_PLATE_WALL = register(
            "sandstone_plate_wall", WallBlock::new,
            createWallSettings(SANDSTONE_PLATES));

    public static final Block CRACKED_SANDSTONE_PLATES = register(
            "cracked_sandstone_plates", Block::new,
            copySettings(SANDSTONE_PLATES));

    public static final Block CRACKED_SANDSTONE_PLATE_STAIRS = register(
            "cracked_sandstone_plate_stairs",
            stairsOf(CRACKED_SANDSTONE_PLATES),
            copySettings(CRACKED_SANDSTONE_PLATES));

    public static final Block CRACKED_SANDSTONE_PLATE_SLAB = register(
            "cracked_sandstone_plate_slab", SlabBlock::new,
            copySettings(CRACKED_SANDSTONE_PLATES));

    public static final Block CRACKED_SANDSTONE_PLATE_WALL = register(
            "cracked_sandstone_plate_wall", WallBlock::new,
            createWallSettings(CRACKED_SANDSTONE_PLATES));

    public static final Block SANDSTONE_TILES = register(
            "sandstone_tiles", Block::new,
            copySettings(SANDSTONE_PLATES));

    public static final Block SANDSTONE_TILE_STAIRS = register(
            "sandstone_tile_stairs",
            stairsOf(SANDSTONE_TILES),
            copySettings(SANDSTONE_TILES));

    public static final Block SANDSTONE_TILE_SLAB = register(
            "sandstone_tile_slab", SlabBlock::new,
            copySettings(SANDSTONE_TILES));

    public static final Block SANDSTONE_TILE_WALL = register(
            "sandstone_tile_wall", WallBlock::new,
            createWallSettings(SANDSTONE_TILES));

    public static final Block CRACKED_SANDSTONE_TILES = register(
            "cracked_sandstone_tiles", Block::new,
            copySettings(SANDSTONE_TILES));

    public static final Block CRACKED_SANDSTONE_TILE_STAIRS = register(
            "cracked_sandstone_tile_stairs",
            stairsOf(CRACKED_SANDSTONE_TILES),
            copySettings(CRACKED_SANDSTONE_TILES));

    public static final Block CRACKED_SANDSTONE_TILE_SLAB = register(
            "cracked_sandstone_tile_slab", SlabBlock::new,
            copySettings(CRACKED_SANDSTONE_TILES));

    public static final Block CRACKED_SANDSTONE_TILE_WALL = register(
            "cracked_sandstone_tile_wall", WallBlock::new,
            createWallSettings(CRACKED_SANDSTONE_TILES));

    public static final Block SANDSTONE_PILLAR = register(
            "sandstone_pillar", PillarBlock::new,
            copySettings(Blocks.SANDSTONE));

    public static final Block CRACKED_SANDSTONE_PILLAR = register(
            "cracked_sandstone_pillar", PillarBlock::new,
            copySettings(SANDSTONE_PILLAR));

    public static void init() {
        fixBlockHardnessAndBlastResistance(Blocks.SANDSTONE_SLAB, Blocks.SANDSTONE);
        fixBlockHardnessAndBlastResistance(Blocks.SMOOTH_SANDSTONE, Blocks.SANDSTONE);
        fixBlockHardnessAndBlastResistance(Blocks.SMOOTH_SANDSTONE_STAIRS, Blocks.SMOOTH_SANDSTONE);
        fixBlockHardnessAndBlastResistance(Blocks.SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_SANDSTONE);
        fixBlockHardnessAndBlastResistance(Blocks.CUT_SANDSTONE_SLAB, Blocks.CUT_SANDSTONE);
    }

    public static void addCreativeEntries(FabricItemGroupEntries entries) {
        entries.getDisplayStacks().removeIf(stack ->
                stack.getItem().equals(Blocks.CHISELED_SANDSTONE.asItem()));
        entries.getSearchTabStacks().removeIf(stack ->
                stack.getItem().equals(Blocks.CHISELED_SANDSTONE.asItem()));

        entries.addAfter(Blocks.SANDSTONE_WALL,
                Blocks.CHISELED_SANDSTONE,
                CRACKED_CHISELED_SANDSTONE,

                COBBLED_SANDSTONE,
                COBBLED_SANDSTONE_STAIRS,
                COBBLED_SANDSTONE_SLAB,
                COBBLED_SANDSTONE_WALL);

        entries.addAfter(Blocks.SMOOTH_SANDSTONE_SLAB,
                SMOOTH_SANDSTONE_WALL);

        entries.addAfter(Blocks.CUT_SANDSTONE,
                CUT_SANDSTONE_STAIRS);

        entries.addAfter(Blocks.CUT_SANDSTONE_SLAB,
                CUT_SANDSTONE_WALL,

                POLISHED_SANDSTONE,
                POLISHED_SANDSTONE_STAIRS,
                POLISHED_SANDSTONE_SLAB,
                POLISHED_SANDSTONE_WALL,
                ModSandstoneBlocks.POLISHED_SANDSTONE_PRESSURE_PLATE,
                ModSandstoneBlocks.POLISHED_SANDSTONE_BUTTON,

                SANDSTONE_BRICKS,
                SANDSTONE_BRICK_STAIRS,
                SANDSTONE_BRICK_SLAB,
                SANDSTONE_BRICK_WALL,
                CHISELED_SANDSTONE_BRICKS,

                CRACKED_SANDSTONE_BRICKS,
                CRACKED_SANDSTONE_BRICK_STAIRS,
                CRACKED_SANDSTONE_BRICK_SLAB,
                CRACKED_SANDSTONE_BRICK_WALL,
                CRACKED_CHISELED_SANDSTONE_BRICKS,

                SANDSTONE_PLATES,
                SANDSTONE_PLATE_STAIRS,
                SANDSTONE_PLATE_SLAB,
                SANDSTONE_PLATE_WALL,

                CRACKED_SANDSTONE_PLATES,
                CRACKED_SANDSTONE_PLATE_STAIRS,
                CRACKED_SANDSTONE_PLATE_SLAB,
                CRACKED_SANDSTONE_PLATE_WALL,

                SANDSTONE_TILES,
                SANDSTONE_TILE_STAIRS,
                SANDSTONE_TILE_SLAB,
                SANDSTONE_TILE_WALL,

                CRACKED_SANDSTONE_TILES,
                CRACKED_SANDSTONE_TILE_STAIRS,
                CRACKED_SANDSTONE_TILE_SLAB,
                CRACKED_SANDSTONE_TILE_WALL,

                SANDSTONE_PILLAR,
                CRACKED_SANDSTONE_PILLAR
        );
    }
}
