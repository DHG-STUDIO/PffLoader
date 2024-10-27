package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.itemgroup.ItemGroup;
import net.minecraft.util.Rarity;

import java.util.Optional;


public class PffItemSettings {
    private int maxCount = 64;
    private ItemGroup itemGroup;
    private PffItemGroup pffItemGroup;
    private int MaxDamage;
    private boolean MaxDamage_boolen = false;
    private Item recipeRemainder;
    private Rarity rarity;
    private boolean fireproof_boolen = false;
    private int maxDamageIfAbsent;
    private boolean Fireproof_boolen = false;

    public PffItemSettings maxCount(int maxcount)
    {
        this.maxCount = maxcount;
        return this;
    }
    //>=1.14x
    public PffItemSettings maxDamageIfAbsent(int maxDamageIfAbsent2)
    {
        maxDamageIfAbsent = maxDamageIfAbsent2;
        return this;
    }

    //>=1.14x
    public PffItemSettings maxDamage(int maxDamage)
    {
        this.MaxDamage_boolen = true;
        this.MaxDamage = maxDamage;
        return this;
    }

    public PffItemSettings recipeRemainder(Item recipeRemainder)
    {
        this.recipeRemainder = recipeRemainder;
        return this;
    }

    //>=1.19.3
    public PffItemSettings group(PffItem pffItem, ItemGroup itemGroup)
    {
        this.itemGroup = itemGroup;
        return this;
    }

    //=>1.19.2
    public PffItemSettings group(ItemGroup itemGroup)
    {
        this.itemGroup = itemGroup;
        return this;
    }

    public PffItemSettings group(PffItemGroup itemGroup) {
        /* for(Item item : buildedItems) {
            itemGroup.appendItems(item);
        } */
        this.pffItemGroup = itemGroup;
        return this;
    }

    //>=1.14x
    public PffItemSettings rarity(Rarity rarity)
    {

        this.rarity = rarity;
        return this;
    }

    public PffItemSettings fireproof()
    {
        this.fireproof_boolen = true;
        return this;
    }

    @Deprecated
    public PffItemSettings food(PffFoodComponent pffFoodComponent)
    {
        return this;
    }

    public PffItem build() {
        PffItem build = new PffItem(this);
        build.setMaxCount(maxCount);
        if (itemGroup != null) build.setItemGroup(itemGroup);
        if (recipeRemainder != null)  build.setRecipeRemainder(recipeRemainder);
        return build;
    }

    public PffBlockItem buildBlockItem(Block block) {
        PffBlockItem build = new PffBlockItem(block);
        build.setMaxCount(maxCount);
        if (itemGroup != null) build.setItemGroup(itemGroup);
        if (recipeRemainder != null)  build.setRecipeRemainder(recipeRemainder);
        return build;
    }

    public PffFoodItem buildFood(PffFoodComponent pffFoodComponent) {
        int Hunger = pffFoodComponent.getHunger();
        float SaturationModifier = pffFoodComponent.getSaturationModifier();
        boolean Meat = pffFoodComponent.getMeat();
        PffFoodItem build = new PffFoodItem(this,Hunger,SaturationModifier,Meat);
        build.setMaxCount(maxCount);
        if (itemGroup != null) build.setItemGroup(itemGroup);
        if (recipeRemainder != null)  build.setRecipeRemainder(recipeRemainder);

        return build;
    }

    // ----

    public Optional<ItemGroup> getItemGroup() {
        return Optional.ofNullable(itemGroup);
    }

    public Optional<PffItemGroup> getPffItemGroup() {
        return Optional.ofNullable(pffItemGroup);
    }
}