package net.muhammadrizo.blocksistency.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.muhammadrizo.blocksistency.Blocksistency;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> GRANITE_BRICKS = createTag("granite_bricks");
        public static final TagKey<Block> DIORITE_BRICKS = createTag("diorite_bricks");
        public static final TagKey<Block> ANDESITE_BRICKS = createTag("andesite_bricks");
        public static final TagKey<Block> DEEPSLATE_BRICKS = createTag("deepslate_bricks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Blocksistency.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> GRANITE_BRICKS = createTag("granite_bricks");
        public static final TagKey<Item> DIORITE_BRICKS = createTag("diorite_bricks");
        public static final TagKey<Item> ANDESITE_BRICKS = createTag("andesite_bricks");
        public static final TagKey<Item> DEEPSLATE_BRICKS = createTag("deepslate_bricks");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Blocksistency.MOD_ID, name));
        }
    }
}
