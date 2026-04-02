package net.muhammadrizo.blocksistency.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.block.*;
import net.muhammadrizo.blocksistency.block.custom.NetherBrickFenceGateBlock;

import static net.muhammadrizo.blocksistency.block.ModBlocks.*;

public class ModNetherBricksBlocks {
    public static final Block NETHER_BRICK_FENCE_GATE = register(
            "nether_brick_fence_gate", NetherBrickFenceGateBlock::new,
            createFenceGateSettings(Blocks.NETHER_BRICKS));

    public static final Block CRACKED_NETHER_BRICK_STAIRS = register(
            "cracked_nether_brick_stairs",
            stairsOf(Blocks.CRACKED_NETHER_BRICKS),
            copySettings(Blocks.CRACKED_NETHER_BRICKS));

    public static final Block CRACKED_NETHER_BRICK_SLAB = register(
            "cracked_nether_brick_slab", SlabBlock::new,
            copySettings(Blocks.CRACKED_NETHER_BRICKS));

    public static final Block CRACKED_NETHER_BRICK_WALL = register(
            "cracked_nether_brick_wall", WallBlock::new,
            createWallSettings(Blocks.CRACKED_NETHER_BRICKS));

    public static final Block CRACKED_NETHER_BRICK_FENCE = register(
            "cracked_nether_brick_fence", FenceBlock::new,
            copySettings(Blocks.CRACKED_NETHER_BRICKS));

    public static final Block CRACKED_NETHER_BRICK_FENCE_GATE = register(
            "cracked_nether_brick_fence_gate", NetherBrickFenceGateBlock::new,
            createFenceGateSettings(Blocks.CRACKED_NETHER_BRICKS));

    public static final Block CRACKED_CHISELED_NETHER_BRICKS = register(
            "cracked_chiseled_nether_bricks", Block::new,
            copySettings(Blocks.CHISELED_NETHER_BRICKS));

    public static final Block NETHER_BRICK_PILLAR = register(
            "nether_brick_pillar", PillarBlock::new,
            copySettings(Blocks.NETHER_BRICKS));

    public static final Block CRACKED_NETHER_BRICK_PILLAR = register(
            "cracked_nether_brick_pillar", PillarBlock::new,
            copySettings(NETHER_BRICK_PILLAR));

    public static void init() {}

    public static void addCreativeEntries(FabricItemGroupEntries entries) {
        entries.addAfter(Blocks.NETHER_BRICK_FENCE,
                NETHER_BRICK_FENCE_GATE);

        entries.getDisplayStacks().removeIf(stack ->
                stack.getItem().equals(Blocks.CRACKED_NETHER_BRICKS.asItem()));
        entries.getSearchTabStacks().removeIf(stack ->
                stack.getItem().equals(Blocks.CRACKED_NETHER_BRICKS.asItem()));

        entries.addAfter(Blocks.CHISELED_NETHER_BRICKS,
                Blocks.CRACKED_NETHER_BRICKS,
                CRACKED_NETHER_BRICK_STAIRS,
                CRACKED_NETHER_BRICK_SLAB,
                CRACKED_NETHER_BRICK_WALL,
                CRACKED_NETHER_BRICK_FENCE,
                CRACKED_NETHER_BRICK_FENCE_GATE,
                CRACKED_CHISELED_NETHER_BRICKS,

                NETHER_BRICK_PILLAR,
                CRACKED_NETHER_BRICK_PILLAR);
    }
}
