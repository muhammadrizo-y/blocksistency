package net.muhammadrizo.blocksistency.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.muhammadrizo.blocksistency.block.types.ModBlockSetTypes;

import static net.muhammadrizo.blocksistency.block.ModBlocks.*;

public class ModDeepslateBlocks {
    public static final Block DEEPSLATE_STAIRS = register(
            "deepslate_stairs",
            stairsOf(Blocks.DEEPSLATE),
            copySettings(Blocks.DEEPSLATE));

    public static final Block DEEPSLATE_SLAB = register(
            "deepslate_slab", SlabBlock::new,
            copySettings(Blocks.DEEPSLATE));

    public static final Block DEEPSLATE_WALL = register(
            "deepslate_wall", WallBlock::new,
            createWallSettings(Blocks.DEEPSLATE));

    public static final Block MOSSY_CHISELED_DEEPSLATE = register(
            "mossy_chiseled_deepslate", Block::new,
            copySettings(Blocks.CHISELED_DEEPSLATE)
                    .strength(3.0F, 6.0F));

    public static final Block CRACKED_CHISELED_DEEPSLATE = register(
            "cracked_chiseled_deepslate", Block::new,
            copySettings(Blocks.CHISELED_DEEPSLATE)
                    .strength(3.0F, 6.0F));

    public static final Block MOSSY_COBBLED_DEEPSLATE = register(
            "mossy_cobbled_deepslate", Block::new,
            copySettings(Blocks.COBBLED_DEEPSLATE));

    public static final Block MOSSY_COBBLED_DEEPSLATE_STAIRS = register(
            "mossy_cobbled_deepslate_stairs",
            stairsOf(MOSSY_COBBLED_DEEPSLATE),
            copySettings(MOSSY_COBBLED_DEEPSLATE));

    public static final Block MOSSY_COBBLED_DEEPSLATE_SLAB = register(
            "mossy_cobbled_deepslate_slab", SlabBlock::new,
            copySettings(MOSSY_COBBLED_DEEPSLATE));

    public static final Block MOSSY_COBBLED_DEEPSLATE_WALL = register(
            "mossy_cobbled_deepslate_wall", WallBlock::new,
            createWallSettings(MOSSY_COBBLED_DEEPSLATE));

    public static final Block SMOOTH_DEEPSLATE = register(
            "smooth_deepslate", Block::new,
            copySettings(Blocks.DEEPSLATE));

    public static final Block SMOOTH_DEEPSLATE_STAIRS = register(
            "smooth_deepslate_stairs",
            stairsOf(SMOOTH_DEEPSLATE),
            copySettings(SMOOTH_DEEPSLATE));

    public static final Block SMOOTH_DEEPSLATE_SLAB = register(
            "smooth_deepslate_slab", SlabBlock::new,
            copySettings(SMOOTH_DEEPSLATE));

    public static final Block SMOOTH_DEEPSLATE_WALL = register(
            "smooth_deepslate_wall", WallBlock::new,
            createWallSettings(SMOOTH_DEEPSLATE));

    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = register(
            "polished_deepslate_pressure_plate",
            pressurePlateType(ModBlockSetTypes.POLISHED_DEEPSLATE),
            createPressurePlateSettings(Blocks.POLISHED_DEEPSLATE));

    public static final Block POLISHED_DEEPSLATE_BUTTON = register(
            "polished_deepslate_button",
            buttonType(ModBlockSetTypes.POLISHED_DEEPSLATE),
            createButtonSettings());

    public static final Block CHISELED_DEEPSLATE_BRICKS = register(
            "chiseled_deepslate_bricks", Block::new,
            copySettings(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.0F, 6.0F));

    public static final Block MOSSY_DEEPSLATE_BRICKS = register(
            "mossy_deepslate_bricks", Block::new,
            copySettings(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.0F, 6.0F));

    public static final Block MOSSY_DEEPSLATE_BRICK_STAIRS = register(
            "mossy_deepslate_brick_stairs",
            stairsOf(MOSSY_DEEPSLATE_BRICKS),
            copySettings(MOSSY_DEEPSLATE_BRICKS));

    public static final Block MOSSY_DEEPSLATE_BRICK_SLAB = register(
            "mossy_deepslate_brick_slab", SlabBlock::new,
            copySettings(MOSSY_DEEPSLATE_BRICKS));

