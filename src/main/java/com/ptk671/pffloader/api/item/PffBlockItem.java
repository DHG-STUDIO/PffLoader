package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.api.block.PffBlock;
import net.minecraft.item.BlockItem;

public class PffBlockItem extends BlockItem {
    public PffBlockItem(PffBlock block , PffItemSettings settings) {
        super(block,settings.build());
    }
}
