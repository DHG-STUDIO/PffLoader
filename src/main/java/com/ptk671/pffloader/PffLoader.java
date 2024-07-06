package com.ptk671.pffloader;

import net.fabricmc.api.ModInitializer;

import static com.ptk671.pffloader.Add.*;

public class PffLoader implements ModInitializer {
    public static String MOD_ID = "pffloader";

    //アイテム変数
    public static PffItem TEST;
    @Override
    //テストコード
    public void onInitialize() {
        //アイテムの設定
        TEST = Add.AddPffAdvancedItem(64,PFF_CREATIVE_TAB);

        //クリエイティブタブの設定
        PFF_CREATIVE_TAB = SettingPPFItemGroup(MOD_ID,"test",TEST,"itemGroup.pffloader.test");
        PFF_CREATIVE_TAB_2 = SettingPPFItemGroup(MOD_ID,"test2",TEST,"itemGroup.pffloader.test");


        //クリエイティブタブにアイテムを追加(1.19.3以降)
        PffItemAddCreativeTab_1_20(TEST,PFF_CREATIVE_TAB);

        //アイテムの登録
        SimpleRegistry.PffItemRegistry(MOD_ID,"newitem",TEST);

        //簡易アイテム追加関数
        AddPffItem(MOD_ID,"test",64,PFF_CREATIVE_TAB);
        AddPffItem(MOD_ID,"test5",64,PFF_CREATIVE_TAB_2);
    }
}