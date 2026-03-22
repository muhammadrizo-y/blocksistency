package net.muhammadrizo.blocksistency.block.model;

import net.minecraft.client.data.Model;
import net.minecraft.client.data.TextureKey;
import net.minecraft.util.Identifier;
import net.muhammadrizo.blocksistency.Blocksistency;

import java.util.Optional;

public class ModModels {
    public static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(Blocksistency.MOD_ID, "block/" + parent)), Optional.of(variant), requiredTextureKeys);
    }

    public static final Model TEMPLATE_BOTTOM_TOP_WALL_POST = block("template_bottom_top_wall_post", "_post", TextureKey.WALL, TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model TEMPLATE_BOTTOM_TOP_WALL_SIDE = block("template_bottom_top_wall_side", "_side", TextureKey.WALL, TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model TEMPLATE_BOTTOM_TOP_WALL_SIDE_TALL = block("template_bottom_top_wall_side_tall", "_side_tall", TextureKey.WALL, TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model BOTTOM_TOP_WALL_INVENTORY = block("bottom_top_wall_inventory", "_inventory", TextureKey.WALL, TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
}
