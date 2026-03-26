package net.muhammadrizo.blocksistency.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.muhammadrizo.blocksistency.Blocksistency;
import net.muhammadrizo.blocksistency.block.*;

public class ModItemGroups {
    public static final ItemGroup BLOCKSISTENCY = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Blocksistency.MOD_ID, "blocksistency"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModGraniteBlocks.GRANITE_BRICKS))
                    .displayName(Text.translatable("itemgroup.blocksistency.blocksistency"))
                    .entries((displayContext, entries) -> {
                        // ============== STONE ==============

                        entries.add(Blocks.STONE);
                        entries.add(Blocks.STONE_STAIRS);
                        entries.add(Blocks.STONE_SLAB);
                        entries.add(ModStoneBlocks.STONE_WALL);
                        entries.add(Blocks.STONE_PRESSURE_PLATE);
                        entries.add(Blocks.STONE_BUTTON);

                        entries.add(ModStoneBlocks.CHISELED_STONE);
                        entries.add(ModStoneBlocks.MOSSY_CHISELED_STONE);
                        entries.add(ModStoneBlocks.CRACKED_CHISELED_STONE);

                        entries.add(Blocks.COBBLESTONE);
                        entries.add(Blocks.COBBLESTONE_STAIRS);
                        entries.add(Blocks.COBBLESTONE_SLAB);
                        entries.add(Blocks.COBBLESTONE_WALL);

                        entries.add(Blocks.MOSSY_COBBLESTONE);
                        entries.add(Blocks.MOSSY_COBBLESTONE_STAIRS);
                        entries.add(Blocks.MOSSY_COBBLESTONE_SLAB);
                        entries.add(Blocks.MOSSY_COBBLESTONE_WALL);

                        entries.add(Blocks.SMOOTH_STONE);
                        entries.add(ModStoneBlocks.SMOOTH_STONE_STAIRS);
                        entries.add(Blocks.SMOOTH_STONE_SLAB);
                        entries.add(ModStoneBlocks.SMOOTH_STONE_WALL);

                        entries.add(ModStoneBlocks.POLISHED_STONE);
                        entries.add(ModStoneBlocks.POLISHED_STONE_STAIRS);
                        entries.add(ModStoneBlocks.POLISHED_STONE_SLAB);
                        entries.add(ModStoneBlocks.POLISHED_STONE_WALL);

                        entries.add(Blocks.STONE_BRICKS);
                        entries.add(Blocks.STONE_BRICK_STAIRS);
                        entries.add(Blocks.STONE_BRICK_SLAB);
                        entries.add(Blocks.STONE_BRICK_WALL);
                        entries.add(Blocks.CHISELED_STONE_BRICKS);

                        entries.add(Blocks.MOSSY_STONE_BRICKS);
                        entries.add(Blocks.MOSSY_STONE_BRICK_STAIRS);
                        entries.add(Blocks.MOSSY_STONE_BRICK_SLAB);
                        entries.add(Blocks.MOSSY_STONE_BRICK_WALL);
                        entries.add(ModStoneBlocks.MOSSY_CHISELED_STONE_BRICKS);

                        entries.add(Blocks.CRACKED_STONE_BRICKS);
                        entries.add(ModStoneBlocks.CRACKED_STONE_BRICK_STAIRS);
                        entries.add(ModStoneBlocks.CRACKED_STONE_BRICK_SLAB);
                        entries.add(ModStoneBlocks.CRACKED_STONE_BRICK_WALL);
                        entries.add(ModStoneBlocks.CRACKED_CHISELED_STONE_BRICKS);

                        entries.add(ModStoneBlocks.STONE_PLATES);
                        entries.add(ModStoneBlocks.STONE_PLATE_STAIRS);
                        entries.add(ModStoneBlocks.STONE_PLATE_SLAB);
                        entries.add(ModStoneBlocks.STONE_PLATE_WALL);

                        entries.add(ModStoneBlocks.MOSSY_STONE_PLATES);
                        entries.add(ModStoneBlocks.MOSSY_STONE_PLATE_STAIRS);
                        entries.add(ModStoneBlocks.MOSSY_STONE_PLATE_SLAB);
                        entries.add(ModStoneBlocks.MOSSY_STONE_PLATE_WALL);

                        entries.add(ModStoneBlocks.CRACKED_STONE_PLATES);
                        entries.add(ModStoneBlocks.CRACKED_STONE_PLATE_STAIRS);
                        entries.add(ModStoneBlocks.CRACKED_STONE_PLATE_SLAB);
                        entries.add(ModStoneBlocks.CRACKED_STONE_PLATE_WALL);

                        entries.add(ModStoneBlocks.STONE_TILES);
                        entries.add(ModStoneBlocks.STONE_TILE_STAIRS);
                        entries.add(ModStoneBlocks.STONE_TILE_SLAB);
                        entries.add(ModStoneBlocks.STONE_TILE_WALL);

                        entries.add(ModStoneBlocks.MOSSY_STONE_TILES);
                        entries.add(ModStoneBlocks.MOSSY_STONE_TILE_STAIRS);
                        entries.add(ModStoneBlocks.MOSSY_STONE_TILE_SLAB);
                        entries.add(ModStoneBlocks.MOSSY_STONE_TILE_WALL);

                        entries.add(ModStoneBlocks.CRACKED_STONE_TILES);
                        entries.add(ModStoneBlocks.CRACKED_STONE_TILE_STAIRS);
                        entries.add(ModStoneBlocks.CRACKED_STONE_TILE_SLAB);
                        entries.add(ModStoneBlocks.CRACKED_STONE_TILE_WALL);

                        entries.add(ModStoneBlocks.STONE_PILLAR);
                        entries.add(ModStoneBlocks.MOSSY_STONE_PILLAR);
                        entries.add(ModStoneBlocks.CRACKED_STONE_PILLAR);

                        // ============== GRANITE ==============

                        entries.add(Blocks.GRANITE);
                        entries.add(Blocks.GRANITE_STAIRS);
                        entries.add(Blocks.GRANITE_SLAB);
                        entries.add(Blocks.GRANITE_WALL);

                        entries.add(ModGraniteBlocks.CHISELED_GRANITE);
                        entries.add(ModGraniteBlocks.MOSSY_CHISELED_GRANITE);
                        entries.add(ModGraniteBlocks.CRACKED_CHISELED_GRANITE);

                        entries.add(ModGraniteBlocks.COBBLED_GRANITE);
                        entries.add(ModGraniteBlocks.COBBLED_GRANITE_STAIRS);
                        entries.add(ModGraniteBlocks.COBBLED_GRANITE_SLAB);
                        entries.add(ModGraniteBlocks.COBBLED_GRANITE_WALL);

                        entries.add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE);
                        entries.add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_STAIRS);
                        entries.add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_SLAB);
                        entries.add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_WALL);

                        entries.add(ModGraniteBlocks.SMOOTH_GRANITE);
                        entries.add(ModGraniteBlocks.SMOOTH_GRANITE_STAIRS);
                        entries.add(ModGraniteBlocks.SMOOTH_GRANITE_SLAB);
                        entries.add(ModGraniteBlocks.SMOOTH_GRANITE_WALL);

                        entries.add(Blocks.POLISHED_GRANITE);
                        entries.add(Blocks.POLISHED_GRANITE_STAIRS);
                        entries.add(Blocks.POLISHED_GRANITE_SLAB);
                        entries.add(ModGraniteBlocks.POLISHED_GRANITE_WALL);
                        entries.add(ModGraniteBlocks.POLISHED_GRANITE_PRESSURE_PLATE);
                        entries.add(ModGraniteBlocks.POLISHED_GRANITE_BUTTON);

                        entries.add(ModGraniteBlocks.GRANITE_BRICKS);
                        entries.add(ModGraniteBlocks.GRANITE_BRICK_STAIRS);
                        entries.add(ModGraniteBlocks.GRANITE_BRICK_SLAB);
                        entries.add(ModGraniteBlocks.GRANITE_BRICK_WALL);
                        entries.add(ModGraniteBlocks.CHISELED_GRANITE_BRICKS);

                        entries.add(ModGraniteBlocks.MOSSY_GRANITE_BRICKS);
                        entries.add(ModGraniteBlocks.MOSSY_GRANITE_BRICK_STAIRS);
                        entries.add(ModGraniteBlocks.MOSSY_GRANITE_BRICK_SLAB);
                        entries.add(ModGraniteBlocks.MOSSY_GRANITE_BRICK_WALL);
                        entries.add(ModGraniteBlocks.MOSSY_CHISELED_GRANITE_BRICKS);

                        entries.add(ModGraniteBlocks.CRACKED_GRANITE_BRICKS);
                        entries.add(ModGraniteBlocks.CRACKED_GRANITE_BRICK_STAIRS);
                        entries.add(ModGraniteBlocks.CRACKED_GRANITE_BRICK_SLAB);
                        entries.add(ModGraniteBlocks.CRACKED_GRANITE_BRICK_WALL);
                        entries.add(ModGraniteBlocks.CRACKED_CHISELED_GRANITE_BRICKS);

                        entries.add(ModGraniteBlocks.GRANITE_PLATES);
                        entries.add(ModGraniteBlocks.GRANITE_PLATE_STAIRS);
                        entries.add(ModGraniteBlocks.GRANITE_PLATE_SLAB);
                        entries.add(ModGraniteBlocks.GRANITE_PLATE_WALL);

                        entries.add(ModGraniteBlocks.MOSSY_GRANITE_PLATES);
                        entries.add(ModGraniteBlocks.MOSSY_GRANITE_PLATE_STAIRS);
                        entries.add(ModGraniteBlocks.MOSSY_GRANITE_PLATE_SLAB);
                        entries.add(ModGraniteBlocks.MOSSY_GRANITE_PLATE_WALL);

                        entries.add(ModGraniteBlocks.CRACKED_GRANITE_PLATES);
                        entries.add(ModGraniteBlocks.CRACKED_GRANITE_PLATE_STAIRS);
                        entries.add(ModGraniteBlocks.CRACKED_GRANITE_PLATE_SLAB);
                        entries.add(ModGraniteBlocks.CRACKED_GRANITE_PLATE_WALL);

                        entries.add(ModGraniteBlocks.GRANITE_TILES);
                        entries.add(ModGraniteBlocks.GRANITE_TILE_STAIRS);
                        entries.add(ModGraniteBlocks.GRANITE_TILE_SLAB);
                        entries.add(ModGraniteBlocks.GRANITE_TILE_WALL);

                        entries.add(ModGraniteBlocks.MOSSY_GRANITE_TILES);
                        entries.add(ModGraniteBlocks.MOSSY_GRANITE_TILE_STAIRS);
                        entries.add(ModGraniteBlocks.MOSSY_GRANITE_TILE_SLAB);
                        entries.add(ModGraniteBlocks.MOSSY_GRANITE_TILE_WALL);

                        entries.add(ModGraniteBlocks.CRACKED_GRANITE_TILES);
                        entries.add(ModGraniteBlocks.CRACKED_GRANITE_TILE_STAIRS);
                        entries.add(ModGraniteBlocks.CRACKED_GRANITE_TILE_SLAB);
                        entries.add(ModGraniteBlocks.CRACKED_GRANITE_TILE_WALL);

                        entries.add(ModGraniteBlocks.GRANITE_PILLAR);
                        entries.add(ModGraniteBlocks.MOSSY_GRANITE_PILLAR);
                        entries.add(ModGraniteBlocks.CRACKED_GRANITE_PILLAR);

                        // ============== DIORITE ==============

                        entries.add(Blocks.DIORITE);
                        entries.add(Blocks.DIORITE_STAIRS);
                        entries.add(Blocks.DIORITE_SLAB);
                        entries.add(Blocks.DIORITE_WALL);

                        entries.add(ModDioriteBlocks.CHISELED_DIORITE);
                        entries.add(ModDioriteBlocks.MOSSY_CHISELED_DIORITE);
                        entries.add(ModDioriteBlocks.CRACKED_CHISELED_DIORITE);

                        entries.add(ModDioriteBlocks.COBBLED_DIORITE);
                        entries.add(ModDioriteBlocks.COBBLED_DIORITE_STAIRS);
                        entries.add(ModDioriteBlocks.COBBLED_DIORITE_SLAB);
                        entries.add(ModDioriteBlocks.COBBLED_DIORITE_WALL);

                        entries.add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE);
                        entries.add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_STAIRS);
                        entries.add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_SLAB);
                        entries.add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_WALL);

                        entries.add(ModDioriteBlocks.SMOOTH_DIORITE);
                        entries.add(ModDioriteBlocks.SMOOTH_DIORITE_STAIRS);
                        entries.add(ModDioriteBlocks.SMOOTH_DIORITE_SLAB);
                        entries.add(ModDioriteBlocks.SMOOTH_DIORITE_WALL);

                        entries.add(Blocks.POLISHED_DIORITE);
                        entries.add(Blocks.POLISHED_DIORITE_STAIRS);
                        entries.add(Blocks.POLISHED_DIORITE_SLAB);
                        entries.add(ModDioriteBlocks.POLISHED_DIORITE_WALL);
                        entries.add(ModDioriteBlocks.POLISHED_DIORITE_PRESSURE_PLATE);
                        entries.add(ModDioriteBlocks.POLISHED_DIORITE_BUTTON);

                        entries.add(ModDioriteBlocks.DIORITE_BRICKS);
                        entries.add(ModDioriteBlocks.DIORITE_BRICK_STAIRS);
                        entries.add(ModDioriteBlocks.DIORITE_BRICK_SLAB);
                        entries.add(ModDioriteBlocks.DIORITE_BRICK_WALL);
                        entries.add(ModDioriteBlocks.CHISELED_DIORITE_BRICKS);

                        entries.add(ModDioriteBlocks.MOSSY_DIORITE_BRICKS);
                        entries.add(ModDioriteBlocks.MOSSY_DIORITE_BRICK_STAIRS);
                        entries.add(ModDioriteBlocks.MOSSY_DIORITE_BRICK_SLAB);
                        entries.add(ModDioriteBlocks.MOSSY_DIORITE_BRICK_WALL);
                        entries.add(ModDioriteBlocks.MOSSY_CHISELED_DIORITE_BRICKS);

                        entries.add(ModDioriteBlocks.CRACKED_DIORITE_BRICKS);
                        entries.add(ModDioriteBlocks.CRACKED_DIORITE_BRICK_STAIRS);
                        entries.add(ModDioriteBlocks.CRACKED_DIORITE_BRICK_SLAB);
                        entries.add(ModDioriteBlocks.CRACKED_DIORITE_BRICK_WALL);
                        entries.add(ModDioriteBlocks.CRACKED_CHISELED_DIORITE_BRICKS);

                        entries.add(ModDioriteBlocks.DIORITE_PLATES);
                        entries.add(ModDioriteBlocks.DIORITE_PLATE_STAIRS);
                        entries.add(ModDioriteBlocks.DIORITE_PLATE_SLAB);
                        entries.add(ModDioriteBlocks.DIORITE_PLATE_WALL);

                        entries.add(ModDioriteBlocks.MOSSY_DIORITE_PLATES);
                        entries.add(ModDioriteBlocks.MOSSY_DIORITE_PLATE_STAIRS);
                        entries.add(ModDioriteBlocks.MOSSY_DIORITE_PLATE_SLAB);
                        entries.add(ModDioriteBlocks.MOSSY_DIORITE_PLATE_WALL);

                        entries.add(ModDioriteBlocks.CRACKED_DIORITE_PLATES);
                        entries.add(ModDioriteBlocks.CRACKED_DIORITE_PLATE_STAIRS);
                        entries.add(ModDioriteBlocks.CRACKED_DIORITE_PLATE_SLAB);
                        entries.add(ModDioriteBlocks.CRACKED_DIORITE_PLATE_WALL);

                        entries.add(ModDioriteBlocks.DIORITE_TILES);
                        entries.add(ModDioriteBlocks.DIORITE_TILE_STAIRS);
                        entries.add(ModDioriteBlocks.DIORITE_TILE_SLAB);
                        entries.add(ModDioriteBlocks.DIORITE_TILE_WALL);

                        entries.add(ModDioriteBlocks.MOSSY_DIORITE_TILES);
                        entries.add(ModDioriteBlocks.MOSSY_DIORITE_TILE_STAIRS);
                        entries.add(ModDioriteBlocks.MOSSY_DIORITE_TILE_SLAB);
                        entries.add(ModDioriteBlocks.MOSSY_DIORITE_TILE_WALL);

                        entries.add(ModDioriteBlocks.CRACKED_DIORITE_TILES);
                        entries.add(ModDioriteBlocks.CRACKED_DIORITE_TILE_STAIRS);
                        entries.add(ModDioriteBlocks.CRACKED_DIORITE_TILE_SLAB);
                        entries.add(ModDioriteBlocks.CRACKED_DIORITE_TILE_WALL);

                        entries.add(ModDioriteBlocks.DIORITE_PILLAR);
                        entries.add(ModDioriteBlocks.MOSSY_DIORITE_PILLAR);
                        entries.add(ModDioriteBlocks.CRACKED_DIORITE_PILLAR);

                        // ============== ANDESITE ==============

                        entries.add(Blocks.ANDESITE);
                        entries.add(Blocks.ANDESITE_STAIRS);
                        entries.add(Blocks.ANDESITE_SLAB);
                        entries.add(Blocks.ANDESITE_WALL);

                        entries.add(ModAndesiteBlocks.CHISELED_ANDESITE);
                        entries.add(ModAndesiteBlocks.MOSSY_CHISELED_ANDESITE);
                        entries.add(ModAndesiteBlocks.CRACKED_CHISELED_ANDESITE);

                        entries.add(ModAndesiteBlocks.COBBLED_ANDESITE);
                        entries.add(ModAndesiteBlocks.COBBLED_ANDESITE_STAIRS);
                        entries.add(ModAndesiteBlocks.COBBLED_ANDESITE_SLAB);
                        entries.add(ModAndesiteBlocks.COBBLED_ANDESITE_WALL);

                        entries.add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE);
                        entries.add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_STAIRS);
                        entries.add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_SLAB);
                        entries.add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_WALL);

                        entries.add(ModAndesiteBlocks.SMOOTH_ANDESITE);
                        entries.add(ModAndesiteBlocks.SMOOTH_ANDESITE_STAIRS);
                        entries.add(ModAndesiteBlocks.SMOOTH_ANDESITE_SLAB);
                        entries.add(ModAndesiteBlocks.SMOOTH_ANDESITE_WALL);

                        entries.add(Blocks.POLISHED_ANDESITE);
                        entries.add(Blocks.POLISHED_ANDESITE_STAIRS);
                        entries.add(Blocks.POLISHED_ANDESITE_SLAB);
                        entries.add(ModAndesiteBlocks.POLISHED_ANDESITE_WALL);
                        entries.add(ModAndesiteBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);
                        entries.add(ModAndesiteBlocks.POLISHED_ANDESITE_BUTTON);

                        entries.add(ModAndesiteBlocks.ANDESITE_BRICKS);
                        entries.add(ModAndesiteBlocks.ANDESITE_BRICK_STAIRS);
                        entries.add(ModAndesiteBlocks.ANDESITE_BRICK_SLAB);
                        entries.add(ModAndesiteBlocks.ANDESITE_BRICK_WALL);
                        entries.add(ModAndesiteBlocks.CHISELED_ANDESITE_BRICKS);

                        entries.add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICKS);
                        entries.add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_STAIRS);
                        entries.add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_SLAB);
                        entries.add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_WALL);
                        entries.add(ModAndesiteBlocks.MOSSY_CHISELED_ANDESITE_BRICKS);

                        entries.add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICKS);
                        entries.add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_STAIRS);
                        entries.add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_SLAB);
                        entries.add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_WALL);
                        entries.add(ModAndesiteBlocks.CRACKED_CHISELED_ANDESITE_BRICKS);

                        entries.add(ModAndesiteBlocks.ANDESITE_PLATES);
                        entries.add(ModAndesiteBlocks.ANDESITE_PLATE_STAIRS);
                        entries.add(ModAndesiteBlocks.ANDESITE_PLATE_SLAB);
                        entries.add(ModAndesiteBlocks.ANDESITE_PLATE_WALL);

                        entries.add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATES);
                        entries.add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_STAIRS);
                        entries.add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_SLAB);
                        entries.add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_WALL);

                        entries.add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATES);
                        entries.add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_STAIRS);
                        entries.add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_SLAB);
                        entries.add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_WALL);

                        entries.add(ModAndesiteBlocks.ANDESITE_TILES);
                        entries.add(ModAndesiteBlocks.ANDESITE_TILE_STAIRS);
                        entries.add(ModAndesiteBlocks.ANDESITE_TILE_SLAB);
                        entries.add(ModAndesiteBlocks.ANDESITE_TILE_WALL);

                        entries.add(ModAndesiteBlocks.MOSSY_ANDESITE_TILES);
                        entries.add(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_STAIRS);
                        entries.add(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_SLAB);
                        entries.add(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_WALL);

                        entries.add(ModAndesiteBlocks.CRACKED_ANDESITE_TILES);
                        entries.add(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_STAIRS);
                        entries.add(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_SLAB);
                        entries.add(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_WALL);

                        entries.add(ModAndesiteBlocks.ANDESITE_PILLAR);
                        entries.add(ModAndesiteBlocks.MOSSY_ANDESITE_PILLAR);
                        entries.add(ModAndesiteBlocks.CRACKED_ANDESITE_PILLAR);

                        // ============== DEEPSLATE ==============

                        entries.add(Blocks.DEEPSLATE);
                        entries.add(ModDeepslateBlocks.DEEPSLATE_STAIRS);
                        entries.add(ModDeepslateBlocks.DEEPSLATE_SLAB);
                        entries.add(ModDeepslateBlocks.DEEPSLATE_WALL);

                        entries.add(Blocks.CHISELED_DEEPSLATE);
                        entries.add(ModDeepslateBlocks.MOSSY_CHISELED_DEEPSLATE);
                        entries.add(ModDeepslateBlocks.CRACKED_CHISELED_DEEPSLATE);

                        entries.add(Blocks.COBBLED_DEEPSLATE);
                        entries.add(Blocks.COBBLED_DEEPSLATE_STAIRS);
                        entries.add(Blocks.COBBLED_DEEPSLATE_SLAB);
                        entries.add(Blocks.COBBLED_DEEPSLATE_WALL);

                        entries.add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE);
                        entries.add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS);
                        entries.add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB);
                        entries.add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_WALL);

                        entries.add(ModDeepslateBlocks.SMOOTH_DEEPSLATE);
                        entries.add(ModDeepslateBlocks.SMOOTH_DEEPSLATE_STAIRS);
                        entries.add(ModDeepslateBlocks.SMOOTH_DEEPSLATE_SLAB);
                        entries.add(ModDeepslateBlocks.SMOOTH_DEEPSLATE_WALL);

                        entries.add(Blocks.POLISHED_DEEPSLATE);
                        entries.add(Blocks.POLISHED_DEEPSLATE_STAIRS);
                        entries.add(Blocks.POLISHED_DEEPSLATE_SLAB);
                        entries.add(Blocks.POLISHED_DEEPSLATE_WALL);
                        entries.add(ModDeepslateBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
                        entries.add(ModDeepslateBlocks.POLISHED_DEEPSLATE_BUTTON);

                        entries.add(Blocks.DEEPSLATE_BRICKS);
                        entries.add(Blocks.DEEPSLATE_BRICK_STAIRS);
                        entries.add(Blocks.DEEPSLATE_BRICK_SLAB);
                        entries.add(Blocks.DEEPSLATE_BRICK_WALL);
                        entries.add(ModDeepslateBlocks.CHISELED_DEEPSLATE_BRICKS);

                        entries.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICKS);
                        entries.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
                        entries.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_SLAB);
                        entries.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_WALL);
                        entries.add(ModDeepslateBlocks.MOSSY_CHISELED_DEEPSLATE_BRICKS);

                        entries.add(Blocks.CRACKED_DEEPSLATE_BRICKS);
                        entries.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
                        entries.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_SLAB);
                        entries.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_WALL);
                        entries.add(ModDeepslateBlocks.CRACKED_CHISELED_DEEPSLATE_BRICKS);

                        entries.add(ModDeepslateBlocks.DEEPSLATE_PLATES);
                        entries.add(ModDeepslateBlocks.DEEPSLATE_PLATE_STAIRS);
                        entries.add(ModDeepslateBlocks.DEEPSLATE_PLATE_SLAB);
                        entries.add(ModDeepslateBlocks.DEEPSLATE_PLATE_WALL);

                        entries.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATES);
                        entries.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_STAIRS);
                        entries.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_SLAB);
                        entries.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_WALL);

                        entries.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATES);
                        entries.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_STAIRS);
                        entries.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_SLAB);
                        entries.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_WALL);

                        entries.add(Blocks.DEEPSLATE_TILES);
                        entries.add(Blocks.DEEPSLATE_TILE_STAIRS);
                        entries.add(Blocks.DEEPSLATE_TILE_SLAB);
                        entries.add(Blocks.DEEPSLATE_TILE_WALL);

                        entries.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILES);
                        entries.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_STAIRS);
                        entries.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_SLAB);
                        entries.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_WALL);

                        entries.add(Blocks.CRACKED_DEEPSLATE_TILES);
                        entries.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
                        entries.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_SLAB);
                        entries.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_WALL);

                        entries.add(ModDeepslateBlocks.DEEPSLATE_PILLAR);
                        entries.add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PILLAR);
                        entries.add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PILLAR);

                        // ============== BRICKS ==============

                        entries.add(Blocks.BRICKS);
                        entries.add(Blocks.BRICK_STAIRS);
                        entries.add(Blocks.BRICK_SLAB);
                        entries.add(Blocks.BRICK_WALL);
                        entries.add(ModBricksBlocks.CHISELED_BRICKS);

                        entries.add(ModBricksBlocks.MOSSY_BRICKS);
                        entries.add(ModBricksBlocks.MOSSY_BRICK_STAIRS);
                        entries.add(ModBricksBlocks.MOSSY_BRICK_SLAB);
                        entries.add(ModBricksBlocks.MOSSY_BRICK_WALL);
                        entries.add(ModBricksBlocks.MOSSY_CHISELED_BRICKS);

                        entries.add(ModBricksBlocks.CRACKED_BRICKS);
                        entries.add(ModBricksBlocks.CRACKED_BRICK_STAIRS);
                        entries.add(ModBricksBlocks.CRACKED_BRICK_SLAB);
                        entries.add(ModBricksBlocks.CRACKED_BRICK_WALL);
                        entries.add(ModBricksBlocks.CRACKED_CHISELED_BRICKS);

                        // ============== SANDSTONE ==============

                        entries.add(Blocks.SANDSTONE);
                        entries.add(Blocks.SANDSTONE_STAIRS);
                        entries.add(Blocks.SANDSTONE_SLAB);
                        entries.add(Blocks.SANDSTONE_WALL);

                        entries.add(Blocks.CHISELED_SANDSTONE);
                        entries.add(ModSandstoneBlocks.CRACKED_CHISELED_SANDSTONE);

                        entries.add(ModSandstoneBlocks.COBBLED_SANDSTONE);
                        entries.add(ModSandstoneBlocks.COBBLED_SANDSTONE_STAIRS);
                        entries.add(ModSandstoneBlocks.COBBLED_SANDSTONE_SLAB);
                        entries.add(ModSandstoneBlocks.COBBLED_SANDSTONE_WALL);

                        entries.add(Blocks.SMOOTH_SANDSTONE);
                        entries.add(Blocks.SMOOTH_SANDSTONE_STAIRS);
                        entries.add(Blocks.SMOOTH_SANDSTONE_SLAB);
                        entries.add(ModSandstoneBlocks.SMOOTH_SANDSTONE_WALL);

                        entries.add(Blocks.CUT_SANDSTONE);
                        entries.add(ModSandstoneBlocks.CUT_SANDSTONE_STAIRS);
                        entries.add(Blocks.CUT_SANDSTONE_SLAB);
                        entries.add(ModSandstoneBlocks.CUT_SANDSTONE_WALL);

                        entries.add(ModSandstoneBlocks.POLISHED_SANDSTONE);
                        entries.add(ModSandstoneBlocks.POLISHED_SANDSTONE_STAIRS);
                        entries.add(ModSandstoneBlocks.POLISHED_SANDSTONE_SLAB);
                        entries.add(ModSandstoneBlocks.POLISHED_SANDSTONE_WALL);
                        entries.add(ModSandstoneBlocks.POLISHED_SANDSTONE_PRESSURE_PLATE);
                        entries.add(ModSandstoneBlocks.POLISHED_SANDSTONE_BUTTON);

                        entries.add(ModSandstoneBlocks.SANDSTONE_BRICKS);
                        entries.add(ModSandstoneBlocks.SANDSTONE_BRICK_STAIRS);
                        entries.add(ModSandstoneBlocks.SANDSTONE_BRICK_SLAB);
                        entries.add(ModSandstoneBlocks.SANDSTONE_BRICK_WALL);
                        entries.add(ModSandstoneBlocks.CHISELED_SANDSTONE_BRICKS);

                        entries.add(ModSandstoneBlocks.CRACKED_SANDSTONE_BRICKS);
                        entries.add(ModSandstoneBlocks.CRACKED_SANDSTONE_BRICK_STAIRS);
                        entries.add(ModSandstoneBlocks.CRACKED_SANDSTONE_BRICK_SLAB);
                        entries.add(ModSandstoneBlocks.CRACKED_SANDSTONE_BRICK_WALL);
                        entries.add(ModSandstoneBlocks.CRACKED_CHISELED_SANDSTONE_BRICKS);

                        entries.add(ModSandstoneBlocks.SANDSTONE_PLATES);
                        entries.add(ModSandstoneBlocks.SANDSTONE_PLATE_STAIRS);
                        entries.add(ModSandstoneBlocks.SANDSTONE_PLATE_SLAB);
                        entries.add(ModSandstoneBlocks.SANDSTONE_PLATE_WALL);

                        entries.add(ModSandstoneBlocks.CRACKED_SANDSTONE_PLATES);
                        entries.add(ModSandstoneBlocks.CRACKED_SANDSTONE_PLATE_STAIRS);
                        entries.add(ModSandstoneBlocks.CRACKED_SANDSTONE_PLATE_SLAB);
                        entries.add(ModSandstoneBlocks.CRACKED_SANDSTONE_PLATE_WALL);

                        entries.add(ModSandstoneBlocks.SANDSTONE_TILES);
                        entries.add(ModSandstoneBlocks.SANDSTONE_TILE_STAIRS);
                        entries.add(ModSandstoneBlocks.SANDSTONE_TILE_SLAB);
                        entries.add(ModSandstoneBlocks.SANDSTONE_TILE_WALL);

                        entries.add(ModSandstoneBlocks.CRACKED_SANDSTONE_TILES);
                        entries.add(ModSandstoneBlocks.CRACKED_SANDSTONE_TILE_STAIRS);
                        entries.add(ModSandstoneBlocks.CRACKED_SANDSTONE_TILE_SLAB);
                        entries.add(ModSandstoneBlocks.CRACKED_SANDSTONE_TILE_WALL);

                        entries.add(ModSandstoneBlocks.SANDSTONE_PILLAR);
                        entries.add(ModSandstoneBlocks.CRACKED_SANDSTONE_PILLAR);

                        // ============== RED SANDSTONE ==============

                        entries.add(Blocks.RED_SANDSTONE);
                        entries.add(Blocks.RED_SANDSTONE_STAIRS);
                        entries.add(Blocks.RED_SANDSTONE_SLAB);
                        entries.add(Blocks.RED_SANDSTONE_WALL);

                        entries.add(Blocks.CHISELED_RED_SANDSTONE);
                        entries.add(ModRedSandstoneBlocks.CRACKED_CHISELED_RED_SANDSTONE);

                        entries.add(ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE);
                        entries.add(ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE_STAIRS);
                        entries.add(ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE_SLAB);
                        entries.add(ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE_WALL);

                        entries.add(Blocks.SMOOTH_RED_SANDSTONE);
                        entries.add(Blocks.SMOOTH_RED_SANDSTONE_STAIRS);
                        entries.add(Blocks.SMOOTH_RED_SANDSTONE_SLAB);
                        entries.add(ModRedSandstoneBlocks.SMOOTH_RED_SANDSTONE_WALL);

                        entries.add(Blocks.CUT_RED_SANDSTONE);
                        entries.add(ModRedSandstoneBlocks.CUT_RED_SANDSTONE_STAIRS);
                        entries.add(Blocks.CUT_RED_SANDSTONE_SLAB);
                        entries.add(ModRedSandstoneBlocks.CUT_RED_SANDSTONE_WALL);

                        entries.add(ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE);
                        entries.add(ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_STAIRS);
                        entries.add(ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_SLAB);
                        entries.add(ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_WALL);
                        entries.add(ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_PRESSURE_PLATE);
                        entries.add(ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_BUTTON);

                        entries.add(ModRedSandstoneBlocks.RED_SANDSTONE_BRICKS);
                        entries.add(ModRedSandstoneBlocks.RED_SANDSTONE_BRICK_STAIRS);
                        entries.add(ModRedSandstoneBlocks.RED_SANDSTONE_BRICK_SLAB);
                        entries.add(ModRedSandstoneBlocks.RED_SANDSTONE_BRICK_WALL);
                        entries.add(ModRedSandstoneBlocks.CHISELED_RED_SANDSTONE_BRICKS);

                        entries.add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_BRICKS);
                        entries.add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS);
                        entries.add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB);
                        entries.add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL);
                        entries.add(ModRedSandstoneBlocks.CRACKED_CHISELED_RED_SANDSTONE_BRICKS);

                        entries.add(ModRedSandstoneBlocks.RED_SANDSTONE_PLATES);
                        entries.add(ModRedSandstoneBlocks.RED_SANDSTONE_PLATE_STAIRS);
                        entries.add(ModRedSandstoneBlocks.RED_SANDSTONE_PLATE_SLAB);
                        entries.add(ModRedSandstoneBlocks.RED_SANDSTONE_PLATE_WALL);

                        entries.add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PLATES);
                        entries.add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PLATE_STAIRS);
                        entries.add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PLATE_SLAB);
                        entries.add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PLATE_WALL);

                        entries.add(ModRedSandstoneBlocks.RED_SANDSTONE_TILES);
                        entries.add(ModRedSandstoneBlocks.RED_SANDSTONE_TILE_STAIRS);
                        entries.add(ModRedSandstoneBlocks.RED_SANDSTONE_TILE_SLAB);
                        entries.add(ModRedSandstoneBlocks.RED_SANDSTONE_TILE_WALL);

                        entries.add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_TILES);
                        entries.add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_TILE_STAIRS);
                        entries.add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_TILE_SLAB);
                        entries.add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_TILE_WALL);

                        entries.add(ModRedSandstoneBlocks.RED_SANDSTONE_PILLAR);
                        entries.add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PILLAR);
                    }).build());

    public static void init() {
        Blocksistency.LOGGER.info("Registering item groups for " + Blocksistency.MOD_ID);
    }
}
