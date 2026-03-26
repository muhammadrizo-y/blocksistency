package net.muhammadrizo.blocksistency.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.block.*;

import static net.muhammadrizo.blocksistency.block.ModBlocks.*;

public class ModDioriteBlocks {
    public static final Block CHISELED_DIORITE = register(
            "chiseled_diorite", Block::new,
            copySettings(Blocks.DIORITE));

    public static final Block MOSSY_CHISELED_DIORITE = register(
            "mossy_chiseled_diorite", Block::new,
            copySettings(CHISELED_DIORITE));

    public static final Block CRACKED_CHISELED_DIORITE = register(
            "cracked_chiseled_diorite", Block::new,
            copySettings(CHISELED_DIORITE));

    public static final Block COBBLED_DIORITE = register(
            "cobbled_diorite", Block::new,
            copySettings(Blocks.DIORITE).strength(2.0F, 6.0F));

    public static final Block COBBLED_DIORITE_STAIRS = register(
            "cobbled_diorite_stairs",
            stairsOf(COBBLED_DIORITE),
            copySettings(COBBLED_DIORITE));

    public static final Block COBBLED_DIORITE_SLAB = register(
            "cobbled_diorite_slab", SlabBlock::new,
            copySettings(COBBLED_DIORITE));

    public static final Block COBBLED_DIORITE_WALL = register(
            "cobbled_diorite_wall", WallBlock::new,
            createWallSettings(COBBLED_DIORITE));

    public static final Block MOSSY_COBBLED_DIORITE = register(
            "mossy_cobbled_diorite", Block::new,
            copySettings(COBBLED_DIORITE));

    public static final Block MOSSY_COBBLED_DIORITE_STAIRS = register(
            "mossy_cobbled_diorite_stairs",
            stairsOf(MOSSY_COBBLED_DIORITE),
            copySettings(MOSSY_COBBLED_DIORITE));

    public static final Block MOSSY_COBBLED_DIORITE_SLAB = register(
            "mossy_cobbled_diorite_slab", SlabBlock::new,
            copySettings(MOSSY_COBBLED_DIORITE));

    public static final Block MOSSY_COBBLED_DIORITE_WALL = register(
            "mossy_cobbled_diorite_wall", WallBlock::new,
            createWallSettings(MOSSY_COBBLED_DIORITE));

    public static final Block SMOOTH_DIORITE = register(
            "smooth_diorite", Block::new,
            copySettings(Blocks.DIORITE));

    public static final Block SMOOTH_DIORITE_STAIRS = register(
            "smooth_diorite_stairs",
            stairsOf(SMOOTH_DIORITE),
            copySettings(SMOOTH_DIORITE));

    public static final Block SMOOTH_DIORITE_SLAB = register(
            "smooth_diorite_slab", SlabBlock::new,
            copySettings(SMOOTH_DIORITE));

    public static final Block SMOOTH_DIORITE_WALL = register(
            "smooth_diorite_wall", WallBlock::new,
            createWallSettings(SMOOTH_DIORITE));

    public static final Block POLISHED_DIORITE_WALL = register(
            "polished_diorite_wall", WallBlock::new,
            createWallSettings(Blocks.POLISHED_DIORITE));

    public static final Block POLISHED_DIORITE_PRESSURE_PLATE = register(
            "polished_diorite_pressure_plate",
            pressurePlateType(ModBlockSetTypes.POLISHED_DIORITE),
            createPressurePlateSettings(Blocks.POLISHED_DIORITE));

    public static final Block POLISHED_DIORITE_BUTTON = register(
            "polished_diorite_button",
            buttonType(ModBlockSetTypes.POLISHED_DIORITE),
            createButtonSettings());

    public static final Block DIORITE_BRICKS = register(
            "diorite_bricks", Block::new,
            copySettings(Blocks.POLISHED_DIORITE));

    public static final Block DIORITE_BRICK_STAIRS = register(
            "diorite_brick_stairs",
            stairsOf(DIORITE_BRICKS),
            copySettings(DIORITE_BRICKS));

    public static final Block DIORITE_BRICK_SLAB = register(
            "diorite_brick_slab", SlabBlock::new,
            copySettings(DIORITE_BRICKS));

    public static final Block DIORITE_BRICK_WALL = register(
            "diorite_brick_wall", WallBlock::new,
            createWallSettings(DIORITE_BRICKS));

    public static final Block CHISELED_DIORITE_BRICKS = register(
            "chiseled_diorite_bricks", Block::new,
            copySettings(DIORITE_BRICKS));

    public static final Block MOSSY_DIORITE_BRICKS = register(
            "mossy_diorite_bricks", Block::new,
            copySettings(DIORITE_BRICKS));

    public static final Block MOSSY_DIORITE_BRICK_STAIRS = register(
            "mossy_diorite_brick_stairs",
            stairsOf(MOSSY_DIORITE_BRICKS),
            copySettings(MOSSY_DIORITE_BRICKS));

