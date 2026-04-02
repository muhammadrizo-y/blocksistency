package net.muhammadrizo.blocksistency.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.CookingRecipeJsonBuilder;
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
import net.muhammadrizo.blocksistency.item.ModItems;

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
                stonecuttingRecipe(Blocks.CHISELED_STONE_BRICKS, ModStoneBlocks.POLISHED_STONE);

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
                pillarBlockRecipe(ModStoneBlocks.STONE_PILLAR, Blocks.STONE);
                mossyBlockRecipe(ModStoneBlocks.MOSSY_STONE_PILLAR, ModStoneBlocks.STONE_PILLAR);
                crackedBlockRecipe(ModStoneBlocks.CRACKED_STONE_PILLAR, ModStoneBlocks.STONE_PILLAR);

                // ============== GRANITE ==============

                smeltIntoBaseRecipe(Blocks.GRANITE, ModGraniteBlocks.COBBLED_GRANITE);

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
                pillarBlockRecipe(ModGraniteBlocks.GRANITE_PILLAR, Blocks.GRANITE);
                mossyBlockRecipe(ModGraniteBlocks.MOSSY_GRANITE_PILLAR, ModGraniteBlocks.GRANITE_PILLAR);
                crackedBlockRecipe(ModGraniteBlocks.CRACKED_GRANITE_PILLAR,  ModGraniteBlocks.GRANITE_PILLAR);

                // ============== DIORITE ==============

                smeltIntoBaseRecipe(Blocks.DIORITE, ModDioriteBlocks.COBBLED_DIORITE);

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
                pillarBlockRecipe(ModDioriteBlocks.DIORITE_PILLAR, Blocks.DIORITE);
                mossyBlockRecipe(ModDioriteBlocks.MOSSY_DIORITE_PILLAR, ModDioriteBlocks.DIORITE_PILLAR);
                crackedBlockRecipe(ModDioriteBlocks.CRACKED_DIORITE_PILLAR,  ModDioriteBlocks.DIORITE_PILLAR);

                // ============== ANDESITE ==============

                smeltIntoBaseRecipe(Blocks.ANDESITE, ModAndesiteBlocks.COBBLED_ANDESITE);

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
                pillarBlockRecipe(ModAndesiteBlocks.ANDESITE_PILLAR, Blocks.ANDESITE);
                mossyBlockRecipe(ModAndesiteBlocks.MOSSY_ANDESITE_PILLAR, ModAndesiteBlocks.ANDESITE_PILLAR);
                crackedBlockRecipe(ModAndesiteBlocks.CRACKED_ANDESITE_PILLAR,  ModAndesiteBlocks.ANDESITE_PILLAR);

                // ============== DEEPSLATE ==============

                // Cobbled Deepslate + forms — stonecutting from Deepslate
                stonecuttingRecipe(Blocks.COBBLED_DEEPSLATE, Blocks.DEEPSLATE);
                stonecuttingRecipe(Blocks.COBBLED_DEEPSLATE_STAIRS, Blocks.DEEPSLATE);
                stonecuttingSlabRecipe(Blocks.COBBLED_DEEPSLATE_SLAB, Blocks.DEEPSLATE);
                stonecuttingRecipe(Blocks.COBBLED_DEEPSLATE_WALL, Blocks.DEEPSLATE);

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
                chiseledBricksBlockRecipe(ModDeepslateBlocks.CHISELED_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICK_SLAB,
                        Blocks.DEEPSLATE_BRICKS, Blocks.POLISHED_DEEPSLATE, Blocks.DEEPSLATE);
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
                pillarBlockRecipe(ModDeepslateBlocks.DEEPSLATE_PILLAR, Blocks.DEEPSLATE);
                mossyBlockRecipe(ModDeepslateBlocks.MOSSY_DEEPSLATE_PILLAR, ModDeepslateBlocks.DEEPSLATE_PILLAR);
                crackedBlockRecipe(ModDeepslateBlocks.CRACKED_DEEPSLATE_PILLAR, ModDeepslateBlocks.DEEPSLATE_PILLAR);

                // ============== BRICKS ==============

                chiseledBlockRecipe(ModBricksBlocks.CHISELED_BRICKS, Blocks.BRICK_SLAB, Blocks.BRICKS);

                mossyBlockRecipe(ModBricksBlocks.MOSSY_BRICKS, Blocks.BRICKS);
                craftBlockForms(
                        ModBricksBlocks.MOSSY_BRICK_STAIRS, ModBricksBlocks.MOSSY_BRICK_SLAB, ModBricksBlocks.MOSSY_BRICK_WALL,
                        ModBricksBlocks.MOSSY_BRICKS);
                mossyBlockRecipe(ModBricksBlocks.MOSSY_CHISELED_BRICKS, ModBricksBlocks.CHISELED_BRICKS);

                crackedBlockRecipe(ModBricksBlocks.CRACKED_BRICKS, Blocks.BRICKS);
                craftBlockForms(
                        ModBricksBlocks.CRACKED_BRICK_STAIRS, ModBricksBlocks.CRACKED_BRICK_SLAB, ModBricksBlocks.CRACKED_BRICK_WALL,
                        ModBricksBlocks.CRACKED_BRICKS);
                crackedBlockRecipe(ModBricksBlocks.CRACKED_CHISELED_BRICKS, ModBricksBlocks.CHISELED_BRICKS);

                // ============== SANDSTONE ==============

                smeltIntoBaseRecipe(Blocks.SANDSTONE, ModSandstoneBlocks.COBBLED_SANDSTONE);

                crackedBlockRecipe(ModSandstoneBlocks.CRACKED_CHISELED_SANDSTONE, Blocks.CHISELED_SANDSTONE);

                // Cobbled Sandstone + forms — stonecutting from Sandstone
                stonecuttingRecipe(ModSandstoneBlocks.COBBLED_SANDSTONE, Blocks.SANDSTONE);
                stonecuttingRecipe(ModSandstoneBlocks.COBBLED_SANDSTONE_STAIRS, Blocks.SANDSTONE);
                stonecuttingSlabRecipe(ModSandstoneBlocks.COBBLED_SANDSTONE_SLAB, Blocks.SANDSTONE);
                stonecuttingRecipe(ModSandstoneBlocks.COBBLED_SANDSTONE_WALL, Blocks.SANDSTONE);

                // Cobbled Sandstone forms
                craftBlockForms(
                        ModSandstoneBlocks.COBBLED_SANDSTONE_STAIRS, ModSandstoneBlocks.COBBLED_SANDSTONE_SLAB, ModSandstoneBlocks.COBBLED_SANDSTONE_WALL,
                        ModSandstoneBlocks.COBBLED_SANDSTONE);

                wallRecipe(ModSandstoneBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);

                // Cut Sandstone stairs, wall  — stonecutting from Sandstone
                stonecuttingRecipe(ModSandstoneBlocks.CUT_SANDSTONE_STAIRS, Blocks.SANDSTONE);
                stonecuttingRecipe(ModSandstoneBlocks.CUT_SANDSTONE_WALL, Blocks.SANDSTONE);

                stairsRecipe(ModSandstoneBlocks.CUT_SANDSTONE_STAIRS, Blocks.CUT_SANDSTONE);
                wallRecipe(ModSandstoneBlocks.CUT_SANDSTONE_WALL, Blocks.CUT_SANDSTONE);

                craftPolishedBlocks(ModSandstoneBlocks.POLISHED_SANDSTONE,
                        ModSandstoneBlocks.POLISHED_SANDSTONE_STAIRS, ModSandstoneBlocks.POLISHED_SANDSTONE_SLAB, ModSandstoneBlocks.POLISHED_SANDSTONE_WALL,
                        Blocks.CUT_SANDSTONE, Blocks.SANDSTONE);
                pressurePlateRecipe(ModSandstoneBlocks.POLISHED_SANDSTONE_PRESSURE_PLATE, ModSandstoneBlocks.POLISHED_SANDSTONE);
                buttonRecipe(ModSandstoneBlocks.POLISHED_SANDSTONE_BUTTON, ModSandstoneBlocks.POLISHED_SANDSTONE);

                craftBricksBlocks(ModSandstoneBlocks.SANDSTONE_BRICKS,
                        ModSandstoneBlocks.SANDSTONE_BRICK_STAIRS, ModSandstoneBlocks.SANDSTONE_BRICK_SLAB, ModSandstoneBlocks.SANDSTONE_BRICK_WALL,
                        ModSandstoneBlocks.POLISHED_SANDSTONE, Blocks.CUT_SANDSTONE, Blocks.SANDSTONE);
                chiseledBricksBlockRecipe(ModSandstoneBlocks.CHISELED_SANDSTONE_BRICKS, ModSandstoneBlocks.SANDSTONE_BRICK_SLAB,
                        ModSandstoneBlocks.SANDSTONE_BRICKS, ModSandstoneBlocks.POLISHED_SANDSTONE, Blocks.CUT_SANDSTONE, Blocks.SANDSTONE);

                crackedBlockRecipe(ModSandstoneBlocks.CRACKED_SANDSTONE_BRICKS, ModSandstoneBlocks.SANDSTONE_BRICKS);
                craftBlockForms(
                        ModSandstoneBlocks.CRACKED_SANDSTONE_BRICK_STAIRS, ModSandstoneBlocks.CRACKED_SANDSTONE_BRICK_SLAB, ModSandstoneBlocks.CRACKED_SANDSTONE_BRICK_WALL,
                        ModSandstoneBlocks.CRACKED_SANDSTONE_BRICKS);
                crackedBlockRecipe(ModSandstoneBlocks.CRACKED_CHISELED_SANDSTONE_BRICKS, ModSandstoneBlocks.CHISELED_SANDSTONE_BRICKS);

                craftPlatesBlocks(ModSandstoneBlocks.SANDSTONE_PLATES,
                        ModSandstoneBlocks.SANDSTONE_PLATE_STAIRS, ModSandstoneBlocks.SANDSTONE_PLATE_SLAB, ModSandstoneBlocks.SANDSTONE_PLATE_WALL,
                        ModSandstoneBlocks.SANDSTONE_BRICKS, ModSandstoneBlocks.POLISHED_SANDSTONE, Blocks.CUT_SANDSTONE, Blocks.SANDSTONE);

                crackedBlockRecipe(ModSandstoneBlocks.CRACKED_SANDSTONE_PLATES, ModSandstoneBlocks.SANDSTONE_PLATES);
                craftBlockForms(
                        ModSandstoneBlocks.CRACKED_SANDSTONE_PLATE_STAIRS, ModSandstoneBlocks.CRACKED_SANDSTONE_PLATE_SLAB, ModSandstoneBlocks.CRACKED_SANDSTONE_PLATE_WALL,
                        ModSandstoneBlocks.CRACKED_SANDSTONE_PLATES);

                craftTilesBlocks(ModSandstoneBlocks.SANDSTONE_TILES,
                        ModSandstoneBlocks.SANDSTONE_TILE_STAIRS, ModSandstoneBlocks.SANDSTONE_TILE_SLAB, ModSandstoneBlocks.SANDSTONE_TILE_WALL,
                        ModSandstoneBlocks.SANDSTONE_PLATES, ModSandstoneBlocks.SANDSTONE_BRICKS, ModSandstoneBlocks.POLISHED_SANDSTONE, Blocks.CUT_SANDSTONE, Blocks.SANDSTONE);

                crackedBlockRecipe(ModSandstoneBlocks.CRACKED_SANDSTONE_TILES, ModSandstoneBlocks.SANDSTONE_TILES);
                craftBlockForms(
                        ModSandstoneBlocks.CRACKED_SANDSTONE_TILE_STAIRS, ModSandstoneBlocks.CRACKED_SANDSTONE_TILE_SLAB, ModSandstoneBlocks.CRACKED_SANDSTONE_TILE_WALL,
                        ModSandstoneBlocks.CRACKED_SANDSTONE_TILES);

                pillarBlockRecipe(ModSandstoneBlocks.SANDSTONE_PILLAR, Blocks.SANDSTONE);
                crackedBlockRecipe(ModSandstoneBlocks.CRACKED_SANDSTONE_PILLAR, ModSandstoneBlocks.SANDSTONE_PILLAR);

                // ============== RED SANDSTONE ==============

                smeltIntoBaseRecipe(Blocks.RED_SANDSTONE, ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE);

                crackedBlockRecipe(ModRedSandstoneBlocks.CRACKED_CHISELED_RED_SANDSTONE, Blocks.CHISELED_RED_SANDSTONE);

                // Cobbled Red Sandstone + forms — stonecutting from Red Sandstone
                stonecuttingRecipe(ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE, Blocks.RED_SANDSTONE);
                stonecuttingRecipe(ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE_STAIRS, Blocks.RED_SANDSTONE);
                stonecuttingSlabRecipe(ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE_SLAB, Blocks.RED_SANDSTONE);
                stonecuttingRecipe(ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE_WALL, Blocks.RED_SANDSTONE);

                // Cobbled Red Sandstone forms
                craftBlockForms(
                        ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE_STAIRS, ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE_SLAB, ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE_WALL,
                        ModRedSandstoneBlocks.COBBLED_RED_SANDSTONE);

                wallRecipe(ModRedSandstoneBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);

                // Cut Red Sandstone stairs, wall  — stonecutting from Red Sandstone
                stonecuttingRecipe(ModRedSandstoneBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.RED_SANDSTONE);
                stonecuttingRecipe(ModRedSandstoneBlocks.CUT_RED_SANDSTONE_WALL, Blocks.RED_SANDSTONE);

                stairsRecipe(ModRedSandstoneBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.CUT_RED_SANDSTONE);
                wallRecipe(ModRedSandstoneBlocks.CUT_RED_SANDSTONE_WALL, Blocks.CUT_RED_SANDSTONE);

                craftPolishedBlocks(ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE,
                        ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_STAIRS, ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_SLAB, ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_WALL,
                        Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE);
                pressurePlateRecipe(ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_PRESSURE_PLATE, ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE);
                buttonRecipe(ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE_BUTTON, ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE);

                craftBricksBlocks(ModRedSandstoneBlocks.RED_SANDSTONE_BRICKS,
                        ModRedSandstoneBlocks.RED_SANDSTONE_BRICK_STAIRS, ModRedSandstoneBlocks.RED_SANDSTONE_BRICK_SLAB, ModRedSandstoneBlocks.RED_SANDSTONE_BRICK_WALL,
                        ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE);
                chiseledBricksBlockRecipe(ModRedSandstoneBlocks.CHISELED_RED_SANDSTONE_BRICKS, ModRedSandstoneBlocks.RED_SANDSTONE_BRICK_SLAB,
                        ModRedSandstoneBlocks.RED_SANDSTONE_BRICKS, ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE);

                crackedBlockRecipe(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_BRICKS, ModRedSandstoneBlocks.RED_SANDSTONE_BRICKS);
                craftBlockForms(
                        ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS, ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB, ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL,
                        ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_BRICKS);
                crackedBlockRecipe(ModRedSandstoneBlocks.CRACKED_CHISELED_RED_SANDSTONE_BRICKS, ModRedSandstoneBlocks.CHISELED_RED_SANDSTONE_BRICKS);

                craftPlatesBlocks(ModRedSandstoneBlocks.RED_SANDSTONE_PLATES,
                        ModRedSandstoneBlocks.RED_SANDSTONE_PLATE_STAIRS, ModRedSandstoneBlocks.RED_SANDSTONE_PLATE_SLAB, ModRedSandstoneBlocks.RED_SANDSTONE_PLATE_WALL,
                        ModRedSandstoneBlocks.RED_SANDSTONE_BRICKS, ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE);

                crackedBlockRecipe(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PLATES, ModRedSandstoneBlocks.RED_SANDSTONE_PLATES);
                craftBlockForms(
                        ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PLATE_STAIRS, ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PLATE_SLAB, ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PLATE_WALL,
                        ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PLATES);

                craftTilesBlocks(ModRedSandstoneBlocks.RED_SANDSTONE_TILES,
                        ModRedSandstoneBlocks.RED_SANDSTONE_TILE_STAIRS, ModRedSandstoneBlocks.RED_SANDSTONE_TILE_SLAB, ModRedSandstoneBlocks.RED_SANDSTONE_TILE_WALL,
                        ModRedSandstoneBlocks.RED_SANDSTONE_PLATES, ModRedSandstoneBlocks.RED_SANDSTONE_BRICKS, ModRedSandstoneBlocks.POLISHED_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE);

                crackedBlockRecipe(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_TILES, ModRedSandstoneBlocks.RED_SANDSTONE_TILES);
                craftBlockForms(
                        ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_TILE_STAIRS, ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_TILE_SLAB, ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_TILE_WALL,
                        ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_TILES);

                pillarBlockRecipe(ModRedSandstoneBlocks.RED_SANDSTONE_PILLAR, Blocks.RED_SANDSTONE);
                crackedBlockRecipe(ModRedSandstoneBlocks.CRACKED_RED_SANDSTONE_PILLAR, ModRedSandstoneBlocks.RED_SANDSTONE_PILLAR);

                // ============== NETHER BRICKS ==============

                fenceGateRecipe(ModNetherBricksBlocks.NETHER_BRICK_FENCE_GATE, Blocks.NETHER_BRICKS, Items.NETHER_BRICK);

                stonecuttingRecipe(Blocks.NETHER_BRICK_FENCE, Blocks.NETHER_BRICKS);
                stonecuttingRecipe(ModNetherBricksBlocks.NETHER_BRICK_FENCE_GATE, Blocks.NETHER_BRICKS);

                craftBlockForms(
                        ModNetherBricksBlocks.CRACKED_NETHER_BRICK_STAIRS, ModNetherBricksBlocks.CRACKED_NETHER_BRICK_SLAB, ModNetherBricksBlocks.CRACKED_NETHER_BRICK_WALL,
                        Blocks.CRACKED_NETHER_BRICKS);
                crackedBlockRecipe(ModNetherBricksBlocks.CRACKED_NETHER_BRICK_FENCE, Blocks.NETHER_BRICK_FENCE);
                crackedBlockRecipe(ModNetherBricksBlocks.CRACKED_NETHER_BRICK_FENCE_GATE, ModNetherBricksBlocks.NETHER_BRICK_FENCE_GATE);
                crackedBlockRecipe(ModNetherBricksBlocks.CRACKED_CHISELED_NETHER_BRICKS, Blocks.CHISELED_NETHER_BRICKS);

                pillarBlockRecipe(ModNetherBricksBlocks.NETHER_BRICK_PILLAR, Blocks.NETHER_BRICKS);
                crackedBlockRecipe(ModNetherBricksBlocks.CRACKED_NETHER_BRICK_PILLAR, ModNetherBricksBlocks.NETHER_BRICK_PILLAR);

                // ============== RED NETHER BRICKS ==============

                createShaped(RecipeCategory.MISC, ModItems.RED_NETHER_BRICK, 8)
                        .input('#', Items.NETHER_BRICK)
                        .input('N', Items.NETHER_WART)
                        .pattern("###")
                        .pattern("#N#")
                        .pattern("###")
                        .criterion(hasItem(Items.NETHER_BRICK), conditionsFromItem(Items.NETHER_BRICK))
                        .offerTo(exporter);

                fenceRecipe(ModRedNetherBricksBlocks.RED_NETHER_BRICK_FENCE, Blocks.RED_NETHER_BRICKS, ModItems.RED_NETHER_BRICK);
                fenceGateRecipe(ModRedNetherBricksBlocks.RED_NETHER_BRICK_FENCE_GATE, Blocks.RED_NETHER_BRICKS, ModItems.RED_NETHER_BRICK);
                stonecuttingRecipe(ModRedNetherBricksBlocks.RED_NETHER_BRICK_FENCE, Blocks.RED_NETHER_BRICKS);
                stonecuttingRecipe(ModRedNetherBricksBlocks.RED_NETHER_BRICK_FENCE_GATE, Blocks.RED_NETHER_BRICKS);
                chiseledBlockRecipe(ModRedNetherBricksBlocks.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICK_SLAB, Blocks.RED_NETHER_BRICKS);

                crackedBlockRecipe(ModRedNetherBricksBlocks.CRACKED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS);
                craftBlockForms(
                        ModRedNetherBricksBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, ModRedNetherBricksBlocks.CRACKED_RED_NETHER_BRICK_SLAB, ModRedNetherBricksBlocks.CRACKED_RED_NETHER_BRICK_WALL,
                        ModRedNetherBricksBlocks.CRACKED_RED_NETHER_BRICKS);
                crackedBlockRecipe(ModRedNetherBricksBlocks.CRACKED_RED_NETHER_BRICK_FENCE, ModRedNetherBricksBlocks.RED_NETHER_BRICK_FENCE);
                crackedBlockRecipe(ModRedNetherBricksBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE, ModRedNetherBricksBlocks.RED_NETHER_BRICK_FENCE_GATE);
                crackedBlockRecipe(ModRedNetherBricksBlocks.CRACKED_CHISELED_RED_NETHER_BRICKS, ModRedNetherBricksBlocks.CHISELED_RED_NETHER_BRICKS);

                pillarBlockRecipe(ModRedNetherBricksBlocks.RED_NETHER_BRICK_PILLAR, Blocks.RED_NETHER_BRICKS);
                crackedBlockRecipe(ModRedNetherBricksBlocks.CRACKED_RED_NETHER_BRICK_PILLAR, ModRedNetherBricksBlocks.RED_NETHER_BRICK_PILLAR);

                // ============== WARPED NETHER BRICKS ==============

                createShaped(RecipeCategory.MISC, ModItems.WARPED_NETHER_BRICK, 8)
                        .input('#', Items.NETHER_BRICK)
                        .input('N', net.muhammadrizo.warped_wart.item.ModItems.WARPED_WART)
                        .pattern("###")
                        .pattern("#N#")
                        .pattern("###")
                        .criterion(hasItem(Items.NETHER_BRICK), conditionsFromItem(Items.NETHER_BRICK))
                        .offerTo(exporter);

                offer2x2CompactingRecipe(RC, ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICKS, ModItems.WARPED_NETHER_BRICK);

                craftBlockForms(
                        ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICK_STAIRS, ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICK_SLAB, ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICK_WALL,
                        ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICKS);
                fenceRecipe(ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICK_FENCE, ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICKS, ModItems.WARPED_NETHER_BRICK);
                fenceGateRecipe(ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICK_FENCE_GATE, ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICKS, ModItems.WARPED_NETHER_BRICK);
                stonecuttingRecipe(ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICK_FENCE, ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICKS);
                stonecuttingRecipe(ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICK_FENCE_GATE, ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICKS);
                chiseledBlockRecipe(ModWarpedNetherBricksBlocks.CHISELED_WARPED_NETHER_BRICKS, ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICK_SLAB, ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICKS);

                crackedBlockRecipe(ModWarpedNetherBricksBlocks.CRACKED_WARPED_NETHER_BRICKS, ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICKS);
                craftBlockForms(
                        ModWarpedNetherBricksBlocks.CRACKED_WARPED_NETHER_BRICK_STAIRS, ModWarpedNetherBricksBlocks.CRACKED_WARPED_NETHER_BRICK_SLAB, ModWarpedNetherBricksBlocks.CRACKED_WARPED_NETHER_BRICK_WALL,
                        ModWarpedNetherBricksBlocks.CRACKED_WARPED_NETHER_BRICKS);
                crackedBlockRecipe(ModWarpedNetherBricksBlocks.CRACKED_WARPED_NETHER_BRICK_FENCE, ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICK_FENCE);
                crackedBlockRecipe(ModWarpedNetherBricksBlocks.CRACKED_WARPED_NETHER_BRICK_FENCE_GATE, ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICK_FENCE_GATE);
                crackedBlockRecipe(ModWarpedNetherBricksBlocks.CRACKED_CHISELED_WARPED_NETHER_BRICKS, ModWarpedNetherBricksBlocks.CHISELED_WARPED_NETHER_BRICKS);

                pillarBlockRecipe(ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICK_PILLAR, ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICKS);
                crackedBlockRecipe(ModWarpedNetherBricksBlocks.CRACKED_WARPED_NETHER_BRICK_PILLAR, ModWarpedNetherBricksBlocks.WARPED_NETHER_BRICK_PILLAR);
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

            public void polishedBlockRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible baseBlock) {
                createShaped(RC, output, 4)
                        .pattern("##")
                        .pattern("##")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                stonecuttingRecipe(output, input);
                stonecuttingRecipe(output, baseBlock);
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

            public void craftPolishedBlocks(ItemConvertible block, ItemConvertible stairs, ItemConvertible slab, ItemConvertible wall, ItemConvertible cutBlock, ItemConvertible baseBlock) {
                polishedBlockRecipe(block, cutBlock, baseBlock);

                stairsRecipe(stairs, block);
                stonecuttingRecipe(stairs, cutBlock);
                stonecuttingRecipe(stairs, baseBlock);

                slabRecipe(slab, block);
                stonecuttingSlabRecipe(slab, cutBlock);
                stonecuttingSlabRecipe(slab, baseBlock);

                wallRecipe(wall, block);
                stonecuttingRecipe(wall, cutBlock);
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

            public void bricksBlockRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible cutBlock, ItemConvertible baseBlock) {
                createShaped(RC, output, 4)
                        .pattern("##")
                        .pattern("##")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                stonecuttingRecipe(output, input);
                stonecuttingRecipe(output, cutBlock);
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

            public void craftBricksBlocks(ItemConvertible block, ItemConvertible stairs, ItemConvertible slab, ItemConvertible wall, ItemConvertible polishedBlock, ItemConvertible cutBlock, ItemConvertible baseBlock) {
                bricksBlockRecipe(block, polishedBlock, cutBlock, baseBlock);

                stairsRecipe(stairs, block);
                stonecuttingRecipe(stairs, polishedBlock);
                stonecuttingRecipe(stairs, cutBlock);
                stonecuttingRecipe(stairs, baseBlock);

                slabRecipe(slab, block);
                stonecuttingSlabRecipe(slab, polishedBlock);
                stonecuttingSlabRecipe(slab, cutBlock);
                stonecuttingSlabRecipe(slab, baseBlock);

                wallRecipe(wall, block);
                stonecuttingRecipe(wall, polishedBlock);
                stonecuttingRecipe(wall, cutBlock);
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

            public void platesBlockRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible polishedBlock, ItemConvertible cutBlock, ItemConvertible baseBlock) {
                createShaped(RC, output, 4)
                        .pattern("##")
                        .pattern("##")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                stonecuttingRecipe(output, input);
                stonecuttingRecipe(output, polishedBlock);
                stonecuttingRecipe(output, cutBlock);
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

            public void craftPlatesBlocks(ItemConvertible block, ItemConvertible stairs, ItemConvertible slab, ItemConvertible wall, ItemConvertible bricksBlock, ItemConvertible polishedBlock, ItemConvertible cutBlock, ItemConvertible baseBlock) {
                platesBlockRecipe(block, bricksBlock, polishedBlock, cutBlock, baseBlock);

                stairsRecipe(stairs, block);
                stonecuttingRecipe(stairs, bricksBlock);
                stonecuttingRecipe(stairs, polishedBlock);
                stonecuttingRecipe(stairs, cutBlock);
                stonecuttingRecipe(stairs, baseBlock);

                slabRecipe(slab, block);
                stonecuttingSlabRecipe(slab, bricksBlock);
                stonecuttingSlabRecipe(slab, polishedBlock);
                stonecuttingSlabRecipe(slab, cutBlock);
                stonecuttingSlabRecipe(slab, baseBlock);

                wallRecipe(wall, block);
                stonecuttingRecipe(wall, bricksBlock);
                stonecuttingRecipe(wall, polishedBlock);
                stonecuttingRecipe(wall, cutBlock);
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

            public void tilesBlockRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible bricksBlock, ItemConvertible polishedBlock, ItemConvertible cutBlock, ItemConvertible baseBlock) {
                createShaped(RC, output, 4)
                        .pattern("##")
                        .pattern("##")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                stonecuttingRecipe(output, input);
                stonecuttingRecipe(output, bricksBlock);
                stonecuttingRecipe(output, polishedBlock);
                stonecuttingRecipe(output, cutBlock);
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

            public void craftTilesBlocks(ItemConvertible block, ItemConvertible stairs, ItemConvertible slab, ItemConvertible wall, ItemConvertible platesBlock, ItemConvertible bricksBlock, ItemConvertible polishedBlock, ItemConvertible cutBlock, ItemConvertible baseBlock) {
                tilesBlockRecipe(block, platesBlock, bricksBlock, polishedBlock, cutBlock, baseBlock);

                stairsRecipe(stairs, block);
                stonecuttingRecipe(stairs, platesBlock);
                stonecuttingRecipe(stairs, bricksBlock);
                stonecuttingRecipe(stairs, polishedBlock);
                stonecuttingRecipe(stairs, cutBlock);
                stonecuttingRecipe(stairs, baseBlock);

                slabRecipe(slab, block);
                stonecuttingSlabRecipe(slab, platesBlock);
                stonecuttingSlabRecipe(slab, bricksBlock);
                stonecuttingSlabRecipe(slab, polishedBlock);
                stonecuttingSlabRecipe(slab, cutBlock);
                stonecuttingSlabRecipe(slab, baseBlock);

                wallRecipe(wall, block);
                stonecuttingRecipe(wall, platesBlock);
                stonecuttingRecipe(wall, bricksBlock);
                stonecuttingRecipe(wall, polishedBlock);
                stonecuttingRecipe(wall, cutBlock);
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

            public void smeltIntoBaseRecipe(ItemConvertible output, ItemConvertible input) {
                CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItem(input), RC, output, 0.1F, 200)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
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

            public void chiseledBricksBlockRecipe(ItemConvertible output, ItemConvertible inputSlab, ItemConvertible inputBlock, ItemConvertible polishedBlock, ItemConvertible cutBlock, ItemConvertible baseBlock) {
                offerChiseledBlockRecipe(RC, output, inputSlab);
                stonecuttingRecipe(output, inputBlock);
                stonecuttingRecipe(output, polishedBlock);
                stonecuttingRecipe(output, cutBlock);
                stonecuttingRecipe(output, baseBlock);
            }

            public void pillarBlockRecipe(ItemConvertible output, ItemConvertible input) {
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

            public void fenceRecipe(ItemConvertible output, ItemConvertible inputBlock, ItemConvertible inputItem) {
                createShaped(RecipeCategory.MISC, output, 3)
                        .input('I', inputItem)
                        .input('B', inputBlock)
                        .pattern("BIB")
                        .pattern("BIB")
                        .criterion(hasItem(inputBlock), conditionsFromItem(inputBlock))
                        .offerTo(exporter);
            }

            public void fenceGateRecipe(ItemConvertible output, ItemConvertible inputBlock, ItemConvertible inputItem) {
                createShaped(RecipeCategory.REDSTONE, output)
                        .input('I', inputItem)
                        .input('B', inputBlock)
                        .pattern("IBI")
                        .pattern("IBI")
                        .criterion(hasItem(inputBlock), conditionsFromItem(inputBlock))
                        .offerTo(exporter);
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
