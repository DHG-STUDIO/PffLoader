package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.api.itemgroup.PffItemAddCreativeTab_1_20;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.util.Rarity;

public class PffItemSetting {
    private Item.Settings settings = new Item.Settings();

    public PffItemSetting maxCount(int maxcount)
    {
        settings.maxCount(maxcount);
        return this;
    }

    public PffItemSetting maxDamageIfAbsent(int maxDamage)
    {
        settings.maxDamage(maxDamage);
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
    public PffItemSetting group(PffItem pffItem,RegistryKey<ItemGroup> itemGroup)
    {
        PffItemAddCreativeTab_1_20.registry(pffItem,itemGroup);
        return this;
    }

    //=>1.19.2
    public PffItemSetting group(RegistryKey<ItemGroup> itemGroup)
    {
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

    public PffItemSetting requires(FeatureFlag... features)
    {
        settings.requires(features);
        return this;
    }

    public Item.Settings build() {
        return settings;
    }

}