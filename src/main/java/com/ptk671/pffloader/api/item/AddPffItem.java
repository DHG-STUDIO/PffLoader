package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.PffItem;
import net.minecraft.item.ItemGroup;

public class AddPffItem {

    @Deprecated
    public static PffItem pffSimpleItemSetting(PffItem pffItem2,int maxCount,ItemGroup itemGroup) {

        PffItem pffItem = new PffItem((new PffItemSetting()
                .maxItemStack(maxCount)
                .addItemGroup(pffItem2,itemGroup)
                .build()
        ));

        return pffItem;
    }
}
