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
import net.muhammadrizo.blocksistency.block.ModStoneBlocks;

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
                wallRecipe(ModStoneBlocks.STONE_WALL, Blocks.STONE);
                // Chiseled Stone + variants
                chiseledBlockRecipe(ModStoneBlocks.CHISELED_STONE, Blocks.STONE_SLAB, Blocks.STONE);
                mossyRecipe(ModStoneBlocks.MOSSY_CHISELED_STONE, ModStoneBlocks.CHISELED_STONE);
                crackedBlockRecipe(ModStoneBlocks.CRACKED_CHISELED_STONE, ModStoneBlocks.CHISELED_STONE);

                // Smooth Stone forms
                stairsRecipe(ModStoneBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);
                wallRecipe(ModStoneBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);

                // Replacing 'Stone >> Stone Bricks' with 'Stone >> Polished Stone'
                // is done in the resources/data/minecraft/recipe, in "stone_bricks.json"
                // Polished Stone forms
                craftBlockForms(
                        ModStoneBlocks.POLISHED_STONE_STAIRS, ModStoneBlocks.POLISHED_STONE_SLAB, ModStoneBlocks.POLISHED_STONE_WALL,
                        ModStoneBlocks.POLISHED_STONE);
                stonecutterRecipe(ModStoneBlocks.POLISHED_STONE_STAIRS, Blocks.STONE);
                stonecutterRecipe(ModStoneBlocks.POLISHED_STONE_SLAB, Blocks.STONE);
                stonecutterRecipe(ModStoneBlocks.POLISHED_STONE_WALL, Blocks.STONE);
                // Polished Stone >> Stone Bricks
                createShaped(RC, Blocks.STONE_BRICKS, 4)
                        .pattern("##")
                        .pattern("##")
                        .input('#', ModStoneBlocks.POLISHED_STONE)
                        .criterion(hasItem(ModStoneBlocks.POLISHED_STONE), conditionsFromItem(ModStoneBlocks.POLISHED_STONE))
                        .offerTo(exporter, "polished_stone_to_stone_bricks");
                stonecutterRecipe(Blocks.STONE_BRICKS, ModStoneBlocks.POLISHED_STONE);
                // Polished Stone >> Stone Brick forms
                stonecutterRecipe(Blocks.STONE_BRICK_STAIRS, ModStoneBlocks.POLISHED_STONE);
                stonecutterRecipe(Blocks.STONE_BRICK_SLAB, ModStoneBlocks.POLISHED_STONE);
                stonecutterRecipe(Blocks.STONE_BRICK_WALL, ModStoneBlocks.POLISHED_STONE);

                // Mossy Chiseled Stone Bricks
                mossyRecipe(ModStoneBlocks.MOSSY_CHISELED_STONE_BRICKS, Blocks.CHISELED_STONE_BRICKS);

                // Cracked Stone Brick forms
                craftBlockForms(ModStoneBlocks.CRACKED_STONE_BRICK_STAIRS, ModStoneBlocks.CRACKED_STONE_BRICK_SLAB, ModStoneBlocks.CRACKED_STONE_BRICK_WALL, Blocks.CRACKED_STONE_BRICKS);
                // Cracked Chiseled Stone Bricks
                crackedBlockRecipe(ModStoneBlocks.CRACKED_CHISELED_STONE_BRICKS, Blocks.CHISELED_STONE_BRICKS);

                // Stone Tiles + forms
                craftTilesBlocks(ModStoneBlocks.STONE_TILES, ModStoneBlocks.STONE_TILE_STAIRS, ModStoneBlocks.STONE_TILE_SLAB, ModStoneBlocks.STONE_TILE_WALL, Blocks.STONE_BRICKS, ModStoneBlocks.POLISHED_STONE, Blocks.STONE);
                // Mossy Stone Tiles + forms
                mossyRecipe(ModStoneBlocks.MOSSY_STONE_TILES, ModStoneBlocks.STONE_TILES);
                craftBlockForms(ModStoneBlocks.MOSSY_STONE_TILE_STAIRS, ModStoneBlocks.MOSSY_STONE_TILE_SLAB, ModStoneBlocks.MOSSY_STONE_TILE_WALL, ModStoneBlocks.MOSSY_STONE_TILES);
                // Cracked Stone Tiles + forms
                crackedBlockRecipe(ModStoneBlocks.CRACKED_STONE_TILES, ModStoneBlocks.STONE_TILES);
                craftBlockForms(ModStoneBlocks.CRACKED_STONE_TILE_STAIRS, ModStoneBlocks.CRACKED_STONE_TILE_SLAB, ModStoneBlocks.CRACKED_STONE_TILE_WALL, ModStoneBlocks.CRACKED_STONE_TILES);

                // Stone Pillar + variants
                pillarRecipe(ModStoneBlocks.STONE_PILLAR, Blocks.STONE);
                mossyRecipe(ModStoneBlocks.MOSSY_STONE_PILLAR, ModStoneBlocks.STONE_PILLAR);
                crackedBlockRecipe(ModStoneBlocks.CRACKED_STONE_PILLAR, ModStoneBlocks.STONE_PILLAR);
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
                        .offerTo(exporter, basePath + "_from_moss_block");
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
