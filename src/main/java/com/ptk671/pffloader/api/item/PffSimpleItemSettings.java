package com.ptk671.pffloader.api.item;


import net.minecraft.item.itemgroup.ItemGroup;

public class PffSimpleItemSettings {


    public static PffItem Setting  (int maxCount) {
        PffItem pffItem = CompatiblePffItemSetting.of(new PffItemSettings().maxCount(maxCount));
        return pffItem;
    }

    public static PffItem Setting  (int maxCount, ItemGroup itemGroup) {
        PffItem pffItem = CompatiblePffItemSetting.of(new PffItemSettings().maxCount(maxCount).group(itemGroup));
        return pffItem;
    }
}
