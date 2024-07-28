package com.ptk671.pffloader.api.block;

import net.minecraft.block.Block;

public class PffBlock extends Block {
    public PffBlock(Settings settings) {
        super(settings);
    }

    public PffBlock(PffBlockSetting settings)
    {
        super(settings.build());
    }
}
