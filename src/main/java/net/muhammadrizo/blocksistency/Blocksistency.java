package net.muhammadrizo.blocksistency;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.muhammadrizo.blocksistency.block.ModBlockSetTypes;
import net.muhammadrizo.blocksistency.block.ModBlocks;
import net.muhammadrizo.blocksistency.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Blocksistency implements ModInitializer {
	public static final String MOD_ID = "blocksistency";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.init();

		ModBlockSetTypes.init();

		ModBlocks.init();

		ResourceManagerHelper.registerBuiltinResourcePack(
				Identifier.of(MOD_ID, "better_recipes"),
				FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(),
				Text.literal("Better Recipes"),
				ResourcePackActivationType.DEFAULT_ENABLED
		);

		ResourceManagerHelper.registerBuiltinResourcePack(
				Identifier.of(MOD_ID, "cobbled_drops"),
				FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(),
				Text.literal("Cobbled Drops"),
				ResourcePackActivationType.DEFAULT_ENABLED
		);
	}
}