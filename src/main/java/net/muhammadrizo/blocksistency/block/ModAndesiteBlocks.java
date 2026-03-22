package net.muhammadrizo.blocksistency.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.block.*;

import static net.muhammadrizo.blocksistency.block.ModBlocks.*;

public class ModAndesiteBlocks {
    public static final Block CHISELED_ANDESITE = register(
            "chiseled_andesite", Block::new,
            copySettings(Blocks.ANDESITE));

    public static final Block MOSSY_CHISELED_ANDESITE = register(
            "mossy_chiseled_andesite", Block::new,
            copySettings(CHISELED_ANDESITE));

    public static final Block CRACKED_CHISELED_ANDESITE = register(
            "cracked_chiseled_andesite", Block::new,
            copySettings(CHISELED_ANDESITE));

    public static final Block COBBLED_ANDESITE = register(
            "cobbled_andesite", Block::new,
            copySettings(Blocks.ANDESITE).strength(2.0F, 6.0F));

    public static final Block COBBLED_ANDESITE_STAIRS = register(
            "cobbled_andesite_stairs",
            settings -> new ModStairsBlock(
                    COBBLED_ANDESITE.getDefaultState(), settings),
            copySettings(COBBLED_ANDESITE));

    public static final Block COBBLED_ANDESITE_SLAB = register(
            "cobbled_andesite_slab", SlabBlock::new,
            copySettings(COBBLED_ANDESITE));

    public static final Block COBBLED_ANDESITE_WALL = register(
            "cobbled_andesite_wall", WallBlock::new,
            copySettings(COBBLED_ANDESITE));

    public static final Block MOSSY_COBBLED_ANDESITE = register(
            "mossy_cobbled_andesite", Block::new,
            copySettings(COBBLED_ANDESITE));

    public static final Block MOSSY_COBBLED_ANDESITE_STAIRS = register(
            "mossy_cobbled_andesite_stairs",
            settings -> new ModStairsBlock(
                    MOSSY_COBBLED_ANDESITE.getDefaultState(), settings),
            copySettings(MOSSY_COBBLED_ANDESITE));

    public static final Block MOSSY_COBBLED_ANDESITE_SLAB = register(
            "mossy_cobbled_andesite_slab", SlabBlock::new,
            copySettings(MOSSY_COBBLED_ANDESITE));

    public static final Block MOSSY_COBBLED_ANDESITE_WALL = register(
            "mossy_cobbled_andesite_wall", WallBlock::new,
            copySettings(MOSSY_COBBLED_ANDESITE));

    public static final Block SMOOTH_ANDESITE = register(
            "smooth_andesite", Block::new,
            copySettings(Blocks.ANDESITE));

    public static final Block SMOOTH_ANDESITE_STAIRS = register(
            "smooth_andesite_stairs",
            stairsOf(SMOOTH_ANDESITE),
            copySettings(SMOOTH_ANDESITE));

    public static final Block SMOOTH_ANDESITE_SLAB = register(
            "smooth_andesite_slab", SlabBlock::new,
            copySettings(SMOOTH_ANDESITE));

    public static final Block SMOOTH_ANDESITE_WALL = register(
            "smooth_andesite_wall", WallBlock::new,
            createWallSettings(SMOOTH_ANDESITE));

    public static final Block POLISHED_ANDESITE_WALL = register(
            "polished_andesite_wall", WallBlock::new,
            createWallSettings(Blocks.POLISHED_ANDESITE));

    public static final Block POLISHED_ANDESITE_PRESSURE_PLATE = register(
            "polished_andesite_pressure_plate",
            pressurePlateType(ModBlockSetTypes.POLISHED_ANDESITE),
            createPressurePlateSettings(Blocks.POLISHED_ANDESITE));

    public static final Block POLISHED_ANDESITE_BUTTON = register(
            "polished_andesite_button",
            buttonType(ModBlockSetTypes.POLISHED_ANDESITE),
            createButtonSettings());

