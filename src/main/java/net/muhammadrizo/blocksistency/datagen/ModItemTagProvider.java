package net.muhammadrizo.blocksistency.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.muhammadrizo.blocksistency.block.*;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(ModGraniteBlocks.COBBLED_GRANITE.asItem())
                .add(ModDioriteBlocks.COBBLED_DIORITE.asItem())
                .add(ModAndesiteBlocks.COBBLED_ANDESITE.asItem());

        valueLookupBuilder(ItemTags.STONE_TOOL_MATERIALS)
                .add(ModGraniteBlocks.COBBLED_GRANITE.asItem())
                .add(ModDioriteBlocks.COBBLED_DIORITE.asItem())
                .add(ModAndesiteBlocks.COBBLED_ANDESITE.asItem());

        TagKey<Item> COBBLESTONES_NORMAL = TagKey.of(
                RegistryKeys.ITEM,
                Identifier.of("c", "cobblestones/normal"));

        TagKey<Item> COBBLESTONES_MOSSY = TagKey.of(
                RegistryKeys.ITEM,
                Identifier.of("c", "cobblestones/mossy"));

        valueLookupBuilder(COBBLESTONES_NORMAL)
                .add(ModGraniteBlocks.COBBLED_GRANITE.asItem())
                .add(ModDioriteBlocks.COBBLED_DIORITE.asItem())
                .add(ModAndesiteBlocks.COBBLED_ANDESITE.asItem())
                .add(ModSandstoneBlocks.COBBLED_SANDSTONE.asItem())
                .add(ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE.asItem());

        valueLookupBuilder(COBBLESTONES_MOSSY)
                .add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE.asItem())
                .add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE.asItem())
                .add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE.asItem())
                .add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE.asItem());

        valueLookupBuilder(ItemTags.STAIRS)
                // ============== STONE ==============
                .add(ModStoneBlocks.SMOOTH_STONE_STAIRS.asItem())
                .add(ModStoneBlocks.POLISHED_STONE_STAIRS.asItem())
                .add(ModStoneBlocks.CRACKED_STONE_BRICK_STAIRS.asItem())
                .add(ModStoneBlocks.STONE_PLATE_STAIRS.asItem())
                .add(ModStoneBlocks.MOSSY_STONE_PLATE_STAIRS.asItem())
                .add(ModStoneBlocks.CRACKED_STONE_PLATE_STAIRS.asItem())
                .add(ModStoneBlocks.STONE_TILE_STAIRS.asItem())
                .add(ModStoneBlocks.MOSSY_STONE_TILE_STAIRS.asItem())
                .add(ModStoneBlocks.CRACKED_STONE_TILE_STAIRS.asItem())

                // ============== GRANITE ==============
                .add(ModGraniteBlocks.COBBLED_GRANITE_STAIRS.asItem())
                .add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_STAIRS.asItem())
                .add(ModGraniteBlocks.SMOOTH_GRANITE_STAIRS.asItem())
                .add(ModGraniteBlocks.GRANITE_BRICK_STAIRS.asItem())
                .add(ModGraniteBlocks.MOSSY_GRANITE_BRICK_STAIRS.asItem())
                .add(ModGraniteBlocks.CRACKED_GRANITE_BRICK_STAIRS.asItem())
                .add(ModGraniteBlocks.GRANITE_PLATE_STAIRS.asItem())
                .add(ModGraniteBlocks.MOSSY_GRANITE_PLATE_STAIRS.asItem())
                .add(ModGraniteBlocks.CRACKED_GRANITE_PLATE_STAIRS.asItem())
                .add(ModGraniteBlocks.GRANITE_TILE_STAIRS.asItem())
                .add(ModGraniteBlocks.MOSSY_GRANITE_TILE_STAIRS.asItem())
                .add(ModGraniteBlocks.CRACKED_GRANITE_TILE_STAIRS.asItem())

                // ============== DIORITE ==============
                .add(ModDioriteBlocks.COBBLED_DIORITE_STAIRS.asItem())
                .add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_STAIRS.asItem())
                .add(ModDioriteBlocks.SMOOTH_DIORITE_STAIRS.asItem())
                .add(ModDioriteBlocks.DIORITE_BRICK_STAIRS.asItem())
                .add(ModDioriteBlocks.MOSSY_DIORITE_BRICK_STAIRS.asItem())
                .add(ModDioriteBlocks.CRACKED_DIORITE_BRICK_STAIRS.asItem())
                .add(ModDioriteBlocks.DIORITE_PLATE_STAIRS.asItem())
                .add(ModDioriteBlocks.MOSSY_DIORITE_PLATE_STAIRS.asItem())
                .add(ModDioriteBlocks.CRACKED_DIORITE_PLATE_STAIRS.asItem())
                .add(ModDioriteBlocks.DIORITE_TILE_STAIRS.asItem())
                .add(ModDioriteBlocks.MOSSY_DIORITE_TILE_STAIRS.asItem())
                .add(ModDioriteBlocks.CRACKED_DIORITE_TILE_STAIRS.asItem())

                // ============== ANDESITE ==============
                .add(ModAndesiteBlocks.COBBLED_ANDESITE_STAIRS.asItem())
                .add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_STAIRS.asItem())
                .add(ModAndesiteBlocks.SMOOTH_ANDESITE_STAIRS.asItem())
                .add(ModAndesiteBlocks.ANDESITE_BRICK_STAIRS.asItem())
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_STAIRS.asItem())
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_STAIRS.asItem())
                .add(ModAndesiteBlocks.ANDESITE_PLATE_STAIRS.asItem())
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_STAIRS.asItem())
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_STAIRS.asItem())
                .add(ModAndesiteBlocks.ANDESITE_TILE_STAIRS.asItem())
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_STAIRS.asItem())
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_STAIRS.asItem())

                // ============== DEEPSLATE ==============
                .add(ModDeepslateBlocks.DEEPSLATE_STAIRS.asItem())
                .add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS.asItem())
                .add(ModDeepslateBlocks.SMOOTH_DEEPSLATE_STAIRS.asItem())
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS.asItem())
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.asItem())
                .add(ModDeepslateBlocks.DEEPSLATE_PLATE_STAIRS.asItem())
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_STAIRS.asItem())
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_STAIRS.asItem())
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_STAIRS.asItem())
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.asItem())

                // ============== BRICKS ==============
                .add(ModBricksBlocks.MOSSY_BRICK_STAIRS.asItem())
                .add(ModBricksBlocks.CRACKED_BRICK_STAIRS.asItem())

                // ============== SANDSTONE ==============
                .add(ModSandstoneBlocks.COBBLED_SANDSTONE_STAIRS.asItem())
                .add(ModSandstoneBlocks.CUT_SANDSTONE_STAIRS.asItem())
                .add(ModSandstoneBlocks.POLISHED_SANDSTONE_STAIRS.asItem())
                .add(ModSandstoneBlocks.SANDSTONE_BRICK_STAIRS.asItem())
                .add(ModSandstoneBlocks.CRACKED_SANDSTONE_BRICK_STAIRS.asItem())
                .add(ModSandstoneBlocks.SANDSTONE_PLATE_STAIRS.asItem())
                .add(ModSandstoneBlocks.CRACKED_SANDSTONE_PLATE_STAIRS.asItem())
                .add(ModSandstoneBlocks.SANDSTONE_TILE_STAIRS.asItem())
                .add(ModSandstoneBlocks.CRACKED_SANDSTONE_TILE_STAIRS.asItem())

                // ============== RED SANDSTONE ==============
                .add(ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE_STAIRS.asItem())
                .add(ModRedSandstoneBlocks.CUT_RED_SANDSTONE_STAIRS.asItem())
                .add(ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_STAIRS.asItem())
                .add(ModRedSandstoneBlocks.RED_SANDSTONE_BRICK_STAIRS.asItem())
                .add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS.asItem())
                .add(ModRedSandstoneBlocks.RED_SANDSTONE_PLATE_STAIRS.asItem())
                .add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PLATE_STAIRS.asItem())
                .add(ModRedSandstoneBlocks.RED_SANDSTONE_TILE_STAIRS.asItem())
                .add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_TILE_STAIRS.asItem());

        valueLookupBuilder(ItemTags.SLABS)
                // ============== STONE ==============
                .add(ModStoneBlocks.POLISHED_STONE_SLAB.asItem())
                .add(ModStoneBlocks.CRACKED_STONE_BRICK_SLAB.asItem())
                .add(ModStoneBlocks.STONE_PLATE_SLAB.asItem())
                .add(ModStoneBlocks.MOSSY_STONE_PLATE_SLAB.asItem())
                .add(ModStoneBlocks.CRACKED_STONE_PLATE_SLAB.asItem())
                .add(ModStoneBlocks.STONE_TILE_SLAB.asItem())
                .add(ModStoneBlocks.MOSSY_STONE_TILE_SLAB.asItem())
                .add(ModStoneBlocks.CRACKED_STONE_TILE_SLAB.asItem())

                // ============== GRANITE ==============
                .add(ModGraniteBlocks.COBBLED_GRANITE_SLAB.asItem())
                .add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_SLAB.asItem())
                .add(ModGraniteBlocks.SMOOTH_GRANITE_SLAB.asItem())
                .add(ModGraniteBlocks.GRANITE_BRICK_SLAB.asItem())
                .add(ModGraniteBlocks.MOSSY_GRANITE_BRICK_SLAB.asItem())
                .add(ModGraniteBlocks.CRACKED_GRANITE_BRICK_SLAB.asItem())
                .add(ModGraniteBlocks.GRANITE_PLATE_SLAB.asItem())
                .add(ModGraniteBlocks.MOSSY_GRANITE_PLATE_SLAB.asItem())
                .add(ModGraniteBlocks.CRACKED_GRANITE_PLATE_SLAB.asItem())
                .add(ModGraniteBlocks.GRANITE_TILE_SLAB.asItem())
                .add(ModGraniteBlocks.MOSSY_GRANITE_TILE_SLAB.asItem())
                .add(ModGraniteBlocks.CRACKED_GRANITE_TILE_SLAB.asItem())

                // ============== DIORITE ==============
                .add(ModDioriteBlocks.COBBLED_DIORITE_SLAB.asItem())
                .add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_SLAB.asItem())
                .add(ModDioriteBlocks.SMOOTH_DIORITE_SLAB.asItem())
                .add(ModDioriteBlocks.DIORITE_BRICK_SLAB.asItem())
                .add(ModDioriteBlocks.MOSSY_DIORITE_BRICK_SLAB.asItem())
                .add(ModDioriteBlocks.CRACKED_DIORITE_BRICK_SLAB.asItem())
                .add(ModDioriteBlocks.DIORITE_PLATE_SLAB.asItem())
                .add(ModDioriteBlocks.MOSSY_DIORITE_PLATE_SLAB.asItem())
                .add(ModDioriteBlocks.CRACKED_DIORITE_PLATE_SLAB.asItem())
                .add(ModDioriteBlocks.DIORITE_TILE_SLAB.asItem())
                .add(ModDioriteBlocks.MOSSY_DIORITE_TILE_SLAB.asItem())
                .add(ModDioriteBlocks.CRACKED_DIORITE_TILE_SLAB.asItem())

                // ============== ANDESITE ==============
                .add(ModAndesiteBlocks.COBBLED_ANDESITE_SLAB.asItem())
                .add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_SLAB.asItem())
                .add(ModAndesiteBlocks.SMOOTH_ANDESITE_SLAB.asItem())
                .add(ModAndesiteBlocks.ANDESITE_BRICK_SLAB.asItem())
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_SLAB.asItem())
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_SLAB.asItem())
                .add(ModAndesiteBlocks.ANDESITE_PLATE_SLAB.asItem())
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_SLAB.asItem())
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_SLAB.asItem())
                .add(ModAndesiteBlocks.ANDESITE_TILE_SLAB.asItem())
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_SLAB.asItem())
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_SLAB.asItem())

                // ============== DEEPSLATE ==============
                .add(ModDeepslateBlocks.DEEPSLATE_SLAB.asItem())
                .add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB.asItem())
                .add(ModDeepslateBlocks.SMOOTH_DEEPSLATE_SLAB.asItem())
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_SLAB.asItem())
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.asItem())
                .add(ModDeepslateBlocks.DEEPSLATE_PLATE_SLAB.asItem())
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_SLAB.asItem())
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_SLAB.asItem())
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_SLAB.asItem())
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_SLAB.asItem())

                // ============== BRICKS ==============
                .add(ModBricksBlocks.MOSSY_BRICK_SLAB.asItem())
                .add(ModBricksBlocks.CRACKED_BRICK_SLAB.asItem())

                // ============== SANDSTONE ==============
                .add(ModSandstoneBlocks.COBBLED_SANDSTONE_SLAB.asItem())
                .add(ModSandstoneBlocks.POLISHED_SANDSTONE_SLAB.asItem())
                .add(ModSandstoneBlocks.SANDSTONE_BRICK_SLAB.asItem())
                .add(ModSandstoneBlocks.CRACKED_SANDSTONE_BRICK_SLAB.asItem())
                .add(ModSandstoneBlocks.SANDSTONE_PLATE_SLAB.asItem())
                .add(ModSandstoneBlocks.CRACKED_SANDSTONE_PLATE_SLAB.asItem())
                .add(ModSandstoneBlocks.SANDSTONE_TILE_SLAB.asItem())
                .add(ModSandstoneBlocks.CRACKED_SANDSTONE_TILE_SLAB.asItem())

                // ============== RED SANDSTONE ==============
                .add(ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE_SLAB.asItem())
                .add(ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_SLAB.asItem())
                .add(ModRedSandstoneBlocks.RED_SANDSTONE_BRICK_SLAB.asItem())
                .add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB.asItem())
                .add(ModRedSandstoneBlocks.RED_SANDSTONE_PLATE_SLAB.asItem())
                .add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PLATE_SLAB.asItem())
                .add(ModRedSandstoneBlocks.RED_SANDSTONE_TILE_SLAB.asItem())
                .add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_TILE_SLAB.asItem());

        valueLookupBuilder(ItemTags.WALLS)
                // ============== STONE ==============
                .add(ModStoneBlocks.STONE_WALL.asItem())
                .add(ModStoneBlocks.SMOOTH_STONE_WALL.asItem())
                .add(ModStoneBlocks.POLISHED_STONE_WALL.asItem())
                .add(ModStoneBlocks.CRACKED_STONE_BRICK_WALL.asItem())
                .add(ModStoneBlocks.STONE_PLATE_WALL.asItem())
                .add(ModStoneBlocks.MOSSY_STONE_PLATE_WALL.asItem())
                .add(ModStoneBlocks.CRACKED_STONE_PLATE_WALL.asItem())
                .add(ModStoneBlocks.STONE_TILE_WALL.asItem())
                .add(ModStoneBlocks.MOSSY_STONE_TILE_WALL.asItem())
                .add(ModStoneBlocks.CRACKED_STONE_TILE_WALL.asItem())

                // ============== GRANITE ==============
                .add(ModGraniteBlocks.COBBLED_GRANITE_WALL.asItem())
                .add(ModGraniteBlocks.MOSSY_COBBLED_GRANITE_WALL.asItem())
                .add(ModGraniteBlocks.SMOOTH_GRANITE_WALL.asItem())
                .add(ModGraniteBlocks.POLISHED_GRANITE_WALL.asItem())
                .add(ModGraniteBlocks.GRANITE_BRICK_WALL.asItem())
                .add(ModGraniteBlocks.MOSSY_GRANITE_BRICK_WALL.asItem())
                .add(ModGraniteBlocks.CRACKED_GRANITE_BRICK_WALL.asItem())
                .add(ModGraniteBlocks.GRANITE_PLATE_WALL.asItem())
                .add(ModGraniteBlocks.MOSSY_GRANITE_PLATE_WALL.asItem())
                .add(ModGraniteBlocks.CRACKED_GRANITE_PLATE_WALL.asItem())
                .add(ModGraniteBlocks.GRANITE_TILE_WALL.asItem())
                .add(ModGraniteBlocks.MOSSY_GRANITE_TILE_WALL.asItem())
                .add(ModGraniteBlocks.CRACKED_GRANITE_TILE_WALL.asItem())

                // ============== DIORITE ==============
                .add(ModDioriteBlocks.COBBLED_DIORITE_WALL.asItem())
                .add(ModDioriteBlocks.MOSSY_COBBLED_DIORITE_WALL.asItem())
                .add(ModDioriteBlocks.SMOOTH_DIORITE_WALL.asItem())
                .add(ModDioriteBlocks.POLISHED_DIORITE_WALL.asItem())
                .add(ModDioriteBlocks.DIORITE_BRICK_WALL.asItem())
                .add(ModDioriteBlocks.MOSSY_DIORITE_BRICK_WALL.asItem())
                .add(ModDioriteBlocks.CRACKED_DIORITE_BRICK_WALL.asItem())
                .add(ModDioriteBlocks.DIORITE_PLATE_WALL.asItem())
                .add(ModDioriteBlocks.MOSSY_DIORITE_PLATE_WALL.asItem())
                .add(ModDioriteBlocks.CRACKED_DIORITE_PLATE_WALL.asItem())
                .add(ModDioriteBlocks.DIORITE_TILE_WALL.asItem())
                .add(ModDioriteBlocks.MOSSY_DIORITE_TILE_WALL.asItem())
                .add(ModDioriteBlocks.CRACKED_DIORITE_TILE_WALL.asItem())

                // ============== ANDESITE ==============
                .add(ModAndesiteBlocks.COBBLED_ANDESITE_WALL.asItem())
                .add(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_WALL.asItem())
                .add(ModAndesiteBlocks.SMOOTH_ANDESITE_WALL.asItem())
                .add(ModAndesiteBlocks.POLISHED_ANDESITE_WALL.asItem())
                .add(ModAndesiteBlocks.ANDESITE_BRICK_WALL.asItem())
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_WALL.asItem())
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_WALL.asItem())
                .add(ModAndesiteBlocks.ANDESITE_PLATE_WALL.asItem())
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_WALL.asItem())
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_WALL.asItem())
                .add(ModAndesiteBlocks.ANDESITE_TILE_WALL.asItem())
                .add(ModAndesiteBlocks.MOSSY_ANDESITE_TILE_WALL.asItem())
                .add(ModAndesiteBlocks.CRACKED_ANDESITE_TILE_WALL.asItem())

                // ============== DEEPSLATE ==============
                .add(ModDeepslateBlocks.DEEPSLATE_WALL.asItem())
                .add(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_WALL.asItem())
                .add(ModDeepslateBlocks.SMOOTH_DEEPSLATE_WALL.asItem())
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_WALL.asItem())
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_WALL.asItem())
                .add(ModDeepslateBlocks.DEEPSLATE_PLATE_WALL.asItem())
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_WALL.asItem())
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_WALL.asItem())
                .add(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_WALL.asItem())
                .add(ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_WALL.asItem())

                // ============== BRICKS ==============
                .add(ModBricksBlocks.MOSSY_BRICK_WALL.asItem())
                .add(ModBricksBlocks.CRACKED_BRICK_WALL.asItem())

                // ============== SANDSTONE ==============
                .add(ModSandstoneBlocks.COBBLED_SANDSTONE_WALL.asItem())
                .add(ModSandstoneBlocks.SMOOTH_SANDSTONE_WALL.asItem())
                .add(ModSandstoneBlocks.CUT_SANDSTONE_WALL.asItem())
                .add(ModSandstoneBlocks.POLISHED_SANDSTONE_WALL.asItem())
                .add(ModSandstoneBlocks.SANDSTONE_BRICK_WALL.asItem())
                .add(ModSandstoneBlocks.CRACKED_SANDSTONE_BRICK_WALL.asItem())
                .add(ModSandstoneBlocks.SANDSTONE_PLATE_WALL.asItem())
                .add(ModSandstoneBlocks.CRACKED_SANDSTONE_PLATE_WALL.asItem())
                .add(ModSandstoneBlocks.SANDSTONE_TILE_WALL.asItem())
                .add(ModSandstoneBlocks.CRACKED_SANDSTONE_TILE_WALL.asItem())

                // ============== RED SANDSTONE ==============
                .add(ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE_WALL.asItem())
                .add(ModRedSandstoneBlocks.SMOOTH_RED_SANDSTONE_WALL.asItem())
                .add(ModRedSandstoneBlocks.CUT_RED_SANDSTONE_WALL.asItem())
                .add(ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_WALL.asItem())
                .add(ModRedSandstoneBlocks.RED_SANDSTONE_BRICK_WALL.asItem())
                .add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL.asItem())
                .add(ModRedSandstoneBlocks.RED_SANDSTONE_PLATE_WALL.asItem())
                .add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PLATE_WALL.asItem())
                .add(ModRedSandstoneBlocks.RED_SANDSTONE_TILE_WALL.asItem())
                .add(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_TILE_WALL.asItem());

        valueLookupBuilder(ItemTags.STONE_BUTTONS)
                .add(ModGraniteBlocks.POLISHED_GRANITE_BUTTON.asItem())
                .add(ModDioriteBlocks.POLISHED_DIORITE_BUTTON.asItem())
                .add(ModAndesiteBlocks.POLISHED_ANDESITE_BUTTON.asItem())
                .add(ModDeepslateBlocks.POLISHED_DEEPSLATE_BUTTON.asItem())
                .add(ModSandstoneBlocks.POLISHED_SANDSTONE_BUTTON.asItem())
                .add(ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_BUTTON.asItem());
    }
}
