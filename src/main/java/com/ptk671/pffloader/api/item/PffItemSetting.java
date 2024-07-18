package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.PffItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class PffItemSetting {
    private FabricItemSettings settings = new FabricItemSettings();

    public PffItemSetting maxItemStack(int maxcount)
    {
        settings.maxCount(maxcount);
        return this;
    }

    public PffItemSetting addItemGroup(PffItem pffItem,RegistryKey<ItemGroup> itemGroup)
    {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> content.add(pffItem));
        return this;
    }

    public FabricItemSettings build() {
        return settings;
    }
}