    public static final Block ANDESITE_BRICKS = register(
            "andesite_bricks", Block::new,
            copySettings(Blocks.POLISHED_ANDESITE));

    public static final Block ANDESITE_BRICK_STAIRS = register(
            "andesite_brick_stairs",
            stairsOf(ANDESITE_BRICKS),
            copySettings(ANDESITE_BRICKS));

    public static final Block ANDESITE_BRICK_SLAB = register(
            "andesite_brick_slab", SlabBlock::new,
            copySettings(ANDESITE_BRICKS));

    public static final Block ANDESITE_BRICK_WALL = register(
            "andesite_brick_wall", WallBlock::new,
            createWallSettings(ANDESITE_BRICKS));

    public static final Block CHISELED_ANDESITE_BRICKS = register(
            "chiseled_andesite_bricks", Block::new,
            copySettings(ANDESITE_BRICKS));

    public static final Block MOSSY_ANDESITE_BRICKS = register(
            "mossy_andesite_bricks", Block::new,
            copySettings(ANDESITE_BRICKS));

    public static final Block MOSSY_ANDESITE_BRICK_STAIRS = register(
            "mossy_andesite_brick_stairs",
            stairsOf(MOSSY_ANDESITE_BRICKS),
            copySettings(MOSSY_ANDESITE_BRICKS));

    public static final Block MOSSY_ANDESITE_BRICK_SLAB = register(
            "mossy_andesite_brick_slab", SlabBlock::new,
            copySettings(MOSSY_ANDESITE_BRICKS));

    public static final Block MOSSY_ANDESITE_BRICK_WALL = register(
            "mossy_andesite_brick_wall", WallBlock::new,
            createWallSettings(MOSSY_ANDESITE_BRICKS));

    public static final Block MOSSY_CHISELED_ANDESITE_BRICKS = register(
            "mossy_chiseled_andesite_bricks", Block::new,
            copySettings(CHISELED_ANDESITE_BRICKS));

    public static final Block CRACKED_ANDESITE_BRICKS = register(
            "cracked_andesite_bricks", Block::new,
            copySettings(ANDESITE_BRICKS));

    public static final Block CRACKED_ANDESITE_BRICK_STAIRS = register(
            "cracked_andesite_brick_stairs",
            stairsOf(CRACKED_ANDESITE_BRICKS),
            copySettings(CRACKED_ANDESITE_BRICKS));

    public static final Block CRACKED_ANDESITE_BRICK_SLAB = register(
            "cracked_andesite_brick_slab", SlabBlock::new,
            copySettings(CRACKED_ANDESITE_BRICKS));

    public static final Block CRACKED_ANDESITE_BRICK_WALL = register(
            "cracked_andesite_brick_wall", WallBlock::new,
            createWallSettings(CRACKED_ANDESITE_BRICKS));

    public static final Block CRACKED_CHISELED_ANDESITE_BRICKS = register(
            "cracked_chiseled_andesite_bricks", Block::new,
            copySettings(CHISELED_ANDESITE_BRICKS));

    public static final Block ANDESITE_PLATES = register(
            "andesite_plates", Block::new,
            copySettings(ANDESITE_BRICKS));

    public static final Block ANDESITE_PLATE_STAIRS = register(
            "andesite_plate_stairs",
            stairsOf(ANDESITE_PLATES),
            copySettings(ANDESITE_PLATES));

    public static final Block ANDESITE_PLATE_SLAB = register(
            "andesite_plate_slab", SlabBlock::new,
            copySettings(ANDESITE_PLATES));

    public static final Block ANDESITE_PLATE_WALL = register(
            "andesite_plate_wall", WallBlock::new,
            createWallSettings(ANDESITE_PLATES));

    public static final Block MOSSY_ANDESITE_PLATES = register(
            "mossy_andesite_plates", Block::new,
            copySettings(ANDESITE_PLATES));

