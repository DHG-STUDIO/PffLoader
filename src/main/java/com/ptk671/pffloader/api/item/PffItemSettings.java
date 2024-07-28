package com.ptk671.pffloader.api.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class PffItemSettings {
    private FabricItemSettings settings = new FabricItemSettings();

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
        settings.group(itemGroup);
        return this;
    }

    //=>1.19.2
    public PffItemSettings group(ItemGroup itemGroup)
    {
        settings.group(itemGroup);
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

    public FabricItemSettings build() {
        return settings;
    }

}