package com.ptk671.pffloader.api.itemgroup;

import com.ptk671.pffloader.api.util.PffText;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class PffItemGroup {
    public Identifier identifier;
    private ItemStack iconSupplier = null;
    private List<ItemStack> entries2 = new ArrayList<>();
    private Text DisplayName;

    public PffItemGroup(Identifier identifier) {
        this.identifier = identifier;
    }


    public static PffItemGroup create(Identifier identifier) {
        return new PffItemGroup(identifier);
    }

    public PffItemGroup Icon(ItemStack iconSupplier) {
        this.iconSupplier = iconSupplier;
        return this;

    }

    public PffItemGroup Icon(Item PffItem)
    {
        return Icon(new ItemStack(PffItem));
    }

    public PffItemGroup appendItems(Item item)
    {
        entries2.add(new ItemStack(item));
        return this;
    }

    public PffItemGroup DisplayName(Text text)
    {
        this.DisplayName = text;
        return this;
    }

    public ItemGroup build()
    {
        ItemGroup.Builder itemGroup = FabricItemGroup.builder(identifier);
        if(iconSupplier != null) itemGroup.icon(() -> new ItemStack(iconSupplier.getItem()));
        itemGroup.entries((enabledFeatures, entries, operatorEnabled) -> {entries.addAll(entries2);});
        if(DisplayName == null) itemGroup.displayName(PffText.translatable("itemGroup."+identifier.getNamespace()+"."+identifier.getPath()));
        if(DisplayName != null) itemGroup.displayName(DisplayName);
        return itemGroup.build();

    }

    public Item getTabItem (int i)
    {
        return entries2.get(i).getItem();
    }

    public Item getIcon ()
    {
        Item item;
        item = BlockItem.fromBlock(Blocks.AIR);
        if(iconSupplier != null) item = iconSupplier.getItem();
        return item;
    }

}