    public static final Block MOSSY_ANDESITE_PLATE_STAIRS = register(
            "mossy_andesite_plate_stairs",
            stairsOf(MOSSY_ANDESITE_PLATES),
            copySettings(MOSSY_ANDESITE_PLATES));

    public static final Block MOSSY_ANDESITE_PLATE_SLAB = register(
            "mossy_andesite_plate_slab", SlabBlock::new,
            copySettings(MOSSY_ANDESITE_PLATES));

    public static final Block MOSSY_ANDESITE_PLATE_WALL = register(
            "mossy_andesite_plate_wall", WallBlock::new,
            createWallSettings(MOSSY_ANDESITE_PLATES));

    public static final Block CRACKED_ANDESITE_PLATES = register(
            "cracked_andesite_plates", Block::new,
            copySettings(ANDESITE_PLATES));

    public static final Block CRACKED_ANDESITE_PLATE_STAIRS = register(
            "cracked_andesite_plate_stairs",
            stairsOf(CRACKED_ANDESITE_PLATES),
            copySettings(CRACKED_ANDESITE_PLATES));

    public static final Block CRACKED_ANDESITE_PLATE_SLAB = register(
            "cracked_andesite_plate_slab", SlabBlock::new,
            copySettings(CRACKED_ANDESITE_PLATES));

    public static final Block CRACKED_ANDESITE_PLATE_WALL = register(
            "cracked_andesite_plate_wall", WallBlock::new,
            createWallSettings(CRACKED_ANDESITE_PLATES));

    public static final Block ANDESITE_TILES = register(
            "andesite_tiles", Block::new,
            copySettings(ANDESITE_PLATES));

    public static final Block ANDESITE_TILE_STAIRS = register(
            "andesite_tile_stairs",
            stairsOf(ANDESITE_TILES),
            copySettings(ANDESITE_TILES));

    public static final Block ANDESITE_TILE_SLAB = register(
            "andesite_tile_slab", SlabBlock::new,
            copySettings(ANDESITE_TILES));

    public static final Block ANDESITE_TILE_WALL = register(
            "andesite_tile_wall", WallBlock::new,
            createWallSettings(ANDESITE_TILES));

    public static final Block MOSSY_ANDESITE_TILES = register(
            "mossy_andesite_tiles", Block::new,
            copySettings(ANDESITE_TILES));

    public static final Block MOSSY_ANDESITE_TILE_STAIRS = register(
            "mossy_andesite_tile_stairs",
            stairsOf(MOSSY_ANDESITE_TILES),
            copySettings(MOSSY_ANDESITE_TILES));

    public static final Block MOSSY_ANDESITE_TILE_SLAB = register(
            "mossy_andesite_tile_slab", SlabBlock::new,
            copySettings(MOSSY_ANDESITE_TILES));

    public static final Block MOSSY_ANDESITE_TILE_WALL = register(
            "mossy_andesite_tile_wall", WallBlock::new,
            createWallSettings(MOSSY_ANDESITE_TILES));

    public static final Block CRACKED_ANDESITE_TILES = register(
            "cracked_andesite_tiles", Block::new,
            copySettings(ANDESITE_TILES));

    public static final Block CRACKED_ANDESITE_TILE_STAIRS = register(
            "cracked_andesite_tile_stairs",
            stairsOf(CRACKED_ANDESITE_TILES),
            copySettings(CRACKED_ANDESITE_TILES));

    public static final Block CRACKED_ANDESITE_TILE_SLAB = register(
            "cracked_andesite_tile_slab", SlabBlock::new,
            copySettings(CRACKED_ANDESITE_TILES));

    public static final Block CRACKED_ANDESITE_TILE_WALL = register(
            "cracked_andesite_tile_wall", WallBlock::new,
            createWallSettings(CRACKED_ANDESITE_TILES));

    public static final Block ANDESITE_PILLAR = register(
            "andesite_pillar", PillarBlock::new,
            copySettings(Blocks.ANDESITE));

