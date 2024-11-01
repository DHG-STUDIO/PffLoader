package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.api.block.PffBlock;
import net.minecraft.item.BlockItem;

public class PffBlockItem extends BlockItem implements IPffItem {
    private PffItemSettings settings = null;
    public PffBlockItem(PffBlock block, PffItemSettings pffItemSettings){
        super(block,pffItemSettings.build());
        settings = pffItemSettings;
    }
    @Override
    public PffItemSettings getSettings() {
        return settings;
    }
}
