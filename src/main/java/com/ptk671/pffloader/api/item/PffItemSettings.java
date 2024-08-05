package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.api.itemgroup.PffItemAddCreativeTab_1_20;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Rarity;

public class PffItemSettings {
    private Item.Settings settings = new Item.Settings();



    public PffItemSettings maxCount(int maxcount)
    {
        settings.maxCount(maxcount);
        return this;
    }

    public PffItemSettings maxDamageIfAbsent(int maxDamage)
    {
        settings.maxDamageIfAbsent(maxDamage);
        return this;
    }

    public PffItemSettings maxDamage(int maxDamage)
    {
        settings.maxDamage(maxDamage);
        return this;
    }
    public PffItemSettings recipeRemainder(Item recipeRemainder)
    {
        settings.recipeRemainder(recipeRemainder);
        return this;
    }

    //>=1.19.3
    public PffItemSettings group(PffItem pffItem, ItemGroup itemGroup)
    {
        PffItemAddCreativeTab_1_20.registry(pffItem,itemGroup);
        return this;
    }

    //=>1.19.2
    public PffItemSettings group(ItemGroup itemGroup)
    {

        return this;
    }

    public PffItemSettings rarity(Rarity rarity)
    {
        settings.rarity(rarity);
        return this;
    }

    public PffItemSettings fireproof()
    {
        settings.fireproof();
        return this;
    }

    public PffItemSettings food(PffFoodComponent pffFoodComponent)
    {
        settings.food(pffFoodComponent.build());
        return this;
    }

    public PffItemSettings food(FoodComponent foodComponent)
    {
        settings.food(foodComponent);
        return this;
    }

    public Item.Settings build() {
        return settings;
    }



}