package net.muhammadrizo.blocksistency.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;

import static net.muhammadrizo.blocksistency.block.ModBlocks.*;

public class ModBricksBlocks {
    public static final Block CHISELED_BRICKS = register(
            "chiseled_bricks", Block::new,
            copySettings(Blocks.BRICKS));

    public static final Block MOSSY_BRICKS = register(
            "mossy_bricks", Block::new,
            copySettings(Blocks.BRICKS));
    public static final Block MOSSY_BRICK_STAIRS = register(
            "mossy_brick_stairs",
            stairsOf(MOSSY_BRICKS),
            copySettings(MOSSY_BRICKS));
    public static final Block MOSSY_BRICK_SLAB = register(
            "mossy_brick_slab", SlabBlock::new,
            copySettings(MOSSY_BRICKS));

    public static final Block MOSSY_BRICK_WALL = register(
            "mossy_brick_wall", WallBlock::new,
            createWallSettings(MOSSY_BRICKS));

    public static final Block MOSSY_CHISELED_BRICKS = register(
            "mossy_chiseled_bricks", Block::new,
            copySettings(CHISELED_BRICKS));

    public static final Block CRACKED_BRICKS = register(
            "cracked_bricks", Block::new,
            copySettings(Blocks.BRICKS));
    public static final Block CRACKED_BRICK_STAIRS = register(
            "cracked_brick_stairs",
            stairsOf(CRACKED_BRICKS),
            copySettings(CRACKED_BRICKS));
    public static final Block CRACKED_BRICK_SLAB = register(
            "cracked_brick_slab", SlabBlock::new,
            copySettings(CRACKED_BRICKS));

    public static final Block CRACKED_BRICK_WALL = register(
            "cracked_brick_wall", WallBlock::new,
            createWallSettings(CRACKED_BRICKS));

    public static final Block CRACKED_CHISELED_BRICKS = register(
            "cracked_chiseled_bricks", Block::new,
            copySettings(CHISELED_BRICKS));

    public static void init() {}

    public static void addCreativeEntries(FabricItemGroupEntries entries) {
        entries.addAfter(Blocks.BRICK_WALL,
                CHISELED_BRICKS,

                MOSSY_BRICKS,
                MOSSY_BRICK_STAIRS,
                MOSSY_BRICK_SLAB,
                MOSSY_BRICK_WALL,
                MOSSY_CHISELED_BRICKS,

                CRACKED_BRICKS,
                CRACKED_BRICK_STAIRS,
                CRACKED_BRICK_SLAB,
                CRACKED_BRICK_WALL,
                CRACKED_CHISELED_BRICKS
        );
    }
}
