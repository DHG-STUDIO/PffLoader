package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.PffItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class AddEasyPffItem {
    @Deprecated
    public static PffItem simplePffItemSetting(PffItem pffItem2,String MOD_ID, String ITEM_ID, int maxCount, RegistryKey<ItemGroup> itemGroup) {
        PffItem pffItem = Registry.register(Registries.ITEM, new Identifier(MOD_ID, ITEM_ID), new PffItem(new PffItemSetting()
                .maxItemStack(maxCount)
                .addItemGroup(pffItem2,itemGroup).build()
        ));
        return pffItem;
    }
}
