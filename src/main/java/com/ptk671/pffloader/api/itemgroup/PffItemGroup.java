package com.ptk671.pffloader.api.itemgroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class PffItemGroup {
    private final Identifier identifier;
    private ItemStack iconSupplier = null;
    private List<ItemStack> stacks2 = new ArrayList<>();

    public PffItemGroup(Identifier identifier) {
        this.identifier = identifier;
    }


    public static PffItemGroup create(Identifier identifier) {
        return new PffItemGroup(identifier);
    }

    public PffItemGroup setIcon(ItemStack iconSupplier) {
        this.iconSupplier = iconSupplier;
        return this;

    }

    public PffItemGroup setIcon(Item PffItem)
    {
        return setIcon(new ItemStack(PffItem));
    }

    public PffItemGroup appendItems(Item item)
    {
        stacks2.add(new ItemStack(item));
        return this;
    }

    public ItemGroup build()
    {

        ItemGroup itemGroup = FabricItemGroupBuilder.create(identifier)
                .icon(() -> new ItemStack(iconSupplier.getItem()))
                .appendItems(stacks -> {
                    stacks.addAll(stacks2);
                })
                .build();
        return itemGroup;
    }

}