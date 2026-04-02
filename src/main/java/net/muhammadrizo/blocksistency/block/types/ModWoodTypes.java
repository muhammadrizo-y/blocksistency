package net.muhammadrizo.blocksistency.block.types;

import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.WoodType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.muhammadrizo.blocksistency.Blocksistency;

import static net.muhammadrizo.blocksistency.block.types.ModBlockSetTypes.NETHER_BRICK_BLOCK_SET_TYPE;

public class ModWoodTypes {
    public static final WoodType NETHER_BRICK_TYPE = WoodTypeBuilder
            .copyOf(WoodType.BAMBOO)
            .soundGroup(BlockSoundGroup.NETHER_BRICKS)
            .register(Identifier.of(Blocksistency.MOD_ID, "nether_brick"), NETHER_BRICK_BLOCK_SET_TYPE);

    public static void init() {
        Blocksistency.LOGGER.info("Registering wood types for " + Blocksistency.MOD_ID);
    }
}
