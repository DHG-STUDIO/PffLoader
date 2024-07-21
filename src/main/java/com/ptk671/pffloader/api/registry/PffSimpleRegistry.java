package com.ptk671.pffloader.api.registry;


import com.ptk671.pffloader.api.block.PffBlock;
import com.ptk671.pffloader.api.item.PffBlockItem;
import com.ptk671.pffloader.api.item.PffItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PffSimpleRegistry {

    public static void PffItemRegistry(String MOD_ID, String ITEM_ID, PffItem pffItem)
    {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, ITEM_ID), pffItem);
    }

    public static void PffItemRegistry(String MOD_ID, String ITEM_ID, PffBlockItem pffItem)
    {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, ITEM_ID), pffItem);
    }

    public static void PffBlockRegistry(String MOD_ID, String BLOCK_ID, PffBlock pffBlock)
    {
        Registry.register(Registries.BLOCK, new Identifier(MOD_ID, BLOCK_ID), pffBlock);
    }
}
