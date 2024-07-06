package com.ptk671.pffloader.api.itemapi;

import com.ptk671.pffloader.PffItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AddEasyPffItem {
    public static PffItem simplePffItemSetting(String MOD_ID, String ITEM_ID, int maxCount, ItemGroup itemGroup) {
        PffItem pffItem = Registry.register(Registry.ITEM, new Identifier(MOD_ID, ITEM_ID), new PffItem(new FabricItemSettings()
                .maxCount(maxCount)
                .group(itemGroup)
        ));
        return pffItem;
    }
}
