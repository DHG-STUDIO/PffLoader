package com.ptk671.pffloader.api.itemgroup;

import net.legacyfabric.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.legacyfabric.fabric.api.util.Identifier;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.itemgroup.ItemGroup;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.List;

public class PffItemGroup {
    public net.legacyfabric.fabric.api.util.Identifier identifier;
    private ItemStack iconSupplier = null;
    private List<ItemStack> stacks2 = new ArrayList<>();
    private Text DisplayName;

    public PffItemGroup(net.legacyfabric.fabric.api.util.Identifier identifier) {
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
        stacks2.add(new ItemStack(item));
        return this;
    }

    public PffItemGroup DisplayName(Text text)
    {
        //>=1.20
        this.DisplayName = text;
        return this;
    }

    public ItemGroup build()
    {
        FabricItemGroupBuilder itemGroup = FabricItemGroupBuilder.create(identifier);
        if(iconSupplier != null) itemGroup.icon(() -> new ItemStack(iconSupplier.getItem()).getItem());
        if(stacks2 != null) itemGroup.appendItems(stacks -> {stacks.addAll(stacks2);});
        return itemGroup.build();
    }

    public Item getTabItem (int i)
    {
        return stacks2.get(i).getItem();
    }

    public Item getIcon ()
    {
         Item item2;
         item2 = BlockItem.fromBlock(Blocks.AIR);
        if(iconSupplier != null) item2 = iconSupplier.getItem();
        return item2;
    }

}