    public static final Block MOSSY_DIORITE_BRICK_SLAB = register(
            "mossy_diorite_brick_slab", SlabBlock::new,
            copySettings(MOSSY_DIORITE_BRICKS));

    public static final Block MOSSY_DIORITE_BRICK_WALL = register(
            "mossy_diorite_brick_wall", WallBlock::new,
            createWallSettings(MOSSY_DIORITE_BRICKS));

    public static final Block MOSSY_CHISELED_DIORITE_BRICKS = register(
            "mossy_chiseled_diorite_bricks", Block::new,
            copySettings(CHISELED_DIORITE_BRICKS));

    public static final Block CRACKED_DIORITE_BRICKS = register(
            "cracked_diorite_bricks", Block::new,
            copySettings(DIORITE_BRICKS));

    public static final Block CRACKED_DIORITE_BRICK_STAIRS = register(
            "cracked_diorite_brick_stairs",
            stairsOf(CRACKED_DIORITE_BRICKS),
            copySettings(CRACKED_DIORITE_BRICKS));

    public static final Block CRACKED_DIORITE_BRICK_SLAB = register(
            "cracked_diorite_brick_slab", SlabBlock::new,
            copySettings(CRACKED_DIORITE_BRICKS));

    public static final Block CRACKED_DIORITE_BRICK_WALL = register(
            "cracked_diorite_brick_wall", WallBlock::new,
            createWallSettings(CRACKED_DIORITE_BRICKS));

    public static final Block CRACKED_CHISELED_DIORITE_BRICKS = register(
            "cracked_chiseled_diorite_bricks", Block::new,
            copySettings(CHISELED_DIORITE_BRICKS));

    public static final Block DIORITE_PLATES = register(
            "diorite_plates", Block::new,
            copySettings(DIORITE_BRICKS));

    public static final Block DIORITE_PLATE_STAIRS = register(
            "diorite_plate_stairs",
            stairsOf(DIORITE_PLATES),
            copySettings(DIORITE_PLATES));

    public static final Block DIORITE_PLATE_SLAB = register(
            "diorite_plate_slab", SlabBlock::new,
            copySettings(DIORITE_PLATES));

    public static final Block DIORITE_PLATE_WALL = register(
            "diorite_plate_wall", WallBlock::new,
            createWallSettings(DIORITE_PLATES));

    public static final Block MOSSY_DIORITE_PLATES = register(
            "mossy_diorite_plates", Block::new,
            copySettings(DIORITE_PLATES));

    public static final Block MOSSY_DIORITE_PLATE_STAIRS = register(
            "mossy_diorite_plate_stairs",
            stairsOf(MOSSY_DIORITE_PLATES),
            copySettings(MOSSY_DIORITE_PLATES));

    public static final Block MOSSY_DIORITE_PLATE_SLAB = register(
            "mossy_diorite_plate_slab", SlabBlock::new,
            copySettings(MOSSY_DIORITE_PLATES));

    public static final Block MOSSY_DIORITE_PLATE_WALL = register(
            "mossy_diorite_plate_wall", WallBlock::new,
            createWallSettings(MOSSY_DIORITE_PLATES));

    public static final Block CRACKED_DIORITE_PLATES = register(
            "cracked_diorite_plates", Block::new,
            copySettings(DIORITE_PLATES));

    public static final Block CRACKED_DIORITE_PLATE_STAIRS = register(
            "cracked_diorite_plate_stairs",
            stairsOf(CRACKED_DIORITE_PLATES),
            copySettings(CRACKED_DIORITE_PLATES));

    public static final Block CRACKED_DIORITE_PLATE_SLAB = register(
            "cracked_diorite_plate_slab", SlabBlock::new,
            copySettings(CRACKED_DIORITE_PLATES));

    public static final Block CRACKED_DIORITE_PLATE_WALL = register(
            "cracked_diorite_plate_wall", WallBlock::new,
            createWallSettings(CRACKED_DIORITE_PLATES));

    public static final Block DIORITE_TILES = register(
            "diorite_tiles", Block::new,
            copySettings(DIORITE_PLATES));

    public static final Block DIORITE_TILE_STAIRS = register(
            "diorite_tile_stairs",
            stairsOf(DIORITE_TILES),
            copySettings(DIORITE_TILES));

    public static final Block DIORITE_TILE_SLAB = register(
            "diorite_tile_slab", SlabBlock::new,
            copySettings(DIORITE_TILES));

    public static final Block DIORITE_TILE_WALL = register(
            "diorite_tile_wall", WallBlock::new,
            createWallSettings(DIORITE_TILES));

    public static final Block MOSSY_DIORITE_TILES = register(
            "mossy_diorite_tiles", Block::new,
            copySettings(DIORITE_TILES));

    public static final Block MOSSY_DIORITE_TILE_STAIRS = register(
            "mossy_diorite_tile_stairs",
            stairsOf(MOSSY_DIORITE_TILES),
            copySettings(MOSSY_DIORITE_TILES));

