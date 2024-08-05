package com.ptk671.pffloader.api.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class PffSimpleItemSettings {


    public static PffItem Setting  (int maxCount) {
    PffItem pffItem = new PffItem(new PffItemSettings()
        .maxCount(maxCount));
        return pffItem;
    }

    public static PffItem Setting  (int maxCount, ItemGroup itemGroup) {
        PffItem pffItem = new PffItem(new PffItemSettings()
                .maxCount(maxCount)
                .group(itemGroup));
        return pffItem;
    }
}
