package net.muhammadrizo.blocksistency.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.muhammadrizo.blocksistency.block.*;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    final RecipeCategory RC = RecipeCategory.BUILDING_BLOCKS;

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                // Replacing the Stonecutter recipe to accept #c:stones
                // is done at resources/data/minecraft/recipe, in "stonecutter.json"

                // ============== STONE ==============

                // Cobblestone + forms — stonecutting from Stone
                stonecuttingRecipe(Blocks.COBBLESTONE, Blocks.STONE);
                stonecuttingRecipe(Blocks.COBBLESTONE_STAIRS, Blocks.STONE);
                stonecuttingSlabRecipe(Blocks.COBBLESTONE_SLAB, Blocks.STONE);
                stonecuttingRecipe(Blocks.COBBLESTONE_WALL, Blocks.STONE);

                // Stone wall
                wallRecipe(ModStoneBlocks.STONE_WALL, Blocks.STONE);

                // Chiseled Stone + variants
                chiseledBlockRecipe(ModStoneBlocks.CHISELED_STONE, Blocks.STONE_SLAB, Blocks.STONE);
                mossyBlockRecipe(ModStoneBlocks.MOSSY_CHISELED_STONE, ModStoneBlocks.CHISELED_STONE);
                crackedBlockRecipe(ModStoneBlocks.CRACKED_CHISELED_STONE, ModStoneBlocks.CHISELED_STONE);

                // Smooth Stone stairs, wall
                stairsRecipe(ModStoneBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);
                wallRecipe(ModStoneBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);

                // Polished Stone forms
                polishedBlockRecipe(ModStoneBlocks.POLISHED_STONE,  Blocks.STONE);
                craftBlockForms(
                        ModStoneBlocks.POLISHED_STONE_STAIRS, ModStoneBlocks.POLISHED_STONE_SLAB, ModStoneBlocks.POLISHED_STONE_WALL,
                        ModStoneBlocks.POLISHED_STONE);
                stonecuttingRecipe(ModStoneBlocks.POLISHED_STONE_STAIRS, Blocks.STONE);
                stonecuttingRecipe(ModStoneBlocks.POLISHED_STONE_SLAB, Blocks.STONE);
                stonecuttingRecipe(ModStoneBlocks.POLISHED_STONE_WALL, Blocks.STONE);

                // Replacing 'Stone >> Stone Bricks' with 'Polished Stone >> Stone Bricks'
                // is done at resources/data/minecraft/recipe, in "stone_bricks.json"
                stonecuttingRecipe(Blocks.STONE_BRICKS, ModStoneBlocks.POLISHED_STONE);

                // Polished Stone >> Stone Brick forms
                stonecuttingRecipe(Blocks.STONE_BRICK_STAIRS, ModStoneBlocks.POLISHED_STONE);
                stonecuttingRecipe(Blocks.STONE_BRICK_SLAB, ModStoneBlocks.POLISHED_STONE);
                stonecuttingRecipe(Blocks.STONE_BRICK_WALL, ModStoneBlocks.POLISHED_STONE);

                // Mossy Chiseled Stone Bricks
                mossyBlockRecipe(ModStoneBlocks.MOSSY_CHISELED_STONE_BRICKS, Blocks.CHISELED_STONE_BRICKS);

                // Cracked Stone Bricks forms
                craftBlockForms(
                        ModStoneBlocks.CRACKED_STONE_BRICK_STAIRS, ModStoneBlocks.CRACKED_STONE_BRICK_SLAB, ModStoneBlocks.CRACKED_STONE_BRICK_WALL,
                        Blocks.CRACKED_STONE_BRICKS);
                crackedBlockRecipe(ModStoneBlocks.CRACKED_CHISELED_STONE_BRICKS, Blocks.CHISELED_STONE_BRICKS);

                // Stone Plates + forms
                craftPlatesBlocks(ModStoneBlocks.STONE_PLATES,
                        ModStoneBlocks.STONE_PLATE_STAIRS, ModStoneBlocks.STONE_PLATE_SLAB, ModStoneBlocks.STONE_PLATE_WALL,
                        Blocks.STONE_BRICKS, ModStoneBlocks.POLISHED_STONE, Blocks.STONE);
                // Mossy Stone Plates + forms
                mossyBlockRecipe(ModStoneBlocks.MOSSY_STONE_PLATES, ModStoneBlocks.STONE_PLATES);
                craftBlockForms(
                        ModStoneBlocks.MOSSY_STONE_PLATE_STAIRS, ModStoneBlocks.MOSSY_STONE_PLATE_SLAB, ModStoneBlocks.MOSSY_STONE_PLATE_WALL,
                        ModStoneBlocks.MOSSY_STONE_PLATES);
                // Cracked Stone Plates + forms
                crackedBlockRecipe(ModStoneBlocks.CRACKED_STONE_PLATES, ModStoneBlocks.STONE_PLATES);
                craftBlockForms(
                        ModStoneBlocks.CRACKED_STONE_PLATE_STAIRS, ModStoneBlocks.CRACKED_STONE_PLATE_SLAB, ModStoneBlocks.CRACKED_STONE_PLATE_WALL,
                        ModStoneBlocks.CRACKED_STONE_PLATES);

                // Stone Tiles + forms
                craftTilesBlocks(ModStoneBlocks.STONE_TILES,
                        ModStoneBlocks.STONE_TILE_STAIRS, ModStoneBlocks.STONE_TILE_SLAB, ModStoneBlocks.STONE_TILE_WALL,
                        ModStoneBlocks.STONE_PLATES, Blocks.STONE_BRICKS, ModStoneBlocks.POLISHED_STONE, Blocks.STONE);
                // Mossy Stone Tiles + forms
                mossyBlockRecipe(ModStoneBlocks.MOSSY_STONE_TILES, ModStoneBlocks.STONE_TILES);
                craftBlockForms(
                        ModStoneBlocks.MOSSY_STONE_TILE_STAIRS, ModStoneBlocks.MOSSY_STONE_TILE_SLAB, ModStoneBlocks.MOSSY_STONE_TILE_WALL,
                        ModStoneBlocks.MOSSY_STONE_TILES);
                // Cracked Stone Tiles + forms
                crackedBlockRecipe(ModStoneBlocks.CRACKED_STONE_TILES, ModStoneBlocks.STONE_TILES);
                craftBlockForms(
                        ModStoneBlocks.CRACKED_STONE_TILE_STAIRS, ModStoneBlocks.CRACKED_STONE_TILE_SLAB, ModStoneBlocks.CRACKED_STONE_TILE_WALL,
                        ModStoneBlocks.CRACKED_STONE_TILES);

                // Stone Pillar + variants
                pillarRecipe(ModStoneBlocks.STONE_PILLAR, Blocks.STONE);
                mossyBlockRecipe(ModStoneBlocks.MOSSY_STONE_PILLAR, ModStoneBlocks.STONE_PILLAR);
                crackedBlockRecipe(ModStoneBlocks.CRACKED_STONE_PILLAR, ModStoneBlocks.STONE_PILLAR);

                // ============== GRANITE ==============

                // Cobbled Granite + forms — stonecutting from Granite
                stonecuttingRecipe(ModGraniteBlocks.COBBLED_GRANITE, Blocks.GRANITE);
                stonecuttingRecipe(ModGraniteBlocks.COBBLED_GRANITE_STAIRS, Blocks.GRANITE);
                stonecuttingSlabRecipe(ModGraniteBlocks.COBBLED_GRANITE_SLAB, Blocks.GRANITE);
                stonecuttingRecipe(ModGraniteBlocks.COBBLED_GRANITE_WALL, Blocks.GRANITE);

                // Chiseled Granite + variants
                chiseledBlockRecipe(ModGraniteBlocks.CHISELED_GRANITE, Blocks.GRANITE_SLAB, Blocks.GRANITE);
                mossyBlockRecipe(ModGraniteBlocks.MOSSY_CHISELED_GRANITE, ModGraniteBlocks.CHISELED_GRANITE);
                crackedBlockRecipe(ModGraniteBlocks.CRACKED_CHISELED_GRANITE, ModGraniteBlocks.CHISELED_GRANITE);

                // Cobbled Granite forms
                craftBlockForms(
                        ModGraniteBlocks.COBBLED_GRANITE_STAIRS, ModGraniteBlocks.COBBLED_GRANITE_SLAB, ModGraniteBlocks.COBBLED_GRANITE_WALL,
                        ModGraniteBlocks.COBBLED_GRANITE);
                // Mossy Cobbled Granite + forms
                mossyBlockRecipe(ModGraniteBlocks.MOSSY_COBBLED_GRANITE, ModGraniteBlocks.COBBLED_GRANITE);
                craftBlockForms(
                        ModGraniteBlocks.MOSSY_COBBLED_GRANITE_STAIRS, ModGraniteBlocks.MOSSY_COBBLED_GRANITE_SLAB, ModGraniteBlocks.MOSSY_COBBLED_GRANITE_WALL,
                        ModGraniteBlocks.MOSSY_COBBLED_GRANITE);

                // Smooth Granite + forms
                smoothBlockRecipe(ModGraniteBlocks.SMOOTH_GRANITE, Blocks.GRANITE);
                craftBlockForms(
                        ModGraniteBlocks.SMOOTH_GRANITE_STAIRS, ModGraniteBlocks.SMOOTH_GRANITE_SLAB, ModGraniteBlocks.SMOOTH_GRANITE_WALL,
                        ModGraniteBlocks.SMOOTH_GRANITE);

                // Polished Granite wall, pressure plate, button
                wallRecipe(ModGraniteBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
                pressurePlateRecipe(ModGraniteBlocks.POLISHED_GRANITE_PRESSURE_PLATE, Blocks.POLISHED_GRANITE);
                buttonRecipe(ModGraniteBlocks.POLISHED_GRANITE_BUTTON, Blocks.POLISHED_GRANITE);

                // Granite Bricks + forms
                craftBricksBlocks(ModGraniteBlocks.GRANITE_BRICKS,
                        ModGraniteBlocks.GRANITE_BRICK_STAIRS, ModGraniteBlocks.GRANITE_BRICK_SLAB, ModGraniteBlocks.GRANITE_BRICK_WALL,
                        Blocks.POLISHED_GRANITE, Blocks.GRANITE);
                chiseledBricksBlockRecipe(ModGraniteBlocks.CHISELED_GRANITE_BRICKS, ModGraniteBlocks.GRANITE_BRICK_SLAB,
                        ModGraniteBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE, Blocks.GRANITE);
                // Mossy Granite Bricks + forms
                mossyBlockRecipe(ModGraniteBlocks.MOSSY_GRANITE_BRICKS, ModGraniteBlocks.GRANITE_BRICKS);
                craftBlockForms(
                        ModGraniteBlocks.MOSSY_GRANITE_BRICK_STAIRS, ModGraniteBlocks.MOSSY_GRANITE_BRICK_SLAB, ModGraniteBlocks.MOSSY_GRANITE_BRICK_WALL,
                        ModGraniteBlocks.MOSSY_GRANITE_BRICKS);
                mossyBlockRecipe(ModGraniteBlocks.MOSSY_CHISELED_GRANITE_BRICKS, ModGraniteBlocks.CHISELED_GRANITE_BRICKS);
                // Cracked Granite Bricks + forms
                crackedBlockRecipe(ModGraniteBlocks.CRACKED_GRANITE_BRICKS, ModGraniteBlocks.GRANITE_BRICKS);
                craftBlockForms(
                        ModGraniteBlocks.CRACKED_GRANITE_BRICK_STAIRS, ModGraniteBlocks.CRACKED_GRANITE_BRICK_SLAB, ModGraniteBlocks.CRACKED_GRANITE_BRICK_WALL,
                        ModGraniteBlocks.CRACKED_GRANITE_BRICKS);
                crackedBlockRecipe(ModGraniteBlocks.CRACKED_CHISELED_GRANITE_BRICKS, ModGraniteBlocks.CHISELED_GRANITE_BRICKS);

                // Granite Plates + forms
                craftPlatesBlocks(ModGraniteBlocks.GRANITE_PLATES,
                        ModGraniteBlocks.GRANITE_PLATE_STAIRS, ModGraniteBlocks.GRANITE_PLATE_SLAB, ModGraniteBlocks.GRANITE_PLATE_WALL,
                        ModGraniteBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE, Blocks.GRANITE);
                // Mossy Granite Plates + forms
                mossyBlockRecipe(ModGraniteBlocks.MOSSY_GRANITE_PLATES, ModGraniteBlocks.GRANITE_PLATES);
                craftBlockForms(
                        ModGraniteBlocks.MOSSY_GRANITE_PLATE_STAIRS, ModGraniteBlocks.MOSSY_GRANITE_PLATE_SLAB, ModGraniteBlocks.MOSSY_GRANITE_PLATE_WALL,
                        ModGraniteBlocks.MOSSY_GRANITE_PLATES);
                // Cracked Granite Plates + forms
                crackedBlockRecipe(ModGraniteBlocks.CRACKED_GRANITE_PLATES, ModGraniteBlocks.GRANITE_PLATES);
                craftBlockForms(
                        ModGraniteBlocks.CRACKED_GRANITE_PLATE_STAIRS, ModGraniteBlocks.CRACKED_GRANITE_PLATE_SLAB, ModGraniteBlocks.CRACKED_GRANITE_PLATE_WALL,
                        ModGraniteBlocks.CRACKED_GRANITE_PLATES);

                // Granite Tiles + forms
                craftTilesBlocks(ModGraniteBlocks.GRANITE_TILES,
                        ModGraniteBlocks.GRANITE_TILE_STAIRS, ModGraniteBlocks.GRANITE_TILE_SLAB, ModGraniteBlocks.GRANITE_TILE_WALL,
                        ModGraniteBlocks.GRANITE_PLATES, ModGraniteBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE, Blocks.GRANITE);
                // Mossy Granite Tiles + forms
                mossyBlockRecipe(ModGraniteBlocks.MOSSY_GRANITE_TILES, ModGraniteBlocks.GRANITE_TILES);
                craftBlockForms(
                        ModGraniteBlocks.MOSSY_GRANITE_TILE_STAIRS, ModGraniteBlocks.MOSSY_GRANITE_TILE_SLAB, ModGraniteBlocks.MOSSY_GRANITE_TILE_WALL,
                        ModGraniteBlocks.MOSSY_GRANITE_TILES);
                // Cracked Granite Tiles + forms
                crackedBlockRecipe(ModGraniteBlocks.CRACKED_GRANITE_TILES, ModGraniteBlocks.GRANITE_TILES);
                craftBlockForms(
                        ModGraniteBlocks.CRACKED_GRANITE_TILE_STAIRS, ModGraniteBlocks.CRACKED_GRANITE_TILE_SLAB, ModGraniteBlocks.CRACKED_GRANITE_TILE_WALL,
                        ModGraniteBlocks.CRACKED_GRANITE_TILES);

                // Granite Pillar + variants
                pillarRecipe(ModGraniteBlocks.GRANITE_PILLAR, Blocks.GRANITE);
                mossyBlockRecipe(ModGraniteBlocks.MOSSY_GRANITE_PILLAR, ModGraniteBlocks.GRANITE_PILLAR);
                crackedBlockRecipe(ModGraniteBlocks.CRACKED_GRANITE_PILLAR,  ModGraniteBlocks.GRANITE_PILLAR);

                // ============== DIORITE ==============

                // Cobbled Diorite + forms — stonecutting from Diorite
                stonecuttingRecipe(ModDioriteBlocks.COBBLED_DIORITE, Blocks.DIORITE);
                stonecuttingRecipe(ModDioriteBlocks.COBBLED_DIORITE_STAIRS, Blocks.DIORITE);
                stonecuttingSlabRecipe(ModDioriteBlocks.COBBLED_DIORITE_SLAB, Blocks.DIORITE);
                stonecuttingRecipe(ModDioriteBlocks.COBBLED_DIORITE_WALL, Blocks.DIORITE);

                // Chiseled Diorite + variants
                chiseledBlockRecipe(ModDioriteBlocks.CHISELED_DIORITE, Blocks.DIORITE_SLAB, Blocks.DIORITE);
                mossyBlockRecipe(ModDioriteBlocks.MOSSY_CHISELED_DIORITE, ModDioriteBlocks.CHISELED_DIORITE);
                crackedBlockRecipe(ModDioriteBlocks.CRACKED_CHISELED_DIORITE, ModDioriteBlocks.CHISELED_DIORITE);

                // Cobbled Diorite forms
                craftBlockForms(
                        ModDioriteBlocks.COBBLED_DIORITE_STAIRS, ModDioriteBlocks.COBBLED_DIORITE_SLAB, ModDioriteBlocks.COBBLED_DIORITE_WALL,
                        ModDioriteBlocks.COBBLED_DIORITE);
                // Mossy Cobbled Diorite + forms
                mossyBlockRecipe(ModDioriteBlocks.MOSSY_COBBLED_DIORITE, ModDioriteBlocks.COBBLED_DIORITE);
                craftBlockForms(
                        ModDioriteBlocks.MOSSY_COBBLED_DIORITE_STAIRS, ModDioriteBlocks.MOSSY_COBBLED_DIORITE_SLAB, ModDioriteBlocks.MOSSY_COBBLED_DIORITE_WALL,
                        ModDioriteBlocks.MOSSY_COBBLED_DIORITE);

                // Smooth Diorite + forms
                smoothBlockRecipe(ModDioriteBlocks.SMOOTH_DIORITE, Blocks.DIORITE);
                craftBlockForms(
                        ModDioriteBlocks.SMOOTH_DIORITE_STAIRS, ModDioriteBlocks.SMOOTH_DIORITE_SLAB, ModDioriteBlocks.SMOOTH_DIORITE_WALL,
                        ModDioriteBlocks.SMOOTH_DIORITE);

                // Polished Diorite wall, pressure plate, button
                wallRecipe(ModDioriteBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
                pressurePlateRecipe(ModDioriteBlocks.POLISHED_DIORITE_PRESSURE_PLATE, Blocks.POLISHED_DIORITE);
                buttonRecipe(ModDioriteBlocks.POLISHED_DIORITE_BUTTON, Blocks.POLISHED_DIORITE);

                // Diorite Bricks + forms
                craftBricksBlocks(ModDioriteBlocks.DIORITE_BRICKS,
                        ModDioriteBlocks.DIORITE_BRICK_STAIRS, ModDioriteBlocks.DIORITE_BRICK_SLAB, ModDioriteBlocks.DIORITE_BRICK_WALL,
                        Blocks.POLISHED_DIORITE, Blocks.DIORITE);
                chiseledBricksBlockRecipe(ModDioriteBlocks.CHISELED_DIORITE_BRICKS, ModDioriteBlocks.DIORITE_BRICK_SLAB,
                        ModDioriteBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE, Blocks.DIORITE);
                // Mossy Diorite Bricks + forms
                mossyBlockRecipe(ModDioriteBlocks.MOSSY_DIORITE_BRICKS, ModDioriteBlocks.DIORITE_BRICKS);
                craftBlockForms(
                        ModDioriteBlocks.MOSSY_DIORITE_BRICK_STAIRS, ModDioriteBlocks.MOSSY_DIORITE_BRICK_SLAB, ModDioriteBlocks.MOSSY_DIORITE_BRICK_WALL,
                        ModDioriteBlocks.MOSSY_DIORITE_BRICKS);
                mossyBlockRecipe(ModDioriteBlocks.MOSSY_CHISELED_DIORITE_BRICKS, ModDioriteBlocks.CHISELED_DIORITE_BRICKS);
                // Cracked Diorite Bricks + forms
                crackedBlockRecipe(ModDioriteBlocks.CRACKED_DIORITE_BRICKS, ModDioriteBlocks.DIORITE_BRICKS);
                craftBlockForms(
                        ModDioriteBlocks.CRACKED_DIORITE_BRICK_STAIRS, ModDioriteBlocks.CRACKED_DIORITE_BRICK_SLAB, ModDioriteBlocks.CRACKED_DIORITE_BRICK_WALL,
                        ModDioriteBlocks.CRACKED_DIORITE_BRICKS);
                crackedBlockRecipe(ModDioriteBlocks.CRACKED_CHISELED_DIORITE_BRICKS, ModDioriteBlocks.CHISELED_DIORITE_BRICKS);

                // Diorite Plates + forms
                craftPlatesBlocks(ModDioriteBlocks.DIORITE_PLATES,
                        ModDioriteBlocks.DIORITE_PLATE_STAIRS, ModDioriteBlocks.DIORITE_PLATE_SLAB, ModDioriteBlocks.DIORITE_PLATE_WALL,
                        ModDioriteBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE, Blocks.DIORITE);
                // Mossy Diorite Plates + forms
                mossyBlockRecipe(ModDioriteBlocks.MOSSY_DIORITE_PLATES, ModDioriteBlocks.DIORITE_PLATES);
                craftBlockForms(
                        ModDioriteBlocks.MOSSY_DIORITE_PLATE_STAIRS, ModDioriteBlocks.MOSSY_DIORITE_PLATE_SLAB, ModDioriteBlocks.MOSSY_DIORITE_PLATE_WALL,
                        ModDioriteBlocks.MOSSY_DIORITE_PLATES);
                // Cracked Diorite Plates + forms
                crackedBlockRecipe(ModDioriteBlocks.CRACKED_DIORITE_PLATES, ModDioriteBlocks.DIORITE_PLATES);
                craftBlockForms(
                        ModDioriteBlocks.CRACKED_DIORITE_PLATE_STAIRS, ModDioriteBlocks.CRACKED_DIORITE_PLATE_SLAB, ModDioriteBlocks.CRACKED_DIORITE_PLATE_WALL,
                        ModDioriteBlocks.CRACKED_DIORITE_PLATES);

                // Diorite Tiles + forms
                craftTilesBlocks(ModDioriteBlocks.DIORITE_TILES,
                        ModDioriteBlocks.DIORITE_TILE_STAIRS, ModDioriteBlocks.DIORITE_TILE_SLAB, ModDioriteBlocks.DIORITE_TILE_WALL,
                        ModDioriteBlocks.DIORITE_PLATES, ModDioriteBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE,  Blocks.DIORITE);
                // Mossy Diorite Tiles + forms
                mossyBlockRecipe(ModDioriteBlocks.MOSSY_DIORITE_TILES, ModDioriteBlocks.DIORITE_TILES);
                craftBlockForms(
                        ModDioriteBlocks.MOSSY_DIORITE_TILE_STAIRS, ModDioriteBlocks.MOSSY_DIORITE_TILE_SLAB, ModDioriteBlocks.MOSSY_DIORITE_TILE_WALL,
                        ModDioriteBlocks.MOSSY_DIORITE_TILES);
                // Cracked Diorite Tiles + forms
                crackedBlockRecipe(ModDioriteBlocks.CRACKED_DIORITE_TILES, ModDioriteBlocks.DIORITE_TILES);
                craftBlockForms(
                        ModDioriteBlocks.CRACKED_DIORITE_TILE_STAIRS, ModDioriteBlocks.CRACKED_DIORITE_TILE_SLAB, ModDioriteBlocks.CRACKED_DIORITE_TILE_WALL,
                        ModDioriteBlocks.CRACKED_DIORITE_TILES);

                // Diorite Pillar + variants
                pillarRecipe(ModDioriteBlocks.DIORITE_PILLAR, Blocks.DIORITE);
                mossyBlockRecipe(ModDioriteBlocks.MOSSY_DIORITE_PILLAR, ModDioriteBlocks.DIORITE_PILLAR);
                crackedBlockRecipe(ModDioriteBlocks.CRACKED_DIORITE_PILLAR,  ModDioriteBlocks.DIORITE_PILLAR);

                // ============== ANDESITE ==============

                // Cobbled Andesite + forms — stonecutting from Andesite
                stonecuttingRecipe(ModAndesiteBlocks.COBBLED_ANDESITE, Blocks.ANDESITE);
                stonecuttingRecipe(ModAndesiteBlocks.COBBLED_ANDESITE_STAIRS, Blocks.ANDESITE);
                stonecuttingSlabRecipe(ModAndesiteBlocks.COBBLED_ANDESITE_SLAB, Blocks.ANDESITE);
                stonecuttingRecipe(ModAndesiteBlocks.COBBLED_ANDESITE_WALL, Blocks.ANDESITE);

                // Chiseled Andesite + variants
                chiseledBlockRecipe(ModAndesiteBlocks.CHISELED_ANDESITE, Blocks.ANDESITE_SLAB, Blocks.ANDESITE);
                mossyBlockRecipe(ModAndesiteBlocks.MOSSY_CHISELED_ANDESITE, ModAndesiteBlocks.CHISELED_ANDESITE);
                crackedBlockRecipe(ModAndesiteBlocks.CRACKED_CHISELED_ANDESITE, ModAndesiteBlocks.CHISELED_ANDESITE);

                // Cobbled Andesite forms
                craftBlockForms(
                        ModAndesiteBlocks.COBBLED_ANDESITE_STAIRS, ModAndesiteBlocks.COBBLED_ANDESITE_SLAB, ModAndesiteBlocks.COBBLED_ANDESITE_WALL,
                        ModAndesiteBlocks.COBBLED_ANDESITE);
                // Mossy Cobbled Andesite + forms
                mossyBlockRecipe(ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE, ModAndesiteBlocks.COBBLED_ANDESITE);
                craftBlockForms(
                        ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_STAIRS, ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_SLAB, ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE_WALL,
                        ModAndesiteBlocks.MOSSY_COBBLED_ANDESITE);

                // Smooth Andesite + forms
                smoothBlockRecipe(ModAndesiteBlocks.SMOOTH_ANDESITE, Blocks.ANDESITE);
                craftBlockForms(
                        ModAndesiteBlocks.SMOOTH_ANDESITE_STAIRS, ModAndesiteBlocks.SMOOTH_ANDESITE_SLAB, ModAndesiteBlocks.SMOOTH_ANDESITE_WALL,
                        ModAndesiteBlocks.SMOOTH_ANDESITE);

                // Polished Andesite wall, pressure plate, button
                wallRecipe(ModAndesiteBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
                pressurePlateRecipe(ModAndesiteBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, Blocks.POLISHED_ANDESITE);
                buttonRecipe(ModAndesiteBlocks.POLISHED_ANDESITE_BUTTON, Blocks.POLISHED_ANDESITE);

                // Andesite Bricks + forms
                craftBricksBlocks(ModAndesiteBlocks.ANDESITE_BRICKS,
                        ModAndesiteBlocks.ANDESITE_BRICK_STAIRS, ModAndesiteBlocks.ANDESITE_BRICK_SLAB, ModAndesiteBlocks.ANDESITE_BRICK_WALL,
                        Blocks.POLISHED_ANDESITE, Blocks.ANDESITE);
                chiseledBricksBlockRecipe(ModAndesiteBlocks.CHISELED_ANDESITE_BRICKS, ModAndesiteBlocks.ANDESITE_BRICK_SLAB,
                        ModAndesiteBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE, Blocks.ANDESITE);
                // Mossy Andesite Bricks + forms
                mossyBlockRecipe(ModAndesiteBlocks.MOSSY_ANDESITE_BRICKS, ModAndesiteBlocks.ANDESITE_BRICKS);
                craftBlockForms(
                        ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_STAIRS, ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_SLAB, ModAndesiteBlocks.MOSSY_ANDESITE_BRICK_WALL,
                        ModAndesiteBlocks.MOSSY_ANDESITE_BRICKS);
                mossyBlockRecipe(ModAndesiteBlocks.MOSSY_CHISELED_ANDESITE_BRICKS, ModAndesiteBlocks.CHISELED_ANDESITE_BRICKS);
                // Cracked Andesite Bricks + forms
                crackedBlockRecipe(ModAndesiteBlocks.CRACKED_ANDESITE_BRICKS, ModAndesiteBlocks.ANDESITE_BRICKS);
                craftBlockForms(
                        ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_STAIRS, ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_SLAB, ModAndesiteBlocks.CRACKED_ANDESITE_BRICK_WALL,
                        ModAndesiteBlocks.CRACKED_ANDESITE_BRICKS);
                crackedBlockRecipe(ModAndesiteBlocks.CRACKED_CHISELED_ANDESITE_BRICKS, ModAndesiteBlocks.CHISELED_ANDESITE_BRICKS);

                // Andesite Plates + forms
                craftPlatesBlocks(ModAndesiteBlocks.ANDESITE_PLATES,
                        ModAndesiteBlocks.ANDESITE_PLATE_STAIRS, ModAndesiteBlocks.ANDESITE_PLATE_SLAB, ModAndesiteBlocks.ANDESITE_PLATE_WALL,
                        ModAndesiteBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE, Blocks.ANDESITE);
                // Mossy Andesite Plates + forms
                mossyBlockRecipe(ModAndesiteBlocks.MOSSY_ANDESITE_PLATES, ModAndesiteBlocks.ANDESITE_PLATES);
                craftBlockForms(
                        ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_STAIRS, ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_SLAB, ModAndesiteBlocks.MOSSY_ANDESITE_PLATE_WALL,
                        ModAndesiteBlocks.MOSSY_ANDESITE_PLATES);
                // Cracked Andesite Plates + forms
                crackedBlockRecipe(ModAndesiteBlocks.CRACKED_ANDESITE_PLATES, ModAndesiteBlocks.ANDESITE_PLATES);
                craftBlockForms(
                        ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_STAIRS, ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_SLAB, ModAndesiteBlocks.CRACKED_ANDESITE_PLATE_WALL,
                        ModAndesiteBlocks.CRACKED_ANDESITE_PLATES);

                // Andesite Tiles + forms
                craftTilesBlocks(ModAndesiteBlocks.ANDESITE_TILES,
                        ModAndesiteBlocks.ANDESITE_TILE_STAIRS, ModAndesiteBlocks.ANDESITE_TILE_SLAB, ModAndesiteBlocks.ANDESITE_TILE_WALL,
                        ModAndesiteBlocks.ANDESITE_PLATES, ModAndesiteBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE,  Blocks.ANDESITE);
                // Mossy Andesite Tiles + forms
                mossyBlockRecipe(ModAndesiteBlocks.MOSSY_ANDESITE_TILES, ModAndesiteBlocks.ANDESITE_TILES);
                craftBlockForms(
                        ModAndesiteBlocks.MOSSY_ANDESITE_TILE_STAIRS, ModAndesiteBlocks.MOSSY_ANDESITE_TILE_SLAB, ModAndesiteBlocks.MOSSY_ANDESITE_TILE_WALL,
                        ModAndesiteBlocks.MOSSY_ANDESITE_TILES);
                // Cracked Andesite Tiles + forms
                crackedBlockRecipe(ModAndesiteBlocks.CRACKED_ANDESITE_TILES, ModAndesiteBlocks.ANDESITE_TILES);
                craftBlockForms(
                        ModAndesiteBlocks.CRACKED_ANDESITE_TILE_STAIRS, ModAndesiteBlocks.CRACKED_ANDESITE_TILE_SLAB, ModAndesiteBlocks.CRACKED_ANDESITE_TILE_WALL,
                        ModAndesiteBlocks.CRACKED_ANDESITE_TILES);

                // Andesite Pillar + variants
                pillarRecipe(ModAndesiteBlocks.ANDESITE_PILLAR, Blocks.ANDESITE);
                mossyBlockRecipe(ModAndesiteBlocks.MOSSY_ANDESITE_PILLAR, ModAndesiteBlocks.ANDESITE_PILLAR);
                crackedBlockRecipe(ModAndesiteBlocks.CRACKED_ANDESITE_PILLAR,  ModAndesiteBlocks.ANDESITE_PILLAR);

                // ============== DEEPSLATE ==============

                // Cobbled Deepslate + forms — stonecutting from Deepslate
                stonecuttingRecipe(Blocks.COBBLED_DEEPSLATE,  Blocks.DEEPSLATE);
                stonecuttingRecipe(Blocks.COBBLED_DEEPSLATE_STAIRS,  Blocks.DEEPSLATE);
                stonecuttingSlabRecipe(Blocks.COBBLED_DEEPSLATE_SLAB,  Blocks.DEEPSLATE);
                stonecuttingRecipe(Blocks.COBBLED_DEEPSLATE_WALL,  Blocks.DEEPSLATE);

                // Deepslate forms
                craftBlockForms(
                        ModDeepslateBlocks.DEEPSLATE_STAIRS, ModDeepslateBlocks.DEEPSLATE_SLAB, ModDeepslateBlocks.DEEPSLATE_WALL,
                        Blocks.DEEPSLATE);

                // Chiseled Deepslate — stonecutting from Deepslate
                stonecuttingRecipe(Blocks.CHISELED_DEEPSLATE, Blocks.DEEPSLATE);
                // Mossy Chiseled Deepslate
                mossyBlockRecipe(ModDeepslateBlocks.MOSSY_CHISELED_DEEPSLATE, Blocks.CHISELED_DEEPSLATE);
                // Cracked Chiseled Deepslate
                crackedBlockRecipe(ModDeepslateBlocks.CRACKED_CHISELED_DEEPSLATE, Blocks.CHISELED_DEEPSLATE);

                // Mossy Cobbled Deepslate + forms
                mossyBlockRecipe(ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE);
                craftBlockForms(
                        ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS, ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB, ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE_WALL,
                        ModDeepslateBlocks.MOSSY_COBBLED_DEEPSLATE);

                // Smooth Deepslate + forms
                smoothBlockRecipe(ModDeepslateBlocks.SMOOTH_DEEPSLATE, Blocks.DEEPSLATE);
                craftBlockForms(
                        ModDeepslateBlocks.SMOOTH_DEEPSLATE_STAIRS, ModDeepslateBlocks.SMOOTH_DEEPSLATE_SLAB, ModDeepslateBlocks.SMOOTH_DEEPSLATE_WALL,
                        ModDeepslateBlocks.SMOOTH_DEEPSLATE);

                // Polished Deepslate + forms — stonecutting from Deepslate
                stonecuttingRecipe(Blocks.POLISHED_DEEPSLATE, Blocks.DEEPSLATE);
                stonecuttingRecipe(Blocks.POLISHED_DEEPSLATE_STAIRS, Blocks.DEEPSLATE);
                stonecuttingSlabRecipe(Blocks.POLISHED_DEEPSLATE_SLAB, Blocks.DEEPSLATE);
                stonecuttingRecipe(Blocks.POLISHED_DEEPSLATE_WALL, Blocks.DEEPSLATE);

                // Polished Deepslate Pressure Plate and Button
                pressurePlateRecipe(ModDeepslateBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Blocks.POLISHED_DEEPSLATE);
                buttonRecipe(ModDeepslateBlocks.POLISHED_DEEPSLATE_BUTTON, Blocks.POLISHED_DEEPSLATE);

                // Deepslate Bricks + forms — stonecutting from Deepslate
                stonecuttingRecipe(Blocks.DEEPSLATE_BRICKS, Blocks.DEEPSLATE);
                stonecuttingRecipe(Blocks.DEEPSLATE_BRICK_STAIRS, Blocks.DEEPSLATE);
                stonecuttingSlabRecipe(Blocks.DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE);
                stonecuttingRecipe(Blocks.DEEPSLATE_BRICK_WALL, Blocks.DEEPSLATE);
                // Chiseled Deepslate Bricks
                chiseledBlockRecipe(ModDeepslateBlocks.CHISELED_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE_BRICKS);
                // Mossy Deepslate Bricks + forms
                mossyBlockRecipe(ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS);
                craftBlockForms(
                        ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICK_WALL,
                        ModDeepslateBlocks.MOSSY_DEEPSLATE_BRICKS);
                mossyBlockRecipe(ModDeepslateBlocks.MOSSY_CHISELED_DEEPSLATE_BRICKS, ModDeepslateBlocks.CHISELED_DEEPSLATE_BRICKS);
                // Cracked Deepslate Bricks forms
                craftBlockForms(
                        ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, ModDeepslateBlocks.CRACKED_DEEPSLATE_BRICK_WALL,
                        Blocks.CRACKED_DEEPSLATE_BRICKS);
                crackedBlockRecipe(ModDeepslateBlocks.CRACKED_CHISELED_DEEPSLATE_BRICKS, ModDeepslateBlocks.CHISELED_DEEPSLATE_BRICKS);

                // Deepslate Plates + forms
                craftPlatesBlocks(ModDeepslateBlocks.DEEPSLATE_PLATES,
                        ModDeepslateBlocks.DEEPSLATE_PLATE_STAIRS, ModDeepslateBlocks.DEEPSLATE_PLATE_SLAB, ModDeepslateBlocks.DEEPSLATE_PLATE_WALL,
                        Blocks.DEEPSLATE_BRICKS, Blocks.POLISHED_DEEPSLATE, Blocks.DEEPSLATE);
                // Mossy Deepslate Plates + forms
                mossyBlockRecipe(ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATES, ModDeepslateBlocks.DEEPSLATE_PLATES);
                craftBlockForms(
                        ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_STAIRS, ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_SLAB, ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATE_WALL,
                        ModDeepslateBlocks.MOSSY_DEEPSLATE_PLATES);
                // Cracked Deepslate Plates + forms
                crackedBlockRecipe(ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATES, ModDeepslateBlocks.DEEPSLATE_PLATES);
                craftBlockForms(
                        ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_STAIRS, ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_SLAB, ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATE_WALL,
                        ModDeepslateBlocks.CRACKED_DEEPSLATE_PLATES);

                // Deepslate Tiles + forms — stonecutting from Deepslate
                stonecuttingRecipe(Blocks.DEEPSLATE_TILES, Blocks.DEEPSLATE);
                stonecuttingRecipe(Blocks.DEEPSLATE_TILE_STAIRS, Blocks.DEEPSLATE);
                stonecuttingSlabRecipe(Blocks.DEEPSLATE_TILE_SLAB, Blocks.DEEPSLATE);
                stonecuttingRecipe(Blocks.DEEPSLATE_TILE_WALL, Blocks.DEEPSLATE);
                // Mossy Deepslate Tiles + forms
                mossyBlockRecipe(ModDeepslateBlocks.MOSSY_DEEPSLATE_TILES, Blocks.DEEPSLATE_TILES);
                craftBlockForms(
                        ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_STAIRS, ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_SLAB, ModDeepslateBlocks.MOSSY_DEEPSLATE_TILE_WALL,
                        ModDeepslateBlocks.MOSSY_DEEPSLATE_TILES);
                // Cracked Deepslate Tiles forms
                craftBlockForms(
                        ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_SLAB, ModDeepslateBlocks.CRACKED_DEEPSLATE_TILE_WALL,
                        Blocks.CRACKED_DEEPSLATE_TILES);

                // Deepslate Pillar + variants
                pillarRecipe(ModDeepslateBlocks.DEEPSLATE_PILLAR, Blocks.DEEPSLATE);
                mossyBlockRecipe(ModDeepslateBlocks.MOSSY_DEEPSLATE_PILLAR, ModDeepslateBlocks.DEEPSLATE_PILLAR);
                crackedBlockRecipe(ModDeepslateBlocks.CRACKED_DEEPSLATE_PILLAR, ModDeepslateBlocks.DEEPSLATE_PILLAR);
            }

            public void craftBlockForms(ItemConvertible stairs, ItemConvertible slab, ItemConvertible wall, ItemConvertible input) {
                stairsRecipe(stairs, input);

                slabRecipe(slab, input);

                wallRecipe(wall, input);
            }

            public void polishedBlockRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RC, output, 4)
                        .pattern("##")
                        .pattern("##")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                stonecuttingRecipe(output, input);
            }

            public void craftPolishedBlocks(ItemConvertible block, ItemConvertible stairs, ItemConvertible slab, ItemConvertible wall, ItemConvertible baseBlock) {
                polishedBlockRecipe(block, baseBlock);

                stairsRecipe(stairs, block);
                stonecuttingRecipe(stairs, baseBlock);

                slabRecipe(slab, block);
                stonecuttingSlabRecipe(slab, baseBlock);

                wallRecipe(wall, block);
                stonecuttingRecipe(wall, baseBlock);
            }

            public void bricksBlockRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible baseBlock) {
                createShaped(RC, output, 4)
                        .pattern("##")
                        .pattern("##")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                stonecuttingRecipe(output, input);
                stonecuttingRecipe(output, baseBlock);
            }

            public void craftBricksBlocks(ItemConvertible block, ItemConvertible stairs, ItemConvertible slab, ItemConvertible wall, ItemConvertible polishedBlock, ItemConvertible baseBlock) {
                bricksBlockRecipe(block, polishedBlock, baseBlock);

                stairsRecipe(stairs, block);
                stonecuttingRecipe(stairs, polishedBlock);
                stonecuttingRecipe(stairs, baseBlock);

                slabRecipe(slab, block);
                stonecuttingSlabRecipe(slab, polishedBlock);
                stonecuttingSlabRecipe(slab, baseBlock);

                wallRecipe(wall, block);
                stonecuttingRecipe(wall, polishedBlock);
                stonecuttingRecipe(wall, baseBlock);
            }

            public void platesBlockRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible polishedBlock, ItemConvertible baseBlock) {
                createShaped(RC, output, 4)
                        .pattern("##")
                        .pattern("##")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                stonecuttingRecipe(output, input);
                stonecuttingRecipe(output, polishedBlock);
                stonecuttingRecipe(output, baseBlock);
            }

            public void craftPlatesBlocks(ItemConvertible block, ItemConvertible stairs, ItemConvertible slab, ItemConvertible wall, ItemConvertible bricksBlock, ItemConvertible polishedBlock, ItemConvertible baseBlock) {
                platesBlockRecipe(block, bricksBlock, polishedBlock, baseBlock);

                stairsRecipe(stairs, block);
                stonecuttingRecipe(stairs, bricksBlock);
                stonecuttingRecipe(stairs, polishedBlock);
                stonecuttingRecipe(stairs, baseBlock);

                slabRecipe(slab, block);
                stonecuttingSlabRecipe(slab, bricksBlock);
                stonecuttingSlabRecipe(slab, polishedBlock);
                stonecuttingSlabRecipe(slab, baseBlock);

                wallRecipe(wall, block);
                stonecuttingRecipe(wall, bricksBlock);
                stonecuttingRecipe(wall, polishedBlock);
                stonecuttingRecipe(wall, baseBlock);
            }

            public void tilesBlockRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible bricksBlock, ItemConvertible polishedBlock, ItemConvertible baseBlock) {
                createShaped(RC, output, 4)
                        .pattern("##")
                        .pattern("##")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                stonecuttingRecipe(output, input);
                stonecuttingRecipe(output, bricksBlock);
                stonecuttingRecipe(output, polishedBlock);
                stonecuttingRecipe(output, baseBlock);
            }

            public void craftTilesBlocks(ItemConvertible block, ItemConvertible stairs, ItemConvertible slab, ItemConvertible wall, ItemConvertible platesBlock, ItemConvertible bricksBlock, ItemConvertible polishedBlock, ItemConvertible baseBlock) {
                tilesBlockRecipe(block, platesBlock, bricksBlock, polishedBlock, baseBlock);

                stairsRecipe(stairs, block);
                stonecuttingRecipe(stairs, platesBlock);
                stonecuttingRecipe(stairs, bricksBlock);
                stonecuttingRecipe(stairs, polishedBlock);
                stonecuttingRecipe(stairs, baseBlock);

                slabRecipe(slab, block);
                stonecuttingSlabRecipe(slab, platesBlock);
                stonecuttingSlabRecipe(slab, bricksBlock);
                stonecuttingSlabRecipe(slab, polishedBlock);
                stonecuttingSlabRecipe(slab, baseBlock);

                wallRecipe(wall, block);
                stonecuttingRecipe(wall, platesBlock);
                stonecuttingRecipe(wall, bricksBlock);
                stonecuttingRecipe(wall, polishedBlock);
                stonecuttingRecipe(wall, baseBlock);
            }

            public void stonecuttingRecipe(ItemConvertible output, ItemConvertible input) {
                offerStonecuttingRecipe(RC, output, input);
            }

            public void stonecuttingRecipe(ItemConvertible output, ItemConvertible input, int count) {
                offerStonecuttingRecipe(RC, output, input, count);
            }

            public void stonecuttingSlabRecipe(ItemConvertible output, ItemConvertible input) {
                offerStonecuttingRecipe(RC, output, input, 2);
            }

            public void smoothBlockRecipe(ItemConvertible output, ItemConvertible input) {
                offerCrackingRecipe(output, input);
            }

            public void mossyBlockRecipe(ItemConvertible output, ItemConvertible input) {
                Item outputItem = output.asItem();

                Identifier outputId = Registries.ITEM.getId(outputItem);
                String basePath = outputId.getPath();

                createShapeless(RC, output)
                        .input(input)
                        .input(Items.VINE)
                        .group(basePath)
                        .criterion(hasItem(Items.VINE), conditionsFromItem(Items.VINE))
                        .offerTo(exporter, basePath + "_from_vine");

                createShapeless(RC, output)
                        .input(input)
                        .input(Blocks.MOSS_BLOCK)
                        .group(basePath)
                        .criterion(hasItem(Blocks.MOSS_BLOCK), conditionsFromItem(Blocks.MOSS_BLOCK))
                        .offerTo(exporter, basePath + "_from_moss_block");
            }

            public void crackedBlockRecipe(ItemConvertible output, ItemConvertible input) {
                offerCrackingRecipe(output, input);
            }

            public void chiseledBlockRecipe(ItemConvertible output, ItemConvertible inputSlab, ItemConvertible inputBlock) {
                offerChiseledBlockRecipe(RC, output, inputSlab);
                stonecuttingRecipe(output, inputBlock);
            }

            public void chiseledBricksBlockRecipe(ItemConvertible output, ItemConvertible inputSlab, ItemConvertible inputBlock, ItemConvertible polishedBlock, ItemConvertible baseBlock) {
                offerChiseledBlockRecipe(RC, output, inputSlab);
                stonecuttingRecipe(output, inputBlock);
                stonecuttingRecipe(output, polishedBlock);
                stonecuttingRecipe(output, baseBlock);
            }

            public void pillarRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RC, output, 2)
                        .pattern("#")
                        .pattern("#")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                stonecuttingRecipe(output, input);
            }

            public void stairsRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RC, output, 4)
                        .input('#', input)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                stonecuttingRecipe(output, input);
            }

            public void slabRecipe(ItemConvertible output, ItemConvertible input) {
                createSlabRecipe(RC, output, Ingredient.ofItem(input))
                    .criterion(hasItem(input), conditionsFromItem(input))
                    .offerTo(exporter);

                stonecuttingSlabRecipe(output, input);
            }

            public void wallRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RC, output, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                stonecuttingRecipe(output, input);
            }

            public void pressurePlateRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.REDSTONE, output)
                        .input('#', input)
                        .pattern("##")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            public void buttonRecipe(ItemConvertible output, ItemConvertible input) {
                createShapeless(RecipeCategory.REDSTONE, output)
                        .input(input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Blocksistency Recipes";
    }
}
