package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

import java.util.Optional;

public class PffItemSettings {
    private FabricItemSettings settings = new FabricItemSettings();
    private int maxCount = 64;
    private ItemGroup itemGroup;
    private PffItemGroup pffItemGroup;
    private int MaxDamage;
    private boolean MaxDamage_boolen = false;
    private boolean maxDamageIfAbsent_boolen = false;
    private Item recipeRemainder;
    private Rarity rarity;
    private boolean fireproof_boolen = false;
    private int maxDamageIfAbsent;
    private boolean Fireproof_boolen = false;
    private PffFoodComponent pffFoodComponent = null;
    private  FoodComponent foodComponent;

    public PffItemSettings maxCount(int maxcount)
    {
        this.maxCount = maxcount;
        return this;
    }

    public PffItemSettings maxDamageIfAbsent(int maxDamageIfAbsent)
    {
        this.maxDamageIfAbsent_boolen = true;
        this.maxDamageIfAbsent = maxDamageIfAbsent;
        return this;
    }

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


    public PffItemSettings group(ItemGroup itemGroup)
    {
            this.itemGroup = itemGroup;
            return this;
    }


    public PffItemSettings group(PffItemGroup itemGroup)
    {
        this.pffItemGroup = itemGroup;
        return this;
    }

    public PffItemSettings rarity(Rarity rarity)
    {
        this.rarity = rarity;
        return this;
    }

    public PffItemSettings fireproof()
    {
        //>=1.16
        this.fireproof_boolen = true;
        return this;
    }

    public PffItemSettings food(PffFoodComponent foodComponent)
    {
            this.pffFoodComponent = foodComponent;
            return this;
    }

    public FabricItemSettings build() {
        settings.maxCount(maxCount);
        if (maxDamageIfAbsent_boolen) settings.maxDamageIfAbsent(maxDamageIfAbsent);
        if (MaxDamage_boolen) settings.maxDamage(MaxDamage);
        if (recipeRemainder != null) settings.recipeRemainder(recipeRemainder);
        if (rarity != null) settings.rarity(rarity);
        if (itemGroup != null) settings.group(itemGroup);
        if (foodComponent != null) settings.food(foodComponent);
        return settings;
    }

    // ----

    public Optional<ItemGroup> getItemGroup() {
        return Optional.ofNullable(itemGroup);
    }

    public Optional<PffItemGroup> getPffItemGroup() {
        return Optional.ofNullable(pffItemGroup);
    }

}