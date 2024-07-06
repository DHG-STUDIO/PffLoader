package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.PffItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class AddPffItem {
    public static PffItem pffItemSetting(int maxCount, RegistryKey<ItemGroup> itemgroup) {

        PffItem pffItem = new PffItem(new FabricItemSettings()
                .maxCount(maxCount)
        );
        return pffItem;
    }
}
