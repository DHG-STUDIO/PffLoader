package com.ptk671.pffloader.api.block;

import net.minecraft.block.Block;

import java.util.Optional;

public class PffBlock extends Block implements IPffBlock {
    private PffBlockSettings settings;

    public PffBlock(PffBlockSettings settings){
        super(settings.build());
        this.settings = settings;
    }
    public PffBlock(){
        super(null);
        settings = null;
    }

    @Override
    public Optional<PffBlockSettings> getOptionalSettings() {
        return IPffBlock.super.getOptionalSettings();
    }

    public PffBlockSettings getBlockSettings() {
        return settings;
    }
}