    public static final Block MOSSY_ANDESITE_PILLAR = register(
            "mossy_andesite_pillar", PillarBlock::new,
            copySettings(ANDESITE_PILLAR));

    public static final Block CRACKED_ANDESITE_PILLAR = register(
            "cracked_andesite_pillar", PillarBlock::new,
            copySettings(ANDESITE_PILLAR));

    public static void init() {}

    public static void addCreativeEntries(FabricItemGroupEntries entries) {
        entries.addAfter(Blocks.ANDESITE_WALL,
                CHISELED_ANDESITE,
                MOSSY_CHISELED_ANDESITE,
                CRACKED_CHISELED_ANDESITE,

                COBBLED_ANDESITE,
                COBBLED_ANDESITE_STAIRS,
                COBBLED_ANDESITE_SLAB,
                COBBLED_ANDESITE_WALL,

                MOSSY_COBBLED_ANDESITE,
                MOSSY_COBBLED_ANDESITE_STAIRS,
                MOSSY_COBBLED_ANDESITE_SLAB,
                MOSSY_COBBLED_ANDESITE_WALL,

                SMOOTH_ANDESITE,
                SMOOTH_ANDESITE_STAIRS,
                SMOOTH_ANDESITE_SLAB,
                SMOOTH_ANDESITE_WALL);

        entries.addAfter(Blocks.POLISHED_ANDESITE_SLAB,
                POLISHED_ANDESITE_WALL,
                POLISHED_ANDESITE_PRESSURE_PLATE,
                POLISHED_ANDESITE_BUTTON,

                ANDESITE_BRICKS,
                ANDESITE_BRICK_STAIRS,
                ANDESITE_BRICK_SLAB,
                ANDESITE_BRICK_WALL,
                CHISELED_ANDESITE_BRICKS,

                MOSSY_ANDESITE_BRICKS,
                MOSSY_ANDESITE_BRICK_STAIRS,
                MOSSY_ANDESITE_BRICK_SLAB,
                MOSSY_ANDESITE_BRICK_WALL,
                MOSSY_CHISELED_ANDESITE_BRICKS,

                CRACKED_ANDESITE_BRICKS,
                CRACKED_ANDESITE_BRICK_STAIRS,
                CRACKED_ANDESITE_BRICK_SLAB,
                CRACKED_ANDESITE_BRICK_WALL,
                CRACKED_CHISELED_ANDESITE_BRICKS,

                ANDESITE_PLATES,
                ANDESITE_PLATE_STAIRS,
                ANDESITE_PLATE_SLAB,
                ANDESITE_PLATE_WALL,

                MOSSY_ANDESITE_PLATES,
                MOSSY_ANDESITE_PLATE_STAIRS,
                MOSSY_ANDESITE_PLATE_SLAB,
                MOSSY_ANDESITE_PLATE_WALL,

                CRACKED_ANDESITE_PLATES,
                CRACKED_ANDESITE_PLATE_STAIRS,
                CRACKED_ANDESITE_PLATE_SLAB,
                CRACKED_ANDESITE_PLATE_WALL,

                ANDESITE_TILES,
                ANDESITE_TILE_STAIRS,
                ANDESITE_TILE_SLAB,
                ANDESITE_TILE_WALL,

                MOSSY_ANDESITE_TILES,
                MOSSY_ANDESITE_TILE_STAIRS,
                MOSSY_ANDESITE_TILE_SLAB,
                MOSSY_ANDESITE_TILE_WALL,

                CRACKED_ANDESITE_TILES,
                CRACKED_ANDESITE_TILE_STAIRS,
                CRACKED_ANDESITE_TILE_SLAB,
                CRACKED_ANDESITE_TILE_WALL,

                ANDESITE_PILLAR,
                MOSSY_ANDESITE_PILLAR,
                CRACKED_ANDESITE_PILLAR);
    }
}
