package com.ptk671.pffloader;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SimpleRegistry {

    public static void PffItemRegistry(String MOD_ID,String ITEM_ID,PffItem pffItem)
    {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, ITEM_ID), pffItem);
    }

}
