package net.muhammadrizo.blocksistency.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.block.*;

import static net.muhammadrizo.blocksistency.block.ModBlocks.register;

public class ModStoneBlocks {
    public static final Block STONE_WALL = register(
            "stone_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(Blocks.STONE),
            true
    );

    public static final Block CHISELED_STONE = register(
            "chiseled_stone",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.STONE),
            true
    );

    public static final Block MOSSY_CHISELED_STONE = register(
            "mossy_chiseled_stone",
            Block::new,
            AbstractBlock.Settings.copy(ModStoneBlocks.CHISELED_STONE),
            true
    );

    public static final Block CRACKED_CHISELED_STONE = register(
            "cracked_chiseled_stone",
            Block::new,
            AbstractBlock.Settings.copy(ModStoneBlocks.CHISELED_STONE),
            true
    );

    public static final Block SMOOTH_STONE_STAIRS = register(
            "smooth_stone_stairs",
            settings -> new ModStairsBlock(
                    Blocks.STONE.getDefaultState(),
                    settings
            ),
            AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE),
            true
    );

    public static final Block SMOOTH_STONE_WALL = register(
            "smooth_stone_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE),
            true
    );

    public static final Block POLISHED_STONE = register(
            "polished_stone",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.STONE),
            true
    );

    public static final Block POLISHED_STONE_STAIRS = register(
            "polished_stone_stairs",
            settings -> new ModStairsBlock(
                    ModStoneBlocks.POLISHED_STONE.getDefaultState(),
                    settings
            ),
            AbstractBlock.Settings.copy(ModStoneBlocks.POLISHED_STONE),
            true
    );

    public static final Block POLISHED_STONE_SLAB = register(
            "polished_stone_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(ModStoneBlocks.POLISHED_STONE),
            true
    );

    public static final Block POLISHED_STONE_WALL = register(
            "polished_stone_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(ModStoneBlocks.POLISHED_STONE),
            true
    );

    public static final Block MOSSY_CHISELED_STONE_BRICKS = register(
            "mossy_chiseled_stone_bricks",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS),
            true
    );

    public static final Block CRACKED_STONE_BRICK_STAIRS = register(
            "cracked_stone_brick_stairs",
            settings -> new ModStairsBlock(
                    Blocks.CRACKED_STONE_BRICKS.getDefaultState(),
                    settings
            ),
            AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS),
            true
    );

    public static final Block CRACKED_STONE_BRICK_SLAB = register(
            "cracked_stone_brick_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS),
            true
    );

    public static final Block CRACKED_STONE_BRICK_WALL = register(
            "cracked_stone_brick_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS),
            true
    );

    public static final Block CRACKED_CHISELED_STONE_BRICKS = register(
            "cracked_chiseled_stone_bricks",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS),
            true
    );

    public static final Block STONE_TILES = register(
            "stone_tiles",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.STONE_BRICKS),
            true
    );

    public static final Block STONE_TILE_STAIRS = register(
            "stone_tile_stairs",
            settings -> new ModStairsBlock(
                    ModStoneBlocks.STONE_TILES.getDefaultState(),
                    settings
            ),
            AbstractBlock.Settings.copy(ModStoneBlocks.STONE_TILES),
            true
    );

    public static final Block STONE_TILE_SLAB = register(
            "stone_tile_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(ModStoneBlocks.STONE_TILES),
            true
    );

    public static final Block STONE_TILE_WALL = register(
            "stone_tile_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(ModStoneBlocks.STONE_TILES),
            true
    );

    public static final Block MOSSY_STONE_TILES = register(
            "mossy_stone_tiles",
            Block::new,
            AbstractBlock.Settings.copy(ModStoneBlocks.STONE_TILES),
            true
    );

    public static final Block MOSSY_STONE_TILE_STAIRS = register(
            "mossy_stone_tile_stairs",
            settings -> new ModStairsBlock(
                    ModStoneBlocks.MOSSY_STONE_TILES.getDefaultState(),
                    settings
            ),
            AbstractBlock.Settings.copy(ModStoneBlocks.MOSSY_STONE_TILES),
            true
    );

    public static final Block MOSSY_STONE_TILE_SLAB = register(
            "mossy_stone_tile_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(ModStoneBlocks.MOSSY_STONE_TILES),
            true
    );

    public static final Block MOSSY_STONE_TILE_WALL = register(
            "mossy_stone_tile_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(ModStoneBlocks.MOSSY_STONE_TILES),
            true
    );

    public static final Block CRACKED_STONE_TILES = register(
            "cracked_stone_tiles",
            Block::new,
            AbstractBlock.Settings.copy(ModStoneBlocks.STONE_TILES),
            true
    );

    public static final Block CRACKED_STONE_TILE_STAIRS = register(
            "cracked_stone_tile_stairs",
            settings -> new ModStairsBlock(
                    ModStoneBlocks.CRACKED_STONE_TILES.getDefaultState(),
                    settings
            ),
            AbstractBlock.Settings.copy(ModStoneBlocks.CRACKED_STONE_TILES),
            true
    );

    public static final Block CRACKED_STONE_TILE_SLAB = register(
            "cracked_stone_tile_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(ModStoneBlocks.CRACKED_STONE_TILES),
            true
    );

    public static final Block CRACKED_STONE_TILE_WALL = register(
            "cracked_stone_tile_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(ModStoneBlocks.CRACKED_STONE_TILES),
            true
    );

    public static final Block STONE_PILLAR = register(
            "stone_pillar",
            PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STONE),
            true
    );

    public static final Block MOSSY_STONE_PILLAR = register(
            "mossy_stone_pillar",
            PillarBlock::new,
            AbstractBlock.Settings.copy(ModStoneBlocks.STONE_PILLAR),
            true
    );

    public static final Block CRACKED_STONE_PILLAR = register(
            "cracked_stone_pillar",
            PillarBlock::new,
            AbstractBlock.Settings.copy(ModStoneBlocks.STONE_PILLAR),
            true
    );
    
    public static void load() {}

    public static void addCreativeEntries(FabricItemGroupEntries entries) {
        entries.addAfter(Blocks.STONE_SLAB,
                ModStoneBlocks.STONE_WALL,
                ModStoneBlocks.CHISELED_STONE,
                ModStoneBlocks.MOSSY_CHISELED_STONE,
                ModStoneBlocks.CRACKED_CHISELED_STONE
        );

        entries.addAfter(Blocks.SMOOTH_STONE,
                ModStoneBlocks.SMOOTH_STONE_STAIRS);

        entries.addAfter(Blocks.SMOOTH_STONE_SLAB,
                ModStoneBlocks.SMOOTH_STONE_WALL,
                ModStoneBlocks.POLISHED_STONE,
                ModStoneBlocks.POLISHED_STONE_STAIRS,
                ModStoneBlocks.POLISHED_STONE_SLAB,
                ModStoneBlocks.POLISHED_STONE_WALL);

        entries.addAfter(Blocks.MOSSY_STONE_BRICK_WALL,
                ModStoneBlocks.MOSSY_CHISELED_STONE_BRICKS);

        entries.getDisplayStacks().removeIf(stack ->
                stack.getItem().equals(Blocks.CRACKED_STONE_BRICKS.asItem()));
        entries.getSearchTabStacks().removeIf(stack ->
                stack.getItem().equals(Blocks.CRACKED_STONE_BRICKS.asItem()));

        entries.addAfter(ModStoneBlocks.MOSSY_CHISELED_STONE_BRICKS,
                Blocks.CRACKED_STONE_BRICKS,
                ModStoneBlocks.CRACKED_STONE_BRICK_STAIRS,
                ModStoneBlocks.CRACKED_STONE_BRICK_SLAB,
                ModStoneBlocks.CRACKED_STONE_BRICK_WALL,
                ModStoneBlocks.CRACKED_CHISELED_STONE_BRICKS,
                ModStoneBlocks.STONE_TILES,
                ModStoneBlocks.STONE_TILE_STAIRS,
                ModStoneBlocks.STONE_TILE_SLAB,
                ModStoneBlocks.STONE_TILE_WALL,
                ModStoneBlocks.MOSSY_STONE_TILES,
                ModStoneBlocks.MOSSY_STONE_TILE_STAIRS,
                ModStoneBlocks.MOSSY_STONE_TILE_SLAB,
                ModStoneBlocks.MOSSY_STONE_TILE_WALL,
                ModStoneBlocks.CRACKED_STONE_TILES,
                ModStoneBlocks.CRACKED_STONE_TILE_STAIRS,
                ModStoneBlocks.CRACKED_STONE_TILE_SLAB,
                ModStoneBlocks.CRACKED_STONE_TILE_WALL,
                ModStoneBlocks.STONE_PILLAR,
                ModStoneBlocks.MOSSY_STONE_PILLAR,
                ModStoneBlocks.CRACKED_STONE_PILLAR);
    }
}
