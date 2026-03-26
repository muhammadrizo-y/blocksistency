package net.muhammadrizo.blocksistency.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.advancement.AdvancementTabGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.muhammadrizo.blocksistency.Blocksistency;
import net.muhammadrizo.blocksistency.block.*;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateAdvancement(RegistryWrapper.WrapperLookup wrapperLookup, Consumer<AdvancementEntry> consumer) {
        AdvancementEntry stoneAgeAdvancement = AdvancementTabGenerator.reference("minecraft:story/mine_stone");

        AdvancementEntry STONE = addAdvancement(
                consumer,
                stoneAgeAdvancement,
                ModStoneBlocks.STONE_TILES,
                "stone",

                Blocks.STONE,
                Blocks.STONE_STAIRS,
                Blocks.STONE_SLAB,
                ModStoneBlocks.STONE_WALL,
                Blocks.STONE_PRESSURE_PLATE,
                Blocks.STONE_BUTTON,

                ModStoneBlocks.CHISELED_STONE,
                ModStoneBlocks.MOSSY_CHISELED_STONE,
                ModStoneBlocks.CRACKED_CHISELED_STONE,

                Blocks.COBBLESTONE,
                Blocks.COBBLESTONE_STAIRS,
                Blocks.COBBLESTONE_SLAB,
                Blocks.COBBLESTONE_WALL,

                Blocks.MOSSY_COBBLESTONE,
                Blocks.MOSSY_COBBLESTONE_STAIRS,
                Blocks.MOSSY_COBBLESTONE_SLAB,
                Blocks.MOSSY_COBBLESTONE_WALL,

                Blocks.SMOOTH_STONE,
                ModStoneBlocks.SMOOTH_STONE_STAIRS,
                Blocks.SMOOTH_STONE_SLAB,
                ModStoneBlocks.SMOOTH_STONE_WALL,

                ModStoneBlocks.POLISHED_STONE,
                ModStoneBlocks.POLISHED_STONE_STAIRS,
                ModStoneBlocks.POLISHED_STONE_SLAB,
                ModStoneBlocks.POLISHED_STONE_WALL,

                Blocks.STONE_BRICKS,
                Blocks.STONE_BRICK_STAIRS,
                Blocks.STONE_BRICK_SLAB,
                Blocks.STONE_BRICK_WALL,
                Blocks.CHISELED_STONE_BRICKS,

                Blocks.MOSSY_STONE_BRICKS,
                Blocks.MOSSY_STONE_BRICK_STAIRS,
                Blocks.MOSSY_STONE_BRICK_SLAB,
                Blocks.MOSSY_STONE_BRICK_WALL,
                ModStoneBlocks.MOSSY_CHISELED_STONE_BRICKS,

                Blocks.CRACKED_STONE_BRICKS,
                ModStoneBlocks.CRACKED_STONE_BRICK_STAIRS,
                ModStoneBlocks.CRACKED_STONE_BRICK_SLAB,
                ModStoneBlocks.CRACKED_STONE_BRICK_WALL,
                ModStoneBlocks.CRACKED_CHISELED_STONE_BRICKS,

                ModStoneBlocks.STONE_PLATES,
                ModStoneBlocks.STONE_PLATE_STAIRS,
                ModStoneBlocks.STONE_PLATE_SLAB,
                ModStoneBlocks.STONE_PLATE_WALL,

                ModStoneBlocks.MOSSY_STONE_PLATES,
                ModStoneBlocks.MOSSY_STONE_PLATE_STAIRS,
                ModStoneBlocks.MOSSY_STONE_PLATE_SLAB,
                ModStoneBlocks.MOSSY_STONE_PLATE_WALL,

                ModStoneBlocks.CRACKED_STONE_PLATES,
                ModStoneBlocks.CRACKED_STONE_PLATE_STAIRS,
                ModStoneBlocks.CRACKED_STONE_PLATE_SLAB,
                ModStoneBlocks.CRACKED_STONE_PLATE_WALL,

                ModStoneBlocks.STONE_TILES,
                ModStoneBlocks.STONE_TILE_STAIRS,
                ModStoneBlocks.STONE_TILE_SLAB,
                ModStoneBlocks.STONE_TILE_WALL,

                ModStoneBlocks.MOSSY_STONE_TILES,
                ModStoneBlocks.MOSSY_STONE_TILE_STAIRS,
                ModStoneBlocks.MOSSY_STONE_TILE_SLAB,
                ModStoneBlocks.MOSSY_STONE_TILE_WALL,

                ModStoneBlocks.CRACKED_STONE_TILES,
                ModStoneBlocks.CRACKED_STONE_TILE_STAIRS,
                ModStoneBlocks.CRACKED_STONE_TILE_SLAB,
                ModStoneBlocks.CRACKED_STONE_TILE_WALL,

                ModStoneBlocks.STONE_PILLAR,
                ModStoneBlocks.MOSSY_STONE_PILLAR,
                ModStoneBlocks.CRACKED_STONE_PILLAR
        );

        AdvancementEntry GRANITE = addAdvancement(
                consumer,
                STONE,
                ModGraniteBlocks.GRANITE_PLATES,
                "granite",

                Blocks.GRANITE,
                Blocks.GRANITE_STAIRS,
                Blocks.GRANITE_SLAB,
                Blocks.GRANITE_WALL,

                ModGraniteBlocks.CHISELED_GRANITE,
                ModGraniteBlocks.MOSSY_CHISELED_GRANITE,
                ModGraniteBlocks.CRACKED_CHISELED_GRANITE,

                ModGraniteBlocks.COBBLED_GRANITE,
                ModGraniteBlocks.COBBLED_GRANITE_STAIRS,
                ModGraniteBlocks.COBBLED_GRANITE_SLAB,
                ModGraniteBlocks.COBBLED_GRANITE_WALL,

                ModGraniteBlocks.MOSSY_COBBLED_GRANITE,
                ModGraniteBlocks.MOSSY_COBBLED_GRANITE_STAIRS,
                ModGraniteBlocks.MOSSY_COBBLED_GRANITE_SLAB,
                ModGraniteBlocks.MOSSY_COBBLED_GRANITE_WALL,

                ModGraniteBlocks.SMOOTH_GRANITE,
                ModGraniteBlocks.SMOOTH_GRANITE_STAIRS,
                ModGraniteBlocks.SMOOTH_GRANITE_SLAB,
                ModGraniteBlocks.SMOOTH_GRANITE_WALL,

                Blocks.POLISHED_GRANITE,
                Blocks.POLISHED_GRANITE_STAIRS,
                Blocks.POLISHED_GRANITE_SLAB,
                ModGraniteBlocks.POLISHED_GRANITE_WALL,
                ModGraniteBlocks.POLISHED_GRANITE_PRESSURE_PLATE,
                ModGraniteBlocks.POLISHED_GRANITE_BUTTON,

                ModGraniteBlocks.GRANITE_BRICKS,
                ModGraniteBlocks.GRANITE_BRICK_STAIRS,
                ModGraniteBlocks.GRANITE_BRICK_SLAB,
                ModGraniteBlocks.GRANITE_BRICK_WALL,
                ModGraniteBlocks.CHISELED_GRANITE_BRICKS,

                ModGraniteBlocks.MOSSY_GRANITE_BRICKS,
                ModGraniteBlocks.MOSSY_GRANITE_BRICK_STAIRS,
                ModGraniteBlocks.MOSSY_GRANITE_BRICK_SLAB,
                ModGraniteBlocks.MOSSY_GRANITE_BRICK_WALL,
                ModGraniteBlocks.MOSSY_CHISELED_GRANITE_BRICKS,

                ModGraniteBlocks.CRACKED_GRANITE_BRICKS,
                ModGraniteBlocks.CRACKED_GRANITE_BRICK_STAIRS,
                ModGraniteBlocks.CRACKED_GRANITE_BRICK_SLAB,
                ModGraniteBlocks.CRACKED_GRANITE_BRICK_WALL,
                ModGraniteBlocks.CRACKED_CHISELED_GRANITE_BRICKS,

                ModGraniteBlocks.GRANITE_PLATES,
                ModGraniteBlocks.GRANITE_PLATE_STAIRS,
                ModGraniteBlocks.GRANITE_PLATE_SLAB,
                ModGraniteBlocks.GRANITE_PLATE_WALL,

                ModGraniteBlocks.MOSSY_GRANITE_PLATES,
                ModGraniteBlocks.MOSSY_GRANITE_PLATE_STAIRS,
                ModGraniteBlocks.MOSSY_GRANITE_PLATE_SLAB,
                ModGraniteBlocks.MOSSY_GRANITE_PLATE_WALL,

                ModGraniteBlocks.CRACKED_GRANITE_PLATES,
                ModGraniteBlocks.CRACKED_GRANITE_PLATE_STAIRS,
                ModGraniteBlocks.CRACKED_GRANITE_PLATE_SLAB,
                ModGraniteBlocks.CRACKED_GRANITE_PLATE_WALL,

                ModGraniteBlocks.GRANITE_TILES,
                ModGraniteBlocks.GRANITE_TILE_STAIRS,
                ModGraniteBlocks.GRANITE_TILE_SLAB,
                ModGraniteBlocks.GRANITE_TILE_WALL,

                ModGraniteBlocks.MOSSY_GRANITE_TILES,
                ModGraniteBlocks.MOSSY_GRANITE_TILE_STAIRS,
                ModGraniteBlocks.MOSSY_GRANITE_TILE_SLAB,
                ModGraniteBlocks.MOSSY_GRANITE_TILE_WALL,

                ModGraniteBlocks.CRACKED_GRANITE_TILES,
                ModGraniteBlocks.CRACKED_GRANITE_TILE_STAIRS,
                ModGraniteBlocks.CRACKED_GRANITE_TILE_SLAB,
                ModGraniteBlocks.CRACKED_GRANITE_TILE_WALL,

                ModGraniteBlocks.GRANITE_PILLAR,
                ModGraniteBlocks.MOSSY_GRANITE_PILLAR,
                ModGraniteBlocks.CRACKED_GRANITE_PILLAR
        );

        AdvancementEntry DIORITE = addAdvancement(
                consumer,
                STONE,
                ModDioriteBlocks.CHISELED_DIORITE,
                "diorite",

                Blocks.DIORITE,
                Blocks.DIORITE_STAIRS,
                Blocks.DIORITE_SLAB,
                Blocks.DIORITE_WALL,

                ModDioriteBlocks.CHISELED_DIORITE,
                ModDioriteBlocks.MOSSY_CHISELED_DIORITE,
                ModDioriteBlocks.CRACKED_CHISELED_DIORITE,

                ModDioriteBlocks.COBBLED_DIORITE,
                ModDioriteBlocks.COBBLED_DIORITE_STAIRS,
                ModDioriteBlocks.COBBLED_DIORITE_SLAB,
                ModDioriteBlocks.COBBLED_DIORITE_WALL,

                ModDioriteBlocks.MOSSY_COBBLED_DIORITE,
                ModDioriteBlocks.MOSSY_COBBLED_DIORITE_STAIRS,
                ModDioriteBlocks.MOSSY_COBBLED_DIORITE_SLAB,
                ModDioriteBlocks.MOSSY_COBBLED_DIORITE_WALL,

                ModDioriteBlocks.SMOOTH_DIORITE,
                ModDioriteBlocks.SMOOTH_DIORITE_STAIRS,
                ModDioriteBlocks.SMOOTH_DIORITE_SLAB,
                ModDioriteBlocks.SMOOTH_DIORITE_WALL,

                Blocks.POLISHED_DIORITE,
                Blocks.POLISHED_DIORITE_STAIRS,
                Blocks.POLISHED_DIORITE_SLAB,
                ModDioriteBlocks.POLISHED_DIORITE_WALL,
                ModDioriteBlocks.POLISHED_DIORITE_PRESSURE_PLATE,
                ModDioriteBlocks.POLISHED_DIORITE_BUTTON,

                ModDioriteBlocks.DIORITE_BRICKS,
                ModDioriteBlocks.DIORITE_BRICK_STAIRS,
                ModDioriteBlocks.DIORITE_BRICK_SLAB,
                ModDioriteBlocks.DIORITE_BRICK_WALL,
                ModDioriteBlocks.CHISELED_DIORITE_BRICKS,

                ModDioriteBlocks.MOSSY_DIORITE_BRICKS,
                ModDioriteBlocks.MOSSY_DIORITE_BRICK_STAIRS,
                ModDioriteBlocks.MOSSY_DIORITE_BRICK_SLAB,
                ModDioriteBlocks.MOSSY_DIORITE_BRICK_WALL,
                ModDioriteBlocks.MOSSY_CHISELED_DIORITE_BRICKS,

                ModDioriteBlocks.CRACKED_DIORITE_BRICKS,
                ModDioriteBlocks.CRACKED_DIORITE_BRICK_STAIRS,
                ModDioriteBlocks.CRACKED_DIORITE_BRICK_SLAB,
                ModDioriteBlocks.CRACKED_DIORITE_BRICK_WALL,
                ModDioriteBlocks.CRACKED_CHISELED_DIORITE_BRICKS,

                ModDioriteBlocks.DIORITE_PLATES,
                ModDioriteBlocks.DIORITE_PLATE_STAIRS,
                ModDioriteBlocks.DIORITE_PLATE_SLAB,
                ModDioriteBlocks.DIORITE_PLATE_WALL,

                ModDioriteBlocks.MOSSY_DIORITE_PLATES,
                ModDioriteBlocks.MOSSY_DIORITE_PLATE_STAIRS,
                ModDioriteBlocks.MOSSY_DIORITE_PLATE_SLAB,
                ModDioriteBlocks.MOSSY_DIORITE_PLATE_WALL,

                ModDioriteBlocks.CRACKED_DIORITE_PLATES,
                ModDioriteBlocks.CRACKED_DIORITE_PLATE_STAIRS,
                ModDioriteBlocks.CRACKED_DIORITE_PLATE_SLAB,
                ModDioriteBlocks.CRACKED_DIORITE_PLATE_WALL,

                ModDioriteBlocks.DIORITE_TILES,
                ModDioriteBlocks.DIORITE_TILE_STAIRS,
                ModDioriteBlocks.DIORITE_TILE_SLAB,
                ModDioriteBlocks.DIORITE_TILE_WALL,

                ModDioriteBlocks.MOSSY_DIORITE_TILES,
                ModDioriteBlocks.MOSSY_DIORITE_TILE_STAIRS,
                ModDioriteBlocks.MOSSY_DIORITE_TILE_SLAB,
                ModDioriteBlocks.MOSSY_DIORITE_TILE_WALL,

                ModDioriteBlocks.CRACKED_DIORITE_TILES,
                ModDioriteBlocks.CRACKED_DIORITE_TILE_STAIRS,
                ModDioriteBlocks.CRACKED_DIORITE_TILE_SLAB,
                ModDioriteBlocks.CRACKED_DIORITE_TILE_WALL,

                ModDioriteBlocks.DIORITE_PILLAR,
                ModDioriteBlocks.MOSSY_DIORITE_PILLAR,
                ModDioriteBlocks.CRACKED_DIORITE_PILLAR
        );

        AdvancementEntry ANDESITE = addAdvancement(
                consumer,
                STONE,
                ModAndesiteBlocks.MOSSY_ANDESITE_BRICKS,
                "andesite",

                Blocks.ANDESITE,
                Blocks.ANDESITE_STAIRS,
                Blocks.ANDESITE_SLAB,
                Blocks.ANDESITE_WALL,

                ModAndesiteBlocks.CHISELED_ANDESITE,
                ModAndesiteBlocks.MOSSY_CHISELED_ANDESITE,
                ModAndesiteBlocks.CRACKED_CHISELED_ANDESITE,

                ModAndesiteBlocks.COBBLED_ANDESITE,
                ModAndesiteBlocks.COBBLED_ANDESITE_STAIRS,
                ModAndesiteBlocks.COBBLED_ANDESITE_SLAB,
                ModAndesiteBlocks.COBBLED_ANDESITE_WALL,

                ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE,
                ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_STAIRS,
                ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_SLAB,
                ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_WALL,

                ModAndesiteBlocks.SMOOTH_ANDESITE,
                ModAndesiteBlocks.SMOOTH_ANDESITE_STAIRS,
                ModAndesiteBlocks.SMOOTH_ANDESITE_SLAB,
                ModAndesiteBlocks.SMOOTH_ANDESITE_WALL,

                Blocks.POLISHED_ANDESITE,
                Blocks.POLISHED_ANDESITE_STAIRS,
                Blocks.POLISHED_ANDESITE_SLAB,
                ModAndesiteBlocks.POLISHED_ANDESITE_WALL,
                ModAndesiteBlocks.POLISHED_ANDESITE_PRESSURE_PLATE,
                ModAndesiteBlocks.POLISHED_ANDESITE_BUTTON,

                ModAndesiteBlocks.ANDESITE_BRICKS,
                ModAndesiteBlocks.ANDESITE_BRICK_STAIRS,
                ModAndesiteBlocks.ANDESITE_BRICK_SLAB,
                ModAndesiteBlocks.ANDESITE_BRICK_WALL,
                ModAndesiteBlocks.CHISELED_ANDESITE_BRICKS,

                ModAndesiteBlocks.MOSSY_ANDESITE_BRICKS,
                ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_STAIRS,
                ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_SLAB,
                ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_WALL,
                ModAndesiteBlocks.MOSSY_CHISELED_ANDESITE_BRICKS,

                ModAndesiteBlocks.CRACKED_ANDESITE_BRICKS,
                ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_STAIRS,
                ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_SLAB,
                ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_WALL,
                ModAndesiteBlocks.CRACKED_CHISELED_ANDESITE_BRICKS,

                ModAndesiteBlocks.ANDESITE_PLATES,
                ModAndesiteBlocks.ANDESITE_PLATE_STAIRS,
                ModAndesiteBlocks.ANDESITE_PLATE_SLAB,
                ModAndesiteBlocks.ANDESITE_PLATE_WALL,

                ModAndesiteBlocks.MOSSY_ANDESITE_PLATES,
                ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_STAIRS,
                ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_SLAB,
                ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_WALL,

                ModAndesiteBlocks.CRACKED_ANDESITE_PLATES,
                ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_STAIRS,
                ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_SLAB,
                ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_WALL,

                ModAndesiteBlocks.ANDESITE_TILES,
                ModAndesiteBlocks.ANDESITE_TILE_STAIRS,
                ModAndesiteBlocks.ANDESITE_TILE_SLAB,
                ModAndesiteBlocks.ANDESITE_TILE_WALL,

                ModAndesiteBlocks.MOSSY_ANDESITE_TILES,
                ModAndesiteBlocks.MOSSY_ANDESITE_TILE_STAIRS,
                ModAndesiteBlocks.MOSSY_ANDESITE_TILE_SLAB,
                ModAndesiteBlocks.MOSSY_ANDESITE_TILE_WALL,

                ModAndesiteBlocks.CRACKED_ANDESITE_TILES,
                ModAndesiteBlocks.CRACKED_ANDESITE_TILE_STAIRS,
                ModAndesiteBlocks.CRACKED_ANDESITE_TILE_SLAB,
                ModAndesiteBlocks.CRACKED_ANDESITE_TILE_WALL,

                ModAndesiteBlocks.ANDESITE_PILLAR,
                ModAndesiteBlocks.MOSSY_ANDESITE_PILLAR,
                ModAndesiteBlocks.CRACKED_ANDESITE_PILLAR
        );

        AdvancementEntry DEEPSLATE = addAdvancement(
                consumer,
                STONE,
                ModDeepslateBlocks.CHISELED_DEEPSLATE_BRICKS,
                "deepslate",

                Blocks.DEEPSLATE,
                ModDeepslateBlocks.DEEPSLATE_STAIRS,
                ModDeepslateBlocks.DEEPSLATE_SLAB,
                ModDeepslateBlocks.DEEPSLATE_WALL,

                Blocks.COBBLED_DEEPSLATE,
                Blocks.COBBLED_DEEPSLATE_STAIRS,
                Blocks.COBBLED_DEEPSLATE_SLAB,
                Blocks.COBBLED_DEEPSLATE_WALL,

                ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE,
                ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS,
                ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB,
                ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_WALL,

                Blocks.CHISELED_DEEPSLATE,
                ModDeepslateBlocks.MOSSY_CHISELED_DEEPSLATE,
                ModDeepslateBlocks.CRACKED_CHISELED_DEEPSLATE,

                ModDeepslateBlocks.SMOOTH_DEEPSLATE,
                ModDeepslateBlocks.SMOOTH_DEEPSLATE_STAIRS,
                ModDeepslateBlocks.SMOOTH_DEEPSLATE_SLAB,
                ModDeepslateBlocks.SMOOTH_DEEPSLATE_WALL,

                Blocks.POLISHED_DEEPSLATE,
                Blocks.POLISHED_DEEPSLATE_STAIRS,
                Blocks.POLISHED_DEEPSLATE_SLAB,
                Blocks.POLISHED_DEEPSLATE_WALL,
                ModDeepslateBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE,
                ModDeepslateBlocks.POLISHED_DEEPSLATE_BUTTON,

                Blocks.DEEPSLATE_BRICKS,
                Blocks.DEEPSLATE_BRICK_STAIRS,
                Blocks.DEEPSLATE_BRICK_SLAB,
                Blocks.DEEPSLATE_BRICK_WALL,
                ModDeepslateBlocks.CHISELED_DEEPSLATE_BRICKS,

                ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICKS,
                ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS,
                ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_SLAB,
                ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_WALL,
                ModDeepslateBlocks.MOSSY_CHISELED_DEEPSLATE_BRICKS,

                Blocks.CRACKED_DEEPSLATE_BRICKS,
                ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS,
                ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_SLAB,
                ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_WALL,
                ModDeepslateBlocks.CRACKED_CHISELED_DEEPSLATE_BRICKS,

                ModDeepslateBlocks.DEEPSLATE_PLATES,
                ModDeepslateBlocks.DEEPSLATE_PLATE_STAIRS,
                ModDeepslateBlocks.DEEPSLATE_PLATE_SLAB,
                ModDeepslateBlocks.DEEPSLATE_PLATE_WALL,

                ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATES,
                ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_STAIRS,
                ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_SLAB,
                ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_WALL,

                ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATES,
                ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_STAIRS,
                ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_SLAB,
                ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_WALL,

                Blocks.DEEPSLATE_TILES,
                Blocks.DEEPSLATE_TILE_STAIRS,
                Blocks.DEEPSLATE_TILE_SLAB,
                Blocks.DEEPSLATE_TILE_WALL,

                ModDeepslateBlocks.MOSSY_DEEPSLATE_TILES,
                ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_STAIRS,
                ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_SLAB,
                ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_WALL,

                Blocks.CRACKED_DEEPSLATE_TILES,
                ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_STAIRS,
                ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_SLAB,
                ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_WALL,

                ModDeepslateBlocks.DEEPSLATE_PILLAR,
                ModDeepslateBlocks.MOSSY_DEEPSLATE_PILLAR,
                ModDeepslateBlocks.CRACKED_DEEPSLATE_PILLAR
        );

        AdvancementEntry BRICKS = addAdvancement(
                consumer,
                STONE,
                ModBricksBlocks.MOSSY_BRICKS,
                "bricks",

                Blocks.BRICKS,
                Blocks.BRICK_STAIRS,
                Blocks.BRICK_SLAB,
                Blocks.BRICK_WALL,
                ModBricksBlocks.CHISELED_BRICKS,

                ModBricksBlocks.MOSSY_BRICKS,
                ModBricksBlocks.MOSSY_BRICK_STAIRS,
                ModBricksBlocks.MOSSY_BRICK_SLAB,
                ModBricksBlocks.MOSSY_BRICK_WALL,
                ModBricksBlocks.MOSSY_CHISELED_BRICKS,

                ModBricksBlocks.CRACKED_BRICKS,
                ModBricksBlocks.CRACKED_BRICK_STAIRS,
                ModBricksBlocks.CRACKED_BRICK_SLAB,
                ModBricksBlocks.CRACKED_BRICK_WALL,
                ModBricksBlocks.CRACKED_CHISELED_BRICKS
        );

        AdvancementEntry SANDSTONE = addAdvancement(
                consumer,
                STONE,
                Blocks.CHISELED_SANDSTONE,
                "sandstone",

                Blocks.SANDSTONE,
                Blocks.SANDSTONE_STAIRS,
                Blocks.SANDSTONE_SLAB,
                Blocks.SANDSTONE_WALL,

                Blocks.CHISELED_SANDSTONE,
                ModSandstoneBlocks.CRACKED_CHISELED_SANDSTONE,

                ModSandstoneBlocks.COBBLED_SANDSTONE,
                ModSandstoneBlocks.COBBLED_SANDSTONE_STAIRS,
                ModSandstoneBlocks.COBBLED_SANDSTONE_SLAB,
                ModSandstoneBlocks.COBBLED_SANDSTONE_WALL,

                Blocks.SMOOTH_SANDSTONE,
                Blocks.SMOOTH_SANDSTONE_STAIRS,
                Blocks.SMOOTH_SANDSTONE_SLAB,
                ModSandstoneBlocks.SMOOTH_SANDSTONE_WALL,

                Blocks.CUT_SANDSTONE,
                ModSandstoneBlocks.CUT_SANDSTONE_STAIRS,
                Blocks.CUT_SANDSTONE_SLAB,
                ModSandstoneBlocks.CUT_SANDSTONE_WALL,

                ModSandstoneBlocks.POLISHED_SANDSTONE,
                ModSandstoneBlocks.POLISHED_SANDSTONE_STAIRS,
                ModSandstoneBlocks.POLISHED_SANDSTONE_SLAB,
                ModSandstoneBlocks.POLISHED_SANDSTONE_WALL,
                ModSandstoneBlocks.POLISHED_SANDSTONE_PRESSURE_PLATE,
                ModSandstoneBlocks.POLISHED_SANDSTONE_BUTTON,

                ModSandstoneBlocks.SANDSTONE_BRICKS,
                ModSandstoneBlocks.SANDSTONE_BRICK_STAIRS,
                ModSandstoneBlocks.SANDSTONE_BRICK_SLAB,
                ModSandstoneBlocks.SANDSTONE_BRICK_WALL,
                ModSandstoneBlocks.CHISELED_SANDSTONE_BRICKS,

                ModSandstoneBlocks.CRACKED_SANDSTONE_BRICKS,
                ModSandstoneBlocks.CRACKED_SANDSTONE_BRICK_STAIRS,
                ModSandstoneBlocks.CRACKED_SANDSTONE_BRICK_SLAB,
                ModSandstoneBlocks.CRACKED_SANDSTONE_BRICK_WALL,
                ModSandstoneBlocks.CRACKED_CHISELED_SANDSTONE_BRICKS,

                ModSandstoneBlocks.SANDSTONE_PLATES,
                ModSandstoneBlocks.SANDSTONE_PLATE_STAIRS,
                ModSandstoneBlocks.SANDSTONE_PLATE_SLAB,
                ModSandstoneBlocks.SANDSTONE_PLATE_WALL,

                ModSandstoneBlocks.CRACKED_SANDSTONE_PLATES,
                ModSandstoneBlocks.CRACKED_SANDSTONE_PLATE_STAIRS,
                ModSandstoneBlocks.CRACKED_SANDSTONE_PLATE_SLAB,
                ModSandstoneBlocks.CRACKED_SANDSTONE_PLATE_WALL,

                ModSandstoneBlocks.SANDSTONE_TILES,
                ModSandstoneBlocks.SANDSTONE_TILE_STAIRS,
                ModSandstoneBlocks.SANDSTONE_TILE_SLAB,
                ModSandstoneBlocks.SANDSTONE_TILE_WALL,

                ModSandstoneBlocks.CRACKED_SANDSTONE_TILES,
                ModSandstoneBlocks.CRACKED_SANDSTONE_TILE_STAIRS,
                ModSandstoneBlocks.CRACKED_SANDSTONE_TILE_SLAB,
                ModSandstoneBlocks.CRACKED_SANDSTONE_TILE_WALL,

                ModSandstoneBlocks.SANDSTONE_PILLAR,
                ModSandstoneBlocks.CRACKED_SANDSTONE_PILLAR
        );

        AdvancementEntry RED_SANDSTONE = addAdvancement(
                consumer,
                STONE,
                Blocks.CHISELED_RED_SANDSTONE,
                "red_sandstone",

                Blocks.RED_SANDSTONE,
                Blocks.RED_SANDSTONE_STAIRS,
                Blocks.RED_SANDSTONE_SLAB,
                Blocks.RED_SANDSTONE_WALL,

                Blocks.CHISELED_RED_SANDSTONE,
                ModRedSandstoneBlocks.CRACKED_CHISELED_RED_SANDSTONE,

                ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE,
                ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE_STAIRS,
                ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE_SLAB,
                ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE_WALL,

                Blocks.SMOOTH_RED_SANDSTONE,
                Blocks.SMOOTH_RED_SANDSTONE_STAIRS,
                Blocks.SMOOTH_RED_SANDSTONE_SLAB,
                ModRedSandstoneBlocks.SMOOTH_RED_SANDSTONE_WALL,

                Blocks.CUT_RED_SANDSTONE,
                ModRedSandstoneBlocks.CUT_RED_SANDSTONE_STAIRS,
                Blocks.CUT_RED_SANDSTONE_SLAB,
                ModRedSandstoneBlocks.CUT_RED_SANDSTONE_WALL,

                ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE,
                ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_STAIRS,
                ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_SLAB,
                ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_WALL,
                ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_PRESSURE_PLATE,
                ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_BUTTON,

                ModRedSandstoneBlocks.RED_SANDSTONE_BRICKS,
                ModRedSandstoneBlocks.RED_SANDSTONE_BRICK_STAIRS,
                ModRedSandstoneBlocks.RED_SANDSTONE_BRICK_SLAB,
                ModRedSandstoneBlocks.RED_SANDSTONE_BRICK_WALL,
                ModRedSandstoneBlocks.CHISELED_RED_SANDSTONE_BRICKS,

                ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_BRICKS,
                ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS,
                ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB,
                ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL,
                ModRedSandstoneBlocks.CRACKED_CHISELED_RED_SANDSTONE_BRICKS,

                ModRedSandstoneBlocks.RED_SANDSTONE_PLATES,
                ModRedSandstoneBlocks.RED_SANDSTONE_PLATE_STAIRS,
                ModRedSandstoneBlocks.RED_SANDSTONE_PLATE_SLAB,
                ModRedSandstoneBlocks.RED_SANDSTONE_PLATE_WALL,

                ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PLATES,
                ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PLATE_STAIRS,
                ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PLATE_SLAB,
                ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PLATE_WALL,

                ModRedSandstoneBlocks.RED_SANDSTONE_TILES,
                ModRedSandstoneBlocks.RED_SANDSTONE_TILE_STAIRS,
                ModRedSandstoneBlocks.RED_SANDSTONE_TILE_SLAB,
                ModRedSandstoneBlocks.RED_SANDSTONE_TILE_WALL,

                ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_TILES,
                ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_TILE_STAIRS,
                ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_TILE_SLAB,
                ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_TILE_WALL,

                ModRedSandstoneBlocks.RED_SANDSTONE_PILLAR,
                ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PILLAR
        );
    }

    public AdvancementEntry addAdvancement(
            Consumer<AdvancementEntry> consumer,
            AdvancementEntry parent,
            ItemConvertible icon,
            String name,
            Block... blocks
    ) {
        String idPath = "get_all_" + name + "_blocks";
        String baseKey = "advancement." + Blocksistency.MOD_ID + "." + idPath;

        Advancement.Builder builder = Advancement.Builder.create()
                .parent(parent)
                .display(
                        icon,
                        Text.translatable(baseKey + ".title"),
                        Text.translatable(baseKey + ".description"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                );

        for (Block block : blocks) {
            Identifier blockId = Registries.BLOCK.getId(block);
            String criterionName = "got_" + blockId.getPath();

            builder.criterion(
                    criterionName,
                    InventoryChangedCriterion.Conditions.items(block.asItem())
            );
        }

        return builder.build(consumer, Blocksistency.MOD_ID + ":" + idPath);
    }
}
