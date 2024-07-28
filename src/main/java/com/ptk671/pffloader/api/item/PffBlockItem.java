package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.api.block.PffBlock;
import net.minecraft.item.BlockItem;

public class PffBlockItem extends BlockItem {
    public PffBlockItem(PffBlock block, Settings settings) {
        super(block, settings);
    }
    public PffBlockItem(PffBlock block,PffItemSetting settings){
        super(block,settings.build());

    }
}
