package net.muhammadrizo.blocksistency.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.block.*;

import static net.muhammadrizo.blocksistency.block.ModBlocks.*;

public class ModStoneBlocks {
    public static final Block STONE_WALL = register(
            "stone_wall", WallBlock::new,
            createWallSettings(Blocks.STONE));

    public static final Block CHISELED_STONE = register(
            "chiseled_stone", Block::new,
            copySettings(Blocks.STONE));

    public static final Block MOSSY_CHISELED_STONE = register(
            "mossy_chiseled_stone", Block::new,
            copySettings(CHISELED_STONE));

    public static final Block CRACKED_CHISELED_STONE = register(
            "cracked_chiseled_stone", Block::new,
            copySettings(CHISELED_STONE));

    public static final Block SMOOTH_STONE_STAIRS = register(
            "smooth_stone_stairs",
            stairsOf(Blocks.SMOOTH_STONE),
            copySettings(Blocks.SMOOTH_STONE)
                    .strength(1.5F, 6.0F));

    public static final Block SMOOTH_STONE_WALL = register(
            "smooth_stone_wall", WallBlock::new,
            createWallSettings(Blocks.SMOOTH_STONE)
                    .strength(1.5F, 6.0F));

    public static final Block POLISHED_STONE = register(
            "polished_stone", Block::new,
            copySettings(Blocks.STONE));

    public static final Block POLISHED_STONE_STAIRS = register(
            "polished_stone_stairs",
            stairsOf(POLISHED_STONE),
            copySettings(POLISHED_STONE));

    public static final Block POLISHED_STONE_SLAB = register(
            "polished_stone_slab", SlabBlock::new,
            copySettings(POLISHED_STONE));

    public static final Block POLISHED_STONE_WALL = register(
            "polished_stone_wall", WallBlock::new,
            createWallSettings(POLISHED_STONE));

    public static final Block MOSSY_CHISELED_STONE_BRICKS = register(
            "mossy_chiseled_stone_bricks", Block::new,
            copySettings(Blocks.CHISELED_STONE_BRICKS));

    public static final Block CRACKED_STONE_BRICK_STAIRS = register(
            "cracked_stone_brick_stairs",
            stairsOf(Blocks.CRACKED_STONE_BRICKS),
            copySettings(Blocks.CRACKED_STONE_BRICKS));

    public static final Block CRACKED_STONE_BRICK_SLAB = register(
            "cracked_stone_brick_slab", SlabBlock::new,
            copySettings(Blocks.CRACKED_STONE_BRICKS));

    public static final Block CRACKED_STONE_BRICK_WALL = register(
            "cracked_stone_brick_wall", WallBlock::new,
            createWallSettings(Blocks.CRACKED_STONE_BRICKS));

    public static final Block CRACKED_CHISELED_STONE_BRICKS = register(
            "cracked_chiseled_stone_bricks", Block::new,
            copySettings(Blocks.CHISELED_STONE_BRICKS));

    public static final Block STONE_PLATES = register(
            "stone_plates", Block::new,
            copySettings(Blocks.STONE_BRICKS));

    public static final Block STONE_PLATE_STAIRS = register(
            "stone_plate_stairs",
            stairsOf(STONE_PLATES),
            copySettings(STONE_PLATES));

    public static final Block STONE_PLATE_SLAB = register(
            "stone_plate_slab", SlabBlock::new,
            copySettings(STONE_PLATES));

    public static final Block STONE_PLATE_WALL = register(
            "stone_plate_wall", WallBlock::new,
            createWallSettings(STONE_PLATES));

    public static final Block MOSSY_STONE_PLATES = register(
            "mossy_stone_plates", Block::new,
            copySettings(STONE_PLATES));

    public static final Block MOSSY_STONE_PLATE_STAIRS = register(
            "mossy_stone_plate_stairs",
            stairsOf(MOSSY_STONE_PLATES),
            copySettings(MOSSY_STONE_PLATES));

    public static final Block MOSSY_STONE_PLATE_SLAB = register(
            "mossy_stone_plate_slab", SlabBlock::new,
            copySettings(MOSSY_STONE_PLATES));

    public static final Block MOSSY_STONE_PLATE_WALL = register(
            "mossy_stone_plate_wall", WallBlock::new,
            createWallSettings(MOSSY_STONE_PLATES));

    public static final Block CRACKED_STONE_PLATES = register(
            "cracked_stone_plates", Block::new,
            copySettings(STONE_PLATES));

    public static final Block CRACKED_STONE_PLATE_STAIRS = register(
            "cracked_stone_plate_stairs",
            stairsOf(CRACKED_STONE_PLATES),
            copySettings(CRACKED_STONE_PLATES));

    public static final Block CRACKED_STONE_PLATE_SLAB = register(
            "cracked_stone_plate_slab", SlabBlock::new,
            copySettings(CRACKED_STONE_PLATES));

    public static final Block CRACKED_STONE_PLATE_WALL = register(
            "cracked_stone_plate_wall", WallBlock::new,
            createWallSettings(CRACKED_STONE_PLATES));

    public static final Block STONE_TILES = register(
            "stone_tiles", Block::new,
            copySettings(STONE_PLATES));

    public static final Block STONE_TILE_STAIRS = register(
            "stone_tile_stairs",
            stairsOf(STONE_TILES),
            copySettings(STONE_TILES));

    public static final Block STONE_TILE_SLAB = register(
            "stone_tile_slab", SlabBlock::new,
            copySettings(STONE_TILES));

