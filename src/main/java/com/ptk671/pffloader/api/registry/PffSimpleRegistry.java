package com.ptk671.pffloader.api.registry;


import com.ptk671.pffloader.api.block.PffBlock;
import com.ptk671.pffloader.api.item.PffBlockItem;
import com.ptk671.pffloader.api.item.PffItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PffSimpleRegistry {

    public static void PffItemRegistry(Identifier identifier, PffItem pffItem)
    {
        Registry.register(Registries.ITEM, identifier, pffItem);
    }

    public static void PffItemRegistry(Identifier identifier, PffBlockItem pffItem)
    {
        Registry.register(Registries.ITEM, identifier, pffItem);
    }

    public static void PffBlockRegistry(Identifier identifier, PffBlock pffBlock)
    {
        Registry.register(Registries.BLOCK, identifier, pffBlock);
    }
}
