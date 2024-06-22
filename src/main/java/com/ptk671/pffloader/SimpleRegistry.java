package com.ptk671.pffloader;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SimpleRegistry {

    public static void ItemRegistry(String MOD_ID, String ITEM_ID, Item item)
    {
        Registry.register(Registry.ITEM, new Identifier( MOD_ID,ITEM_ID), item);
    }



}
