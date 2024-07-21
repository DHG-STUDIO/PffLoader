package com.ptk671.pffloader.api.registry;

import com.ptk671.pffloader.api.block.PffBlock;
import com.ptk671.pffloader.api.item.PffBlockItem;
import com.ptk671.pffloader.api.item.PffItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PffSimpleRegistry {

    public static void PffItemRegistry(String MOD_ID, String ITEM_ID, PffItem pffItem)
    {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, ITEM_ID), pffItem);
    }
    public static void PffItemRegistry(String MOD_ID, String ITEM_ID, PffBlockItem pffItem)
    {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, ITEM_ID), pffItem);
    }
    public static void PffBlockRegistry(String MOD_ID, String BLOCK_ID, PffBlock pffBlock)
    {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, BLOCK_ID), pffBlock);
    }
}
