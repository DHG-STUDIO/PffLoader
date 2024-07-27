package com.ptk671.pffloader;

import com.ptk671.pffloader.api.item.PffItem;
import com.ptk671.pffloader.api.item.PffItemSetting;
import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import com.ptk671.pffloader.api.registry.PffSimpleRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class PffLoader implements ModInitializer {
    public static String MOD_ID = "pffloader";
    public static PffItem fe;
    public static PffItem fe2;
    public static PffItemGroup sd;


    @Override
    public void onInitialize() {

        fe = new PffItem(new PffItemSetting().build());
        fe2 = new PffItem(new PffItemSetting()
                .build());
        PffSimpleRegistry.PffItemRegistry(new Identifier("pff","test"),fe);
        PffSimpleRegistry.PffItemRegistry(new Identifier("pff","test2"),fe2);

        sd  = PffItemGroup.create(new Identifier(MOD_ID,"all"))

                .setIcon(Items.SAND)
                .appendItems(fe2)
                .appendItems(fe);


        PffSimpleRegistry.PffItemGroupRegistry(new Identifier(MOD_ID,"all"),sd);
    }
}