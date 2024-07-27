package com.ptk671.pffloader.api.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class PffSimpleItemSetting {


    public static PffItem Setting  (int maxCount) {
    PffItem pffItem = new PffItem(new PffItemSetting()
        .maxCount(maxCount)
        .build());
        return pffItem;
    }

    public static PffItem Setting  (int maxCount, RegistryKey<ItemGroup> itemGroup) {
        PffItem pffItem = new PffItem(new PffItemSetting()
                .maxCount(maxCount)
                .group(itemGroup)
                .build());
        return pffItem;
    }
}
