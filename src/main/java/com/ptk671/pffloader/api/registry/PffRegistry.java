package com.ptk671.pffloader.api.registry;

import com.ptk671.pffloader.api.block.PffBlock;
import com.ptk671.pffloader.api.item.*;
import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import net.legacyfabric.fabric.api.registry.v1.RegistryHelper;
import net.legacyfabric.fabric.api.resource.ItemModelRegistry;
import net.legacyfabric.fabric.api.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.item.itemgroup.ItemGroup;



public class PffRegistry {

    public static void registerItem(Identifier identifier, PffItem pffItem) {
        RegistryHelper.registerItem(pffItem,identifier);
        ItemModelRegistry.registerItemModel(pffItem,identifier);

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

    public static void registerItem(Identifier identifier, PffFoodItem pffItem) {
        RegistryHelper.registerItem(pffItem, identifier);
        ItemModelRegistry.registerItemModel(pffItem,identifier);

        applySettings(pffItem);
    }

    public static void registerItem(Identifier identifier, PffBlockItem pffItem) {
        RegistryHelper.registerItem(pffItem, identifier);
        ItemModelRegistry.registerBlockItemModel(pffItem.getBlock(),identifier);

        applySettings(pffItem);
    }

    public static void registerBlock(Identifier identifier, PffBlock pffBlock) {
        RegistryHelper.registerBlock(pffBlock, identifier);
        ItemModelRegistry.registerBlockItemModel(pffBlock,identifier);
    }

    public static void registerItemGroup(Identifier identifier, PffItemGroup itemGroup) {
        registerItemGroup(itemGroup);
    }

    public static void registerItemGroup(PffItemGroup itemGroup) {
        itemGroup.build();
    }

    public static void registerItemGroup(Identifier identifier, ItemGroup itemGroup) {

    }

}
