package net.muhammadrizo.blocksistency.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.item.ItemConvertible;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.registry.RegistryWrapper;
import net.muhammadrizo.blocksistency.block.*;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // ============== STONE ==============

        addDrop(ModStoneBlocks.STONE_WALL);

        addDrop(ModStoneBlocks.CHISELED_STONE);
        addDrop(ModStoneBlocks.MOSSY_CHISELED_STONE);
        addDrop(ModStoneBlocks.CRACKED_CHISELED_STONE);

        addDrop(ModStoneBlocks.SMOOTH_STONE_STAIRS);
        addDrop(ModStoneBlocks.SMOOTH_STONE_WALL);

        addDrop(ModStoneBlocks.POLISHED_STONE);
        addDrop(ModStoneBlocks.POLISHED_STONE_STAIRS);
        addSlabDrop(ModStoneBlocks.POLISHED_STONE_SLAB);
        addDrop(ModStoneBlocks.POLISHED_STONE_WALL);

        addDrop(ModStoneBlocks.MOSSY_CHISELED_STONE_BRICKS);

        addDrop(ModStoneBlocks.CRACKED_STONE_BRICK_STAIRS);
        addSlabDrop(ModStoneBlocks.CRACKED_STONE_BRICK_SLAB);
        addDrop(ModStoneBlocks.CRACKED_STONE_BRICK_WALL);
        addDrop(ModStoneBlocks.CRACKED_CHISELED_STONE_BRICKS);

        addDrop(ModStoneBlocks.STONE_PLATES);
        addDrop(ModStoneBlocks.STONE_PLATE_STAIRS);
        addSlabDrop(ModStoneBlocks.STONE_PLATE_SLAB);
        addDrop(ModStoneBlocks.STONE_PLATE_WALL);

        addDrop(ModStoneBlocks.MOSSY_STONE_PLATES);
        addDrop(ModStoneBlocks.MOSSY_STONE_PLATE_STAIRS);
        addSlabDrop(ModStoneBlocks.MOSSY_STONE_PLATE_SLAB);
        addDrop(ModStoneBlocks.MOSSY_STONE_PLATE_WALL);

        addDrop(ModStoneBlocks.CRACKED_STONE_PLATES);
        addDrop(ModStoneBlocks.CRACKED_STONE_PLATE_STAIRS);
        addSlabDrop(ModStoneBlocks.CRACKED_STONE_PLATE_SLAB);
        addDrop(ModStoneBlocks.CRACKED_STONE_PLATE_WALL);

        addDrop(ModStoneBlocks.STONE_TILES);
        addDrop(ModStoneBlocks.STONE_TILE_STAIRS);
        addSlabDrop(ModStoneBlocks.STONE_TILE_SLAB);
        addDrop(ModStoneBlocks.STONE_TILE_WALL);

        addDrop(ModStoneBlocks.MOSSY_STONE_TILES);
        addDrop(ModStoneBlocks.MOSSY_STONE_TILE_STAIRS);
        addSlabDrop(ModStoneBlocks.MOSSY_STONE_TILE_SLAB);
        addDrop(ModStoneBlocks.MOSSY_STONE_TILE_WALL);

        addDrop(ModStoneBlocks.CRACKED_STONE_TILES);
        addDrop(ModStoneBlocks.CRACKED_STONE_TILE_STAIRS);
        addSlabDrop(ModStoneBlocks.CRACKED_STONE_TILE_SLAB);
        addDrop(ModStoneBlocks.CRACKED_STONE_TILE_WALL);

        addDrop(ModStoneBlocks.STONE_PILLAR);
        addDrop(ModStoneBlocks.MOSSY_STONE_PILLAR);
        addDrop(ModStoneBlocks.CRACKED_STONE_PILLAR);

        // ============== GRANITE ==============

        addDrop(ModGraniteBlocks.CHISELED_GRANITE);
        addDrop(ModGraniteBlocks.MOSSY_CHISELED_GRANITE);
        addDrop(ModGraniteBlocks.CRACKED_CHISELED_GRANITE);

        addDrop(ModGraniteBlocks.COBBLED_GRANITE);
        addDrop(ModGraniteBlocks.COBBLED_GRANITE_STAIRS);
        addSlabDrop(ModGraniteBlocks.COBBLED_GRANITE_SLAB);
        addDrop(ModGraniteBlocks.COBBLED_GRANITE_WALL);

        addDrop(ModGraniteBlocks.MOSSY_COBBLED_GRANITE);
        addDrop(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_STAIRS);
        addSlabDrop(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_SLAB);
        addDrop(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_WALL);

        addDrop(ModGraniteBlocks.SMOOTH_GRANITE);
        addDrop(ModGraniteBlocks.SMOOTH_GRANITE_STAIRS);
        addSlabDrop(ModGraniteBlocks.SMOOTH_GRANITE_SLAB);
        addDrop(ModGraniteBlocks.SMOOTH_GRANITE_WALL);

        addDrop(ModGraniteBlocks.POLISHED_GRANITE_WALL);
        addDrop(ModGraniteBlocks.POLISHED_GRANITE_PRESSURE_PLATE);
        addDrop(ModGraniteBlocks.POLISHED_GRANITE_BUTTON);

        addDrop(ModGraniteBlocks.GRANITE_BRICKS);
        addDrop(ModGraniteBlocks.GRANITE_BRICK_STAIRS);
        addSlabDrop(ModGraniteBlocks.GRANITE_BRICK_SLAB);
        addDrop(ModGraniteBlocks.GRANITE_BRICK_WALL);
        addDrop(ModGraniteBlocks.CHISELED_GRANITE_BRICKS);

        addDrop(ModGraniteBlocks.MOSSY_GRANITE_BRICKS);
        addDrop(ModGraniteBlocks.MOSSY_GRANITE_BRICK_STAIRS);
        addSlabDrop(ModGraniteBlocks.MOSSY_GRANITE_BRICK_SLAB);
        addDrop(ModGraniteBlocks.MOSSY_GRANITE_BRICK_WALL);
        addDrop(ModGraniteBlocks.MOSSY_CHISELED_GRANITE_BRICKS);

        addDrop(ModGraniteBlocks.CRACKED_GRANITE_BRICKS);
        addDrop(ModGraniteBlocks.CRACKED_GRANITE_BRICK_STAIRS);
        addSlabDrop(ModGraniteBlocks.CRACKED_GRANITE_BRICK_SLAB);
        addDrop(ModGraniteBlocks.CRACKED_GRANITE_BRICK_WALL);
        addDrop(ModGraniteBlocks.CRACKED_CHISELED_GRANITE_BRICKS);

        addDrop(ModGraniteBlocks.GRANITE_PLATES);
        addDrop(ModGraniteBlocks.GRANITE_PLATE_STAIRS);
        addSlabDrop(ModGraniteBlocks.GRANITE_PLATE_SLAB);
        addDrop(ModGraniteBlocks.GRANITE_PLATE_WALL);

        addDrop(ModGraniteBlocks.MOSSY_GRANITE_PLATES);
        addDrop(ModGraniteBlocks.MOSSY_GRANITE_PLATE_STAIRS);
        addSlabDrop(ModGraniteBlocks.MOSSY_GRANITE_PLATE_SLAB);
        addDrop(ModGraniteBlocks.MOSSY_GRANITE_PLATE_WALL);

        addDrop(ModGraniteBlocks.CRACKED_GRANITE_PLATES);
        addDrop(ModGraniteBlocks.CRACKED_GRANITE_PLATE_STAIRS);
        addSlabDrop(ModGraniteBlocks.CRACKED_GRANITE_PLATE_SLAB);
        addDrop(ModGraniteBlocks.CRACKED_GRANITE_PLATE_WALL);

        addDrop(ModGraniteBlocks.GRANITE_TILES);
        addDrop(ModGraniteBlocks.GRANITE_TILE_STAIRS);
        addSlabDrop(ModGraniteBlocks.GRANITE_TILE_SLAB);
        addDrop(ModGraniteBlocks.GRANITE_TILE_WALL);

        addDrop(ModGraniteBlocks.MOSSY_GRANITE_TILES);
        addDrop(ModGraniteBlocks.MOSSY_GRANITE_TILE_STAIRS);
        addSlabDrop(ModGraniteBlocks.MOSSY_GRANITE_TILE_SLAB);
        addDrop(ModGraniteBlocks.MOSSY_GRANITE_TILE_WALL);

        addDrop(ModGraniteBlocks.CRACKED_GRANITE_TILES);
        addDrop(ModGraniteBlocks.CRACKED_GRANITE_TILE_STAIRS);
        addSlabDrop(ModGraniteBlocks.CRACKED_GRANITE_TILE_SLAB);
        addDrop(ModGraniteBlocks.CRACKED_GRANITE_TILE_WALL);

        addDrop(ModGraniteBlocks.GRANITE_PILLAR);
        addDrop(ModGraniteBlocks.MOSSY_GRANITE_PILLAR);
        addDrop(ModGraniteBlocks.CRACKED_GRANITE_PILLAR);

        // ============== DIORITE ==============

        addDrop(ModDioriteBlocks.CHISELED_DIORITE);
        addDrop(ModDioriteBlocks.MOSSY_CHISELED_DIORITE);
        addDrop(ModDioriteBlocks.CRACKED_CHISELED_DIORITE);

        addDrop(ModDioriteBlocks.COBBLED_DIORITE);
        addDrop(ModDioriteBlocks.COBBLED_DIORITE_STAIRS);
        addSlabDrop(ModDioriteBlocks.COBBLED_DIORITE_SLAB);
        addDrop(ModDioriteBlocks.COBBLED_DIORITE_WALL);

        addDrop(ModDioriteBlocks.MOSSY_COBBLED_DIORITE);
        addDrop(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_STAIRS);
        addSlabDrop(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_SLAB);
        addDrop(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_WALL);

        addDrop(ModDioriteBlocks.SMOOTH_DIORITE);
        addDrop(ModDioriteBlocks.SMOOTH_DIORITE_STAIRS);
        addSlabDrop(ModDioriteBlocks.SMOOTH_DIORITE_SLAB);
        addDrop(ModDioriteBlocks.SMOOTH_DIORITE_WALL);

        addDrop(ModDioriteBlocks.POLISHED_DIORITE_WALL);
        addDrop(ModDioriteBlocks.POLISHED_DIORITE_PRESSURE_PLATE);
        addDrop(ModDioriteBlocks.POLISHED_DIORITE_BUTTON);

        addDrop(ModDioriteBlocks.DIORITE_BRICKS);
        addDrop(ModDioriteBlocks.DIORITE_BRICK_STAIRS);
        addSlabDrop(ModDioriteBlocks.DIORITE_BRICK_SLAB);
        addDrop(ModDioriteBlocks.DIORITE_BRICK_WALL);
        addDrop(ModDioriteBlocks.CHISELED_DIORITE_BRICKS);

        addDrop(ModDioriteBlocks.MOSSY_DIORITE_BRICKS);
        addDrop(ModDioriteBlocks.MOSSY_DIORITE_BRICK_STAIRS);
        addSlabDrop(ModDioriteBlocks.MOSSY_DIORITE_BRICK_SLAB);
        addDrop(ModDioriteBlocks.MOSSY_DIORITE_BRICK_WALL);
        addDrop(ModDioriteBlocks.MOSSY_CHISELED_DIORITE_BRICKS);

        addDrop(ModDioriteBlocks.CRACKED_DIORITE_BRICKS);
        addDrop(ModDioriteBlocks.CRACKED_DIORITE_BRICK_STAIRS);
        addSlabDrop(ModDioriteBlocks.CRACKED_DIORITE_BRICK_SLAB);
        addDrop(ModDioriteBlocks.CRACKED_DIORITE_BRICK_WALL);
        addDrop(ModDioriteBlocks.CRACKED_CHISELED_DIORITE_BRICKS);

        addDrop(ModDioriteBlocks.DIORITE_PLATES);
        addDrop(ModDioriteBlocks.DIORITE_PLATE_STAIRS);
        addSlabDrop(ModDioriteBlocks.DIORITE_PLATE_SLAB);
        addDrop(ModDioriteBlocks.DIORITE_PLATE_WALL);

        addDrop(ModDioriteBlocks.MOSSY_DIORITE_PLATES);
        addDrop(ModDioriteBlocks.MOSSY_DIORITE_PLATE_STAIRS);
        addSlabDrop(ModDioriteBlocks.MOSSY_DIORITE_PLATE_SLAB);
        addDrop(ModDioriteBlocks.MOSSY_DIORITE_PLATE_WALL);

        addDrop(ModDioriteBlocks.CRACKED_DIORITE_PLATES);
        addDrop(ModDioriteBlocks.CRACKED_DIORITE_PLATE_STAIRS);
        addSlabDrop(ModDioriteBlocks.CRACKED_DIORITE_PLATE_SLAB);
        addDrop(ModDioriteBlocks.CRACKED_DIORITE_PLATE_WALL);

        addDrop(ModDioriteBlocks.DIORITE_TILES);
        addDrop(ModDioriteBlocks.DIORITE_TILE_STAIRS);
        addSlabDrop(ModDioriteBlocks.DIORITE_TILE_SLAB);
        addDrop(ModDioriteBlocks.DIORITE_TILE_WALL);

        addDrop(ModDioriteBlocks.MOSSY_DIORITE_TILES);
        addDrop(ModDioriteBlocks.MOSSY_DIORITE_TILE_STAIRS);
        addSlabDrop(ModDioriteBlocks.MOSSY_DIORITE_TILE_SLAB);
        addDrop(ModDioriteBlocks.MOSSY_DIORITE_TILE_WALL);

        addDrop(ModDioriteBlocks.CRACKED_DIORITE_TILES);
        addDrop(ModDioriteBlocks.CRACKED_DIORITE_TILE_STAIRS);
        addSlabDrop(ModDioriteBlocks.CRACKED_DIORITE_TILE_SLAB);
        addDrop(ModDioriteBlocks.CRACKED_DIORITE_TILE_WALL);

        addDrop(ModDioriteBlocks.DIORITE_PILLAR);
        addDrop(ModDioriteBlocks.MOSSY_DIORITE_PILLAR);
        addDrop(ModDioriteBlocks.CRACKED_DIORITE_PILLAR);

        // ============== ANDESITE ==============

        addDrop(ModAndesiteBlocks.CHISELED_ANDESITE);
        addDrop(ModAndesiteBlocks.MOSSY_CHISELED_ANDESITE);
        addDrop(ModAndesiteBlocks.CRACKED_CHISELED_ANDESITE);

        addDrop(ModAndesiteBlocks.COBBLED_ANDESITE);
        addDrop(ModAndesiteBlocks.COBBLED_ANDESITE_STAIRS);
        addSlabDrop(ModAndesiteBlocks.COBBLED_ANDESITE_SLAB);
        addDrop(ModAndesiteBlocks.COBBLED_ANDESITE_WALL);

        addDrop(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE);
        addDrop(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_STAIRS);
        addSlabDrop(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_SLAB);
        addDrop(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_WALL);

        addDrop(ModAndesiteBlocks.SMOOTH_ANDESITE);
        addDrop(ModAndesiteBlocks.SMOOTH_ANDESITE_STAIRS);
        addSlabDrop(ModAndesiteBlocks.SMOOTH_ANDESITE_SLAB);
        addDrop(ModAndesiteBlocks.SMOOTH_ANDESITE_WALL);

        addDrop(ModAndesiteBlocks.POLISHED_ANDESITE_WALL);
        addDrop(ModAndesiteBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);
        addDrop(ModAndesiteBlocks.POLISHED_ANDESITE_BUTTON);

        addDrop(ModAndesiteBlocks.ANDESITE_BRICKS);
        addDrop(ModAndesiteBlocks.ANDESITE_BRICK_STAIRS);
        addSlabDrop(ModAndesiteBlocks.ANDESITE_BRICK_SLAB);
        addDrop(ModAndesiteBlocks.ANDESITE_BRICK_WALL);
        addDrop(ModAndesiteBlocks.CHISELED_ANDESITE_BRICKS);

        addDrop(ModAndesiteBlocks.MOSSY_ANDESITE_BRICKS);
        addDrop(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_STAIRS);
        addSlabDrop(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_SLAB);
        addDrop(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_WALL);
        addDrop(ModAndesiteBlocks.MOSSY_CHISELED_ANDESITE_BRICKS);

        addDrop(ModAndesiteBlocks.CRACKED_ANDESITE_BRICKS);
        addDrop(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_STAIRS);
        addSlabDrop(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_SLAB);
        addDrop(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_WALL);
        addDrop(ModAndesiteBlocks.CRACKED_CHISELED_ANDESITE_BRICKS);

        addDrop(ModAndesiteBlocks.ANDESITE_PLATES);
        addDrop(ModAndesiteBlocks.ANDESITE_PLATE_STAIRS);
        addSlabDrop(ModAndesiteBlocks.ANDESITE_PLATE_SLAB);
        addDrop(ModAndesiteBlocks.ANDESITE_PLATE_WALL);

        addDrop(ModAndesiteBlocks.MOSSY_ANDESITE_PLATES);
        addDrop(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_STAIRS);
        addSlabDrop(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_SLAB);
        addDrop(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_WALL);

        addDrop(ModAndesiteBlocks.CRACKED_ANDESITE_PLATES);
        addDrop(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_STAIRS);
        addSlabDrop(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_SLAB);
        addDrop(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_WALL);

        addDrop(ModAndesiteBlocks.ANDESITE_TILES);
        addDrop(ModAndesiteBlocks.ANDESITE_TILE_STAIRS);
        addSlabDrop(ModAndesiteBlocks.ANDESITE_TILE_SLAB);
        addDrop(ModAndesiteBlocks.ANDESITE_TILE_WALL);

        addDrop(ModAndesiteBlocks.MOSSY_ANDESITE_TILES);
        addDrop(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_STAIRS);
        addSlabDrop(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_SLAB);
        addDrop(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_WALL);

        addDrop(ModAndesiteBlocks.CRACKED_ANDESITE_TILES);
        addDrop(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_STAIRS);
        addSlabDrop(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_SLAB);
        addDrop(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_WALL);

        addDrop(ModAndesiteBlocks.ANDESITE_PILLAR);
        addDrop(ModAndesiteBlocks.MOSSY_ANDESITE_PILLAR);
        addDrop(ModAndesiteBlocks.CRACKED_ANDESITE_PILLAR);

        // ============== DEEPSLATE ==============

        addDrop(ModDeepslateBlocks.DEEPSLATE_STAIRS);
        addSlabDrop(ModDeepslateBlocks.DEEPSLATE_SLAB);
        addDrop(ModDeepslateBlocks.DEEPSLATE_WALL);

        addDrop(ModDeepslateBlocks.MOSSY_CHISELED_DEEPSLATE);
        addDrop(ModDeepslateBlocks.CRACKED_CHISELED_DEEPSLATE);

        addDrop(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE);
        addDrop(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS);
        addSlabDrop(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB);
        addDrop(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_WALL);

        addDrop(ModDeepslateBlocks.SMOOTH_DEEPSLATE);
        addDrop(ModDeepslateBlocks.SMOOTH_DEEPSLATE_STAIRS);
        addSlabDrop(ModDeepslateBlocks.SMOOTH_DEEPSLATE_SLAB);
        addDrop(ModDeepslateBlocks.SMOOTH_DEEPSLATE_WALL);

        addDrop(ModDeepslateBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
        addDrop(ModDeepslateBlocks.POLISHED_DEEPSLATE_BUTTON);

        addDrop(ModDeepslateBlocks.CHISELED_DEEPSLATE_BRICKS);

        addDrop(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICKS);
        addDrop(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
        addSlabDrop(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_SLAB);
        addDrop(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_WALL);
        addDrop(ModDeepslateBlocks.MOSSY_CHISELED_DEEPSLATE_BRICKS);

        addDrop(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
        addSlabDrop(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_SLAB);
        addDrop(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_WALL);
        addDrop(ModDeepslateBlocks.CRACKED_CHISELED_DEEPSLATE_BRICKS);

        addDrop(ModDeepslateBlocks.DEEPSLATE_PLATES);
        addDrop(ModDeepslateBlocks.DEEPSLATE_PLATE_STAIRS);
        addDrop(ModDeepslateBlocks.DEEPSLATE_PLATE_SLAB);
        addDrop(ModDeepslateBlocks.DEEPSLATE_PLATE_WALL);

        addDrop(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATES);
        addDrop(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_STAIRS);
        addSlabDrop(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_SLAB);
        addDrop(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_WALL);

        addDrop(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATES);
        addDrop(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_STAIRS);
        addSlabDrop(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_SLAB);
        addDrop(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_WALL);

        addDrop(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILES);
        addDrop(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_STAIRS);
        addSlabDrop(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_SLAB);
        addDrop(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_WALL);

        addDrop(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
        addSlabDrop(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_SLAB);
        addDrop(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_WALL);

        addDrop(ModDeepslateBlocks.DEEPSLATE_PILLAR);
        addDrop(ModDeepslateBlocks.MOSSY_DEEPSLATE_PILLAR);
        addDrop(ModDeepslateBlocks.CRACKED_DEEPSLATE_PILLAR);
    }

    public void addSlabDrop(Block block) {
        addDrop(block, slabDrops(block));
    }

    public void addCobbledDrop(Block block, ItemConvertible blockToDrop) {
        addDrop(block, dropsWithSilkTouch(block, ItemEntry.builder(blockToDrop)));
    }
}
