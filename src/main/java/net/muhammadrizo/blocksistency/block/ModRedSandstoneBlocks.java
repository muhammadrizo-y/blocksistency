package net.muhammadrizo.blocksistency.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.block.*;

import static net.muhammadrizo.blocksistency.block.ModBlocks.*;

public class ModRedSandstoneBlocks {
    public static final Block CRACKED_CHISELED_RED_SANDSTONE = register(
            "cracked_chiseled_red_sandstone", Block::new,
            copySettings(Blocks.CHISELED_RED_SANDSTONE));

    public static final Block COBBLED_RED_SANDSTONE = register(
            "cobbled_red_sandstone", Block::new,
            copySettings(Blocks.RED_SANDSTONE)
                    .strength(1.3F, 0.8F));

    public static final Block COBBLED_RED_SANDSTONE_STAIRS = register(
            "cobbled_red_sandstone_stairs",
            stairsOf(COBBLED_RED_SANDSTONE),
            copySettings(COBBLED_RED_SANDSTONE));

    public static final Block COBBLED_RED_SANDSTONE_SLAB = register(
            "cobbled_red_sandstone_slab", SlabBlock::new,
            copySettings(COBBLED_RED_SANDSTONE));

    public static final Block COBBLED_RED_SANDSTONE_WALL = register(
            "cobbled_red_sandstone_wall", WallBlock::new,
            createWallSettings(COBBLED_RED_SANDSTONE));

    public static final Block SMOOTH_RED_SANDSTONE_WALL = register(
            "smooth_red_sandstone_wall", WallBlock::new,
            createWallSettings(Blocks.SMOOTH_RED_SANDSTONE)
                    .strength(0.8F, 0.8F));

    public static final Block CUT_RED_SANDSTONE_STAIRS = register(
            "cut_red_sandstone_stairs",
            stairsOf(Blocks.CUT_RED_SANDSTONE),
            copySettings(Blocks.CUT_RED_SANDSTONE));

    public static final Block CUT_RED_SANDSTONE_WALL = register(
            "cut_red_sandstone_wall", WallBlock::new,
            createWallSettings(Blocks.CUT_RED_SANDSTONE));

    public static final Block POLISHED_RED_SANDSTONE = register(
            "polished_red_sandstone", Block::new,
            copySettings(Blocks.CUT_RED_SANDSTONE));

    public static final Block POLISHED_RED_SANDSTONE_STAIRS = register(
            "polished_red_sandstone_stairs",
            stairsOf(POLISHED_RED_SANDSTONE),
            copySettings(POLISHED_RED_SANDSTONE));

    public static final Block POLISHED_RED_SANDSTONE_SLAB = register(
            "polished_red_sandstone_slab", SlabBlock::new,
            copySettings(POLISHED_RED_SANDSTONE));

    public static final Block POLISHED_RED_SANDSTONE_WALL = register(
            "polished_red_sandstone_wall", WallBlock::new,
            createWallSettings(POLISHED_RED_SANDSTONE));

    public static final Block POLISHED_RED_SANDSTONE_PRESSURE_PLATE = register(
            "polished_red_sandstone_pressure_plate",
            pressurePlateType(ModBlockSetTypes.POLISHED_RED_SANDSTONE),
            createPressurePlateSettings(ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE));

    public static final Block POLISHED_RED_SANDSTONE_BUTTON = register(
            "polished_red_sandstone_button",
            buttonType(ModBlockSetTypes.POLISHED_RED_SANDSTONE),
            createButtonSettings());

    public static final Block RED_SANDSTONE_BRICKS = register(
            "red_sandstone_bricks", Block::new,
            copySettings(POLISHED_RED_SANDSTONE));

    public static final Block RED_SANDSTONE_BRICK_STAIRS = register(
            "red_sandstone_brick_stairs",
            stairsOf(RED_SANDSTONE_BRICKS),
            copySettings(RED_SANDSTONE_BRICKS));

    public static final Block RED_SANDSTONE_BRICK_SLAB = register(
            "red_sandstone_brick_slab", SlabBlock::new,
            copySettings(RED_SANDSTONE_BRICKS));

    public static final Block RED_SANDSTONE_BRICK_WALL = register(
            "red_sandstone_brick_wall", WallBlock::new,
            createWallSettings(RED_SANDSTONE_BRICKS));

