package net.muhammadrizo.blocksistency.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.block.*;

import static net.muhammadrizo.blocksistency.block.ModBlocks.*;

public class ModGraniteBlocks {
    public static final Block CHISELED_GRANITE = register(
            "chiseled_granite", Block::new,
            copySettings(Blocks.GRANITE));

    public static final Block MOSSY_CHISELED_GRANITE = register(
            "mossy_chiseled_granite", Block::new,
            copySettings(CHISELED_GRANITE));

    public static final Block CRACKED_CHISELED_GRANITE = register(
            "cracked_chiseled_granite", Block::new,
            copySettings(CHISELED_GRANITE));

    public static final Block COBBLED_GRANITE = register(
            "cobbled_granite", Block::new,
            copySettings(Blocks.GRANITE).strength(2.0F, 6.0F)
    );

    public static final Block COBBLED_GRANITE_STAIRS = register(
            "cobbled_granite_stairs",
            settings -> new ModStairsBlock(
                    COBBLED_GRANITE.getDefaultState(), settings),
            copySettings(COBBLED_GRANITE)
    );

    public static final Block COBBLED_GRANITE_SLAB = register(
            "cobbled_granite_slab",
            SlabBlock::new,
            copySettings(COBBLED_GRANITE)
    );

    public static final Block COBBLED_GRANITE_WALL = register(
            "cobbled_granite_wall",
            WallBlock::new,
            copySettings(COBBLED_GRANITE)
    );

    public static final Block MOSSY_COBBLED_GRANITE = register(
            "mossy_cobbled_granite",
            Block::new,
            copySettings(COBBLED_GRANITE)
    );

    public static final Block MOSSY_COBBLED_GRANITE_STAIRS = register(
            "mossy_cobbled_granite_stairs",
            settings -> new ModStairsBlock(
                    MOSSY_COBBLED_GRANITE.getDefaultState(), settings),
            copySettings(MOSSY_COBBLED_GRANITE)
    );

    public static final Block MOSSY_COBBLED_GRANITE_SLAB = register(
            "mossy_cobbled_granite_slab",
            SlabBlock::new,
            copySettings(MOSSY_COBBLED_GRANITE)
    );

    public static final Block MOSSY_COBBLED_GRANITE_WALL = register(
            "mossy_cobbled_granite_wall",
            WallBlock::new,
            copySettings(MOSSY_COBBLED_GRANITE)
    );

    public static final Block SMOOTH_GRANITE = register(
            "smooth_granite", Block::new,
            copySettings(Blocks.GRANITE));

    public static final Block SMOOTH_GRANITE_STAIRS = register(
            "smooth_granite_stairs",
            stairsOf(SMOOTH_GRANITE),
            copySettings(SMOOTH_GRANITE));

    public static final Block SMOOTH_GRANITE_SLAB = register(
            "smooth_granite_slab", SlabBlock::new,
            copySettings(SMOOTH_GRANITE));

    public static final Block SMOOTH_GRANITE_WALL = register(
            "smooth_granite_wall", WallBlock::new,
            createWallSettings(SMOOTH_GRANITE));

    public static final Block POLISHED_GRANITE_WALL = register(
            "polished_granite_wall", WallBlock::new,
            createWallSettings(Blocks.POLISHED_GRANITE));

    public static final Block POLISHED_GRANITE_PRESSURE_PLATE = register(
            "polished_granite_pressure_plate",
            pressurePlateType(ModBlockSetTypes.POLISHED_GRANITE),
            createPressurePlateSettings(Blocks.POLISHED_GRANITE));

    public static final Block POLISHED_GRANITE_BUTTON = register(
            "polished_granite_button",
            buttonType(ModBlockSetTypes.POLISHED_GRANITE),
            createButtonSettings());

    public static final Block GRANITE_BRICKS = register(
            "granite_bricks", Block::new,
            copySettings(Blocks.POLISHED_GRANITE));

    public static final Block GRANITE_BRICK_STAIRS = register(
            "granite_brick_stairs",
            stairsOf(GRANITE_BRICKS),
            copySettings(GRANITE_BRICKS));

    public static final Block GRANITE_BRICK_SLAB = register(
            "granite_brick_slab", SlabBlock::new,
            copySettings(GRANITE_BRICKS));

    public static final Block GRANITE_BRICK_WALL = register(
            "granite_brick_wall", WallBlock::new,
            createWallSettings(GRANITE_BRICKS));

    public static final Block CHISELED_GRANITE_BRICKS = register(
            "chiseled_granite_bricks", Block::new,
            copySettings(GRANITE_BRICKS));

    public static final Block MOSSY_GRANITE_BRICKS = register(
            "mossy_granite_bricks", Block::new,
            copySettings(GRANITE_BRICKS));

    public static final Block MOSSY_GRANITE_BRICK_STAIRS = register(
            "mossy_granite_brick_stairs",
            stairsOf(MOSSY_GRANITE_BRICKS),
            copySettings(MOSSY_GRANITE_BRICKS));

