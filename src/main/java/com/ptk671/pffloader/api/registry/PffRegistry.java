package com.ptk671.pffloader.api.registry;

import com.ptk671.pffloader.api.block.PffBlock;
import com.ptk671.pffloader.api.item.PffBlockItem;
import com.ptk671.pffloader.api.item.PffFoodItem;
import com.ptk671.pffloader.api.item.PffItem;
import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import net.legacyfabric.fabric.api.util.Identifier;
import net.minecraft.item.itemgroup.ItemGroup;

import static net.legacyfabric.fabric.api.registry.v1.RegistryHelper.registerBlock;
import static net.legacyfabric.fabric.api.registry.v1.RegistryHelper.registerItem;

public class PffRegistry {

    public static void PffItemRegistry(Identifier identifier, PffItem pffItem)
    {
        registerItem(pffItem, identifier);
    }

    public static void PffItemRegistry(Identifier identifier, PffFoodItem pffItem)
    {
        registerItem(pffItem, identifier);
    }

    public static void PffItemRegistry(Identifier identifier, PffBlockItem pffItem)
    {
        registerItem(pffItem, identifier);
    }
    public static void PffBlockRegistry(Identifier identifier, PffBlock pffBlock)
    {
        registerBlock(pffBlock, identifier);
    }

    public static void PffItemGroupRegistry(net.legacyfabric.fabric.api.util.Identifier identifier, PffItemGroup itemGroup)
    {
        itemGroup.build();
    }

    public static void PffItemGroupRegistry(PffItemGroup itemGroup)
    {
        itemGroup.build();
    }

    public static void PffItemGroupRegistry(Identifier identifier, ItemGroup itemGroup)
    {

    }

}
