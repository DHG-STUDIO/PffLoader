package com.ptk671.pffloader;

import com.ptk671.pffloader.api.item.*;
import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import com.ptk671.pffloader.api.registry.PffRegistry;
import com.ptk671.pffloader.api.util.PffIdentifier;
import net.fabricmc.api.ModInitializer;

public class PffLoader implements ModInitializer {
    public static PffItemGroup test;

    public static PffItem sampleItem;
    public static PffFoodItem test2;
    public static String MOD_ID = "pffloader";
    @Override
    public void onInitialize() {
        sampleItem = CompatiblePffItemSetting.of(new PffItemSettings().maxCount(2));
        test2 = CompatiblePffItemSetting.ofFood(new PffFoodComponent(),new PffItemSettings());

        test = new PffItemGroup(PffIdentifier.of(MOD_ID,"test_tab")).appendItems(sampleItem).appendItems(test2);


        PffRegistry.PffItemGroupRegistry(test);
        PffRegistry.PffItemRegistry(PffIdentifier.of(MOD_ID,"test"),test2);
        PffRegistry.PffItemRegistry(PffIdentifier.of(MOD_ID,"test_item"),sampleItem);

    }
}

