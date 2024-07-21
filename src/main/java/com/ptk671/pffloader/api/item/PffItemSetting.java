package com.ptk671.pffloader.api.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;

public class PffItemSetting {
    private FabricItemSettings settings = new FabricItemSettings();

    public PffItemSetting maxItemStack(int maxcount)
    {
        settings.maxCount(maxcount);
        return this;
    }

    public PffItemSetting addItemGroup(PffItem pffItem,ItemGroup itemGroup)
    {
        settings.group(itemGroup);
        return this;
    }

    public FabricItemSettings build() {
        return settings;
    }
}