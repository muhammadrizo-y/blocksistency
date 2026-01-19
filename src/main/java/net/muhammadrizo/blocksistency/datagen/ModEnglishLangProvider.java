package net.muhammadrizo.blocksistency.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLangProvider extends FabricLanguageProvider {
    public ModEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("block.blocksistency.stone_wall", "Stone Wall");

        translationBuilder.add("block.blocksistency.smooth_stone_stairs", "Smooth Stone Stairs");
        translationBuilder.add("block.blocksistency.smooth_stone_wall", "Smooth Stone Wall");

        translationBuilder.add("block.blocksistency.polished_stone", "Polished Stone");
        translationBuilder.add("block.blocksistency.polished_stone_stairs", "Polished Stone Stairs");
        translationBuilder.add("block.blocksistency.polished_stone_slab", "Polished Stone Slab");
        translationBuilder.add("block.blocksistency.polished_stone_wall", "Polished Stone Wall");

        translationBuilder.add("block.blocksistency.cracked_stone_brick_stairs", "Cracked Stone Brick Stairs");
        translationBuilder.add("block.blocksistency.cracked_stone_brick_slab", "Cracked Stone Brick Slab");
        translationBuilder.add("block.blocksistency.cracked_stone_brick_wall", "Cracked Stone Brick Wall");

        translationBuilder.add("block.blocksistency.stone_tiles", "Stone Tiles");
        translationBuilder.add("block.blocksistency.stone_tile_stairs", "Stone Tile Stairs");
        translationBuilder.add("block.blocksistency.stone_tile_slab", "Stone Tile Slab");
        translationBuilder.add("block.blocksistency.stone_tile_wall", "Stone Tile Wall");

        translationBuilder.add("block.blocksistency.mossy_stone_tiles", "Mossy Stone Tiles");
        translationBuilder.add("block.blocksistency.mossy_stone_tile_stairs", "Mossy Stone Tile Stairs");
        translationBuilder.add("block.blocksistency.mossy_stone_tile_slab", "Mossy Stone Tile Slab");
        translationBuilder.add("block.blocksistency.mossy_stone_tile_wall", "Mossy Stone Tile Wall");

        translationBuilder.add("block.blocksistency.cracked_stone_tiles", "Cracked Stone Tiles");
        translationBuilder.add("block.blocksistency.cracked_stone_tile_stairs", "Cracked Stone Tile Stairs");
        translationBuilder.add("block.blocksistency.cracked_stone_tile_slab", "Cracked Stone Tile Slab");
        translationBuilder.add("block.blocksistency.cracked_stone_tile_wall", "Cracked Stone Tile Wall");

        translationBuilder.add("block.blocksistency.chiseled_stone", "Chiseled Stone");
        translationBuilder.add("block.blocksistency.mossy_chiseled_stone", "Mossy Chiseled Stone");
        translationBuilder.add("block.blocksistency.cracked_chiseled_stone", "Cracked Chiseled Stone");

        translationBuilder.add("block.blocksistency.mossy_chiseled_stone_bricks", "Mossy Chiseled Stone Bricks");
        translationBuilder.add("block.blocksistency.cracked_chiseled_stone_bricks", "Cracked Chiseled Stone Bricks");

        translationBuilder.add("block.blocksistency.stone_pillar", "Stone Pillar");
        translationBuilder.add("block.blocksistency.mossy_stone_pillar", "Mossy Stone Pillar");
        translationBuilder.add("block.blocksistency.cracked_stone_pillar", "Cracked Stone Pillar");

        translationBuilder.add("itemgroup.blocksistency.stone", "Blocksistency: Stone");
    }
}
