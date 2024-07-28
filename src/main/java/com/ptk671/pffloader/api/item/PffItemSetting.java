package com.ptk671.pffloader.api.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class PffItemSetting {
    private FabricItemSettings settings = new FabricItemSettings();

    public PffItemSetting maxCount(int maxcount)
    {
        settings.maxCount(maxcount);
        return this;
    }

    public PffItemSetting maxDamageIfAbsent(int maxDamage)
    {
        settings.maxDamageIfAbsent(maxDamage);
        return this;
    }

    public PffItemSetting maxDamage(int maxDamage)
    {
        settings.maxDamage(maxDamage);
        return this;
    }
    public PffItemSetting recipeRemainder(Item recipeRemainder)
    {
        settings.recipeRemainder(recipeRemainder);
        return this;
    }

    //>=1.19.3
    public PffItemSetting group(PffItem pffItem,ItemGroup itemGroup)
    {
        settings.group(itemGroup);
        return this;
    }

    //=>1.19.2
    public PffItemSetting group(ItemGroup itemGroup)
    {
        settings.group(itemGroup);
        return this;
    }

    public PffItemSetting rarity(Rarity rarity)
    {
        settings.rarity(rarity);
        return this;
    }

    public PffItemSetting fireproof()
    {
        settings.fireproof();
        return this;
    }

    public PffItemSetting food(PffFoodComponent foodComponent)
    {
        settings.food(foodComponent.build());
        return this;
    }

    public FabricItemSettings build() {
        return settings;
    }

}