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
import net.muhammadrizo.blocksistency.block.ModStoneBlocks;

public class ModItemGroups {

    public static final ItemGroup BLOCKSISTENCY = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Blocksistency.MOD_ID, "stone"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.STONE))
                    .displayName(Text.translatable("itemgroup.blocksistency.blocksistency"))
                    .entries((displayContext, entries) -> {
                        // ============== STONE ==============

                        entries.add(Blocks.STONE);
                        entries.add(Blocks.STONE_STAIRS);
                        entries.add(Blocks.STONE_SLAB);
                        entries.add(ModStoneBlocks.STONE_WALL);
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
                    }).build());

    public static void registerItemGroups() {
        Blocksistency.LOGGER.info("Registering item groups for " + Blocksistency.MOD_ID);
    }
}
