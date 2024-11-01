package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import com.ptk671.pffloader.api.util.CompatIdentifier;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.Optional;

public class PffItemSettings {
    private Item.Settings settings = new Item.Settings();
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
    private PffFoodComponent pffFoodComponent = null;
    private FoodComponent foodComponent;
    private final Identifier id;
    private final CompatIdentifier compatIdentifier;
    private final RegistryKey<Item> key;

    public PffItemSettings(CompatIdentifier compatIdentifier){
        this.compatIdentifier = compatIdentifier;
        this.id = compatIdentifier.toMinecraft();
        this.key = RegistryKey.of(RegistryKeys.ITEM,id);
    }

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

    public Item.Settings build() {
        settings.maxCount(maxCount);
       // if (maxDamageIfAbsent_boolen) settings.maxDamageIfAbsent(maxDamageIfAbsent);
        if (MaxDamage_boolen) settings.maxDamage(MaxDamage);
        if (recipeRemainder != null) settings.recipeRemainder(recipeRemainder);
        if (rarity != null) settings.rarity(rarity);
       // if (itemGroup != null) PffItemAddCreativeTab_1_20.registry(,itemGroup);
        if (foodComponent != null) settings.food(foodComponent);
        if (fireproof_boolen) settings.fireproof();
        settings.useItemPrefixedTranslationKey();
        settings.registryKey(key);

        return settings;
    }

    // ----

    public Optional<ItemGroup> getItemGroup() {
        return Optional.ofNullable(itemGroup);
    }

    public Optional<PffItemGroup> getPffItemGroup() {
        return Optional.ofNullable(pffItemGroup);
    }

    public Optional<CompatIdentifier> getCompatIdentifier() {
        return Optional.ofNullable(compatIdentifier);
    }

    public Optional<Identifier> getIdentifier() {
        return Optional.ofNullable(id);
    }

    public Optional<RegistryKey<Item>> getKey(){

        return Optional.ofNullable(key);
    }
}