package com.ptk671.pffloader;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class Add {


    public static Item item(RegistryKey<ItemGroup> itemGroup)
    {
        Item item = new Item(new FabricItemSettings());
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> {
            content.add(item);
        });
        return item;
    }

    public static RegistryKey<ItemGroup> itemGroup(String MOD_ID, String TabId, Item item)
    {

        RegistryKey<ItemGroup> fabricItemGroupBuilder = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID,TabId));

        return fabricItemGroupBuilder;



    }

}
