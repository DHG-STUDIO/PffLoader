package com.ptk671.pffloader;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class PffLoader implements ModInitializer {
    public static String MOD_ID = "pffloader";
    public static  ItemGroup TEST_TAB = Add.itemGroup(MOD_ID,"all", Items.STONE);
    public static Item TEST_ITEM = Add.item(PffLoader.TEST_TAB);

    public static Identifier id(String patch)
    {
        return new Identifier(MOD_ID,patch);
    }

    @Override
    public void onInitialize() {

        SimpleRegistry.ItemRegistry(MOD_ID,"test",TEST_ITEM);
    }
}
