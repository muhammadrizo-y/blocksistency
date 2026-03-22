package net.muhammadrizo.blocksistency.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.muhammadrizo.blocksistency.block.*;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLangProvider extends FabricLanguageProvider {
    public ModEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        // ============== STONE ==============

        translationBuilder.add(ModStoneBlocks.STONE_WALL, "Stone Wall");

        translationBuilder.add(ModStoneBlocks.CHISELED_STONE, "Chiseled Stone");
        translationBuilder.add(ModStoneBlocks.MOSSY_CHISELED_STONE, "Mossy Chiseled Stone");
        translationBuilder.add(ModStoneBlocks.CRACKED_CHISELED_STONE, "Cracked Chiseled Stone");

        translationBuilder.add(ModStoneBlocks.SMOOTH_STONE_STAIRS, "Smooth Stone Stairs");
        translationBuilder.add(ModStoneBlocks.SMOOTH_STONE_WALL, "Smooth Stone Wall");

        translationBuilder.add(ModStoneBlocks.POLISHED_STONE, "Polished Stone");
        translationBuilder.add(ModStoneBlocks.POLISHED_STONE_STAIRS, "Polished Stone Stairs");
        translationBuilder.add(ModStoneBlocks.POLISHED_STONE_SLAB, "Polished Stone Slab");
        translationBuilder.add(ModStoneBlocks.POLISHED_STONE_WALL, "Polished Stone Wall");

        translationBuilder.add(ModStoneBlocks.MOSSY_CHISELED_STONE_BRICKS, "Mossy Chiseled Stone Bricks");

        translationBuilder.add(ModStoneBlocks.CRACKED_STONE_BRICK_STAIRS, "Cracked Stone Brick Stairs");
        translationBuilder.add(ModStoneBlocks.CRACKED_STONE_BRICK_SLAB, "Cracked Stone Brick Slab");
        translationBuilder.add(ModStoneBlocks.CRACKED_STONE_BRICK_WALL, "Cracked Stone Brick Wall");
        translationBuilder.add(ModStoneBlocks.CRACKED_CHISELED_STONE_BRICKS, "Cracked Chiseled Stone Bricks");

        translationBuilder.add(ModStoneBlocks.STONE_PLATES, "Stone Plates");
        translationBuilder.add(ModStoneBlocks.STONE_PLATE_STAIRS, "Stone Plate Stairs");
        translationBuilder.add(ModStoneBlocks.STONE_PLATE_SLAB, "Stone Plate Slab");
        translationBuilder.add(ModStoneBlocks.STONE_PLATE_WALL, "Stone Plate Wall");

        translationBuilder.add(ModStoneBlocks.MOSSY_STONE_PLATES, "Mossy Stone Plates");
        translationBuilder.add(ModStoneBlocks.MOSSY_STONE_PLATE_STAIRS, "Mossy Stone Plate Stairs");
        translationBuilder.add(ModStoneBlocks.MOSSY_STONE_PLATE_SLAB, "Mossy Stone Plate Slab");
        translationBuilder.add(ModStoneBlocks.MOSSY_STONE_PLATE_WALL, "Mossy Stone Plate Wall");

        translationBuilder.add(ModStoneBlocks.CRACKED_STONE_PLATES, "Cracked Stone Plates");
        translationBuilder.add(ModStoneBlocks.CRACKED_STONE_PLATE_STAIRS, "Cracked Stone Plate Stairs");
        translationBuilder.add(ModStoneBlocks.CRACKED_STONE_PLATE_SLAB, "Cracked Stone Plate Slab");
        translationBuilder.add(ModStoneBlocks.CRACKED_STONE_PLATE_WALL, "Cracked Stone Plate Wall");

        translationBuilder.add(ModStoneBlocks.STONE_TILES, "Stone Tiles");
        translationBuilder.add(ModStoneBlocks.STONE_TILE_STAIRS, "Stone Tile Stairs");
        translationBuilder.add(ModStoneBlocks.STONE_TILE_SLAB, "Stone Tile Slab");
        translationBuilder.add(ModStoneBlocks.STONE_TILE_WALL, "Stone Tile Wall");

        translationBuilder.add(ModStoneBlocks.MOSSY_STONE_TILES, "Mossy Stone Tiles");
        translationBuilder.add(ModStoneBlocks.MOSSY_STONE_TILE_STAIRS, "Mossy Stone Tile Stairs");
        translationBuilder.add(ModStoneBlocks.MOSSY_STONE_TILE_SLAB, "Mossy Stone Tile Slab");
        translationBuilder.add(ModStoneBlocks.MOSSY_STONE_TILE_WALL, "Mossy Stone Tile Wall");

        translationBuilder.add(ModStoneBlocks.CRACKED_STONE_TILES, "Cracked Stone Tiles");
        translationBuilder.add(ModStoneBlocks.CRACKED_STONE_TILE_STAIRS, "Cracked Stone Tile Stairs");
        translationBuilder.add(ModStoneBlocks.CRACKED_STONE_TILE_SLAB, "Cracked Stone Tile Slab");
        translationBuilder.add(ModStoneBlocks.CRACKED_STONE_TILE_WALL, "Cracked Stone Tile Wall");

        translationBuilder.add(ModStoneBlocks.STONE_PILLAR, "Stone Pillar");
        translationBuilder.add(ModStoneBlocks.MOSSY_STONE_PILLAR, "Mossy Stone Pillar");
        translationBuilder.add(ModStoneBlocks.CRACKED_STONE_PILLAR, "Cracked Stone Pillar");

        // ============== GRANITE ==============

        translationBuilder.add(ModGraniteBlocks.CHISELED_GRANITE, "Chiseled Granite");
        translationBuilder.add(ModGraniteBlocks.MOSSY_CHISELED_GRANITE, "Mossy Chiseled Granite");
        translationBuilder.add(ModGraniteBlocks.CRACKED_CHISELED_GRANITE, "Cracked Chiseled Granite");

        translationBuilder.add(ModGraniteBlocks.COBBLED_GRANITE, "Cobbled Granite");
        translationBuilder.add(ModGraniteBlocks.COBBLED_GRANITE_STAIRS, "Cobbled Granite Stairs");
        translationBuilder.add(ModGraniteBlocks.COBBLED_GRANITE_SLAB, "Cobbled Granite Slab");
        translationBuilder.add(ModGraniteBlocks.COBBLED_GRANITE_WALL, "Cobbled Granite Wall");

        translationBuilder.add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE, "Mossy Cobbled Granite");
        translationBuilder.add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_STAIRS, "Mossy Cobbled Granite Stairs");
        translationBuilder.add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_SLAB, "Mossy Cobbled Granite Slab");
        translationBuilder.add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_WALL, "Mossy Cobbled Granite Wall");

        translationBuilder.add(ModGraniteBlocks.SMOOTH_GRANITE, "Smooth Granite");
        translationBuilder.add(ModGraniteBlocks.SMOOTH_GRANITE_STAIRS, "Smooth Granite Stairs");
        translationBuilder.add(ModGraniteBlocks.SMOOTH_GRANITE_SLAB, "Smooth Granite Slab");
        translationBuilder.add(ModGraniteBlocks.SMOOTH_GRANITE_WALL, "Smooth Granite Wall");

        translationBuilder.add(ModGraniteBlocks.POLISHED_GRANITE_WALL, "Polished Granite Wall");
        translationBuilder.add(ModGraniteBlocks.POLISHED_GRANITE_PRESSURE_PLATE, "Polished Granite Pressure Plate");
        translationBuilder.add(ModGraniteBlocks.POLISHED_GRANITE_BUTTON, "Polished Granite Button");

        translationBuilder.add(ModGraniteBlocks.GRANITE_BRICKS, "Granite Bricks");
        translationBuilder.add(ModGraniteBlocks.GRANITE_BRICK_STAIRS, "Granite Brick Stairs");
        translationBuilder.add(ModGraniteBlocks.GRANITE_BRICK_SLAB, "Granite Brick Slab");
        translationBuilder.add(ModGraniteBlocks.GRANITE_BRICK_WALL, "Granite Brick Wall");
        translationBuilder.add(ModGraniteBlocks.CHISELED_GRANITE_BRICKS, "Chiseled Granite Bricks");

        translationBuilder.add(ModGraniteBlocks.MOSSY_GRANITE_BRICKS, "Mossy Granite Bricks");
        translationBuilder.add(ModGraniteBlocks.MOSSY_GRANITE_BRICK_STAIRS, "Mossy Granite Brick Stairs");
        translationBuilder.add(ModGraniteBlocks.MOSSY_GRANITE_BRICK_SLAB, "Mossy Granite Brick Slab");
        translationBuilder.add(ModGraniteBlocks.MOSSY_GRANITE_BRICK_WALL, "Mossy Granite Brick Wall");
        translationBuilder.add(ModGraniteBlocks.MOSSY_CHISELED_GRANITE_BRICKS, "Mossy Chiseled Granite Bricks");

        translationBuilder.add(ModGraniteBlocks.CRACKED_GRANITE_BRICKS, "Cracked Granite Bricks");
        translationBuilder.add(ModGraniteBlocks.CRACKED_GRANITE_BRICK_STAIRS, "Cracked Granite Brick Stairs");
        translationBuilder.add(ModGraniteBlocks.CRACKED_GRANITE_BRICK_SLAB, "Cracked Granite Brick Slab");
        translationBuilder.add(ModGraniteBlocks.CRACKED_GRANITE_BRICK_WALL, "Cracked Granite Brick Wall");
        translationBuilder.add(ModGraniteBlocks.CRACKED_CHISELED_GRANITE_BRICKS, "Cracked Chiseled Granite Bricks");

        translationBuilder.add(ModGraniteBlocks.GRANITE_PLATES, "Granite Plates");
        translationBuilder.add(ModGraniteBlocks.GRANITE_PLATE_STAIRS, "Granite Plate Stairs");
        translationBuilder.add(ModGraniteBlocks.GRANITE_PLATE_SLAB, "Granite Plate Slab");
        translationBuilder.add(ModGraniteBlocks.GRANITE_PLATE_WALL, "Granite Plate Wall");

        translationBuilder.add(ModGraniteBlocks.MOSSY_GRANITE_PLATES, "Mossy Granite Plates");
        translationBuilder.add(ModGraniteBlocks.MOSSY_GRANITE_PLATE_STAIRS, "Mossy Granite Plate Stairs");
        translationBuilder.add(ModGraniteBlocks.MOSSY_GRANITE_PLATE_SLAB, "Mossy Granite Plate Slab");
        translationBuilder.add(ModGraniteBlocks.MOSSY_GRANITE_PLATE_WALL, "Mossy Granite Plate Wall");

        translationBuilder.add(ModGraniteBlocks.CRACKED_GRANITE_PLATES, "Cracked Granite Plates");
        translationBuilder.add(ModGraniteBlocks.CRACKED_GRANITE_PLATE_STAIRS, "Cracked Granite Plate Stairs");
        translationBuilder.add(ModGraniteBlocks.CRACKED_GRANITE_PLATE_SLAB, "Cracked Granite Plate Slab");
        translationBuilder.add(ModGraniteBlocks.CRACKED_GRANITE_PLATE_WALL, "Cracked Granite Plate Wall");

        translationBuilder.add(ModGraniteBlocks.GRANITE_TILES, "Granite Tiles");
        translationBuilder.add(ModGraniteBlocks.GRANITE_TILE_STAIRS, "Granite Tile Stairs");
        translationBuilder.add(ModGraniteBlocks.GRANITE_TILE_SLAB, "Granite Tile Slab");
        translationBuilder.add(ModGraniteBlocks.GRANITE_TILE_WALL, "Granite Tile Wall");

        translationBuilder.add(ModGraniteBlocks.MOSSY_GRANITE_TILES, "Mossy Granite Tiles");
        translationBuilder.add(ModGraniteBlocks.MOSSY_GRANITE_TILE_STAIRS, "Mossy Granite Tile Stairs");
        translationBuilder.add(ModGraniteBlocks.MOSSY_GRANITE_TILE_SLAB, "Mossy Granite Tile Slab");
        translationBuilder.add(ModGraniteBlocks.MOSSY_GRANITE_TILE_WALL, "Mossy Granite Tile Wall");

        translationBuilder.add(ModGraniteBlocks.CRACKED_GRANITE_TILES, "Cracked Granite Tiles");
        translationBuilder.add(ModGraniteBlocks.CRACKED_GRANITE_TILE_STAIRS, "Cracked Granite Tile Stairs");
        translationBuilder.add(ModGraniteBlocks.CRACKED_GRANITE_TILE_SLAB, "Cracked Granite Tile Slab");
        translationBuilder.add(ModGraniteBlocks.CRACKED_GRANITE_TILE_WALL, "Cracked Granite Tile Wall");

        translationBuilder.add(ModGraniteBlocks.GRANITE_PILLAR, "Granite Pillar");
        translationBuilder.add(ModGraniteBlocks.MOSSY_GRANITE_PILLAR, "Mossy Granite Pillar");
        translationBuilder.add(ModGraniteBlocks.CRACKED_GRANITE_PILLAR, "Cracked Granite Pillar");

        // ============== DIORITE ==============

        translationBuilder.add(ModDioriteBlocks.CHISELED_DIORITE, "Chiseled Diorite");
        translationBuilder.add(ModDioriteBlocks.MOSSY_CHISELED_DIORITE, "Mossy Chiseled Diorite");
        translationBuilder.add(ModDioriteBlocks.CRACKED_CHISELED_DIORITE, "Cracked Chiseled Diorite");

        translationBuilder.add(ModDioriteBlocks.COBBLED_DIORITE, "Cobbled Diorite");
        translationBuilder.add(ModDioriteBlocks.COBBLED_DIORITE_STAIRS, "Cobbled Diorite Stairs");
        translationBuilder.add(ModDioriteBlocks.COBBLED_DIORITE_SLAB, "Cobbled Diorite Slab");
        translationBuilder.add(ModDioriteBlocks.COBBLED_DIORITE_WALL, "Cobbled Diorite Wall");

        translationBuilder.add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE, "Mossy Cobbled Diorite");
        translationBuilder.add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_STAIRS, "Mossy Cobbled Diorite Stairs");
        translationBuilder.add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_SLAB, "Mossy Cobbled Diorite Slab");
        translationBuilder.add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_WALL, "Mossy Cobbled Diorite Wall");

        translationBuilder.add(ModDioriteBlocks.SMOOTH_DIORITE, "Smooth Diorite");
        translationBuilder.add(ModDioriteBlocks.SMOOTH_DIORITE_STAIRS, "Smooth Diorite Stairs");
        translationBuilder.add(ModDioriteBlocks.SMOOTH_DIORITE_SLAB, "Smooth Diorite Slab");
        translationBuilder.add(ModDioriteBlocks.SMOOTH_DIORITE_WALL, "Smooth Diorite Wall");

        translationBuilder.add(ModDioriteBlocks.POLISHED_DIORITE_WALL, "Polished Diorite Wall");
        translationBuilder.add(ModDioriteBlocks.POLISHED_DIORITE_PRESSURE_PLATE, "Polished Diorite Pressure Plate");
        translationBuilder.add(ModDioriteBlocks.POLISHED_DIORITE_BUTTON, "Polished Diorite Button");

        translationBuilder.add(ModDioriteBlocks.DIORITE_BRICKS, "Diorite Bricks");
        translationBuilder.add(ModDioriteBlocks.DIORITE_BRICK_STAIRS, "Diorite Brick Stairs");
        translationBuilder.add(ModDioriteBlocks.DIORITE_BRICK_SLAB, "Diorite Brick Slab");
        translationBuilder.add(ModDioriteBlocks.DIORITE_BRICK_WALL, "Diorite Brick Wall");
        translationBuilder.add(ModDioriteBlocks.CHISELED_DIORITE_BRICKS, "Chiseled Diorite Bricks");

        translationBuilder.add(ModDioriteBlocks.MOSSY_DIORITE_BRICKS, "Mossy Diorite Bricks");
        translationBuilder.add(ModDioriteBlocks.MOSSY_DIORITE_BRICK_STAIRS, "Mossy Diorite Brick Stairs");
        translationBuilder.add(ModDioriteBlocks.MOSSY_DIORITE_BRICK_SLAB, "Mossy Diorite Brick Slab");
        translationBuilder.add(ModDioriteBlocks.MOSSY_DIORITE_BRICK_WALL, "Mossy Diorite Brick Wall");
        translationBuilder.add(ModDioriteBlocks.MOSSY_CHISELED_DIORITE_BRICKS, "Mossy Chiseled Diorite Bricks");

        translationBuilder.add(ModDioriteBlocks.CRACKED_DIORITE_BRICKS, "Cracked Diorite Bricks");
        translationBuilder.add(ModDioriteBlocks.CRACKED_DIORITE_BRICK_STAIRS, "Cracked Diorite Brick Stairs");
        translationBuilder.add(ModDioriteBlocks.CRACKED_DIORITE_BRICK_SLAB, "Cracked Diorite Brick Slab");
        translationBuilder.add(ModDioriteBlocks.CRACKED_DIORITE_BRICK_WALL, "Cracked Diorite Brick Wall");
        translationBuilder.add(ModDioriteBlocks.CRACKED_CHISELED_DIORITE_BRICKS, "Cracked Chiseled Diorite Bricks");

        translationBuilder.add(ModDioriteBlocks.DIORITE_PLATES, "Diorite Plates");
        translationBuilder.add(ModDioriteBlocks.DIORITE_PLATE_STAIRS, "Diorite Plate Stairs");
        translationBuilder.add(ModDioriteBlocks.DIORITE_PLATE_SLAB, "Diorite Plate Slab");
        translationBuilder.add(ModDioriteBlocks.DIORITE_PLATE_WALL, "Diorite Plate Wall");

        translationBuilder.add(ModDioriteBlocks.MOSSY_DIORITE_PLATES, "Mossy Diorite Plates");
        translationBuilder.add(ModDioriteBlocks.MOSSY_DIORITE_PLATE_STAIRS, "Mossy Diorite Plate Stairs");
        translationBuilder.add(ModDioriteBlocks.MOSSY_DIORITE_PLATE_SLAB, "Mossy Diorite Plate Slab");
        translationBuilder.add(ModDioriteBlocks.MOSSY_DIORITE_PLATE_WALL, "Mossy Diorite Plate Wall");

        translationBuilder.add(ModDioriteBlocks.CRACKED_DIORITE_PLATES, "Cracked Diorite Plates");
        translationBuilder.add(ModDioriteBlocks.CRACKED_DIORITE_PLATE_STAIRS, "Cracked Diorite Plate Stairs");
        translationBuilder.add(ModDioriteBlocks.CRACKED_DIORITE_PLATE_SLAB, "Cracked Diorite Plate Slab");
        translationBuilder.add(ModDioriteBlocks.CRACKED_DIORITE_PLATE_WALL, "Cracked Diorite Plate Wall");

        translationBuilder.add(ModDioriteBlocks.DIORITE_TILES, "Diorite Tiles");
        translationBuilder.add(ModDioriteBlocks.DIORITE_TILE_STAIRS, "Diorite Tile Stairs");
        translationBuilder.add(ModDioriteBlocks.DIORITE_TILE_SLAB, "Diorite Tile Slab");
        translationBuilder.add(ModDioriteBlocks.DIORITE_TILE_WALL, "Diorite Tile Wall");

        translationBuilder.add(ModDioriteBlocks.MOSSY_DIORITE_TILES, "Mossy Diorite Tiles");
        translationBuilder.add(ModDioriteBlocks.MOSSY_DIORITE_TILE_STAIRS, "Mossy Diorite Tile Stairs");
        translationBuilder.add(ModDioriteBlocks.MOSSY_DIORITE_TILE_SLAB, "Mossy Diorite Tile Slab");
        translationBuilder.add(ModDioriteBlocks.MOSSY_DIORITE_TILE_WALL, "Mossy Diorite Tile Wall");

        translationBuilder.add(ModDioriteBlocks.CRACKED_DIORITE_TILES, "Cracked Diorite Tiles");
        translationBuilder.add(ModDioriteBlocks.CRACKED_DIORITE_TILE_STAIRS, "Cracked Diorite Tile Stairs");
        translationBuilder.add(ModDioriteBlocks.CRACKED_DIORITE_TILE_SLAB, "Cracked Diorite Tile Slab");
        translationBuilder.add(ModDioriteBlocks.CRACKED_DIORITE_TILE_WALL, "Cracked Diorite Tile Wall");

        translationBuilder.add(ModDioriteBlocks.DIORITE_PILLAR, "Diorite Pillar");
        translationBuilder.add(ModDioriteBlocks.MOSSY_DIORITE_PILLAR, "Mossy Diorite Pillar");
        translationBuilder.add(ModDioriteBlocks.CRACKED_DIORITE_PILLAR, "Cracked Diorite Pillar");

        // ============== ANDESITE ==============

        translationBuilder.add(ModAndesiteBlocks.CHISELED_ANDESITE, "Chiseled Andesite");
        translationBuilder.add(ModAndesiteBlocks.MOSSY_CHISELED_ANDESITE, "Mossy Chiseled Andesite");
        translationBuilder.add(ModAndesiteBlocks.CRACKED_CHISELED_ANDESITE, "Cracked Chiseled Andesite");

        translationBuilder.add(ModAndesiteBlocks.COBBLED_ANDESITE, "Cobbled Andesite");
        translationBuilder.add(ModAndesiteBlocks.COBBLED_ANDESITE_STAIRS, "Cobbled Andesite Stairs");
        translationBuilder.add(ModAndesiteBlocks.COBBLED_ANDESITE_SLAB, "Cobbled Andesite Slab");
        translationBuilder.add(ModAndesiteBlocks.COBBLED_ANDESITE_WALL, "Cobbled Andesite Wall");

        translationBuilder.add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE, "Mossy Cobbled Andesite");
        translationBuilder.add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_STAIRS, "Mossy Cobbled Andesite Stairs");
        translationBuilder.add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_SLAB, "Mossy Cobbled Andesite Slab");
        translationBuilder.add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_WALL, "Mossy Cobbled Andesite Wall");

        translationBuilder.add(ModAndesiteBlocks.SMOOTH_ANDESITE, "Smooth Andesite");
        translationBuilder.add(ModAndesiteBlocks.SMOOTH_ANDESITE_STAIRS, "Smooth Andesite Stairs");
        translationBuilder.add(ModAndesiteBlocks.SMOOTH_ANDESITE_SLAB, "Smooth Andesite Slab");
        translationBuilder.add(ModAndesiteBlocks.SMOOTH_ANDESITE_WALL, "Smooth Andesite Wall");

        translationBuilder.add(ModAndesiteBlocks.POLISHED_ANDESITE_WALL, "Polished Andesite Wall");
        translationBuilder.add(ModAndesiteBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, "Polished Andesite Pressure Plate");
        translationBuilder.add(ModAndesiteBlocks.POLISHED_ANDESITE_BUTTON, "Polished Andesite Button");

        translationBuilder.add(ModAndesiteBlocks.ANDESITE_BRICKS, "Andesite Bricks");
        translationBuilder.add(ModAndesiteBlocks.ANDESITE_BRICK_STAIRS, "Andesite Brick Stairs");
        translationBuilder.add(ModAndesiteBlocks.ANDESITE_BRICK_SLAB, "Andesite Brick Slab");
        translationBuilder.add(ModAndesiteBlocks.ANDESITE_BRICK_WALL, "Andesite Brick Wall");
        translationBuilder.add(ModAndesiteBlocks.CHISELED_ANDESITE_BRICKS, "Chiseled Andesite Bricks");

        translationBuilder.add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICKS, "Mossy Andesite Bricks");
        translationBuilder.add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_STAIRS, "Mossy Andesite Brick Stairs");
        translationBuilder.add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_SLAB, "Mossy Andesite Brick Slab");
        translationBuilder.add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_WALL, "Mossy Andesite Brick Wall");
        translationBuilder.add(ModAndesiteBlocks.MOSSY_CHISELED_ANDESITE_BRICKS, "Mossy Chiseled Andesite Bricks");

        translationBuilder.add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICKS, "Cracked Andesite Bricks");
        translationBuilder.add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_STAIRS, "Cracked Andesite Brick Stairs");
        translationBuilder.add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_SLAB, "Cracked Andesite Brick Slab");
        translationBuilder.add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_WALL, "Cracked Andesite Brick Wall");
        translationBuilder.add(ModAndesiteBlocks.CRACKED_CHISELED_ANDESITE_BRICKS, "Cracked Chiseled Andesite Bricks");

        translationBuilder.add(ModAndesiteBlocks.ANDESITE_PLATES, "Andesite Plates");
        translationBuilder.add(ModAndesiteBlocks.ANDESITE_PLATE_STAIRS, "Andesite Plate Stairs");
        translationBuilder.add(ModAndesiteBlocks.ANDESITE_PLATE_SLAB, "Andesite Plate Slab");
        translationBuilder.add(ModAndesiteBlocks.ANDESITE_PLATE_WALL, "Andesite Plate Wall");

        translationBuilder.add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATES, "Mossy Andesite Plates");
        translationBuilder.add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_STAIRS, "Mossy Andesite Plate Stairs");
        translationBuilder.add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_SLAB, "Mossy Andesite Plate Slab");
        translationBuilder.add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_WALL, "Mossy Andesite Plate Wall");

        translationBuilder.add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATES, "Cracked Andesite Plates");
        translationBuilder.add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_STAIRS, "Cracked Andesite Plate Stairs");
        translationBuilder.add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_SLAB, "Cracked Andesite Plate Slab");
        translationBuilder.add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_WALL, "Cracked Andesite Plate Wall");

        translationBuilder.add(ModAndesiteBlocks.ANDESITE_TILES, "Andesite Tiles");
        translationBuilder.add(ModAndesiteBlocks.ANDESITE_TILE_STAIRS, "Andesite Tile Stairs");
        translationBuilder.add(ModAndesiteBlocks.ANDESITE_TILE_SLAB, "Andesite Tile Slab");
        translationBuilder.add(ModAndesiteBlocks.ANDESITE_TILE_WALL, "Andesite Tile Wall");

        translationBuilder.add(ModAndesiteBlocks.MOSSY_ANDESITE_TILES, "Mossy Andesite Tiles");
        translationBuilder.add(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_STAIRS, "Mossy Andesite Tile Stairs");
        translationBuilder.add(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_SLAB, "Mossy Andesite Tile Slab");
        translationBuilder.add(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_WALL, "Mossy Andesite Tile Wall");

        translationBuilder.add(ModAndesiteBlocks.CRACKED_ANDESITE_TILES, "Cracked Andesite Tiles");
        translationBuilder.add(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_STAIRS, "Cracked Andesite Tile Stairs");
        translationBuilder.add(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_SLAB, "Cracked Andesite Tile Slab");
        translationBuilder.add(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_WALL, "Cracked Andesite Tile Wall");

        translationBuilder.add(ModAndesiteBlocks.ANDESITE_PILLAR, "Andesite Pillar");
        translationBuilder.add(ModAndesiteBlocks.MOSSY_ANDESITE_PILLAR, "Mossy Andesite Pillar");
        translationBuilder.add(ModAndesiteBlocks.CRACKED_ANDESITE_PILLAR, "Cracked Andesite Pillar");

        // ============== DEEPSLATE ==============

        translationBuilder.add(ModDeepslateBlocks.DEEPSLATE_STAIRS, "Deepslate Stairs");
        translationBuilder.add(ModDeepslateBlocks.DEEPSLATE_SLAB, "Deepslate Slab");
        translationBuilder.add(ModDeepslateBlocks.DEEPSLATE_WALL, "Deepslate Wall");

        translationBuilder.add(ModDeepslateBlocks.MOSSY_CHISELED_DEEPSLATE, "Mossy Chiseled Deepslate");
        translationBuilder.add(ModDeepslateBlocks.CRACKED_CHISELED_DEEPSLATE, "Cracked Chiseled Deepslate");

        translationBuilder.add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE, "Mossy Cobbled Deepslate");
        translationBuilder.add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS, "Mossy Cobbled Deepslate Stairs");
        translationBuilder.add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB, "Mossy Cobbled Deepslate Slab");
        translationBuilder.add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_WALL, "Mossy Cobbled Deepslate Wall");

        translationBuilder.add(ModDeepslateBlocks.SMOOTH_DEEPSLATE, "Smooth Deepslate");
        translationBuilder.add(ModDeepslateBlocks.SMOOTH_DEEPSLATE_STAIRS, "Smooth Deepslate Stairs");
        translationBuilder.add(ModDeepslateBlocks.SMOOTH_DEEPSLATE_SLAB, "Smooth Deepslate Slab");
        translationBuilder.add(ModDeepslateBlocks.SMOOTH_DEEPSLATE_WALL, "Smooth Deepslate Wall");

        translationBuilder.add(ModDeepslateBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, "Polished Deepslate Pressure Plate");
        translationBuilder.add(ModDeepslateBlocks.POLISHED_DEEPSLATE_BUTTON, "Polished Deepslate Button");

        translationBuilder.add(ModDeepslateBlocks.CHISELED_DEEPSLATE_BRICKS, "Chiseled Deepslate Bricks");

        translationBuilder.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICKS, "Mossy Deepslate Bricks");
        translationBuilder.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, "Mossy Deepslate Brick Stairs");
        translationBuilder.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, "Mossy Deepslate Brick Slab");
        translationBuilder.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_WALL, "Mossy Deepslate Brick Wall");
        translationBuilder.add(ModDeepslateBlocks.MOSSY_CHISELED_DEEPSLATE_BRICKS, "Mossy Chiseled Deepslate Bricks");

        translationBuilder.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, "Cracked Deepslate Brick Stairs");
        translationBuilder.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, "Cracked Deepslate Brick Slab");
        translationBuilder.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_WALL, "Cracked Deepslate Brick Wall");
        translationBuilder.add(ModDeepslateBlocks.CRACKED_CHISELED_DEEPSLATE_BRICKS, "Cracked Chiseled Deepslate Bricks");

        translationBuilder.add(ModDeepslateBlocks.DEEPSLATE_PLATES, "Deepslate Plates");
        translationBuilder.add(ModDeepslateBlocks.DEEPSLATE_PLATE_STAIRS, "Deepslate Plate Stairs");
        translationBuilder.add(ModDeepslateBlocks.DEEPSLATE_PLATE_SLAB, "Deepslate Plate Slab");
        translationBuilder.add(ModDeepslateBlocks.DEEPSLATE_PLATE_WALL, "Deepslate Plate Wall");

        translationBuilder.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATES, "Mossy Deepslate Plates");
        translationBuilder.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_STAIRS, "Mossy Deepslate Plate Stairs");
        translationBuilder.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_SLAB, "Mossy Deepslate Plate Slab");
        translationBuilder.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_WALL, "Mossy Deepslate Plate Wall");

        translationBuilder.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATES, "Cracked Deepslate Plates");
        translationBuilder.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_STAIRS, "Cracked Deepslate Plate Stairs");
        translationBuilder.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_SLAB, "Cracked Deepslate Plate Slab");
        translationBuilder.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_WALL, "Cracked Deepslate Plate Wall");

        translationBuilder.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILES, "Mossy Deepslate Tiles");
        translationBuilder.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_STAIRS, "Mossy Deepslate Tile Stairs");
        translationBuilder.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_SLAB, "Mossy Deepslate Tile Slab");
        translationBuilder.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_WALL, "Mossy Deepslate Tile Wall");

        translationBuilder.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, "Cracked Deepslate Tile Stairs");
        translationBuilder.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_SLAB, "Cracked Deepslate Tile Slab");
        translationBuilder.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_WALL, "Cracked Deepslate Tile Wall");

        translationBuilder.add(ModDeepslateBlocks.DEEPSLATE_PILLAR, "Deepslate Pillar");
        translationBuilder.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PILLAR, "Mossy Deepslate Pillar");
        translationBuilder.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PILLAR, "Cracked Deepslate Pillar");

        // Renaming Blackstone blocks is done at resources/assets/minecraft/lang, in "en_us.json"

        // ============== ADVANCEMENTS ==============

        translationBuilder.add("advancement.blocksistency.get_all_stone_blocks.title", "No Stone Left Uncrafted");
        translationBuilder.add("advancement.blocksistency.get_all_stone_blocks.description", "Obtain all Stone blocks");

        translationBuilder.add("advancement.blocksistency.get_all_granite_blocks.title", "Quartz-Fortified!");
        translationBuilder.add("advancement.blocksistency.get_all_granite_blocks.description", "Obtain all Granite blocks");

        translationBuilder.add("advancement.blocksistency.get_all_diorite_blocks.title", "It's Good Now, Actually");
        translationBuilder.add("advancement.blocksistency.get_all_diorite_blocks.description", "Obtain all Diorite blocks");

        translationBuilder.add("advancement.blocksistency.get_all_andesite_blocks.title", "Quartz-Conscious!");
        translationBuilder.add("advancement.blocksistency.get_all_andesite_blocks.description", "Obtain all Andesite blocks");

        translationBuilder.add("advancement.blocksistency.get_all_deepslate_blocks.title", "Grimstone Glory");
        translationBuilder.add("advancement.blocksistency.get_all_deepslate_blocks.description", "Obtain all Deepslate blocks");

        // Creative Tab
        translationBuilder.add("itemgroup.blocksistency.blocksistency", "Blocksistency");
    }
}
