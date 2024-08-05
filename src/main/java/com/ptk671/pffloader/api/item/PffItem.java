package com.ptk671.pffloader.api.item;

import net.minecraft.item.Item;
import net.minecraft.item.itemgroup.ItemGroup;

public class PffItem extends Item {

    public ItemGroup getGroup;

    public PffItem(PffItemSettings settings) {
        new Item();
        settings.build();
    }

    public PffItem(){

    }

}
