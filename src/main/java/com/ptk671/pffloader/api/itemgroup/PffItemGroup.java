package com.ptk671.pffloader.api.itemgroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class PffItemGroup {
    private final Identifier identifier;
    private Text displayName = null;
    private ItemStack iconSupplier = null;
    private boolean noRenderedName = false;
    private boolean noScrollbar = false;
    private boolean special = false;
    private String texture;
    private List<ItemStack> stacks2 = new ArrayList<>();

    public PffItemGroup(Identifier identifier) {
        this.identifier = identifier;
    }


    public static PffItemGroup create(Identifier identifier) {
        return new PffItemGroup(identifier);
    }

    public PffItemGroup setDisplayName(Text text) {
        this.displayName = text;
        return this;
    }

    public PffItemGroup setIcon(ItemStack iconSupplier) {
        this.iconSupplier = iconSupplier;
        return this;

    }

    public PffItemGroup setIcon(Item PffItem)
    {
        return setIcon(new ItemStack(PffItem));
    }

    public void noRenderedName() {
        this.noRenderedName = true;
    }

    public void noScrollbar() {
        this.noScrollbar = true;
    }

    public void special() {
        this.special = true;
    }

    public void setTexture(String texture) {
        this.texture = texture;
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
        if (displayName != null) itemGroup.setName(displayName.getString());
        if (noRenderedName) itemGroup.setName("");
        if (noScrollbar) itemGroup.setNoScrollbar();
        if (special) itemGroup.isSpecial();
        if (texture != null) itemGroup.setTexture(texture);
        return itemGroup;
    }

}