    public static final Block MOSSY_DIORITE_TILE_SLAB = register(
            "mossy_diorite_tile_slab", SlabBlock::new,
            copySettings(MOSSY_DIORITE_TILES));

    public static final Block MOSSY_DIORITE_TILE_WALL = register(
            "mossy_diorite_tile_wall", WallBlock::new,
            createWallSettings(MOSSY_DIORITE_TILES));

    public static final Block CRACKED_DIORITE_TILES = register(
            "cracked_diorite_tiles", Block::new,
            copySettings(DIORITE_TILES));

    public static final Block CRACKED_DIORITE_TILE_STAIRS = register(
            "cracked_diorite_tile_stairs",
            stairsOf(CRACKED_DIORITE_TILES),
            copySettings(CRACKED_DIORITE_TILES));

    public static final Block CRACKED_DIORITE_TILE_SLAB = register(
            "cracked_diorite_tile_slab", SlabBlock::new,
            copySettings(CRACKED_DIORITE_TILES));

    public static final Block CRACKED_DIORITE_TILE_WALL = register(
            "cracked_diorite_tile_wall", WallBlock::new,
            createWallSettings(CRACKED_DIORITE_TILES));

    public static final Block DIORITE_PILLAR = register(
            "diorite_pillar", PillarBlock::new,
            copySettings(Blocks.DIORITE));

    public static final Block MOSSY_DIORITE_PILLAR = register(
            "mossy_diorite_pillar", PillarBlock::new,
            copySettings(DIORITE_PILLAR));

    public static final Block CRACKED_DIORITE_PILLAR = register(
            "cracked_diorite_pillar", PillarBlock::new,
            copySettings(DIORITE_PILLAR));

    public static void init() {}

    public static void addCreativeEntries(FabricItemGroupEntries entries) {
        entries.addAfter(Blocks.DIORITE_WALL,
                CHISELED_DIORITE,
                MOSSY_CHISELED_DIORITE,
                CRACKED_CHISELED_DIORITE,

                COBBLED_DIORITE,
                COBBLED_DIORITE_STAIRS,
                COBBLED_DIORITE_SLAB,
                COBBLED_DIORITE_WALL,

                MOSSY_COBBLED_DIORITE,
                MOSSY_COBBLED_DIORITE_STAIRS,
                MOSSY_COBBLED_DIORITE_SLAB,
                MOSSY_COBBLED_DIORITE_WALL,

                SMOOTH_DIORITE,
                SMOOTH_DIORITE_STAIRS,
                SMOOTH_DIORITE_SLAB,
                SMOOTH_DIORITE_WALL);

        entries.addAfter(Blocks.POLISHED_DIORITE_SLAB,
                POLISHED_DIORITE_WALL,
                POLISHED_DIORITE_PRESSURE_PLATE,
                POLISHED_DIORITE_BUTTON,

                DIORITE_BRICKS,
                DIORITE_BRICK_STAIRS,
                DIORITE_BRICK_SLAB,
                DIORITE_BRICK_WALL,
                CHISELED_DIORITE_BRICKS,

                MOSSY_DIORITE_BRICKS,
                MOSSY_DIORITE_BRICK_STAIRS,
                MOSSY_DIORITE_BRICK_SLAB,
                MOSSY_DIORITE_BRICK_WALL,
                MOSSY_CHISELED_DIORITE_BRICKS,

                CRACKED_DIORITE_BRICKS,
                CRACKED_DIORITE_BRICK_STAIRS,
                CRACKED_DIORITE_BRICK_SLAB,
                CRACKED_DIORITE_BRICK_WALL,
                CRACKED_CHISELED_DIORITE_BRICKS,

                DIORITE_PLATES,
                DIORITE_PLATE_STAIRS,
                DIORITE_PLATE_SLAB,
                DIORITE_PLATE_WALL,

                MOSSY_DIORITE_PLATES,
                MOSSY_DIORITE_PLATE_STAIRS,
                MOSSY_DIORITE_PLATE_SLAB,
                MOSSY_DIORITE_PLATE_WALL,

                CRACKED_DIORITE_PLATES,
                CRACKED_DIORITE_PLATE_STAIRS,
                CRACKED_DIORITE_PLATE_SLAB,
                CRACKED_DIORITE_PLATE_WALL,

                DIORITE_TILES,
                DIORITE_TILE_STAIRS,
                DIORITE_TILE_SLAB,
                DIORITE_TILE_WALL,

                MOSSY_DIORITE_TILES,
                MOSSY_DIORITE_TILE_STAIRS,
                MOSSY_DIORITE_TILE_SLAB,
                MOSSY_DIORITE_TILE_WALL,

                CRACKED_DIORITE_TILES,
                CRACKED_DIORITE_TILE_STAIRS,
                CRACKED_DIORITE_TILE_SLAB,
                CRACKED_DIORITE_TILE_WALL,

                DIORITE_PILLAR,
                MOSSY_DIORITE_PILLAR,
                CRACKED_DIORITE_PILLAR);
    }
}
