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

    final RecipeCategory RC = RecipeCategory.BUILDING_BLOCKS;

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                // ============== STONE ==============

                // Stone forms
                wallRecipe(ModBlocks.STONE_WALL, Blocks.STONE);

                // Smooth Stone forms
                stairsRecipe(ModBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);
                wallRecipe(ModBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);

                // Replace 'Stone >> Stone Bricks' with 'Stone >> Polished Stone'
                createShaped(RC, ModBlocks.POLISHED_STONE, 4)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Blocks.STONE)
                        .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                        .offerTo(exporter, "stone_bricks");

                // Polished Stone + forms
                craftPolishedBlocks(ModBlocks.POLISHED_STONE, ModBlocks.POLISHED_STONE_STAIRS, ModBlocks.POLISHED_STONE_SLAB, ModBlocks.POLISHED_STONE_WALL, Blocks.STONE);

                // Polished Stone >> Stone Bricks
                createShaped(RC, Blocks.STONE_BRICKS, 4)
                        .pattern("##")
                        .pattern("##")
                        .input('#', ModBlocks.POLISHED_STONE)
                        .criterion(hasItem(ModBlocks.POLISHED_STONE), conditionsFromItem(ModBlocks.POLISHED_STONE))
                        .offerTo(exporter, "polished_stone_to_stone_bricks");
                offerStonecuttingRecipe(RC, Blocks.STONE_BRICKS, ModBlocks.POLISHED_STONE);

                // Polished Stone >> Stone Brick forms
                offerStonecuttingRecipe(RC, Blocks.STONE_BRICK_STAIRS, ModBlocks.POLISHED_STONE);
                offerStonecuttingRecipe(RC, Blocks.STONE_BRICK_SLAB, ModBlocks.POLISHED_STONE);
                offerStonecuttingRecipe(RC, Blocks.STONE_BRICK_WALL, ModBlocks.POLISHED_STONE);

                // Cracked Stone Brick forms
                craftBlockForms(ModBlocks.CRACKED_STONE_BRICK_STAIRS, ModBlocks.CRACKED_STONE_BRICK_SLAB, ModBlocks.CRACKED_STONE_BRICK_WALL, Blocks.CRACKED_STONE_BRICKS);

                // Stone Tiles + forms
                craftTilesBlocks(ModBlocks.STONE_TILES, ModBlocks.STONE_TILE_STAIRS, ModBlocks.STONE_TILE_SLAB, ModBlocks.STONE_TILE_WALL, Blocks.STONE_BRICKS, ModBlocks.POLISHED_STONE, Blocks.STONE);
                // Mossy Stone Tiles + forms
                mossyRecipe(ModBlocks.MOSSY_STONE_TILES, ModBlocks.STONE_TILES);
                craftBlockForms(ModBlocks.MOSSY_STONE_TILE_STAIRS, ModBlocks.MOSSY_STONE_TILE_SLAB, ModBlocks.MOSSY_STONE_TILE_WALL, ModBlocks.MOSSY_STONE_TILES);
                // Cracked Stone Tiles + forms
                offerCrackingRecipe(ModBlocks.CRACKED_STONE_TILES, ModBlocks.STONE_TILES);
                craftBlockForms(ModBlocks.CRACKED_STONE_TILE_STAIRS, ModBlocks.CRACKED_STONE_TILE_SLAB, ModBlocks.CRACKED_STONE_TILE_WALL, ModBlocks.CRACKED_STONE_TILES);

                // Chiseled Stone + variants
                chiseledBlockRecipe(ModBlocks.CHISELED_STONE, Blocks.STONE_SLAB, Blocks.STONE);
                mossyRecipe(ModBlocks.MOSSY_CHISELED_STONE, ModBlocks.CHISELED_STONE);
                offerCrackingRecipe(ModBlocks.CRACKED_CHISELED_STONE, ModBlocks.CHISELED_STONE);

                // Mossy Chiseled Stone Bricks, Cracked Chiseled Stone Bricks
                mossyRecipe(ModBlocks.MOSSY_CHISELED_STONE_BRICKS, Blocks.CHISELED_STONE_BRICKS);
                offerCrackingRecipe(ModBlocks.CRACKED_CHISELED_STONE_BRICKS, Blocks.CHISELED_STONE_BRICKS);

                // Stone Pillar + variants
                pillarRecipe(ModBlocks.STONE_PILLAR, Blocks.STONE);
                mossyRecipe(ModBlocks.MOSSY_STONE_PILLAR, ModBlocks.STONE_PILLAR);
                offerCrackingRecipe(ModBlocks.CRACKED_STONE_PILLAR, ModBlocks.STONE_PILLAR);
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

                offerStonecuttingRecipe(RC, output, input);
            }

            public void craftPolishedBlocks(ItemConvertible block, ItemConvertible stairs, ItemConvertible slab, ItemConvertible wall, ItemConvertible baseBlock) {
                polishedBlockRecipe(block, baseBlock);

                stairsRecipe(stairs, block);
                offerStonecuttingRecipe(RC, stairs, baseBlock);

                slabRecipe(slab, block);
                offerStonecuttingRecipe(RC, slab, baseBlock, 2);

                wallRecipe(wall, block);
                offerStonecuttingRecipe(RC, wall, baseBlock);
            }

            public void bricksBlockRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible baseBlock) {
                createShaped(RC, output, 4)
                        .pattern("##")
                        .pattern("##")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                offerStonecuttingRecipe(RC, output, input);
                offerStonecuttingRecipe(RC, output, baseBlock);
            }

            public void craftBricksBlocks(ItemConvertible block, ItemConvertible stairs, ItemConvertible slab, ItemConvertible wall, ItemConvertible polishedBlock, ItemConvertible baseBlock) {
                bricksBlockRecipe(block, polishedBlock, baseBlock);

                stairsRecipe(stairs, block);
                offerStonecuttingRecipe(RC, stairs, polishedBlock);
                offerStonecuttingRecipe(RC, stairs, baseBlock);

                slabRecipe(slab, block);
                offerStonecuttingRecipe(RC, slab, polishedBlock, 2);
                offerStonecuttingRecipe(RC, slab, baseBlock, 2);

                wallRecipe(wall, block);
                offerStonecuttingRecipe(RC, wall, polishedBlock);
                offerStonecuttingRecipe(RC, wall, baseBlock);
            }

            public void tilesBlockRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible polishedBlock, ItemConvertible baseBlock) {
                createShaped(RC, output, 4)
                        .pattern("##")
                        .pattern("##")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                offerStonecuttingRecipe(RC, output, input);
                offerStonecuttingRecipe(RC, output, polishedBlock);
                offerStonecuttingRecipe(RC, output, baseBlock);
            }

            public void craftTilesBlocks(ItemConvertible block, ItemConvertible stairs, ItemConvertible slab, ItemConvertible wall, ItemConvertible bricksBlock, ItemConvertible polishedBlock, ItemConvertible baseBlock) {
                tilesBlockRecipe(block, bricksBlock, polishedBlock, baseBlock);

                stairsRecipe(stairs, block);
                stonecutterRecipe(stairs, bricksBlock);
                stonecutterRecipe(stairs, polishedBlock);
                stonecutterRecipe(stairs, baseBlock);

                slabRecipe(slab, block);
                stonecutterRecipe(slab, bricksBlock, 2);
                stonecutterRecipe(slab, polishedBlock, 2);
                stonecutterRecipe(slab, baseBlock, 2);

                wallRecipe(wall, block);
                stonecutterRecipe(wall, bricksBlock);
                stonecutterRecipe(wall, polishedBlock);
                stonecutterRecipe(wall, baseBlock);
            }

            public void stonecutterRecipe(ItemConvertible output, ItemConvertible input) {
                offerStonecuttingRecipe(RC, output, input);
            }

            public void stonecutterRecipe(ItemConvertible output, ItemConvertible input, int count) {
                offerStonecuttingRecipe(RC, output, input, count);
            }

            public void smoothBlockRecipe(ItemConvertible output, ItemConvertible input) {
                offerCrackingRecipe(output, input);
            }

            public void mossyRecipe(ItemConvertible output, ItemConvertible input) {
                Item outputItem = output.asItem();

                Identifier outputId = Registries.ITEM.getId(outputItem);
                String basePath = outputId.getPath();

                createShapeless(RC, output)
                        .input(input)
                        .input(Items.VINE)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter, basePath + "_from_vine");

                createShapeless(RC, output)
                        .input(input)
                        .input(Blocks.MOSS_BLOCK)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter, basePath + "from_moss_block");
            }

            public void crackedBlockRecipe(ItemConvertible output, ItemConvertible input) {
                offerCrackingRecipe(output, input);
            }

            public void chiseledBlockRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible inputBlock) {
                offerChiseledBlockRecipe(RC, output, input);
                stonecutterRecipe(output, inputBlock, 1);
            }

            public void pillarRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RC, output, 2)
                        .pattern("#")
                        .pattern("#")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                stonecutterRecipe(output, input, 1);
            }

            public void stairsRecipe(ItemConvertible output, ItemConvertible input) {
                createStairsRecipe(output, Ingredient.ofItem(input))
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                stonecutterRecipe(output, input, 1);
            }

            public void slabRecipe(ItemConvertible output, ItemConvertible input) {
                createSlabRecipe(RC, output, Ingredient.ofItem(input))
                    .criterion(hasItem(input), conditionsFromItem(input))
                    .offerTo(exporter);

                stonecutterRecipe(output, input, 2);
            }

            public void wallRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.MISC, output, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);

                stonecutterRecipe(output, input, 1);
            }
        };
    }

    @Override
    public String getName() {
        return "Blocksistency Recipes";
    }
}
