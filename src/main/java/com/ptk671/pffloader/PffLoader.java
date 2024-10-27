package com.ptk671.pffloader;

import com.ptk671.pffloader.api.item.CompatiblePffItemSetting;
import com.ptk671.pffloader.api.item.PffItem;
import com.ptk671.pffloader.api.item.PffItemSettings;
import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import com.ptk671.pffloader.api.registry.PffRegistry;
import com.ptk671.pffloader.api.util.PffIdentifier;
import net.fabricmc.api.ModInitializer;


public class PffLoader implements ModInitializer {
public static String MOD_ID = "pffloader";

    @Override
    public void onInitialize() {
    itemGroup = PffItemGroup.create(PffIdentifier.of(MOD_ID,"test"));
        test = CompatiblePffItemSetting.of(new PffItemSettings().group(itemGroup));
        PffRegistry.registerItemGroup(itemGroup);
        PffRegistry.registerItem(PffIdentifier.of(MOD_ID,"test"),test);

    }
}



