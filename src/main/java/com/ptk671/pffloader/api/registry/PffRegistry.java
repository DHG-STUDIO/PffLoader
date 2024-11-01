package com.ptk671.pffloader.api.registry;

import com.ptk671.pffloader.api.block.PffBlock;
import com.ptk671.pffloader.api.item.*;
import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import com.ptk671.pffloader.api.util.CompatIdentifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;


public class PffRegistry {

    @Deprecated
    public static void registerItem(CompatIdentifier
            identifier, PffItem pffItem) {
        Registry.register(Registries.ITEM,identifier.toMinecraft(),pffItem);
        applySettings(pffItem);
    }

    public static void registerItem(PffItem pffItem) {
        Registry.register(Registries.ITEM,pffItem.getSettings().getIdentifier().get(),pffItem);
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

    @Deprecated
    public static void registerItem(CompatIdentifier identifier, PffFoodItem pffItem) {
        Registry.register(Registries.ITEM,identifier.toMinecraft(),pffItem);
        applySettings(pffItem);
    }

    public static void registerItem(PffFoodItem pffItem) {
        Registry.register(Registries.ITEM,pffItem.getSettings().getIdentifier().get(),pffItem);
        applySettings(pffItem);
    }

    @Deprecated
    public static void registerItem(CompatIdentifier identifier, PffBlockItem pffItem) {
        Registry.register(Registries.ITEM,identifier.toMinecraft(),pffItem);
        applySettings(pffItem);
    }

    public static void registerItem(PffBlockItem pffItem) {
        Registry.register(Registries.ITEM,pffItem.getSettings().getIdentifier().get(),pffItem);
        applySettings(pffItem);
    }

    @Deprecated
    public static void registerBlock(CompatIdentifier identifier, PffBlock pffBlock) {
        Registry.register(Registries.BLOCK,identifier.toMinecraft(),pffBlock);
    }

    public static void registerBlock(PffBlock pffBlock) {
        Registry.register(Registries.BLOCK,pffBlock.getBlockSettings().getIdentifier().get(),pffBlock);
    }

    @Deprecated
    public static void registerItemGroup(CompatIdentifier identifier, PffItemGroup itemGroup) {
    ItemGroup itemGroup1 = itemGroup.build();
    }

    public static void registerItemGroup(PffItemGroup itemGroup) {
        ItemGroup itemGroup1 = itemGroup.build();
    }

    @Deprecated
    public static void registerItemGroup(CompatIdentifier identifier, ItemGroup itemGroup) {

    }

    public static void registerItemGroup(ItemGroup itemGroup) {

    }

}
