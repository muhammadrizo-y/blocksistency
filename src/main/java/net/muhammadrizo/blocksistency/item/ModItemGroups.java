package net.muhammadrizo.blocksistency.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.muhammadrizo.blocksistency.Blocksistency;
import net.muhammadrizo.blocksistency.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup BLOCKSISTENCY = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Blocksistency.MOD_ID, "blocksistency"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.STONE))
                    .displayName(Text.translatable("itemgroup.blocksistency.blocksistency"))
                    .entries((displayContext, entries) -> {
                        entries.add(Blocks.STONE);
                        entries.add(Blocks.STONE_STAIRS);
                        entries.add(Blocks.STONE_SLAB);
                        entries.add(ModBlocks.STONE_WALL);

                        entries.add(Blocks.COBBLESTONE);
                        entries.add(Blocks.COBBLESTONE_STAIRS);
                        entries.add(Blocks.COBBLESTONE_SLAB);
                        entries.add(Blocks.COBBLESTONE_WALL);

                        entries.add(Blocks.MOSSY_COBBLESTONE);
                        entries.add(Blocks.MOSSY_COBBLESTONE_STAIRS);
                        entries.add(Blocks.MOSSY_COBBLESTONE_SLAB);
                        entries.add(Blocks.MOSSY_COBBLESTONE_WALL);

                        entries.add(Blocks.SMOOTH_STONE);
                        entries.add(ModBlocks.SMOOTH_STONE_STAIRS);
                        entries.add(Blocks.SMOOTH_STONE_SLAB);
                        entries.add(ModBlocks.SMOOTH_STONE_WALL);

                        entries.add(ModBlocks.POLISHED_STONE);
                        entries.add(ModBlocks.POLISHED_STONE_STAIRS);
                        entries.add(ModBlocks.POLISHED_STONE_SLAB);
                        entries.add(ModBlocks.POLISHED_STONE_WALL);

                        entries.add(Blocks.STONE_BRICKS);
                        entries.add(Blocks.STONE_BRICK_STAIRS);
                        entries.add(Blocks.STONE_BRICK_SLAB);
                        entries.add(Blocks.STONE_BRICK_WALL);

                        entries.add(Blocks.MOSSY_STONE_BRICKS);
                        entries.add(Blocks.MOSSY_STONE_BRICK_STAIRS);
                        entries.add(Blocks.MOSSY_STONE_BRICK_SLAB);
                        entries.add(Blocks.MOSSY_STONE_BRICK_WALL);

                        entries.add(Blocks.CRACKED_STONE_BRICKS);
                        entries.add(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_STONE_BRICK_WALL);

                        entries.add(ModBlocks.STONE_TILES);
                        entries.add(ModBlocks.STONE_TILE_STAIRS);
                        entries.add(ModBlocks.STONE_TILE_SLAB);
                        entries.add(ModBlocks.STONE_TILE_WALL);

                        entries.add(ModBlocks.MOSSY_STONE_TILES);
                        entries.add(ModBlocks.MOSSY_STONE_TILE_STAIRS);
                        entries.add(ModBlocks.MOSSY_STONE_TILE_SLAB);
                        entries.add(ModBlocks.MOSSY_STONE_TILE_WALL);

                        entries.add(ModBlocks.CRACKED_STONE_TILES);
                        entries.add(ModBlocks.CRACKED_STONE_TILE_STAIRS);
                        entries.add(ModBlocks.CRACKED_STONE_TILE_SLAB);
                        entries.add(ModBlocks.CRACKED_STONE_TILE_WALL);

                        entries.add(ModBlocks.CHISELED_STONE);
                        entries.add(ModBlocks.MOSSY_CHISELED_STONE);
                        entries.add(ModBlocks.CRACKED_CHISELED_STONE);

                        entries.add(Blocks.CHISELED_STONE_BRICKS);
                        entries.add(ModBlocks.MOSSY_CHISELED_STONE_BRICKS);
                        entries.add(ModBlocks.CRACKED_CHISELED_STONE_BRICKS);

                        entries.add(ModBlocks.STONE_PILLAR);
                        entries.add(ModBlocks.MOSSY_STONE_PILLAR);
                        entries.add(ModBlocks.CRACKED_STONE_PILLAR);
                    }).build());

    public static void registerItemGroups() {
        Blocksistency.LOGGER.info("Registering item groups for " + Blocksistency.MOD_ID);
    }
}
