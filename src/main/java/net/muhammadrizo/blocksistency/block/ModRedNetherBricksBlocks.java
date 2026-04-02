package net.muhammadrizo.blocksistency.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.block.*;
import net.muhammadrizo.blocksistency.block.custom.NetherBrickFenceGateBlock;

import static net.muhammadrizo.blocksistency.block.ModBlocks.*;

public class ModRedNetherBricksBlocks {
    public static final Block RED_NETHER_BRICK_FENCE = register(
            "red_nether_brick_fence", FenceBlock::new,
            copySettings(Blocks.RED_NETHER_BRICKS));

    public static final Block RED_NETHER_BRICK_FENCE_GATE = register(
            "red_nether_brick_fence_gate", NetherBrickFenceGateBlock::new,
            createFenceGateSettings(Blocks.RED_NETHER_BRICKS));

    public static final Block CRACKED_RED_NETHER_BRICKS = register(
            "cracked_red_nether_bricks", Block::new,
            copySettings(Blocks.RED_NETHER_BRICKS));

    public static final Block CRACKED_RED_NETHER_BRICK_STAIRS = register(
            "cracked_red_nether_brick_stairs",
            stairsOf(CRACKED_RED_NETHER_BRICKS),
            copySettings(CRACKED_RED_NETHER_BRICKS));

    public static final Block CRACKED_RED_NETHER_BRICK_SLAB = register(
            "cracked_red_nether_brick_slab", SlabBlock::new,
            copySettings(CRACKED_RED_NETHER_BRICKS));

    public static final Block CRACKED_RED_NETHER_BRICK_WALL = register(
            "cracked_red_nether_brick_wall", WallBlock::new,
            createWallSettings(CRACKED_RED_NETHER_BRICKS));

    public static final Block CRACKED_RED_NETHER_BRICK_FENCE = register(
            "cracked_red_nether_brick_fence", FenceBlock::new,
            copySettings(CRACKED_RED_NETHER_BRICKS));

    public static final Block CRACKED_RED_NETHER_BRICK_FENCE_GATE = register(
            "cracked_red_nether_brick_fence_gate", NetherBrickFenceGateBlock::new,
            createFenceGateSettings(CRACKED_RED_NETHER_BRICKS));

    public static final Block CHISELED_RED_NETHER_BRICKS = register(
            "chiseled_red_nether_bricks", Block::new,
            copySettings(Blocks.RED_NETHER_BRICKS));

    public static final Block CRACKED_CHISELED_RED_NETHER_BRICKS = register(
            "cracked_chiseled_red_nether_bricks", Block::new,
            copySettings(CHISELED_RED_NETHER_BRICKS));

    public static final Block RED_NETHER_BRICK_PILLAR = register(
            "red_nether_brick_pillar", PillarBlock::new,
            copySettings(Blocks.RED_NETHER_BRICKS));

    public static final Block CRACKED_RED_NETHER_BRICK_PILLAR = register(
            "cracked_red_nether_brick_pillar", PillarBlock::new,
            copySettings(RED_NETHER_BRICK_PILLAR));

    public static void init() {}

    public static void addCreativeEntries(FabricItemGroupEntries entries) {
        entries.addAfter(Blocks.RED_NETHER_BRICK_WALL,
                RED_NETHER_BRICK_FENCE,
                RED_NETHER_BRICK_FENCE_GATE,
                CHISELED_RED_NETHER_BRICKS,

                CRACKED_RED_NETHER_BRICKS,
                CRACKED_RED_NETHER_BRICK_STAIRS,
                CRACKED_RED_NETHER_BRICK_SLAB,
                CRACKED_RED_NETHER_BRICK_WALL,
                CRACKED_RED_NETHER_BRICK_FENCE,
                CRACKED_RED_NETHER_BRICK_FENCE_GATE,
                CRACKED_CHISELED_RED_NETHER_BRICKS,

                RED_NETHER_BRICK_PILLAR,
                CRACKED_RED_NETHER_BRICK_PILLAR);
    }
}
