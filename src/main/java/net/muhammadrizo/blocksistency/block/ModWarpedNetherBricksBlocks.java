package net.muhammadrizo.blocksistency.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.block.*;
import net.muhammadrizo.blocksistency.block.custom.NetherBrickFenceGateBlock;

import static net.muhammadrizo.blocksistency.block.ModBlocks.*;

public class ModWarpedNetherBricksBlocks {
    public static final Block WARPED_NETHER_BRICKS = register(
            "warped_nether_bricks", Block::new,
            copySettings(Blocks.NETHER_BRICKS));

    public static final Block WARPED_NETHER_BRICK_STAIRS = register(
            "warped_nether_brick_stairs",
            stairsOf(WARPED_NETHER_BRICKS),
            copySettings(WARPED_NETHER_BRICKS));

    public static final Block WARPED_NETHER_BRICK_SLAB = register(
            "warped_nether_brick_slab", SlabBlock::new,
            copySettings(WARPED_NETHER_BRICKS));

    public static final Block WARPED_NETHER_BRICK_WALL = register(
            "warped_nether_brick_wall", WallBlock::new,
            createWallSettings(WARPED_NETHER_BRICKS));

    public static final Block WARPED_NETHER_BRICK_FENCE = register(
            "warped_nether_brick_fence", FenceBlock::new,
            copySettings(WARPED_NETHER_BRICKS));

    public static final Block WARPED_NETHER_BRICK_FENCE_GATE = register(
            "warped_nether_brick_fence_gate", NetherBrickFenceGateBlock::new,
            createFenceGateSettings(WARPED_NETHER_BRICKS));

    public static final Block CRACKED_WARPED_NETHER_BRICKS = register(
            "cracked_warped_nether_bricks", Block::new,
            copySettings(WARPED_NETHER_BRICKS));

    public static final Block CRACKED_WARPED_NETHER_BRICK_STAIRS = register(
            "cracked_warped_nether_brick_stairs",
            stairsOf(CRACKED_WARPED_NETHER_BRICKS),
            copySettings(CRACKED_WARPED_NETHER_BRICKS));

    public static final Block CRACKED_WARPED_NETHER_BRICK_SLAB = register(
            "cracked_warped_nether_brick_slab", SlabBlock::new,
            copySettings(CRACKED_WARPED_NETHER_BRICKS));

    public static final Block CRACKED_WARPED_NETHER_BRICK_WALL = register(
            "cracked_warped_nether_brick_wall", WallBlock::new,
            createWallSettings(CRACKED_WARPED_NETHER_BRICKS));

    public static final Block CRACKED_WARPED_NETHER_BRICK_FENCE = register(
            "cracked_warped_nether_brick_fence", FenceBlock::new,
            copySettings(CRACKED_WARPED_NETHER_BRICKS));

    public static final Block CRACKED_WARPED_NETHER_BRICK_FENCE_GATE = register(
            "cracked_warped_nether_brick_fence_gate", NetherBrickFenceGateBlock::new,
            createFenceGateSettings(CRACKED_WARPED_NETHER_BRICKS));

    public static final Block CHISELED_WARPED_NETHER_BRICKS = register(
            "chiseled_warped_nether_bricks", Block::new,
            copySettings(WARPED_NETHER_BRICKS));

    public static final Block CRACKED_CHISELED_WARPED_NETHER_BRICKS = register(
            "cracked_chiseled_warped_nether_bricks", Block::new,
            copySettings(CHISELED_WARPED_NETHER_BRICKS));

    public static final Block WARPED_NETHER_BRICK_PILLAR = register(
            "warped_nether_brick_pillar", PillarBlock::new,
            copySettings(WARPED_NETHER_BRICKS));

    public static final Block CRACKED_WARPED_NETHER_BRICK_PILLAR = register(
            "cracked_warped_nether_brick_pillar", PillarBlock::new,
            copySettings(WARPED_NETHER_BRICK_PILLAR));

    public static void init() {}

    public static void addCreativeEntries(FabricItemGroupEntries entries) {
        entries.addAfter(ModRedNetherBricksBlocks.CRACKED_RED_NETHER_BRICK_PILLAR,
                WARPED_NETHER_BRICKS,
                WARPED_NETHER_BRICK_STAIRS,
                WARPED_NETHER_BRICK_SLAB,
                WARPED_NETHER_BRICK_WALL,
                WARPED_NETHER_BRICK_FENCE,
                WARPED_NETHER_BRICK_FENCE_GATE,
                CHISELED_WARPED_NETHER_BRICKS,

                CRACKED_WARPED_NETHER_BRICKS,
                CRACKED_WARPED_NETHER_BRICK_STAIRS,
                CRACKED_WARPED_NETHER_BRICK_SLAB,
                CRACKED_WARPED_NETHER_BRICK_WALL,
                CRACKED_WARPED_NETHER_BRICK_FENCE,
                CRACKED_WARPED_NETHER_BRICK_FENCE_GATE,
                CRACKED_CHISELED_WARPED_NETHER_BRICKS,

                WARPED_NETHER_BRICK_PILLAR,
                CRACKED_WARPED_NETHER_BRICK_PILLAR);
    }
}
