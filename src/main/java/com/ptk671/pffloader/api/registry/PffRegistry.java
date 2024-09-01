package com.ptk671.pffloader.api.registry;

import com.ptk671.pffloader.api.block.PffBlock;
import com.ptk671.pffloader.api.item.PffBlockItem;
import com.ptk671.pffloader.api.item.PffFoodItem;
import com.ptk671.pffloader.api.item.PffItem;
import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import net.legacyfabric.fabric.api.registry.v1.RegistryHelper;
import net.legacyfabric.fabric.api.resource.ItemModelRegistry;
import net.legacyfabric.fabric.api.util.Identifier;
import net.minecraft.item.itemgroup.ItemGroup;



public class PffRegistry {

    public static void registerItem(Identifier identifier, PffItem pffItem) {
        RegistryHelper.registerItem(pffItem,identifier);
        ItemModelRegistry.registerItemModel(pffItem,identifier);
    }

    public static void registerItem(Identifier identifier, PffFoodItem pffItem) {
        RegistryHelper.registerItem(pffItem, identifier);
        ItemModelRegistry.registerItemModel(pffItem,identifier);
    }

    public static void registerItem(Identifier identifier, PffBlockItem pffItem) {
        RegistryHelper.registerItem(pffItem, identifier);
       ItemModelRegistry.registerBlockItemModel(pffItem.getBlock(),identifier);
    }
    public static void registerBlock(Identifier identifier, PffBlock pffBlock) {
        RegistryHelper.registerBlock(pffBlock, identifier);
        ItemModelRegistry.registerBlockItemModel(pffBlock,identifier);
    }

    public static void registerItemGroup(Identifier identifier, PffItemGroup itemGroup) {
        itemGroup.build();
    }

    public static void registerItemGroup(PffItemGroup itemGroup) {
        itemGroup.build();
    }

    public static void registerItemGroup(Identifier identifier, ItemGroup itemGroup) {

    }

}