    public static final Block MOSSY_GRANITE_BRICK_SLAB = register(
            "mossy_granite_brick_slab", SlabBlock::new,
            copySettings(MOSSY_GRANITE_BRICKS));

    public static final Block MOSSY_GRANITE_BRICK_WALL = register(
            "mossy_granite_brick_wall", WallBlock::new,
            createWallSettings(MOSSY_GRANITE_BRICKS));

    public static final Block MOSSY_CHISELED_GRANITE_BRICKS = register(
            "mossy_chiseled_granite_bricks", Block::new,
            copySettings(CHISELED_GRANITE_BRICKS));

    public static final Block CRACKED_GRANITE_BRICKS = register(
            "cracked_granite_bricks", Block::new,
            copySettings(GRANITE_BRICKS));

    public static final Block CRACKED_GRANITE_BRICK_STAIRS = register(
            "cracked_granite_brick_stairs",
            stairsOf(CRACKED_GRANITE_BRICKS),
            copySettings(CRACKED_GRANITE_BRICKS));

    public static final Block CRACKED_GRANITE_BRICK_SLAB = register(
            "cracked_granite_brick_slab", SlabBlock::new,
            copySettings(CRACKED_GRANITE_BRICKS));

    public static final Block CRACKED_GRANITE_BRICK_WALL = register(
            "cracked_granite_brick_wall", WallBlock::new,
            createWallSettings(CRACKED_GRANITE_BRICKS));

    public static final Block CRACKED_CHISELED_GRANITE_BRICKS = register(
            "cracked_chiseled_granite_bricks", Block::new,
            copySettings(CHISELED_GRANITE_BRICKS));

    public static final Block GRANITE_PLATES = register(
            "granite_plates", Block::new,
            copySettings(GRANITE_BRICKS));

    public static final Block GRANITE_PLATE_STAIRS = register(
            "granite_plate_stairs",
            stairsOf(GRANITE_PLATES),
            copySettings(GRANITE_PLATES));

    public static final Block GRANITE_PLATE_SLAB = register(
            "granite_plate_slab", SlabBlock::new,
            copySettings(GRANITE_PLATES));

    public static final Block GRANITE_PLATE_WALL = register(
            "granite_plate_wall", WallBlock::new,
            createWallSettings(GRANITE_PLATES));

    public static final Block MOSSY_GRANITE_PLATES = register(
            "mossy_granite_plates", Block::new,
            copySettings(GRANITE_PLATES));

    public static final Block MOSSY_GRANITE_PLATE_STAIRS = register(
            "mossy_granite_plate_stairs",
            stairsOf(MOSSY_GRANITE_PLATES),
            copySettings(MOSSY_GRANITE_PLATES));

    public static final Block MOSSY_GRANITE_PLATE_SLAB = register(
            "mossy_granite_plate_slab", SlabBlock::new,
            copySettings(MOSSY_GRANITE_PLATES));

    public static final Block MOSSY_GRANITE_PLATE_WALL = register(
            "mossy_granite_plate_wall", WallBlock::new,
            createWallSettings(MOSSY_GRANITE_PLATES));

    public static final Block CRACKED_GRANITE_PLATES = register(
            "cracked_granite_plates", Block::new,
            copySettings(GRANITE_PLATES));

    public static final Block CRACKED_GRANITE_PLATE_STAIRS = register(
            "cracked_granite_plate_stairs",
            stairsOf(CRACKED_GRANITE_PLATES),
            copySettings(CRACKED_GRANITE_PLATES));

    public static final Block CRACKED_GRANITE_PLATE_SLAB = register(
            "cracked_granite_plate_slab", SlabBlock::new,
            copySettings(CRACKED_GRANITE_PLATES));

    public static final Block CRACKED_GRANITE_PLATE_WALL = register(
            "cracked_granite_plate_wall", WallBlock::new,
            createWallSettings(CRACKED_GRANITE_PLATES));

    public static final Block GRANITE_TILES = register(
            "granite_tiles", Block::new,
            copySettings(GRANITE_PLATES));

    public static final Block GRANITE_TILE_STAIRS = register(
            "granite_tile_stairs",
            stairsOf(GRANITE_TILES),
            copySettings(GRANITE_TILES));

    public static final Block GRANITE_TILE_SLAB = register(
            "granite_tile_slab", SlabBlock::new,
            copySettings(GRANITE_TILES));

    public static final Block GRANITE_TILE_WALL = register(
            "granite_tile_wall", WallBlock::new,
            createWallSettings(GRANITE_TILES));

    public static final Block MOSSY_GRANITE_TILES = register(
            "mossy_granite_tiles", Block::new,
            copySettings(GRANITE_TILES));

    public static final Block MOSSY_GRANITE_TILE_STAIRS = register(
            "mossy_granite_tile_stairs",
            stairsOf(MOSSY_GRANITE_TILES),
            copySettings(MOSSY_GRANITE_TILES));