    public static final Block MOSSY_DEEPSLATE_BRICK_WALL = register(
            "mossy_deepslate_brick_wall", WallBlock::new,
            createWallSettings(MOSSY_DEEPSLATE_BRICKS));

    public static final Block MOSSY_CHISELED_DEEPSLATE_BRICKS = register(
            "mossy_chiseled_deepslate_bricks", Block::new,
            copySettings(CHISELED_DEEPSLATE_BRICKS));

    public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = register(
            "cracked_deepslate_brick_stairs",
            stairsOf(Blocks.CRACKED_DEEPSLATE_BRICKS),
            copySettings(Blocks.CRACKED_DEEPSLATE_BRICKS)
                    .strength(3.0F, 6.0F));

    public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = register(
            "cracked_deepslate_brick_slab", SlabBlock::new,
            copySettings(Blocks.CRACKED_DEEPSLATE_BRICKS)
                    .strength(3.0F, 6.0F));

    public static final Block CRACKED_DEEPSLATE_BRICK_WALL = register(
            "cracked_deepslate_brick_wall", WallBlock::new,
            createWallSettings(Blocks.CRACKED_DEEPSLATE_BRICKS)
                    .strength(3.0F, 6.0F));

    public static final Block CRACKED_CHISELED_DEEPSLATE_BRICKS = register(
            "cracked_chiseled_deepslate_bricks", Block::new,
            copySettings(CHISELED_DEEPSLATE_BRICKS));

    public static final Block DEEPSLATE_PLATES = register(
            "deepslate_plates", Block::new,
            copySettings(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.0F, 6.0F));

    public static final Block DEEPSLATE_PLATE_STAIRS = register(
            "deepslate_plate_stairs",
            stairsOf(DEEPSLATE_PLATES),
            copySettings(DEEPSLATE_PLATES));

    public static final Block DEEPSLATE_PLATE_SLAB = register(
            "deepslate_plate_slab", SlabBlock::new,
            copySettings(DEEPSLATE_PLATES));

    public static final Block DEEPSLATE_PLATE_WALL = register(
            "deepslate_plate_wall", WallBlock::new,
            createWallSettings(DEEPSLATE_PLATES));

    public static final Block MOSSY_DEEPSLATE_PLATES = register(
            "mossy_deepslate_plates", Block::new,
            copySettings(DEEPSLATE_PLATES));

    public static final Block MOSSY_DEEPSLATE_PLATE_STAIRS = register(
            "mossy_deepslate_plate_stairs",
            stairsOf(MOSSY_DEEPSLATE_PLATES),
            copySettings(MOSSY_DEEPSLATE_PLATES));

    public static final Block MOSSY_DEEPSLATE_PLATE_SLAB = register(
            "mossy_deepslate_plate_slab", SlabBlock::new,
            copySettings(MOSSY_DEEPSLATE_PLATES));

    public static final Block MOSSY_DEEPSLATE_PLATE_WALL = register(
            "mossy_deepslate_plate_wall", WallBlock::new,
            createWallSettings(MOSSY_DEEPSLATE_PLATES));

    public static final Block CRACKED_DEEPSLATE_PLATES = register(
            "cracked_deepslate_plates", Block::new,
            copySettings(DEEPSLATE_PLATES));

    public static final Block CRACKED_DEEPSLATE_PLATE_STAIRS = register(
            "cracked_deepslate_plate_stairs",
            stairsOf(CRACKED_DEEPSLATE_PLATES),
            copySettings(CRACKED_DEEPSLATE_PLATES));

    public static final Block CRACKED_DEEPSLATE_PLATE_SLAB = register(
            "cracked_deepslate_plate_slab", SlabBlock::new,
            copySettings(CRACKED_DEEPSLATE_PLATES));

    public static final Block CRACKED_DEEPSLATE_PLATE_WALL = register(
            "cracked_deepslate_plate_wall", WallBlock::new,
            createWallSettings(CRACKED_DEEPSLATE_PLATES));

    public static final Block MOSSY_DEEPSLATE_TILES = register(
            "mossy_deepslate_tiles", Block::new,
            copySettings(Blocks.DEEPSLATE_TILES)
                    .strength(3.0F, 6.0F));

    public static final Block MOSSY_DEEPSLATE_TILE_STAIRS = register(
            "mossy_deepslate_tile_stairs",
            stairsOf(MOSSY_DEEPSLATE_TILES),
            copySettings(MOSSY_DEEPSLATE_TILES));

