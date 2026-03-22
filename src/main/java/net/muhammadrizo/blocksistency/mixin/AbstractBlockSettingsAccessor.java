package net.muhammadrizo.blocksistency.mixin;

import net.minecraft.block.AbstractBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(AbstractBlock.Settings.class)
public interface AbstractBlockSettingsAccessor {
    @Accessor("hardness")
    @Mutable
    void setHardness(float hardness);

    @Accessor("resistance")
    @Mutable
    void setResistance(float resistance);
}
