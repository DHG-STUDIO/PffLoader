package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.PffItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class AddEasyPffItem {
    public static PffItem simplePffItemSetting(String MOD_ID, String ITEM_ID, int maxCount, RegistryKey<ItemGroup> itemGroup) {
        PffItem pffItem = Registry.register(Registries.ITEM, new Identifier(MOD_ID, ITEM_ID), new PffItem(new FabricItemSettings()
                .maxCount(maxCount)
        ));

        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> {
            content.add(pffItem);
        });
        return pffItem;
    }
}
