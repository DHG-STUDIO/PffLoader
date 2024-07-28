package com.ptk671.pffloader.api.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class PffSimpleItemSetting {


    public static PffItem Setting  (int maxCount) {
    PffItem pffItem = new PffItem(new PffItemSetting()
        .maxCount(maxCount));
        return pffItem;
    }

    public static PffItem Setting  (int maxCount, RegistryKey<ItemGroup> itemGroup) {
        PffItem pffItem = new PffItem(new PffItemSetting()
                .maxCount(maxCount)
                .group(itemGroup));
        return pffItem;
    }
}
