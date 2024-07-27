package com.ptk671.pffloader.api.registry;


import com.ptk671.pffloader.api.block.PffBlock;
import com.ptk671.pffloader.api.item.PffBlockItem;
import com.ptk671.pffloader.api.item.PffItem;
import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import net.minecraft.item.ItemGroup;
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
        Registry.register(Registries.BLOCK, identifier, pffBlock);
    }

    public static void PffItemGroupRegistry(Identifier identifier,PffItemGroup itemGroup)
    {
       ItemGroup itemGroup1 = itemGroup.build();
        Registry.register(Registries.ITEM_GROUP, identifier, itemGroup1);
    }

}
