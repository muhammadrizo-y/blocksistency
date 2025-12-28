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

    public static final Block STONE_WALL = register(
            "stone_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(Blocks.STONE),
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

    public static final Block MOSSY_CHISELED_STONE_BRICKS = register(
            "mossy_chiseled_stone_bricks",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS),
            true
    );

    public static final Block CRACKED_CHISELED_STONE_BRICKS = register(
            "cracked_chiseled_stone_bricks",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS),
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

    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        RegistryKey<Block> blockKey = keyOfBlock(name);

        Block block = blockFactory.apply(settings.registryKey(blockKey));

        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey());
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blocksistency.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blocksistency.MOD_ID, name));
    }

    public static void registerModBlocks() {
        Blocksistency.LOGGER.info("Registering mod blocks for " + Blocksistency.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.STONE_WALL);

            entries.add(ModBlocks.SMOOTH_STONE_STAIRS);
            entries.add(ModBlocks.SMOOTH_STONE_WALL);

            entries.add(ModBlocks.POLISHED_STONE);
            entries.add(ModBlocks.POLISHED_STONE_STAIRS);
            entries.add(ModBlocks.POLISHED_STONE_SLAB);
            entries.add(ModBlocks.POLISHED_STONE_WALL);

            entries.add(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
            entries.add(ModBlocks.CRACKED_STONE_BRICK_SLAB);
            entries.add(ModBlocks.CRACKED_STONE_BRICK_WALL);

            entries.add(ModBlocks.STONE_TILES);
            entries.add(ModBlocks.STONE_TILE_STAIRS);
            entries.add(ModBlocks.STONE_TILE_SLAB);
            entries.add(ModBlocks.STONE_TILE_WALL);

            entries.add(ModBlocks.MOSSY_STONE_TILES);
            entries.add(ModBlocks.MOSSY_STONE_TILE_STAIRS);
            entries.add(ModBlocks.MOSSY_STONE_TILE_SLAB);
            entries.add(ModBlocks.MOSSY_STONE_TILE_WALL);

            entries.add(ModBlocks.CRACKED_STONE_TILES);
            entries.add(ModBlocks.CRACKED_STONE_TILE_STAIRS);
            entries.add(ModBlocks.CRACKED_STONE_TILE_SLAB);
            entries.add(ModBlocks.CRACKED_STONE_TILE_WALL);

            entries.add(ModBlocks.CHISELED_STONE);
            entries.add(ModBlocks.MOSSY_CHISELED_STONE);
            entries.add(ModBlocks.CRACKED_CHISELED_STONE);

            entries.add(ModBlocks.MOSSY_CHISELED_STONE_BRICKS);
            entries.add(ModBlocks.CRACKED_CHISELED_STONE_BRICKS);

            entries.add(ModBlocks.STONE_PILLAR);
            entries.add(ModBlocks.MOSSY_STONE_PILLAR);
            entries.add(ModBlocks.CRACKED_STONE_PILLAR);
        });
    }
}
