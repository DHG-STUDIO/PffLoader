package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import com.ptk671.pffloader.api.util.CompatIdentifier;
import net.legacyfabric.fabric.api.util.Identifier;
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
    private boolean maxDamageIfAbsent_boolen = false;
    private Item recipeRemainder;
    private Rarity rarity;
    private boolean fireproof_boolen = false;
    private int maxDamageIfAbsent;
    private boolean Fireproof_boolen = false;
    private final Identifier id;
    private final CompatIdentifier compatIdentifier;
    public PffItemSettings(CompatIdentifier compatIdentifier){
        this.compatIdentifier = compatIdentifier;
        this.id = compatIdentifier.toLegacyFabric();
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

    public Optional<CompatIdentifier> getCompatIdentifier() {
        return Optional.ofNullable(compatIdentifier);
    }

    public Optional<Identifier> getIdentifier() {
        return Optional.ofNullable(id);
    }

}