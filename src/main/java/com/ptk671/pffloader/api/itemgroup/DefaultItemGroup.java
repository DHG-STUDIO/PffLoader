package com.ptk671.pffloader.api.itemgroup;

import net.minecraft.block.Blocks;
import net.minecraft.item.itemgroup.ItemGroup;

public class DefaultItemGroup {
    public static final ItemGroup FOOD = ItemGroup.FOOD;
    public static final ItemGroup MATERIALS = ItemGroup.MATERIALS;

    public static final ItemGroup BUILDING_BLOCKS = Blocks.STONE.getItemGroup();
    public static final ItemGroup COLORED_BLOCKS = Blocks.STONE.getItemGroup();
    public static final ItemGroup NATURAL = Blocks.STONE.getItemGroup();
    public static final ItemGroup FUNCTIONAL = Blocks.STONE.getItemGroup();
    public static final ItemGroup REDSTONE = Blocks.REDSTONE_WIRE.getItemGroup();
    public static final ItemGroup HOTBAR = ItemGroup.INVENTORY;
    public static final ItemGroup SEARCH = ItemGroup.SEARCH;
    public static final ItemGroup TOOLS = ItemGroup.TOOLS;
    public static final ItemGroup COMBAT = ItemGroup.COMBAT;
    public static final ItemGroup FOOD_AND_DRINK = ItemGroup.FOOD;
    public static final ItemGroup INGREDIENTS = ItemGroup.MATERIALS;
    public static final ItemGroup SPAWN_EGGS = ItemGroup.MISC;
    public static final ItemGroup OPERATOR = Blocks.STONE.getItemGroup();
    public static final ItemGroup INVENTORY = ItemGroup.INVENTORY;

    // ～1.19.2 Item Group
    public static final ItemGroup BREWING = ItemGroup.BREWING;
    public static final ItemGroup TRANSPORTATION = FUNCTIONAL;
    public static final ItemGroup DECORATIONS = NATURAL;
    public static final ItemGroup MISC = ItemGroup.MISC;
}