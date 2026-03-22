package net.muhammadrizo.blocksistency.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.muhammadrizo.blocksistency.block.*;
import net.muhammadrizo.blocksistency.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                // ============== STONE ==============

                .add(ModStoneBlocks.STONE_WALL)
                .add(ModStoneBlocks.CHISELED_STONE)
                .add(ModStoneBlocks.MOSSY_CHISELED_STONE)
                .add(ModStoneBlocks.CRACKED_CHISELED_STONE)

                .add(ModStoneBlocks.SMOOTH_STONE_STAIRS)
                .add(ModStoneBlocks.SMOOTH_STONE_WALL)

                .add(ModStoneBlocks.POLISHED_STONE)
                .add(ModStoneBlocks.POLISHED_STONE_STAIRS)
                .add(ModStoneBlocks.POLISHED_STONE_SLAB)
                .add(ModStoneBlocks.POLISHED_STONE_WALL)

                .add(ModStoneBlocks.MOSSY_CHISELED_STONE_BRICKS)

                .add(ModStoneBlocks.CRACKED_STONE_BRICK_STAIRS)
                .add(ModStoneBlocks.CRACKED_STONE_BRICK_SLAB)
                .add(ModStoneBlocks.CRACKED_STONE_BRICK_WALL)
                .add(ModStoneBlocks.CRACKED_CHISELED_STONE_BRICKS)

                .add(ModStoneBlocks.STONE_PLATES)
                .add(ModStoneBlocks.STONE_PLATE_STAIRS)
                .add(ModStoneBlocks.STONE_PLATE_SLAB)
                .add(ModStoneBlocks.STONE_PLATE_WALL)

                .add(ModStoneBlocks.MOSSY_STONE_PLATES)
                .add(ModStoneBlocks.MOSSY_STONE_PLATE_STAIRS)
                .add(ModStoneBlocks.MOSSY_STONE_PLATE_SLAB)
                .add(ModStoneBlocks.MOSSY_STONE_PLATE_WALL)

                .add(ModStoneBlocks.CRACKED_STONE_PLATES)
                .add(ModStoneBlocks.CRACKED_STONE_PLATE_STAIRS)
                .add(ModStoneBlocks.CRACKED_STONE_PLATE_SLAB)
                .add(ModStoneBlocks.CRACKED_STONE_PLATE_WALL)

                .add(ModStoneBlocks.STONE_TILES)
                .add(ModStoneBlocks.STONE_TILE_STAIRS)
                .add(ModStoneBlocks.STONE_TILE_SLAB)
                .add(ModStoneBlocks.STONE_TILE_WALL)

                .add(ModStoneBlocks.MOSSY_STONE_TILES)
                .add(ModStoneBlocks.MOSSY_STONE_TILE_STAIRS)
                .add(ModStoneBlocks.MOSSY_STONE_TILE_SLAB)
                .add(ModStoneBlocks.MOSSY_STONE_TILE_WALL)

                .add(ModStoneBlocks.CRACKED_STONE_TILES)
                .add(ModStoneBlocks.CRACKED_STONE_TILE_STAIRS)
                .add(ModStoneBlocks.CRACKED_STONE_TILE_SLAB)
                .add(ModStoneBlocks.CRACKED_STONE_TILE_WALL)

                .add(ModStoneBlocks.STONE_PILLAR)
                .add(ModStoneBlocks.MOSSY_STONE_PILLAR)
                .add(ModStoneBlocks.CRACKED_STONE_PILLAR)

                // ============== GRANITE ==============

                .add(ModGraniteBlocks.CHISELED_GRANITE)
                .add(ModGraniteBlocks.MOSSY_CHISELED_GRANITE)
                .add(ModGraniteBlocks.CRACKED_CHISELED_GRANITE)

                .add(ModGraniteBlocks.COBBLED_GRANITE)
                .add(ModGraniteBlocks.COBBLED_GRANITE_STAIRS)
                .add(ModGraniteBlocks.COBBLED_GRANITE_SLAB)
                .add(ModGraniteBlocks.COBBLED_GRANITE_WALL)

                .add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE)
                .add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_STAIRS)
                .add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_SLAB)
                .add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_WALL)

                .add(ModGraniteBlocks.SMOOTH_GRANITE)
                .add(ModGraniteBlocks.SMOOTH_GRANITE_STAIRS)
                .add(ModGraniteBlocks.SMOOTH_GRANITE_SLAB)
                .add(ModGraniteBlocks.SMOOTH_GRANITE_WALL)

                .add(ModGraniteBlocks.POLISHED_GRANITE_WALL)
                .add(ModGraniteBlocks.POLISHED_GRANITE_PRESSURE_PLATE)
                .add(ModGraniteBlocks.POLISHED_GRANITE_BUTTON)

                .add(ModGraniteBlocks.GRANITE_BRICKS)
                .add(ModGraniteBlocks.GRANITE_BRICK_STAIRS)
                .add(ModGraniteBlocks.GRANITE_BRICK_SLAB)
                .add(ModGraniteBlocks.GRANITE_BRICK_WALL)
                .add(ModGraniteBlocks.CHISELED_GRANITE_BRICKS)

                .add(ModGraniteBlocks.MOSSY_GRANITE_BRICKS)
                .add(ModGraniteBlocks.MOSSY_GRANITE_BRICK_STAIRS)
                .add(ModGraniteBlocks.MOSSY_GRANITE_BRICK_SLAB)
                .add(ModGraniteBlocks.MOSSY_GRANITE_BRICK_WALL)
                .add(ModGraniteBlocks.MOSSY_CHISELED_GRANITE_BRICKS)

                .add(ModGraniteBlocks.CRACKED_GRANITE_BRICKS)
                .add(ModGraniteBlocks.CRACKED_GRANITE_BRICK_STAIRS)
                .add(ModGraniteBlocks.CRACKED_GRANITE_BRICK_SLAB)
                .add(ModGraniteBlocks.CRACKED_GRANITE_BRICK_WALL)
                .add(ModGraniteBlocks.CRACKED_CHISELED_GRANITE_BRICKS)

                .add(ModGraniteBlocks.GRANITE_PLATES)
                .add(ModGraniteBlocks.GRANITE_PLATE_STAIRS)
                .add(ModGraniteBlocks.GRANITE_PLATE_SLAB)
                .add(ModGraniteBlocks.GRANITE_PLATE_WALL)

                .add(ModGraniteBlocks.MOSSY_GRANITE_PLATES)
                .add(ModGraniteBlocks.MOSSY_GRANITE_PLATE_STAIRS)
                .add(ModGraniteBlocks.MOSSY_GRANITE_PLATE_SLAB)
                .add(ModGraniteBlocks.MOSSY_GRANITE_PLATE_WALL)

                .add(ModGraniteBlocks.CRACKED_GRANITE_PLATES)
                .add(ModGraniteBlocks.CRACKED_GRANITE_PLATE_STAIRS)
                .add(ModGraniteBlocks.CRACKED_GRANITE_PLATE_SLAB)
                .add(ModGraniteBlocks.CRACKED_GRANITE_PLATE_WALL)

                .add(ModGraniteBlocks.GRANITE_TILES)
                .add(ModGraniteBlocks.GRANITE_TILE_STAIRS)
                .add(ModGraniteBlocks.GRANITE_TILE_SLAB)
                .add(ModGraniteBlocks.GRANITE_TILE_WALL)

                .add(ModGraniteBlocks.MOSSY_GRANITE_TILES)
                .add(ModGraniteBlocks.MOSSY_GRANITE_TILE_STAIRS)
                .add(ModGraniteBlocks.MOSSY_GRANITE_TILE_SLAB)
                .add(ModGraniteBlocks.MOSSY_GRANITE_TILE_WALL)

                .add(ModGraniteBlocks.CRACKED_GRANITE_TILES)
                .add(ModGraniteBlocks.CRACKED_GRANITE_TILE_STAIRS)
                .add(ModGraniteBlocks.CRACKED_GRANITE_TILE_SLAB)
                .add(ModGraniteBlocks.CRACKED_GRANITE_TILE_WALL)

                .add(ModGraniteBlocks.GRANITE_PILLAR)
                .add(ModGraniteBlocks.MOSSY_GRANITE_PILLAR)
                .add(ModGraniteBlocks.CRACKED_GRANITE_PILLAR)

                // ============== DIORITE ==============

                .add(ModDioriteBlocks.CHISELED_DIORITE)
                .add(ModDioriteBlocks.MOSSY_CHISELED_DIORITE)
                .add(ModDioriteBlocks.CRACKED_CHISELED_DIORITE)

                .add(ModDioriteBlocks.COBBLED_DIORITE)
                .add(ModDioriteBlocks.COBBLED_DIORITE_STAIRS)
                .add(ModDioriteBlocks.COBBLED_DIORITE_SLAB)
                .add(ModDioriteBlocks.COBBLED_DIORITE_WALL)

                .add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE)
                .add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_STAIRS)
                .add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_SLAB)
                .add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_WALL)

                .add(ModDioriteBlocks.SMOOTH_DIORITE)
                .add(ModDioriteBlocks.SMOOTH_DIORITE_STAIRS)
                .add(ModDioriteBlocks.SMOOTH_DIORITE_SLAB)
                .add(ModDioriteBlocks.SMOOTH_DIORITE_WALL)

                .add(ModDioriteBlocks.POLISHED_DIORITE_WALL)
                .add(ModDioriteBlocks.POLISHED_DIORITE_PRESSURE_PLATE)
                .add(ModDioriteBlocks.POLISHED_DIORITE_BUTTON)

                .add(ModDioriteBlocks.DIORITE_BRICKS)
                .add(ModDioriteBlocks.DIORITE_BRICK_STAIRS)
                .add(ModDioriteBlocks.DIORITE_BRICK_SLAB)
                .add(ModDioriteBlocks.DIORITE_BRICK_WALL)
                .add(ModDioriteBlocks.CHISELED_DIORITE_BRICKS)

                .add(ModDioriteBlocks.MOSSY_DIORITE_BRICKS)
                .add(ModDioriteBlocks.MOSSY_DIORITE_BRICK_STAIRS)
                .add(ModDioriteBlocks.MOSSY_DIORITE_BRICK_SLAB)
                .add(ModDioriteBlocks.MOSSY_DIORITE_BRICK_WALL)
                .add(ModDioriteBlocks.MOSSY_CHISELED_DIORITE_BRICKS)

                .add(ModDioriteBlocks.CRACKED_DIORITE_BRICKS)
                .add(ModDioriteBlocks.CRACKED_DIORITE_BRICK_STAIRS)
                .add(ModDioriteBlocks.CRACKED_DIORITE_BRICK_SLAB)
                .add(ModDioriteBlocks.CRACKED_DIORITE_BRICK_WALL)
                .add(ModDioriteBlocks.CRACKED_CHISELED_DIORITE_BRICKS)

                .add(ModDioriteBlocks.DIORITE_PLATES)
                .add(ModDioriteBlocks.DIORITE_PLATE_STAIRS)
                .add(ModDioriteBlocks.DIORITE_PLATE_SLAB)
                .add(ModDioriteBlocks.DIORITE_PLATE_WALL)

                .add(ModDioriteBlocks.MOSSY_DIORITE_PLATES)
                .add(ModDioriteBlocks.MOSSY_DIORITE_PLATE_STAIRS)
                .add(ModDioriteBlocks.MOSSY_DIORITE_PLATE_SLAB)
                .add(ModDioriteBlocks.MOSSY_DIORITE_PLATE_WALL)

                .add(ModDioriteBlocks.CRACKED_DIORITE_PLATES)
                .add(ModDioriteBlocks.CRACKED_DIORITE_PLATE_STAIRS)
                .add(ModDioriteBlocks.CRACKED_DIORITE_PLATE_SLAB)
                .add(ModDioriteBlocks.CRACKED_DIORITE_PLATE_WALL)

                .add(ModDioriteBlocks.DIORITE_TILES)
                .add(ModDioriteBlocks.DIORITE_TILE_STAIRS)
                .add(ModDioriteBlocks.DIORITE_TILE_SLAB)
                .add(ModDioriteBlocks.DIORITE_TILE_WALL)

                .add(ModDioriteBlocks.MOSSY_DIORITE_TILES)
                .add(ModDioriteBlocks.MOSSY_DIORITE_TILE_STAIRS)
                .add(ModDioriteBlocks.MOSSY_DIORITE_TILE_SLAB)
                .add(ModDioriteBlocks.MOSSY_DIORITE_TILE_WALL)

                .add(ModDioriteBlocks.CRACKED_DIORITE_TILES)
                .add(ModDioriteBlocks.CRACKED_DIORITE_TILE_STAIRS)
                .add(ModDioriteBlocks.CRACKED_DIORITE_TILE_SLAB)
                .add(ModDioriteBlocks.CRACKED_DIORITE_TILE_WALL)

                .add(ModDioriteBlocks.DIORITE_PILLAR)
                .add(ModDioriteBlocks.MOSSY_DIORITE_PILLAR)
                .add(ModDioriteBlocks.CRACKED_DIORITE_PILLAR)

                // ============== ANDESITE ==============

                .add(ModAndesiteBlocks.CHISELED_ANDESITE)
                .add(ModAndesiteBlocks.MOSSY_CHISELED_ANDESITE)
                .add(ModAndesiteBlocks.CRACKED_CHISELED_ANDESITE)

                .add(ModAndesiteBlocks.COBBLED_ANDESITE)
                .add(ModAndesiteBlocks.COBBLED_ANDESITE_STAIRS)
                .add(ModAndesiteBlocks.COBBLED_ANDESITE_SLAB)
                .add(ModAndesiteBlocks.COBBLED_ANDESITE_WALL)

                .add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE)
                .add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_STAIRS)
                .add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_SLAB)
                .add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_WALL)

                .add(ModAndesiteBlocks.SMOOTH_ANDESITE)
                .add(ModAndesiteBlocks.SMOOTH_ANDESITE_STAIRS)
                .add(ModAndesiteBlocks.SMOOTH_ANDESITE_SLAB)
                .add(ModAndesiteBlocks.SMOOTH_ANDESITE_WALL)

                .add(ModAndesiteBlocks.POLISHED_ANDESITE_WALL)
                .add(ModAndesiteBlocks.POLISHED_ANDESITE_PRESSURE_PLATE)
                .add(ModAndesiteBlocks.POLISHED_ANDESITE_BUTTON)

                .add(ModAndesiteBlocks.ANDESITE_BRICKS)
                .add(ModAndesiteBlocks.ANDESITE_BRICK_STAIRS)
                .add(ModAndesiteBlocks.ANDESITE_BRICK_SLAB)
                .add(ModAndesiteBlocks.ANDESITE_BRICK_WALL)
                .add(ModAndesiteBlocks.CHISELED_ANDESITE_BRICKS)

                .add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICKS)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_STAIRS)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_SLAB)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_WALL)
                .add(ModAndesiteBlocks.MOSSY_CHISELED_ANDESITE_BRICKS)

                .add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICKS)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_STAIRS)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_SLAB)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_WALL)
                .add(ModAndesiteBlocks.CRACKED_CHISELED_ANDESITE_BRICKS)

                .add(ModAndesiteBlocks.ANDESITE_PLATES)
                .add(ModAndesiteBlocks.ANDESITE_PLATE_STAIRS)
                .add(ModAndesiteBlocks.ANDESITE_PLATE_SLAB)
                .add(ModAndesiteBlocks.ANDESITE_PLATE_WALL)

                .add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATES)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_STAIRS)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_SLAB)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_WALL)

                .add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATES)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_STAIRS)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_SLAB)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_WALL)

                .add(ModAndesiteBlocks.ANDESITE_TILES)
                .add(ModAndesiteBlocks.ANDESITE_TILE_STAIRS)
                .add(ModAndesiteBlocks.ANDESITE_TILE_SLAB)
                .add(ModAndesiteBlocks.ANDESITE_TILE_WALL)

                .add(ModAndesiteBlocks.MOSSY_ANDESITE_TILES)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_STAIRS)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_SLAB)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_WALL)

                .add(ModAndesiteBlocks.CRACKED_ANDESITE_TILES)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_STAIRS)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_SLAB)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_WALL)

                .add(ModAndesiteBlocks.ANDESITE_PILLAR)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_PILLAR)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_PILLAR)

                // ============== DEEPSLATE ==============

                .add(ModDeepslateBlocks.DEEPSLATE_STAIRS)
                .add(ModDeepslateBlocks.DEEPSLATE_SLAB)
                .add(ModDeepslateBlocks.DEEPSLATE_WALL)

                .add(ModDeepslateBlocks.MOSSY_CHISELED_DEEPSLATE)
                .add(ModDeepslateBlocks.CRACKED_CHISELED_DEEPSLATE)

                .add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE)
                .add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS)
                .add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB)
                .add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_WALL)

                .add(ModDeepslateBlocks.SMOOTH_DEEPSLATE)
                .add(ModDeepslateBlocks.SMOOTH_DEEPSLATE_STAIRS)
                .add(ModDeepslateBlocks.SMOOTH_DEEPSLATE_SLAB)
                .add(ModDeepslateBlocks.SMOOTH_DEEPSLATE_WALL)

                .add(ModDeepslateBlocks.CHISELED_DEEPSLATE_BRICKS)

                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICKS)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_SLAB)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_WALL)
                .add(ModDeepslateBlocks.MOSSY_CHISELED_DEEPSLATE_BRICKS)

                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS)
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_SLAB)
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_WALL)
                .add(ModDeepslateBlocks.CRACKED_CHISELED_DEEPSLATE_BRICKS)

                .add(ModDeepslateBlocks.DEEPSLATE_PLATES)
                .add(ModDeepslateBlocks.DEEPSLATE_PLATE_STAIRS)
                .add(ModDeepslateBlocks.DEEPSLATE_PLATE_SLAB)
                .add(ModDeepslateBlocks.DEEPSLATE_PLATE_WALL)

                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATES)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_STAIRS)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_SLAB)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_WALL)

                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATES)
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_STAIRS)
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_SLAB)
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_WALL)

                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILES)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_STAIRS)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_SLAB)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_WALL)

                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_STAIRS)
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_SLAB)
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_WALL)

                .add(ModDeepslateBlocks.DEEPSLATE_PILLAR)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PILLAR)
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PILLAR);

        TagKey<Block> COBBLESTONES_NORMAL = TagKey.of(
                RegistryKeys.BLOCK,
                Identifier.of("c", "cobblestones/normal"));

        TagKey<Block> COBBLESTONES_MOSSY = TagKey.of(
                RegistryKeys.BLOCK,
                Identifier.of("c", "cobblestones/mossy"));

        valueLookupBuilder(COBBLESTONES_NORMAL)
                .add(ModGraniteBlocks.COBBLED_GRANITE)
                .add(ModDioriteBlocks.COBBLED_DIORITE)
                .add(ModAndesiteBlocks.COBBLED_ANDESITE);

        valueLookupBuilder(COBBLESTONES_MOSSY)
                .add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE)
                .add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE)
                .add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE)
                .add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE);

        valueLookupBuilder(BlockTags.STONE_BRICKS)
                .add(ModStoneBlocks.MOSSY_CHISELED_STONE_BRICKS)
                .add(ModStoneBlocks.CRACKED_CHISELED_STONE_BRICKS);

        valueLookupBuilder(ModTags.Blocks.GRANITE_BRICKS)
                .add(ModGraniteBlocks.GRANITE_BRICKS)
                .add(ModGraniteBlocks.MOSSY_GRANITE_BRICKS)
                .add(ModGraniteBlocks.CRACKED_GRANITE_BRICKS)
                .add(ModGraniteBlocks.CHISELED_GRANITE_BRICKS)
                .add(ModGraniteBlocks.MOSSY_CHISELED_GRANITE_BRICKS)
                .add(ModGraniteBlocks.CRACKED_CHISELED_GRANITE_BRICKS);

        valueLookupBuilder(ModTags.Blocks.DIORITE_BRICKS)
                .add(ModDioriteBlocks.DIORITE_BRICKS)
                .add(ModDioriteBlocks.MOSSY_DIORITE_BRICKS)
                .add(ModDioriteBlocks.CRACKED_DIORITE_BRICKS)
                .add(ModDioriteBlocks.CHISELED_DIORITE_BRICKS)
                .add(ModDioriteBlocks.MOSSY_CHISELED_DIORITE_BRICKS)
                .add(ModDioriteBlocks.CRACKED_CHISELED_DIORITE_BRICKS);

        valueLookupBuilder(ModTags.Blocks.ANDESITE_BRICKS)
                .add(ModAndesiteBlocks.ANDESITE_BRICKS)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICKS)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICKS)
                .add(ModAndesiteBlocks.CHISELED_ANDESITE_BRICKS)
                .add(ModAndesiteBlocks.MOSSY_CHISELED_ANDESITE_BRICKS)
                .add(ModAndesiteBlocks.CRACKED_CHISELED_ANDESITE_BRICKS);

        valueLookupBuilder(ModTags.Blocks.DEEPSLATE_BRICKS)
                .add(Blocks.DEEPSLATE_BRICKS)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICKS)
                .add(Blocks.CRACKED_DEEPSLATE_BRICKS)
                .add(ModDeepslateBlocks.CHISELED_DEEPSLATE_BRICKS)
                .add(ModDeepslateBlocks.MOSSY_CHISELED_DEEPSLATE_BRICKS)
                .add(ModDeepslateBlocks.CRACKED_CHISELED_DEEPSLATE_BRICKS);

        valueLookupBuilder(BlockTags.STAIRS)
                // ============== STONE ==============
                .add(ModStoneBlocks.SMOOTH_STONE_STAIRS)
                .add(ModStoneBlocks.POLISHED_STONE_STAIRS)
                .add(ModStoneBlocks.CRACKED_STONE_BRICK_STAIRS)
                .add(ModStoneBlocks.STONE_PLATE_STAIRS)
                .add(ModStoneBlocks.MOSSY_STONE_PLATE_STAIRS)
                .add(ModStoneBlocks.CRACKED_STONE_PLATE_STAIRS)
                .add(ModStoneBlocks.STONE_TILE_STAIRS)
                .add(ModStoneBlocks.MOSSY_STONE_TILE_STAIRS)
                .add(ModStoneBlocks.CRACKED_STONE_TILE_STAIRS)

                // ============== GRANITE ==============
                .add(ModGraniteBlocks.COBBLED_GRANITE_STAIRS)
                .add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_STAIRS)
                .add(ModGraniteBlocks.SMOOTH_GRANITE_STAIRS)
                .add(ModGraniteBlocks.GRANITE_BRICK_STAIRS)
                .add(ModGraniteBlocks.MOSSY_GRANITE_BRICK_STAIRS)
                .add(ModGraniteBlocks.CRACKED_GRANITE_BRICK_STAIRS)
                .add(ModGraniteBlocks.GRANITE_PLATE_STAIRS)
                .add(ModGraniteBlocks.MOSSY_GRANITE_PLATE_STAIRS)
                .add(ModGraniteBlocks.CRACKED_GRANITE_PLATE_STAIRS)
                .add(ModGraniteBlocks.GRANITE_TILE_STAIRS)
                .add(ModGraniteBlocks.MOSSY_GRANITE_TILE_STAIRS)
                .add(ModGraniteBlocks.CRACKED_GRANITE_TILE_STAIRS)

                // ============== DIORITE ==============
                .add(ModDioriteBlocks.COBBLED_DIORITE_STAIRS)
                .add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_STAIRS)
                .add(ModDioriteBlocks.SMOOTH_DIORITE_STAIRS)
                .add(ModDioriteBlocks.DIORITE_BRICK_STAIRS)
                .add(ModDioriteBlocks.MOSSY_DIORITE_BRICK_STAIRS)
                .add(ModDioriteBlocks.CRACKED_DIORITE_BRICK_STAIRS)
                .add(ModDioriteBlocks.DIORITE_PLATE_STAIRS)
                .add(ModDioriteBlocks.MOSSY_DIORITE_PLATE_STAIRS)
                .add(ModDioriteBlocks.CRACKED_DIORITE_PLATE_STAIRS)
                .add(ModDioriteBlocks.DIORITE_TILE_STAIRS)
                .add(ModDioriteBlocks.MOSSY_DIORITE_TILE_STAIRS)
                .add(ModDioriteBlocks.CRACKED_DIORITE_TILE_STAIRS)

                // ============== ANDESITE ==============
                .add(ModAndesiteBlocks.COBBLED_ANDESITE_STAIRS)
                .add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_STAIRS)
                .add(ModAndesiteBlocks.SMOOTH_ANDESITE_STAIRS)
                .add(ModAndesiteBlocks.ANDESITE_BRICK_STAIRS)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_STAIRS)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_STAIRS)
                .add(ModAndesiteBlocks.ANDESITE_PLATE_STAIRS)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_STAIRS)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_STAIRS)
                .add(ModAndesiteBlocks.ANDESITE_TILE_STAIRS)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_STAIRS)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_STAIRS)

                // ============== DEEPSLATE ==============
                .add(ModDeepslateBlocks.DEEPSLATE_STAIRS)
                .add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS)
                .add(ModDeepslateBlocks.SMOOTH_DEEPSLATE_STAIRS)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS)
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS)
                .add(ModDeepslateBlocks.DEEPSLATE_PLATE_STAIRS)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_STAIRS)
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_STAIRS)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_STAIRS)
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);

        valueLookupBuilder(BlockTags.SLABS)
                // ============== STONE ==============
                .add(ModStoneBlocks.POLISHED_STONE_SLAB)
                .add(ModStoneBlocks.CRACKED_STONE_BRICK_SLAB)
                .add(ModStoneBlocks.STONE_PLATE_SLAB)
                .add(ModStoneBlocks.MOSSY_STONE_PLATE_SLAB)
                .add(ModStoneBlocks.CRACKED_STONE_PLATE_SLAB)
                .add(ModStoneBlocks.STONE_TILE_SLAB)
                .add(ModStoneBlocks.MOSSY_STONE_TILE_SLAB)
                .add(ModStoneBlocks.CRACKED_STONE_TILE_SLAB)

                // ============== GRANITE ==============
                .add(ModGraniteBlocks.COBBLED_GRANITE_SLAB)
                .add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_SLAB)
                .add(ModGraniteBlocks.SMOOTH_GRANITE_SLAB)
                .add(ModGraniteBlocks.GRANITE_BRICK_SLAB)
                .add(ModGraniteBlocks.MOSSY_GRANITE_BRICK_SLAB)
                .add(ModGraniteBlocks.CRACKED_GRANITE_BRICK_SLAB)
                .add(ModGraniteBlocks.GRANITE_PLATE_SLAB)
                .add(ModGraniteBlocks.MOSSY_GRANITE_PLATE_SLAB)
                .add(ModGraniteBlocks.CRACKED_GRANITE_PLATE_SLAB)
                .add(ModGraniteBlocks.GRANITE_TILE_SLAB)
                .add(ModGraniteBlocks.MOSSY_GRANITE_TILE_SLAB)
                .add(ModGraniteBlocks.CRACKED_GRANITE_TILE_SLAB)

                // ============== DIORITE ==============
                .add(ModDioriteBlocks.COBBLED_DIORITE_SLAB)
                .add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_SLAB)
                .add(ModDioriteBlocks.SMOOTH_DIORITE_SLAB)
                .add(ModDioriteBlocks.DIORITE_BRICK_SLAB)
                .add(ModDioriteBlocks.MOSSY_DIORITE_BRICK_SLAB)
                .add(ModDioriteBlocks.CRACKED_DIORITE_BRICK_SLAB)
                .add(ModDioriteBlocks.DIORITE_PLATE_SLAB)
                .add(ModDioriteBlocks.MOSSY_DIORITE_PLATE_SLAB)
                .add(ModDioriteBlocks.CRACKED_DIORITE_PLATE_SLAB)
                .add(ModDioriteBlocks.DIORITE_TILE_SLAB)
                .add(ModDioriteBlocks.MOSSY_DIORITE_TILE_SLAB)
                .add(ModDioriteBlocks.CRACKED_DIORITE_TILE_SLAB)

                // ============== ANDESITE ==============
                .add(ModAndesiteBlocks.COBBLED_ANDESITE_SLAB)
                .add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_SLAB)
                .add(ModAndesiteBlocks.SMOOTH_ANDESITE_SLAB)
                .add(ModAndesiteBlocks.ANDESITE_BRICK_SLAB)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_SLAB)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_SLAB)
                .add(ModAndesiteBlocks.ANDESITE_PLATE_SLAB)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_SLAB)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_SLAB)
                .add(ModAndesiteBlocks.ANDESITE_TILE_SLAB)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_SLAB)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_SLAB)

                // ============== DEEPSLATE ==============
                .add(ModDeepslateBlocks.DEEPSLATE_SLAB)
                .add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB)
                .add(ModDeepslateBlocks.SMOOTH_DEEPSLATE_SLAB)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_SLAB)
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_SLAB)
                .add(ModDeepslateBlocks.DEEPSLATE_PLATE_SLAB)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_SLAB)
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_SLAB)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_SLAB)
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_SLAB);

        valueLookupBuilder(BlockTags.WALLS)
                // ============== STONE ==============
                .add(ModStoneBlocks.STONE_WALL)
                .add(ModStoneBlocks.SMOOTH_STONE_WALL)
                .add(ModStoneBlocks.POLISHED_STONE_WALL)
                .add(ModStoneBlocks.CRACKED_STONE_BRICK_WALL)
                .add(ModStoneBlocks.STONE_PLATE_WALL)
                .add(ModStoneBlocks.MOSSY_STONE_PLATE_WALL)
                .add(ModStoneBlocks.CRACKED_STONE_PLATE_WALL)
                .add(ModStoneBlocks.STONE_TILE_WALL)
                .add(ModStoneBlocks.MOSSY_STONE_TILE_WALL)
                .add(ModStoneBlocks.CRACKED_STONE_TILE_WALL)

                // ============== GRANITE ==============
                .add(ModGraniteBlocks.COBBLED_GRANITE_WALL)
                .add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_WALL)
                .add(ModGraniteBlocks.SMOOTH_GRANITE_WALL)
                .add(ModGraniteBlocks.POLISHED_GRANITE_WALL)
                .add(ModGraniteBlocks.GRANITE_BRICK_WALL)
                .add(ModGraniteBlocks.MOSSY_GRANITE_BRICK_WALL)
                .add(ModGraniteBlocks.CRACKED_GRANITE_BRICK_WALL)
                .add(ModGraniteBlocks.GRANITE_PLATE_WALL)
                .add(ModGraniteBlocks.MOSSY_GRANITE_PLATE_WALL)
                .add(ModGraniteBlocks.CRACKED_GRANITE_PLATE_WALL)
                .add(ModGraniteBlocks.GRANITE_TILE_WALL)
                .add(ModGraniteBlocks.MOSSY_GRANITE_TILE_WALL)
                .add(ModGraniteBlocks.CRACKED_GRANITE_TILE_WALL)

                // ============== DIORITE ==============
                .add(ModDioriteBlocks.COBBLED_DIORITE_WALL)
                .add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_WALL)
                .add(ModDioriteBlocks.SMOOTH_DIORITE_WALL)
                .add(ModDioriteBlocks.POLISHED_DIORITE_WALL)
                .add(ModDioriteBlocks.DIORITE_BRICK_WALL)
                .add(ModDioriteBlocks.MOSSY_DIORITE_BRICK_WALL)
                .add(ModDioriteBlocks.CRACKED_DIORITE_BRICK_WALL)
                .add(ModDioriteBlocks.DIORITE_PLATE_WALL)
                .add(ModDioriteBlocks.MOSSY_DIORITE_PLATE_WALL)
                .add(ModDioriteBlocks.CRACKED_DIORITE_PLATE_WALL)
                .add(ModDioriteBlocks.DIORITE_TILE_WALL)
                .add(ModDioriteBlocks.MOSSY_DIORITE_TILE_WALL)
                .add(ModDioriteBlocks.CRACKED_DIORITE_TILE_WALL)

                // ============== ANDESITE ==============
                .add(ModAndesiteBlocks.COBBLED_ANDESITE_WALL)
                .add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_WALL)
                .add(ModAndesiteBlocks.SMOOTH_ANDESITE_WALL)
                .add(ModAndesiteBlocks.POLISHED_ANDESITE_WALL)
                .add(ModAndesiteBlocks.ANDESITE_BRICK_WALL)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_WALL)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_WALL)
                .add(ModAndesiteBlocks.ANDESITE_PLATE_WALL)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_WALL)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_WALL)
                .add(ModAndesiteBlocks.ANDESITE_TILE_WALL)
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_WALL)
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_WALL)

                // ============== DEEPSLATE ==============
                .add(ModDeepslateBlocks.DEEPSLATE_WALL)
                .add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_WALL)
                .add(ModDeepslateBlocks.SMOOTH_DEEPSLATE_WALL)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_WALL)
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_WALL)
                .add(ModDeepslateBlocks.DEEPSLATE_PLATE_WALL)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_WALL)
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_WALL)
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_WALL)
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_WALL);

        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES)
                .add(ModGraniteBlocks.POLISHED_GRANITE_PRESSURE_PLATE)
                .add(ModDioriteBlocks.POLISHED_DIORITE_PRESSURE_PLATE)
                .add(ModAndesiteBlocks.POLISHED_ANDESITE_PRESSURE_PLATE)
                .add(ModDeepslateBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);

        valueLookupBuilder(BlockTags.STONE_BUTTONS)
                .add(ModGraniteBlocks.POLISHED_GRANITE_BUTTON)
                .add(ModDioriteBlocks.POLISHED_DIORITE_BUTTON)
                .add(ModAndesiteBlocks.POLISHED_ANDESITE_BUTTON)
                .add(ModDeepslateBlocks.POLISHED_DEEPSLATE_BUTTON);
    }
}
