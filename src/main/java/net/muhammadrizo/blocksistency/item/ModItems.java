package net.muhammadrizo.blocksistency.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.muhammadrizo.blocksistency.Blocksistency;

import java.util.function.Function;

public class ModItems {
    public static final Item RED_NETHER_BRICK = register(
            "red_nether_brick", Item::new);

    public static final Item WARPED_NETHER_BRICK = register(
            "warped_nether_brick", Item::new);

    public static Item register(String name, Function<Item.Settings, Item> itemFactory) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blocksistency.MOD_ID, name));

        Item.Settings settings = new Item.Settings().registryKey(itemKey);

        Item item = itemFactory.apply(settings);

        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    public static void init() {
        Blocksistency.LOGGER.info("Registering items for " + Blocksistency.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.addAfter(Items.NETHER_BRICK,
                    RED_NETHER_BRICK,
                    WARPED_NETHER_BRICK);
        });
    }
}
