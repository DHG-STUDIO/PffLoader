package com.ptk671.pffloader.api.itemgroup;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class PffItemGroup {
    private final Identifier identifier;
    private ItemStack iconSupplier = null;
    private List<ItemStack> entries2 = new ArrayList<>();

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
        entries2.add(new ItemStack(item));
        return this;
    }

    public ItemGroup build() {
        return FabricItemGroup.builder()
                .icon(() -> new ItemStack(iconSupplier.getItem()))
                .entries((context, entries) -> {entries.addAll(entries2);})
                .displayName(Text.translatable("itemGroup."+identifier.getNamespace()+"."+identifier.getPath()))
                .build();
    }
}