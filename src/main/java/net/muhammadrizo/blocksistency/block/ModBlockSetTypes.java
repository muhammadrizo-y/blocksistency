package net.muhammadrizo.blocksistency.block;

import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.muhammadrizo.blocksistency.Blocksistency;

public class ModBlockSetTypes {
    public static final BlockSetType POLISHED_GRANITE = BlockSetTypeBuilder
            .copyOf(BlockSetType.STONE)
            .soundGroup(BlockSoundGroup.STONE)
            .register(Identifier.of(Blocksistency.MOD_ID, "polished_granite"));

    public static final BlockSetType POLISHED_DIORITE = BlockSetTypeBuilder
            .copyOf(BlockSetType.STONE)
            .soundGroup(BlockSoundGroup.STONE)
            .register(Identifier.of(Blocksistency.MOD_ID, "polished_diorite"));

    public static final BlockSetType POLISHED_ANDESITE = BlockSetTypeBuilder
            .copyOf(BlockSetType.STONE)
            .soundGroup(BlockSoundGroup.STONE)
            .register(Identifier.of(Blocksistency.MOD_ID, "polished_andesite"));

    public static final BlockSetType POLISHED_DEEPSLATE = BlockSetTypeBuilder
            .copyOf(BlockSetType.STONE)
            .soundGroup(BlockSoundGroup.POLISHED_DEEPSLATE)
            .register(Identifier.of(Blocksistency.MOD_ID, "polished_deepslate"));

    public static void init() {
        Blocksistency.LOGGER.info("Registering block set types for " + Blocksistency.MOD_ID);
    }
}
