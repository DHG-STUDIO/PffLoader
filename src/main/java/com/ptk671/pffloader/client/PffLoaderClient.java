package com.ptk671.pffloader.client;

import com.ptk671.pffloader.api.block.PffBlock;
import com.ptk671.pffloader.api.block.PffBlockSetting;
import com.ptk671.pffloader.api.item.PffBlockItem;
import com.ptk671.pffloader.api.item.PffItemSetting;
import com.ptk671.pffloader.api.registry.PffSimpleRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.sound.BlockSoundGroup;

public class PffLoaderClient implements ClientModInitializer {
    public static PffBlock test;
    public static PffBlockItem test_item;
    @Override
    public void onInitializeClient() {
test = new PffBlock(new PffBlockSetting()
        .sounds(BlockSoundGroup.GLASS)
        .build());

test_item = new PffBlockItem(test, new PffItemSetting().build());

        PffSimpleRegistry.PffBlockRegistry("pff","test",test);
        PffSimpleRegistry.PffItemRegistry("pff","test",test_item);
    }
}
