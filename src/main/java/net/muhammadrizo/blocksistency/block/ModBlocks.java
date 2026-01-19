package net.muhammadrizo.blocksistency.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.muhammadrizo.blocksistency.Blocksistency;

import java.util.function.Function;

public class ModBlocks {
    // ============== STONE ==============

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
            AbstractBlock.Settings.copy(ModBlocks.CHISELED_STONE),
            true
    );

    public static final Block CRACKED_CHISELED_STONE = register(
            "cracked_chiseled_stone",
            Block::new,
            AbstractBlock.Settings.copy(ModBlocks.CHISELED_STONE),
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
                    ModBlocks.POLISHED_STONE.getDefaultState(),
                    settings
            ),
            AbstractBlock.Settings.copy(ModBlocks.POLISHED_STONE),
            true
    );

    public static final Block POLISHED_STONE_SLAB = register(
            "polished_stone_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(ModBlocks.POLISHED_STONE),
            true
    );

    public static final Block POLISHED_STONE_WALL = register(
            "polished_stone_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(ModBlocks.POLISHED_STONE),
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
                    ModBlocks.STONE_TILES.getDefaultState(),
                    settings
            ),
            AbstractBlock.Settings.copy(ModBlocks.STONE_TILES),
            true
    );

    public static final Block STONE_TILE_SLAB = register(
            "stone_tile_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(ModBlocks.STONE_TILES),
            true
    );

    public static final Block STONE_TILE_WALL = register(
            "stone_tile_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(ModBlocks.STONE_TILES),
            true
    );

    public static final Block MOSSY_STONE_TILES = register(
            "mossy_stone_tiles",
            Block::new,
            AbstractBlock.Settings.copy(ModBlocks.STONE_TILES),
            true
    );

    public static final Block MOSSY_STONE_TILE_STAIRS = register(
            "mossy_stone_tile_stairs",
            settings -> new ModStairsBlock(
                    ModBlocks.MOSSY_STONE_TILES.getDefaultState(),
                    settings
            ),
            AbstractBlock.Settings.copy(ModBlocks.MOSSY_STONE_TILES),
            true
    );

    public static final Block MOSSY_STONE_TILE_SLAB = register(
            "mossy_stone_tile_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(ModBlocks.MOSSY_STONE_TILES),
            true
    );

    public static final Block MOSSY_STONE_TILE_WALL = register(
            "mossy_stone_tile_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(ModBlocks.MOSSY_STONE_TILES),
            true
    );

    public static final Block CRACKED_STONE_TILES = register(
            "cracked_stone_tiles",
            Block::new,
            AbstractBlock.Settings.copy(ModBlocks.STONE_TILES),
            true
    );

    public static final Block CRACKED_STONE_TILE_STAIRS = register(
            "cracked_stone_tile_stairs",
            settings -> new ModStairsBlock(
                    ModBlocks.CRACKED_STONE_TILES.getDefaultState(),
                    settings
            ),
            AbstractBlock.Settings.copy(ModBlocks.CRACKED_STONE_TILES),
            true
    );

    public static final Block CRACKED_STONE_TILE_SLAB = register(
            "cracked_stone_tile_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(ModBlocks.CRACKED_STONE_TILES),
            true
    );

    public static final Block CRACKED_STONE_TILE_WALL = register(
            "cracked_stone_tile_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(ModBlocks.CRACKED_STONE_TILES),
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
            AbstractBlock.Settings.copy(ModBlocks.STONE_PILLAR),
            true
    );

    public static final Block CRACKED_STONE_PILLAR = register(
            "cracked_stone_pillar",
            PillarBlock::new,
            AbstractBlock.Settings.copy(ModBlocks.STONE_PILLAR),
            true
    );

    public static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        RegistryKey<Block> blockKey = keyOfBlock(name);

        Block block = blockFactory.apply(settings.registryKey(blockKey));

        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey());
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    public static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blocksistency.MOD_ID, name));
    }

    public static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blocksistency.MOD_ID, name));
    }

    public static void registerModBlocks() {
        Blocksistency.LOGGER.info("Registering mod blocks for " + Blocksistency.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            // ============== STONE ==============

            entries.addAfter(Blocks.STONE_SLAB,
                    ModBlocks.STONE_WALL,
                    ModBlocks.CHISELED_STONE,
                    ModBlocks.MOSSY_CHISELED_STONE,
                    ModBlocks.CRACKED_CHISELED_STONE
            );

            entries.addAfter(Blocks.SMOOTH_STONE,
                    ModBlocks.SMOOTH_STONE_STAIRS);

            entries.addAfter(Blocks.SMOOTH_STONE_SLAB,
                    ModBlocks.SMOOTH_STONE_WALL,
                    ModBlocks.POLISHED_STONE,
                    ModBlocks.POLISHED_STONE_STAIRS,
                    ModBlocks.POLISHED_STONE_SLAB,
                    ModBlocks.POLISHED_STONE_WALL);

            entries.addAfter(Blocks.MOSSY_STONE_BRICK_WALL,
                    ModBlocks.MOSSY_CHISELED_STONE_BRICKS);

            entries.getDisplayStacks().removeIf(stack ->
                    stack.getItem().equals(Blocks.CRACKED_STONE_BRICKS.asItem()));
            entries.getSearchTabStacks().removeIf(stack ->
                    stack.getItem().equals(Blocks.CRACKED_STONE_BRICKS.asItem()));

            entries.addAfter(ModBlocks.MOSSY_CHISELED_STONE_BRICKS,
                    Blocks.CRACKED_STONE_BRICKS,
                    ModBlocks.CRACKED_STONE_BRICK_STAIRS,
                    ModBlocks.CRACKED_STONE_BRICK_SLAB,
                    ModBlocks.CRACKED_STONE_BRICK_WALL,
                    ModBlocks.CRACKED_CHISELED_STONE_BRICKS,
                    ModBlocks.STONE_TILES,
                    ModBlocks.STONE_TILE_STAIRS,
                    ModBlocks.STONE_TILE_SLAB,
                    ModBlocks.STONE_TILE_WALL,
                    ModBlocks.MOSSY_STONE_TILES,
                    ModBlocks.MOSSY_STONE_TILE_STAIRS,
                    ModBlocks.MOSSY_STONE_TILE_SLAB,
                    ModBlocks.MOSSY_STONE_TILE_WALL,
                    ModBlocks.CRACKED_STONE_TILES,
                    ModBlocks.CRACKED_STONE_TILE_STAIRS,
                    ModBlocks.CRACKED_STONE_TILE_SLAB,
                    ModBlocks.CRACKED_STONE_TILE_WALL,
                    ModBlocks.STONE_PILLAR,
                    ModBlocks.MOSSY_STONE_PILLAR,
                    ModBlocks.CRACKED_STONE_PILLAR);
        });
    }
}
