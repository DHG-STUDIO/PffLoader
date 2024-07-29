package com.ptk671.pffloader;

import com.ptk671.pffloader.api.item.PffItem;
import com.ptk671.pffloader.api.item.PffItemSettings;
import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import com.ptk671.pffloader.api.registry.PffRegistry;
import com.ptk671.pffloader.api.util.PffIdentifier;
import net.fabricmc.api.ModInitializer;

public class PffLoader implements ModInitializer {
    public static String MOD_ID = "pffloader";
public static PffItemGroup test_Tab;
public static PffItem test_item;
    @Override
    public void onInitialize() {
        test_item = new PffItem(new PffItemSettings());
        PffRegistry.PffItemRegistry(PffIdentifier.of(MOD_ID,"test"),test_item);
        test_Tab = PffItemGroup.create(PffIdentifier.of(MOD_ID,"test"))
                .appendItems(test_item)
                        .Icon(test_item);



         PffRegistry.PffItemGroupRegistry(test_Tab);



    }
}