package net.muhammadrizo.blocksistency.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.muhammadrizo.blocksistency.Blocksistency;
import net.muhammadrizo.blocksistency.block.custom.ModStairsBlock;
import net.muhammadrizo.blocksistency.mixin.AbstractBlockStateAccessor;
import net.muhammadrizo.blocksistency.mixin.AbstractBlockAccessor;
import net.muhammadrizo.blocksistency.mixin.AbstractBlockSettingsAccessor;
import net.muhammadrizo.blocksistency.mixin.ButtonBlockAccessor;

import java.util.function.Function;

public class ModBlocks {
    public static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings) {
        RegistryKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        RegistryKey<Item> itemKey = keyOfItem(name);

        BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey());
        Registry.register(Registries.ITEM, itemKey, blockItem);

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    public static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blocksistency.MOD_ID, name));
    }

    public static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blocksistency.MOD_ID, name));
    }

    public static void fixBlockHardnessAndBlastResistance(Block block, Block base) {
        fixBlockHardnessAndBlastResistance(block,  base.getHardness(), base.getBlastResistance());
    }

    public static void fixBlockHardnessAndBlastResistance(Block block, float hardness, float resistance) {
        AbstractBlockAccessor blockAccessor = (AbstractBlockAccessor) block;
        AbstractBlock.Settings settings = block.getSettings();

        AbstractBlockSettingsAccessor settingsAccessor = (AbstractBlockSettingsAccessor) settings;
        settingsAccessor.setHardness(hardness);
        settingsAccessor.setResistance(resistance);

        for (BlockState state : block.getStateManager().getStates()) {
            ((AbstractBlockStateAccessor) state).setHardness(hardness);
        }

        blockAccessor.setResistance(resistance);
    }

    public static Function<AbstractBlock.Settings, Block> stairsOf(Block base) {
        return settings -> new ModStairsBlock(base.getDefaultState(), settings);
    }

    public static Function<AbstractBlock.Settings, Block> pressurePlateType(BlockSetType blockSetType) {
        return settings -> new PressurePlateBlock(blockSetType, settings);
    }

    public static Function<AbstractBlock.Settings, Block> buttonType(BlockSetType blockSetType) {
        return settings -> new ButtonBlock(blockSetType, 20, settings);
    }

    public static AbstractBlock.Settings copySettings(Block base) {
        return AbstractBlock.Settings.copy(base);
    }

    public static AbstractBlock.Settings createWallSettings(Block base) {
        return AbstractBlock.Settings.copy(base)
                .solid();
    }

    public static AbstractBlock.Settings createFenceGateSettings(Block base) {
        return createWallSettings(base);
    }

    public static AbstractBlock.Settings createPressurePlateSettings(Block base) {
        return AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .solid()
                .instrument(base.getDefaultState().getInstrument())
                .noCollision()
                .strength(0.5F)
                .pistonBehavior(PistonBehavior.DESTROY);
    }

    public static AbstractBlock.Settings createButtonSettings() {
        return AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY);
    }

    public static void init() {
        Blocksistency.LOGGER.info("Registering blocks for " + Blocksistency.MOD_ID);

        ModStoneBlocks.init();
        ModGraniteBlocks.init();
        ModDioriteBlocks.init();
        ModAndesiteBlocks.init();
        ModDeepslateBlocks.init();
        ModBricksBlocks.init();
        ModSandstoneBlocks.init();
        ModRedSandstoneBlocks.init();
        ModNetherBricksBlocks.init();
        ModRedNetherBricksBlocks.init();
        ModWarpedNetherBricksBlocks.init();

        fixBlockHardnessAndBlastResistance(Blocks.QUARTZ_SLAB, Blocks.QUARTZ_BLOCK);
        fixBlockHardnessAndBlastResistance(Blocks.SMOOTH_QUARTZ, Blocks.QUARTZ_BLOCK);
        fixBlockHardnessAndBlastResistance(Blocks.SMOOTH_QUARTZ_STAIRS, Blocks.SMOOTH_QUARTZ);
        fixBlockHardnessAndBlastResistance(Blocks.SMOOTH_QUARTZ_SLAB, Blocks.SMOOTH_QUARTZ);

        fixBlockHardnessAndBlastResistance(Blocks.PURPUR_SLAB, Blocks.PURPUR_BLOCK);

        fixBlockHardnessAndBlastResistance(Blocks.BLACKSTONE_SLAB, Blocks.BLACKSTONE);
        fixBlockHardnessAndBlastResistance(Blocks.POLISHED_BLACKSTONE, Blocks.BLACKSTONE);
        fixBlockHardnessAndBlastResistance(Blocks.POLISHED_BLACKSTONE_STAIRS, Blocks.POLISHED_BLACKSTONE);
        fixBlockHardnessAndBlastResistance(Blocks.POLISHED_BLACKSTONE_SLAB, Blocks.POLISHED_BLACKSTONE);
        fixBlockHardnessAndBlastResistance(Blocks.POLISHED_BLACKSTONE_WALL, Blocks.POLISHED_BLACKSTONE);
        fixBlockHardnessAndBlastResistance(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.POLISHED_BLACKSTONE_BRICKS);
        ((ButtonBlockAccessor) Blocks.POLISHED_BLACKSTONE_BUTTON).setBlockSetType(BlockSetType.POLISHED_BLACKSTONE);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            ModStoneBlocks.addCreativeEntries(entries);
            ModGraniteBlocks.addCreativeEntries(entries);
            ModDioriteBlocks.addCreativeEntries(entries);
            ModAndesiteBlocks.addCreativeEntries(entries);
            ModDeepslateBlocks.addCreativeEntries(entries);
            ModBricksBlocks.addCreativeEntries(entries);
            ModSandstoneBlocks.addCreativeEntries(entries);
            ModRedSandstoneBlocks.addCreativeEntries(entries);
            ModNetherBricksBlocks.addCreativeEntries(entries);
            ModRedNetherBricksBlocks.addCreativeEntries(entries);
            ModWarpedNetherBricksBlocks.addCreativeEntries(entries);
        });
    }
}
