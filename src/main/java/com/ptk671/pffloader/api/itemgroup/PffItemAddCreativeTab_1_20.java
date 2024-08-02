package com.ptk671.pffloader.api.itemgroup;

import com.ptk671.pffloader.api.item.PffItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;

public class PffItemAddCreativeTab_1_20 {
    public static void registry(PffItem pffItem, ItemGroup itemgroup) {
        ItemGroupEvents.modifyEntriesEvent(itemgroup).register(content -> content.add(pffItem));

    }
}
