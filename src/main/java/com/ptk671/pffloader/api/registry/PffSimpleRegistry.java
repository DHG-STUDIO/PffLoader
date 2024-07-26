package com.ptk671.pffloader.api.registry;

import com.ptk671.pffloader.api.block.PffBlock;
import com.ptk671.pffloader.api.item.PffBlockItem;
import com.ptk671.pffloader.api.item.PffItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PffSimpleRegistry {

    public static void PffItemRegistry(Identifier identifier, PffItem pffItem)
    {
        Registry.register(Registry.ITEM, identifier, pffItem);
    }
    public static void PffItemRegistry(Identifier identifier, PffBlockItem pffItem)
    {
        Registry.register(Registry.ITEM, identifier, pffItem);
    }
    public static void PffBlockRegistry(Identifier identifier, PffBlock pffBlock)
    {
        Registry.register(Registry.BLOCK, identifier, pffBlock);
    }

}
