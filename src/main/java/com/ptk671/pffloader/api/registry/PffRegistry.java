package com.ptk671.pffloader.api.registry;

import com.ptk671.pffloader.api.block.PffBlock;
import com.ptk671.pffloader.api.item.*;
import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import com.ptk671.pffloader.api.util.CompatIdentifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;



public class PffRegistry {

    public static void registerItem(CompatIdentifier
            identifier, PffItem pffItem) {
        Registry.register(Registry.ITEM,identifier.toMinecraft(),pffItem);
        applySettings(pffItem);
    }

    /**
     * PffItemSettingsを適用する、今のところはPffItemGroupへの追加のみ実装
     * @param pffItem PffItem, PffFoodItemなど
     */
    public static void applySettings(IPffItem pffItem) {
        if (!pffItem.getOptionalSettings().isPresent()) return;
        PffItemSettings settings = pffItem.getSettings();

        if (pffItem instanceof Item && settings.getPffItemGroup().isPresent()) {
            settings.getPffItemGroup().get().appendItems((Item) pffItem);
        }
    }

    public static void registerItem(CompatIdentifier identifier, PffFoodItem pffItem) {
        Registry.register(Registry.ITEM,identifier.toMinecraft(),pffItem);
        applySettings(pffItem);
    }

    public static void registerItem(CompatIdentifier identifier, PffBlockItem pffItem) {
        Registry.register(Registry.ITEM,identifier.toMinecraft(),pffItem);
        applySettings(pffItem);
    }

    public static void registerBlock(CompatIdentifier identifier, PffBlock pffBlock) {
        Registry.register(Registry.BLOCK,identifier.toMinecraft(),pffBlock);
    }

    public static void registerItemGroup(CompatIdentifier identifier, PffItemGroup itemGroup) {
        itemGroup.build();
    }

    public static void registerItemGroup(PffItemGroup itemGroup) {
        itemGroup.build();
    }

    public static void registerItemGroup(CompatIdentifier identifier, ItemGroup itemGroup) {

    }

}
