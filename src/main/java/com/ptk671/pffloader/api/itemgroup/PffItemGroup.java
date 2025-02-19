package com.ptk671.pffloader.api.itemgroup;

import com.ptk671.pffloader.api.util.CompatIdentifier;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
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
    private Identifier identifier;
    private CompatIdentifier compatIdentifier;
    private ItemStack iconSupplier = null;
    private List<ItemStack> stacks2 = new ArrayList<>();
    private Text DisplayName;
    private ItemGroup settings;

    public PffItemGroup(CompatIdentifier identifier) {
        this.identifier = identifier.toMinecraft();
    }

    public static PffItemGroup create(CompatIdentifier identifier) {
        return new PffItemGroup(identifier);
    }

    public PffItemGroup(){
        settings = null;
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
        if(iconSupplier != null) itemGroup.icon(() -> new ItemStack(iconSupplier.getItem()));
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

    public CompatIdentifier getCompatid(){
        return compatIdentifier;
    }

    public Identifier getIdentifier(){
        return identifier;
    }
}