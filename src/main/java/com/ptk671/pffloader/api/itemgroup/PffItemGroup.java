package com.ptk671.pffloader.api.itemgroup;

import com.ptk671.pffloader.api.util.CompatIdentifier;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class PffItemGroup {
    public Identifier identifier;
    private ItemStack iconSupplier = null;
    private List<ItemStack> stacks2 = new ArrayList<>();
    private Text DisplayName;

    public PffItemGroup(Identifier identifier) {
        this.identifier = identifier;
    }

    public static PffItemGroup create(CompatIdentifier identifier) {
        return new PffItemGroup(identifier.toMinecraft());
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
        ItemGroup.Builder itemGroup = FabricItemGroup.builder(identifier);
        if(iconSupplier != null) itemGroup.icon(() -> new ItemStack(iconSupplier.getItem()));
        if(stacks2 != null) itemGroup.entries((enabledFeatures, entries, operatorEnabled) -> {entries.addAll(stacks2);});
        return itemGroup.build();

    }

    public Item getTabItem (int i)
    {
        return stacks2.get(i).getItem();
    }

    public Item getIcon ()
    {
        Item item;
        item = Items.AIR;
        if(iconSupplier != null) item = iconSupplier.getItem();
        return item;
    }

}