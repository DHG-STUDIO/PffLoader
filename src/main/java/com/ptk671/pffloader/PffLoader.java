package com.ptk671.pffloader;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import java.util.concurrent.Callable;

import static com.ptk671.pffloader.Add.*;

public class PffLoader implements ModInitializer {
    public static String MOD_ID = "pffloader";

    Callable<Item> addPffHideItemCaller = () -> {
        String MOD_ID = "pffloader";
        String ITEM_ID = "my_pff_item";
        int maxCount = 64; // 任意の値

        AddPffHideItem(MOD_ID, ITEM_ID, maxCount);


        return null;
    };


    public static Identifier id(String patch)
    {
        return new Identifier(MOD_ID,patch);
    }

    @Override

    //テストコード
    public void onInitialize() {


        try {
            AddPffItemGroup("test",  addPffHideItemCaller.call());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        AddPffItem(MOD_ID,"test",64);

    }
}
