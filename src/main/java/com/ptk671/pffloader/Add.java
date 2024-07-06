package com.ptk671.pffloader;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;



public class Add {

    public static ItemGroup PFF_CREATIVE_TAB;
    public static ItemGroup PFF_CREATIVE_TAB_2;

    public static ItemGroup SettingPPFItemGroup(String MOD_ID, String TAB_ID, Item pffItem, String DisplayName) {
                ItemGroup itemGroup =    FabricItemGroupBuilder.build(
                new Identifier(MOD_ID, TAB_ID),
                () -> new ItemStack(pffItem)
                        .setCustomName(Text.of(DisplayName))
        );
        return itemGroup;
    }

    public static PffItem AddPffItem(String MOD_ID, String ITEM_ID, int maxCount, ItemGroup itemGroup) {
        PffItem pffItem = Registry.register(Registry.ITEM, new Identifier(MOD_ID, ITEM_ID), new PffItem(new FabricItemSettings()
                .maxCount(maxCount)
                .group(itemGroup)
        ));
        return pffItem;
    }
   public static FabricItemSettings cus = new FabricItemSettings();
    public static PffItem AddPffAdvancedItem(int maxCount) {

        PffItem pffItem = new PffItem(cus.maxCount(maxCount));

        return pffItem;
    }

    public static void PffItemAddCreativeTab(PffItem pffItem, ItemGroup itemGroup) {


    }
}