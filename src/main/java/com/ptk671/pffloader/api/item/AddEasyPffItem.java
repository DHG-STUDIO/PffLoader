package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.PffItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AddEasyPffItem {
    @Deprecated
    public static PffItem simplePffItemSetting(PffItem apffItem,String MOD_ID, String ITEM_ID, int maxCount, ItemGroup itemGroup) {
        PffItem pffItem = Registry.register(Registry.ITEM, new Identifier(MOD_ID, ITEM_ID), new PffItem(new PffItemSetting()
                .maxItemStack(maxCount)
                .addItemGroup(apffItem,itemGroup).build()
        ));
        return pffItem;
    }
}
