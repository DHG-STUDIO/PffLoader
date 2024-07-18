package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.PffItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class AddPffItem {
    @Deprecated
    public static PffItem pffItemSetting(PffItem pffItem2,int maxCount, RegistryKey<ItemGroup> itemgroup) {

        PffItem pffItem = new PffItem(new PffItemSetting()
                .maxItemStack(maxCount)
                .addItemGroup(pffItem2,itemgroup).build()
        );
        return pffItem;
    }
}
