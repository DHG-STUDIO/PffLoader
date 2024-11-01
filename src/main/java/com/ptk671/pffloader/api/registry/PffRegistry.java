package com.ptk671.pffloader.api.registry;

import com.ptk671.pffloader.api.block.PffBlock;
import com.ptk671.pffloader.api.item.*;
import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import com.ptk671.pffloader.api.util.CompatIdentifier;
import net.legacyfabric.fabric.api.registry.v1.RegistryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.itemgroup.ItemGroup;


public class PffRegistry {

    @Deprecated
    public static void registerItem(CompatIdentifier
            identifier, PffItem pffItem) {
        RegistryHelper.registerItem(pffItem, identifier.toLegacyFabric());
        applySettings(pffItem);
    }

    public static void registerItem(PffItem pffItem) {
        RegistryHelper.registerItem(pffItem,pffItem.getSettings().getIdentifier().get());
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
        RegistryHelper.registerItem( pffItem,identifier.toLegacyFabric());
        applySettings(pffItem);
    }

    public static void registerItem(PffFoodItem pffItem) {
        RegistryHelper.registerItem(pffItem,pffItem.getSettings().getIdentifier().get());
        applySettings(pffItem);
    }

    @Deprecated
    public static void registerItem(CompatIdentifier identifier, PffBlockItem pffItem) {
        RegistryHelper.registerItem(pffItem,identifier.toLegacyFabric());
        applySettings(pffItem);
    }

    public static void registerItem(PffBlockItem pffItem) {
        RegistryHelper.registerItem(pffItem,pffItem.getSettings().getIdentifier().get());
        applySettings(pffItem);
    }

    @Deprecated
    public static void registerBlock(CompatIdentifier identifier, PffBlock pffBlock) {
        RegistryHelper.registerBlock(pffBlock,identifier.toLegacyFabric());
    }

    public static void registerBlock(PffBlock pffBlock) {
        RegistryHelper.registerBlock(pffBlock,pffBlock.getBlockSettings().getIdentifier().get());
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
