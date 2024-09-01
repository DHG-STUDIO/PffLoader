package com.ptk671.pffloader.api.registry;

import com.ptk671.pffloader.api.block.PffBlock;
import com.ptk671.pffloader.api.item.PffBlockItem;
import com.ptk671.pffloader.api.item.PffItem;
import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PffRegistry {

    public static void registerItem(Identifier identifier, PffItem pffItem)
    {
        Registry.register(Registry.ITEM, identifier, pffItem);
    }

    public static void registerItem(Identifier identifier, PffBlockItem pffItem)
    {
        Registry.register(Registry.ITEM, identifier, pffItem);
    }

    public static void registerBlock(Identifier identifier, PffBlock pffBlock)
    {
        Registry.register(Registry.BLOCK, identifier, pffBlock);
    }

    public static void registerItemGroup(Identifier identifier,PffItemGroup itemGroup)
    {
        itemGroup.build();
    }

    public static void registerItemGroup(PffItemGroup itemGroup)
    {
        itemGroup.build();
    }

    public static void registerItemGroup(Identifier identifier, ItemGroup itemGroup)
    {

    }

}
