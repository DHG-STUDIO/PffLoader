package com.ptk671.pffloader.api.item;

import net.minecraft.item.Item;

public class PffItem extends Item {
    public PffItem(PffItemSettings settings) {
        super(settings.build());
    }

}