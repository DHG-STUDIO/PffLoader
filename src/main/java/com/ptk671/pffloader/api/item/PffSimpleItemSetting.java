package com.ptk671.pffloader.api.item;

import net.minecraft.item.ItemGroup;

public class PffSimpleItemSetting {


    public static PffItem Setting  (int maxCount) {
        PffItem pffItem = new PffItem(new PffItemSetting()
                .maxCount(maxCount));
        return pffItem;
    }

    public static PffItem Setting  (int maxCount, ItemGroup itemGroup) {
        PffItem pffItem = new PffItem(new PffItemSetting()
                .maxCount(maxCount)
                .group(itemGroup));
        return pffItem;
    }
}