    public static final Block MOSSY_DEEPSLATE_TILE_SLAB = register(
            "mossy_deepslate_tile_slab", SlabBlock::new,
            copySettings(MOSSY_DEEPSLATE_TILES));

    public static final Block MOSSY_DEEPSLATE_TILE_WALL = register(
            "mossy_deepslate_tile_wall", WallBlock::new,
            createWallSettings(MOSSY_DEEPSLATE_TILES));

    public static final Block CRACKED_DEEPSLATE_TILE_STAIRS = register(
            "cracked_deepslate_tile_stairs",
            stairsOf(Blocks.CRACKED_DEEPSLATE_TILES),
            copySettings(Blocks.CRACKED_DEEPSLATE_TILES)
                    .strength(3.0F, 6.0F));

    public static final Block CRACKED_DEEPSLATE_TILE_SLAB = register(
            "cracked_deepslate_tile_slab", SlabBlock::new,
            copySettings(Blocks.CRACKED_DEEPSLATE_TILES)
                    .strength(3.0F, 6.0F));

    public static final Block CRACKED_DEEPSLATE_TILE_WALL = register(
            "cracked_deepslate_tile_wall", WallBlock::new,
            createWallSettings(Blocks.CRACKED_DEEPSLATE_TILES)
                    .strength(3.0F, 6.0F));

    public static final Block DEEPSLATE_PILLAR = register(
            "deepslate_pillar", PillarBlock::new,
            copySettings(Blocks.DEEPSLATE)
                    .sounds(BlockSoundGroup.POLISHED_DEEPSLATE));

    public static final Block MOSSY_DEEPSLATE_PILLAR = register(
            "mossy_deepslate_pillar", PillarBlock::new,
            copySettings(DEEPSLATE_PILLAR));

    public static final Block CRACKED_DEEPSLATE_PILLAR = register(
            "cracked_deepslate_pillar", PillarBlock::new,
            copySettings(DEEPSLATE_PILLAR));

    public static void init() {
        fixBlockHardnessAndBlastResistance(Blocks.CHISELED_DEEPSLATE, Blocks.DEEPSLATE);

        fixBlockHardnessAndBlastResistance(Blocks.POLISHED_DEEPSLATE, Blocks.DEEPSLATE);
        fixBlockHardnessAndBlastResistance(Blocks.POLISHED_DEEPSLATE_STAIRS, Blocks.POLISHED_DEEPSLATE);
        fixBlockHardnessAndBlastResistance(Blocks.POLISHED_DEEPSLATE_SLAB, Blocks.POLISHED_DEEPSLATE);
        fixBlockHardnessAndBlastResistance(Blocks.POLISHED_DEEPSLATE_WALL, Blocks.POLISHED_DEEPSLATE);

        fixBlockHardnessAndBlastResistance(Blocks.DEEPSLATE_BRICKS, Blocks.POLISHED_DEEPSLATE);
        fixBlockHardnessAndBlastResistance(Blocks.DEEPSLATE_BRICK_STAIRS, Blocks.DEEPSLATE_BRICKS);
        fixBlockHardnessAndBlastResistance(Blocks.DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE_BRICKS);
        fixBlockHardnessAndBlastResistance(Blocks.DEEPSLATE_BRICK_WALL, Blocks.DEEPSLATE_BRICKS);

        fixBlockHardnessAndBlastResistance(Blocks.CRACKED_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS);

        fixBlockHardnessAndBlastResistance(Blocks.DEEPSLATE_TILES, Blocks.DEEPSLATE_BRICKS);
        fixBlockHardnessAndBlastResistance(Blocks.DEEPSLATE_TILE_STAIRS, Blocks.DEEPSLATE_TILES);
        fixBlockHardnessAndBlastResistance(Blocks.DEEPSLATE_TILE_SLAB, Blocks.DEEPSLATE_TILES);
        fixBlockHardnessAndBlastResistance(Blocks.DEEPSLATE_TILE_WALL, Blocks.DEEPSLATE_TILES);

        fixBlockHardnessAndBlastResistance(Blocks.CRACKED_DEEPSLATE_TILES, Blocks.DEEPSLATE_TILES);
    }

