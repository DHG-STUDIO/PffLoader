package com.ptk671.pffloader;

import com.ptk671.pffloader.api.block.CompatiblePffBlockSetting;
import com.ptk671.pffloader.api.block.PffBlock;
import com.ptk671.pffloader.api.block.PffBlockSettings;
import com.ptk671.pffloader.api.item.CompatiblePffItemSetting;
import com.ptk671.pffloader.api.item.PffBlockItem;
import com.ptk671.pffloader.api.item.PffItemSettings;
import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import com.ptk671.pffloader.api.registry.PffRegistry;
import com.ptk671.pffloader.api.util.PffIdentifier;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resource.JsonDataLoader;


public class PffLoader implements ModInitializer {
    public static PffBlock tyest;
    public static PffBlockItem block_item;
    public static PffItemGroup itemGroup;
    @Override
    public void onInitialize() {
        JsonDataLoader.class
        tyest = CompatiblePffBlockSetting.of(new PffBlockSettings());
        block_item = CompatiblePffItemSetting.of(tyest,new PffItemSettings());
        itemGroup = new PffItemGroup(PffIdentifier.of("test","test")).appendItems(block_item);

        PffRegistry.PffBlockRegistry(PffIdentifier.of("test","test_block"),tyest);
        PffRegistry.PffItemRegistry(PffIdentifier.of("test","test_block"),block_item);
        PffRegistry.PffItemGroupRegistry(PffIdentifier.of("test","tese_itemgroup"),itemGroup);
    }
}


