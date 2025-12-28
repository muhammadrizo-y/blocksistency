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
import net.muhammadrizo.blocksistency.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                // ============== STONE ==============

                // Stone >> Stone forms
                wallRecipe(ModBlocks.STONE_WALL, Blocks.STONE);

                // Smooth Stone >> Smooth Stone forms
                stairsRecipe(ModBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);
                wallRecipe(ModBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);

                // Replace 'Stone >> Stone Bricks' with 'Stone >> Polished Stone'
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_STONE, 4)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Blocks.STONE)
                        .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                        .offerTo(exporter, "stone_bricks");
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_STONE, Blocks.STONE);

                // Polished Stone >> Stone Bricks
                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICKS, 4)
                        .pattern("##")
                        .pattern("##")
                        .input('#', ModBlocks.POLISHED_STONE)
                        .criterion(hasItem(ModBlocks.POLISHED_STONE), conditionsFromItem(ModBlocks.POLISHED_STONE))
                        .offerTo(exporter, "polished_stone_to_stone_bricks");
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICKS, ModBlocks.POLISHED_STONE);

                // Polished Stone / Stone >> Polished Stone forms
                stairsRecipe(ModBlocks.POLISHED_STONE_STAIRS, ModBlocks.POLISHED_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_STONE_STAIRS, Blocks.STONE);
                slabRecipe(ModBlocks.POLISHED_STONE_SLAB, ModBlocks.POLISHED_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_STONE_SLAB, Blocks.STONE, 2);
                wallRecipe(ModBlocks.POLISHED_STONE_WALL, ModBlocks.POLISHED_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_STONE_WALL, Blocks.STONE);

                // Polished Stone >> Stone Brick forms
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_STAIRS, ModBlocks.POLISHED_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_SLAB, ModBlocks.POLISHED_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_WALL, ModBlocks.POLISHED_STONE);

                // Cracked Stone Bricks >> Cracked Stone Brick forms
                stairsRecipe(ModBlocks.CRACKED_STONE_BRICK_STAIRS, Blocks.CRACKED_STONE_BRICKS);
                slabRecipe(ModBlocks.CRACKED_STONE_BRICK_SLAB, Blocks.CRACKED_STONE_BRICKS);
                wallRecipe(ModBlocks.CRACKED_STONE_BRICK_WALL, Blocks.CRACKED_STONE_BRICKS);

                // Stone Bricks / Polished Stone / Stone >> Stone Tiles
                craft2x2Recipe(ModBlocks.STONE_TILES, Blocks.STONE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILES, Blocks.STONE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILES, ModBlocks.POLISHED_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILES, Blocks.STONE);

                // Stone Tiles / Stone Bricks / Polished Stone / Stone >> Stone Tile forms
                stairsRecipe(ModBlocks.STONE_TILE_STAIRS, ModBlocks.STONE_TILES);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, Blocks.STONE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, ModBlocks.POLISHED_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, Blocks.STONE);
                slabRecipe(ModBlocks.STONE_TILE_SLAB, ModBlocks.STONE_TILES);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, Blocks.STONE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, ModBlocks.POLISHED_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, Blocks.STONE);
                wallRecipe(ModBlocks.STONE_TILE_WALL, ModBlocks.STONE_TILES);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_WALL, Blocks.STONE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_WALL, ModBlocks.POLISHED_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_WALL, Blocks.STONE);

                // Stone Tiles >> Mossy Stone Tiles
                mossyRecipe(ModBlocks.MOSSY_STONE_TILES, ModBlocks.STONE_TILES);

                // Mossy Stone Tiles >> Mossy Stone Tile forms
                stairsRecipe(ModBlocks.MOSSY_STONE_TILE_STAIRS, ModBlocks.MOSSY_STONE_TILES);
                slabRecipe(ModBlocks.MOSSY_STONE_TILE_SLAB, ModBlocks.MOSSY_STONE_TILES);
                wallRecipe(ModBlocks.MOSSY_STONE_TILE_WALL, ModBlocks.MOSSY_STONE_TILES);

                // Stone Tiles >> Cracked Stone Tiles
                offerCrackingRecipe(ModBlocks.CRACKED_STONE_TILES, ModBlocks.STONE_TILES);

                // Cracked Stone Tiles >> Cracked Stone Tile forms
                stairsRecipe(ModBlocks.CRACKED_STONE_TILE_STAIRS, ModBlocks.CRACKED_STONE_TILES);
                slabRecipe(ModBlocks.CRACKED_STONE_TILE_SLAB, ModBlocks.CRACKED_STONE_TILES);
                wallRecipe(ModBlocks.CRACKED_STONE_TILE_WALL, ModBlocks.CRACKED_STONE_TILES);

                // 2 Stone Slab >> Chiseled Stone
                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_STONE, Blocks.STONE_SLAB);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_STONE, Blocks.STONE);

                // Chiseled Stone >> Mossy Chiseled Stone
                mossyRecipe(ModBlocks.MOSSY_CHISELED_STONE, ModBlocks.CHISELED_STONE);

                // Chiseled Stone >> Cracked Chiseled Stone
                offerCrackingRecipe(ModBlocks.CRACKED_CHISELED_STONE, ModBlocks.CHISELED_STONE);

                // Chiseled Stone Bricks >> Mossy Chiseled Stone Bricks
                mossyRecipe(ModBlocks.MOSSY_CHISELED_STONE_BRICKS, Blocks.CHISELED_STONE_BRICKS);

                // Chiseled Stone Bricks >> Cracked Chiseled Stone Bricks
                offerCrackingRecipe(ModBlocks.CRACKED_CHISELED_STONE_BRICKS, Blocks.CHISELED_STONE_BRICKS);

                // Stone >> Stone Pillar
                pillarRecipe(ModBlocks.STONE_PILLAR, Blocks.STONE);

                // Stone Pillar >> Mossy Stone Pillar
                mossyRecipe(ModBlocks.MOSSY_STONE_PILLAR, ModBlocks.STONE_PILLAR);

                // Stone Pillar >> Cracked Stone Pillar
                offerCrackingRecipe(ModBlocks.CRACKED_STONE_PILLAR, ModBlocks.STONE_PILLAR);
            }

            public void craft2x2Recipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                        .pattern("##")
                        .pattern("##")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            public void mossyRecipe(ItemConvertible output, ItemConvertible input) {
                Item outputItem = output.asItem();

                Identifier outputId = Registries.ITEM.getId(outputItem);
                String basePath = outputId.getPath();

                createShapeless(RecipeCategory.BUILDING_BLOCKS, output)
                        .input(input)
                        .input(Items.VINE)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter, basePath + "_from_vine");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, output)
                        .input(input)
                        .input(Blocks.MOSS_BLOCK)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter, basePath + "from_moss_block");
            }

            public void pillarRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 2)
                        .pattern("#")
                        .pattern("#")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, output, input);
            }

            public void stairsRecipe(ItemConvertible output, ItemConvertible input) {
                createStairsRecipe(output, Ingredient.ofItem(input))
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, output, input);
            }

            public void slabRecipe(ItemConvertible output, ItemConvertible input) {
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, output, Ingredient.ofItem(input))
                    .criterion(hasItem(input), conditionsFromItem(input))
                    .offerTo(exporter);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, output, input, 2);
            }

            public void wallRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.MISC, output, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, output, input);
            }
        };
    }

    @Override
    public String getName() {
        return "Blocksistency Recipes";
    }
}
