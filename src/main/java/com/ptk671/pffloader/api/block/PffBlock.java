package com.ptk671.pffloader.api.block;

import net.minecraft.block.Block;

public class PffBlock extends Block {
    public PffBlock(PffBlockSettings settings) {
        super(settings.build());
    }
}