    public static void addCreativeEntries(FabricItemGroupEntries entries) {
        entries.getDisplayStacks().removeIf(stack ->
                stack.getItem().equals(Blocks.CHISELED_DEEPSLATE.asItem()));
        entries.getSearchTabStacks().removeIf(stack ->
                stack.getItem().equals(Blocks.CHISELED_DEEPSLATE.asItem()));

        entries.addAfter(Blocks.DEEPSLATE,
                DEEPSLATE_STAIRS,
                DEEPSLATE_SLAB,
                DEEPSLATE_WALL,

                Blocks.CHISELED_DEEPSLATE,
                MOSSY_CHISELED_DEEPSLATE,
                CRACKED_CHISELED_DEEPSLATE);

        entries.addAfter(Blocks.COBBLED_DEEPSLATE_WALL,
                MOSSY_COBBLED_DEEPSLATE,
                MOSSY_COBBLED_DEEPSLATE_STAIRS,
                MOSSY_COBBLED_DEEPSLATE_SLAB,
                MOSSY_COBBLED_DEEPSLATE_WALL,

                SMOOTH_DEEPSLATE,
                SMOOTH_DEEPSLATE_STAIRS,
                SMOOTH_DEEPSLATE_SLAB,
                SMOOTH_DEEPSLATE_WALL);

        entries.addAfter(Blocks.POLISHED_DEEPSLATE_WALL,
                POLISHED_DEEPSLATE_PRESSURE_PLATE,
                POLISHED_DEEPSLATE_BUTTON);

        entries.getDisplayStacks().removeIf(stack ->
                stack.getItem().equals(Blocks.CRACKED_DEEPSLATE_BRICKS.asItem()));
        entries.getSearchTabStacks().removeIf(stack ->
                stack.getItem().equals(Blocks.CRACKED_DEEPSLATE_BRICKS.asItem()));

        entries.addAfter(Blocks.DEEPSLATE_BRICK_WALL,
                CHISELED_DEEPSLATE_BRICKS,

                MOSSY_DEEPSLATE_BRICKS,
                MOSSY_DEEPSLATE_BRICK_STAIRS,
                MOSSY_DEEPSLATE_BRICK_SLAB,
                MOSSY_DEEPSLATE_BRICK_WALL,
                MOSSY_CHISELED_DEEPSLATE_BRICKS,

                Blocks.CRACKED_DEEPSLATE_BRICKS,
                CRACKED_DEEPSLATE_BRICK_STAIRS,
                CRACKED_DEEPSLATE_BRICK_SLAB,
                CRACKED_DEEPSLATE_BRICK_WALL,
                CRACKED_CHISELED_DEEPSLATE_BRICKS,

                DEEPSLATE_PLATES,
                DEEPSLATE_PLATE_STAIRS,
                DEEPSLATE_PLATE_SLAB,
                DEEPSLATE_PLATE_WALL,

                MOSSY_DEEPSLATE_PLATES,
                MOSSY_DEEPSLATE_PLATE_STAIRS,
                MOSSY_DEEPSLATE_PLATE_SLAB,
                MOSSY_DEEPSLATE_PLATE_WALL,

                CRACKED_DEEPSLATE_PLATES,
                CRACKED_DEEPSLATE_PLATE_STAIRS,
                CRACKED_DEEPSLATE_PLATE_SLAB,
                CRACKED_DEEPSLATE_PLATE_WALL);

        entries.getDisplayStacks().removeIf(stack ->
                stack.getItem().equals(Blocks.CRACKED_DEEPSLATE_TILES.asItem()));
        entries.getSearchTabStacks().removeIf(stack ->
                stack.getItem().equals(Blocks.CRACKED_DEEPSLATE_TILES.asItem()));

        entries.addAfter(Blocks.DEEPSLATE_TILE_WALL,
                MOSSY_DEEPSLATE_TILES,
                MOSSY_DEEPSLATE_TILE_STAIRS,
                MOSSY_DEEPSLATE_TILE_SLAB,
                MOSSY_DEEPSLATE_TILE_WALL,

                Blocks.CRACKED_DEEPSLATE_TILES,
                CRACKED_DEEPSLATE_TILE_STAIRS,
                CRACKED_DEEPSLATE_TILE_SLAB,
                CRACKED_DEEPSLATE_TILE_WALL,

                DEEPSLATE_PILLAR,
                MOSSY_DEEPSLATE_PILLAR,
                CRACKED_DEEPSLATE_PILLAR);
    }
}