    public static final Block STONE_TILE_WALL = register(
            "stone_tile_wall", WallBlock::new,
            createWallSettings(STONE_TILES));

    public static final Block MOSSY_STONE_TILES = register(
            "mossy_stone_tiles", Block::new,
            copySettings(STONE_TILES));

    public static final Block MOSSY_STONE_TILE_STAIRS = register(
            "mossy_stone_tile_stairs",
            stairsOf(MOSSY_STONE_TILES),
            copySettings(MOSSY_STONE_TILES));

    public static final Block MOSSY_STONE_TILE_SLAB = register(
            "mossy_stone_tile_slab", SlabBlock::new,
            copySettings(MOSSY_STONE_TILES));

    public static final Block MOSSY_STONE_TILE_WALL = register(
            "mossy_stone_tile_wall", WallBlock::new,
            createWallSettings(MOSSY_STONE_TILES));

    public static final Block CRACKED_STONE_TILES = register(
            "cracked_stone_tiles", Block::new,
            copySettings(STONE_TILES));

    public static final Block CRACKED_STONE_TILE_STAIRS = register(
            "cracked_stone_tile_stairs",
            stairsOf(CRACKED_STONE_TILES),
            copySettings(CRACKED_STONE_TILES));

    public static final Block CRACKED_STONE_TILE_SLAB = register(
            "cracked_stone_tile_slab", SlabBlock::new,
            copySettings(CRACKED_STONE_TILES));

    public static final Block CRACKED_STONE_TILE_WALL = register(
            "cracked_stone_tile_wall", WallBlock::new,
            createWallSettings(CRACKED_STONE_TILES));

    public static final Block STONE_PILLAR = register(
            "stone_pillar", PillarBlock::new,
            copySettings(Blocks.STONE));

    public static final Block MOSSY_STONE_PILLAR = register(
            "mossy_stone_pillar", PillarBlock::new,
            copySettings(STONE_PILLAR));

    public static final Block CRACKED_STONE_PILLAR = register(
            "cracked_stone_pillar", PillarBlock::new,
            copySettings(STONE_PILLAR));
    
    public static void init() {
        fixBlockHardnessAndBlastResistance(Blocks.STONE_SLAB, Blocks.STONE);

        fixBlockHardnessAndBlastResistance(Blocks.SMOOTH_STONE, Blocks.STONE);
        fixBlockHardnessAndBlastResistance(Blocks.SMOOTH_STONE_SLAB, Blocks.SMOOTH_STONE);

        fixBlockHardnessAndBlastResistance(Blocks.STONE_BRICK_SLAB, Blocks.STONE_BRICKS);
    }

    public static void addCreativeEntries(FabricItemGroupEntries entries) {
        entries.addAfter(Blocks.STONE_SLAB,
                STONE_WALL);

        entries.addAfter(Blocks.STONE_BUTTON,
                CHISELED_STONE,
                MOSSY_CHISELED_STONE,
                CRACKED_CHISELED_STONE);

        entries.addAfter(Blocks.SMOOTH_STONE,
                SMOOTH_STONE_STAIRS);

        entries.addAfter(Blocks.SMOOTH_STONE_SLAB,
                SMOOTH_STONE_WALL,

                POLISHED_STONE,
                POLISHED_STONE_STAIRS,
                POLISHED_STONE_SLAB,
                POLISHED_STONE_WALL);

        entries.addAfter(Blocks.MOSSY_STONE_BRICK_WALL,
                MOSSY_CHISELED_STONE_BRICKS);

        entries.getDisplayStacks().removeIf(stack ->
                stack.getItem().equals(Blocks.CRACKED_STONE_BRICKS.asItem()));
        entries.getSearchTabStacks().removeIf(stack ->
                stack.getItem().equals(Blocks.CRACKED_STONE_BRICKS.asItem()));

        entries.addAfter(MOSSY_CHISELED_STONE_BRICKS,
                Blocks.CRACKED_STONE_BRICKS,
                CRACKED_STONE_BRICK_STAIRS,
                CRACKED_STONE_BRICK_SLAB,
                CRACKED_STONE_BRICK_WALL,
                CRACKED_CHISELED_STONE_BRICKS,

                STONE_PLATES,
                STONE_PLATE_STAIRS,
                STONE_PLATE_SLAB,
                STONE_PLATE_WALL,

                MOSSY_STONE_PLATES,
                MOSSY_STONE_PLATE_STAIRS,
                MOSSY_STONE_PLATE_SLAB,
                MOSSY_STONE_PLATE_WALL,

                CRACKED_STONE_PLATES,
                CRACKED_STONE_PLATE_STAIRS,
                CRACKED_STONE_PLATE_SLAB,
                CRACKED_STONE_PLATE_WALL,

                STONE_TILES,
                STONE_TILE_STAIRS,
                STONE_TILE_SLAB,
                STONE_TILE_WALL,

                MOSSY_STONE_TILES,
                MOSSY_STONE_TILE_STAIRS,
                MOSSY_STONE_TILE_SLAB,
                MOSSY_STONE_TILE_WALL,

                CRACKED_STONE_TILES,
                CRACKED_STONE_TILE_STAIRS,
                CRACKED_STONE_TILE_SLAB,
                CRACKED_STONE_TILE_WALL,

                STONE_PILLAR,
                MOSSY_STONE_PILLAR,
                CRACKED_STONE_PILLAR);
    }
}