    public static final Block MOSSY_GRANITE_TILE_SLAB = register(
            "mossy_granite_tile_slab", SlabBlock::new,
            copySettings(MOSSY_GRANITE_TILES));

    public static final Block MOSSY_GRANITE_TILE_WALL = register(
            "mossy_granite_tile_wall", WallBlock::new,
            createWallSettings(MOSSY_GRANITE_TILES));

    public static final Block CRACKED_GRANITE_TILES = register(
            "cracked_granite_tiles", Block::new,
            copySettings(GRANITE_TILES));

    public static final Block CRACKED_GRANITE_TILE_STAIRS = register(
            "cracked_granite_tile_stairs",
            stairsOf(CRACKED_GRANITE_TILES),
            copySettings(CRACKED_GRANITE_TILES));

    public static final Block CRACKED_GRANITE_TILE_SLAB = register(
            "cracked_granite_tile_slab", SlabBlock::new,
            copySettings(CRACKED_GRANITE_TILES));

    public static final Block CRACKED_GRANITE_TILE_WALL = register(
            "cracked_granite_tile_wall", WallBlock::new,
            createWallSettings(CRACKED_GRANITE_TILES));

    public static final Block GRANITE_PILLAR = register(
            "granite_pillar", PillarBlock::new,
            copySettings(Blocks.GRANITE));

    public static final Block MOSSY_GRANITE_PILLAR = register(
            "mossy_granite_pillar", PillarBlock::new,
            copySettings(GRANITE_PILLAR));

    public static final Block CRACKED_GRANITE_PILLAR = register(
            "cracked_granite_pillar", PillarBlock::new,
            copySettings(GRANITE_PILLAR));

    public static void init() {}

    public static void addCreativeEntries(FabricItemGroupEntries entries) {
        entries.addAfter(Blocks.GRANITE_WALL,
                CHISELED_GRANITE,
                MOSSY_CHISELED_GRANITE,
                CRACKED_CHISELED_GRANITE,

                COBBLED_GRANITE,
                COBBLED_GRANITE_STAIRS,
                COBBLED_GRANITE_SLAB,
                COBBLED_GRANITE_WALL,

                MOSSY_COBBLED_GRANITE,
                MOSSY_COBBLED_GRANITE_STAIRS,
                MOSSY_COBBLED_GRANITE_SLAB,
                MOSSY_COBBLED_GRANITE_WALL,

                SMOOTH_GRANITE,
                SMOOTH_GRANITE_STAIRS,
                SMOOTH_GRANITE_SLAB,
                SMOOTH_GRANITE_WALL);

        entries.addAfter(Blocks.POLISHED_GRANITE_SLAB,
                POLISHED_GRANITE_WALL,
                POLISHED_GRANITE_PRESSURE_PLATE,
                POLISHED_GRANITE_BUTTON,

                GRANITE_BRICKS,
                GRANITE_BRICK_STAIRS,
                GRANITE_BRICK_SLAB,
                GRANITE_BRICK_WALL,
                CHISELED_GRANITE_BRICKS,

                MOSSY_GRANITE_BRICKS,
                MOSSY_GRANITE_BRICK_STAIRS,
                MOSSY_GRANITE_BRICK_SLAB,
                MOSSY_GRANITE_BRICK_WALL,
                MOSSY_CHISELED_GRANITE_BRICKS,

                CRACKED_GRANITE_BRICKS,
                CRACKED_GRANITE_BRICK_STAIRS,
                CRACKED_GRANITE_BRICK_SLAB,
                CRACKED_GRANITE_BRICK_WALL,
                CRACKED_CHISELED_GRANITE_BRICKS,

                GRANITE_PLATES,
                GRANITE_PLATE_STAIRS,
                GRANITE_PLATE_SLAB,
                GRANITE_PLATE_WALL,

                MOSSY_GRANITE_PLATES,
                MOSSY_GRANITE_PLATE_STAIRS,
                MOSSY_GRANITE_PLATE_SLAB,
                MOSSY_GRANITE_PLATE_WALL,

                CRACKED_GRANITE_PLATES,
                CRACKED_GRANITE_PLATE_STAIRS,
                CRACKED_GRANITE_PLATE_SLAB,
                CRACKED_GRANITE_PLATE_WALL,

                GRANITE_TILES,
                GRANITE_TILE_STAIRS,
                GRANITE_TILE_SLAB,
                GRANITE_TILE_WALL,

                MOSSY_GRANITE_TILES,
                MOSSY_GRANITE_TILE_STAIRS,
                MOSSY_GRANITE_TILE_SLAB,
                MOSSY_GRANITE_TILE_WALL,

                CRACKED_GRANITE_TILES,
                CRACKED_GRANITE_TILE_STAIRS,
                CRACKED_GRANITE_TILE_SLAB,
                CRACKED_GRANITE_TILE_WALL,

                GRANITE_PILLAR,
                MOSSY_GRANITE_PILLAR,
                CRACKED_GRANITE_PILLAR);
    }
}
