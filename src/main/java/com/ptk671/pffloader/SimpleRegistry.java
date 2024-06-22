package com.ptk671.pffloader;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SimpleRegistry {

    public static void ItemRegistry(String MOD_ID, String ITEM_ID, Item item)
    {
        Registry.register(Registries.ITEM, new Identifier( MOD_ID,ITEM_ID), item);
    }




}
