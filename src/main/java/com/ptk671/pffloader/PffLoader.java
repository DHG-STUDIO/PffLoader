package com.ptk671.pffloader;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import static com.ptk671.pffloader.Add.*;

public class PffLoader implements ModInitializer {
    public static String MOD_ID = "pffloader";


    public static Identifier id(String patch)
    {
        return new Identifier(MOD_ID,patch);
    }

    @Override
    //テストコード
    public void onInitialize() {
        AddPffItemGroup("test",  Items.STONE);
AddPffItem(MOD_ID,"test",64);

    }
}