    public static final Block CHISELED_RED_SANDSTONE_BRICKS = register(
            "chiseled_red_sandstone_bricks", Block::new,
            copySettings(RED_SANDSTONE_BRICKS));

    public static final Block CRACKED_RED_SANDSTONE_BRICKS = register(
            "cracked_red_sandstone_bricks", Block::new,
            copySettings(RED_SANDSTONE_BRICKS));

    public static final Block CRACKED_RED_SANDSTONE_BRICK_STAIRS = register(
            "cracked_red_sandstone_brick_stairs",
            stairsOf(CRACKED_RED_SANDSTONE_BRICKS),
            copySettings(CRACKED_RED_SANDSTONE_BRICKS));

    public static final Block CRACKED_RED_SANDSTONE_BRICK_SLAB = register(
            "cracked_red_sandstone_brick_slab", SlabBlock::new,
            copySettings(CRACKED_RED_SANDSTONE_BRICKS));

    public static final Block CRACKED_RED_SANDSTONE_BRICK_WALL = register(
            "cracked_red_sandstone_brick_wall", WallBlock::new,
            createWallSettings(CRACKED_RED_SANDSTONE_BRICKS));

    public static final Block CRACKED_CHISELED_RED_SANDSTONE_BRICKS = register(
            "cracked_chiseled_red_sandstone_bricks", Block::new,
            copySettings(CHISELED_RED_SANDSTONE_BRICKS));

    public static final Block RED_SANDSTONE_PLATES = register(
            "red_sandstone_plates", Block::new,
            copySettings(RED_SANDSTONE_BRICKS));

    public static final Block RED_SANDSTONE_PLATE_STAIRS = register(
            "red_sandstone_plate_stairs",
            stairsOf(RED_SANDSTONE_PLATES),
            copySettings(RED_SANDSTONE_PLATES));

    public static final Block RED_SANDSTONE_PLATE_SLAB = register(
            "red_sandstone_plate_slab", SlabBlock::new,
            copySettings(RED_SANDSTONE_PLATES));

    public static final Block RED_SANDSTONE_PLATE_WALL = register(
            "red_sandstone_plate_wall", WallBlock::new,
            createWallSettings(RED_SANDSTONE_PLATES));

    public static final Block CRACKED_RED_SANDSTONE_PLATES = register(
            "cracked_red_sandstone_plates", Block::new,
            copySettings(RED_SANDSTONE_PLATES));

    public static final Block CRACKED_RED_SANDSTONE_PLATE_STAIRS = register(
            "cracked_red_sandstone_plate_stairs",
            stairsOf(CRACKED_RED_SANDSTONE_PLATES),
            copySettings(CRACKED_RED_SANDSTONE_PLATES));

    public static final Block CRACKED_RED_SANDSTONE_PLATE_SLAB = register(
            "cracked_red_sandstone_plate_slab", SlabBlock::new,
            copySettings(CRACKED_RED_SANDSTONE_PLATES));

    public static final Block CRACKED_RED_SANDSTONE_PLATE_WALL = register(
            "cracked_red_sandstone_plate_wall", WallBlock::new,
            createWallSettings(CRACKED_RED_SANDSTONE_PLATES));

    public static final Block RED_SANDSTONE_TILES = register(
            "red_sandstone_tiles", Block::new,
            copySettings(RED_SANDSTONE_PLATES));

    public static final Block RED_SANDSTONE_TILE_STAIRS = register(
            "red_sandstone_tile_stairs",
            stairsOf(RED_SANDSTONE_TILES),
            copySettings(RED_SANDSTONE_TILES));

    public static final Block RED_SANDSTONE_TILE_SLAB = register(
            "red_sandstone_tile_slab", SlabBlock::new,
            copySettings(RED_SANDSTONE_TILES));

    public static final Block RED_SANDSTONE_TILE_WALL = register(
            "red_sandstone_tile_wall", WallBlock::new,
            createWallSettings(RED_SANDSTONE_TILES));

    public static final Block CRACKED_RED_SANDSTONE_TILES = register(
            "cracked_red_sandstone_tiles", Block::new,
            copySettings(RED_SANDSTONE_TILES));

