package net.muhammadrizo.blocksistency.block.custom;

import net.minecraft.block.FenceGateBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.muhammadrizo.blocksistency.block.types.ModWoodTypes;

public class NetherBrickFenceGateBlock extends FenceGateBlock {
    public NetherBrickFenceGateBlock(Settings settings) {
        super(ModWoodTypes.NETHER_BRICK_TYPE, settings.sounds(BlockSoundGroup.NETHER_BRICKS));
    }
}
