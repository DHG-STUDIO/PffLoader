package com.ptk671.pffloader.api.itemapi;

import com.ptk671.pffloader.PffItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;

public class AddPffItem {

    public static PffItem pffItemSetting(int maxCount,ItemGroup itemGroup) {

        PffItem pffItem = new PffItem((new FabricItemSettings()
                .maxCount(maxCount)
                .group(itemGroup)
        ));

        return pffItem;
    }
}