    public static final Block CRACKED_RED_SANDSTONE_TILE_STAIRS = register(
            "cracked_red_sandstone_tile_stairs",
            stairsOf(CRACKED_RED_SANDSTONE_TILES),
            copySettings(CRACKED_RED_SANDSTONE_TILES));

    public static final Block CRACKED_RED_SANDSTONE_TILE_SLAB = register(
            "cracked_red_sandstone_tile_slab", SlabBlock::new,
            copySettings(CRACKED_RED_SANDSTONE_TILES));

    public static final Block CRACKED_RED_SANDSTONE_TILE_WALL = register(
            "cracked_red_sandstone_tile_wall", WallBlock::new,
            createWallSettings(CRACKED_RED_SANDSTONE_TILES));

    public static final Block RED_SANDSTONE_PILLAR = register(
            "red_sandstone_pillar", PillarBlock::new,
            copySettings(Blocks.RED_SANDSTONE));

    public static final Block CRACKED_RED_SANDSTONE_PILLAR = register(
            "cracked_red_sandstone_pillar", PillarBlock::new,
            copySettings(RED_SANDSTONE_PILLAR));

    public static void init() {}

    public static void addCreativeEntries(FabricItemGroupEntries entries) {
        entries.getDisplayStacks().removeIf(stack ->
                stack.getItem().equals(Blocks.CHISELED_RED_SANDSTONE.asItem()));
        entries.getSearchTabStacks().removeIf(stack ->
                stack.getItem().equals(Blocks.CHISELED_RED_SANDSTONE.asItem()));

        entries.addAfter(Blocks.RED_SANDSTONE_WALL,
                Blocks.CHISELED_RED_SANDSTONE,
                CRACKED_CHISELED_RED_SANDSTONE,

                COBBLED_RED_SANDSTONE,
                COBBLED_RED_SANDSTONE_STAIRS,
                COBBLED_RED_SANDSTONE_SLAB,
                COBBLED_RED_SANDSTONE_WALL);

        entries.addAfter(Blocks.SMOOTH_RED_SANDSTONE_SLAB,
                SMOOTH_RED_SANDSTONE_WALL);

        entries.addAfter(Blocks.CUT_RED_SANDSTONE,
                CUT_RED_SANDSTONE_STAIRS);

        entries.addAfter(Blocks.CUT_RED_SANDSTONE_SLAB,
                CUT_RED_SANDSTONE_WALL,

                POLISHED_RED_SANDSTONE,
                POLISHED_RED_SANDSTONE_STAIRS,
                POLISHED_RED_SANDSTONE_SLAB,
                POLISHED_RED_SANDSTONE_WALL,

                RED_SANDSTONE_BRICKS,
                RED_SANDSTONE_BRICK_STAIRS,
                RED_SANDSTONE_BRICK_SLAB,
                RED_SANDSTONE_BRICK_WALL,
                CHISELED_RED_SANDSTONE_BRICKS,

                CRACKED_RED_SANDSTONE_BRICKS,
                CRACKED_RED_SANDSTONE_BRICK_STAIRS,
                CRACKED_RED_SANDSTONE_BRICK_SLAB,
                CRACKED_RED_SANDSTONE_BRICK_WALL,
                CRACKED_CHISELED_RED_SANDSTONE_BRICKS,

                RED_SANDSTONE_PLATES,
                RED_SANDSTONE_PLATE_STAIRS,
                RED_SANDSTONE_PLATE_SLAB,
                RED_SANDSTONE_PLATE_WALL,

                CRACKED_RED_SANDSTONE_PLATES,
                CRACKED_RED_SANDSTONE_PLATE_STAIRS,
                CRACKED_RED_SANDSTONE_PLATE_SLAB,
                CRACKED_RED_SANDSTONE_PLATE_WALL,

                RED_SANDSTONE_TILES,
                RED_SANDSTONE_TILE_STAIRS,
                RED_SANDSTONE_TILE_SLAB,
                RED_SANDSTONE_TILE_WALL,

                CRACKED_RED_SANDSTONE_TILES,
                CRACKED_RED_SANDSTONE_TILE_STAIRS,
                CRACKED_RED_SANDSTONE_TILE_SLAB,
                CRACKED_RED_SANDSTONE_TILE_WALL,

                RED_SANDSTONE_PILLAR,
                CRACKED_RED_SANDSTONE_PILLAR
        );
    }
}
