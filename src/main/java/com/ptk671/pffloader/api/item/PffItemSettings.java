package com.ptk671.pffloader.api.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.itemgroup.ItemGroup;
import net.minecraft.util.Rarity;


public class PffItemSettings {
  //  private Item settings = new Item();
    private int maxCount = 64;
    private ItemGroup itemGroup;
    private int MaxDamage;
    private boolean MaxDamage_boolen = false;
    private Item recipeRemainder;

    public PffItemSettings maxCount(int maxcount)
    {
        this.maxCount = maxcount;
        return this;
    }

    public PffItemSettings maxDamageIfAbsent(int maxDamage)
    {
        //settings.maxDamageIfAbsent(maxDamage);
        return this;
    }

    public PffItemSettings maxDamage(int maxDamage)
    {
        this.MaxDamage_boolen = true;
        this.MaxDamage = maxDamage;
        //settings.maxDamage(maxDamage);
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

    public PffItemSettings rarity(Rarity rarity)
    {
        //settings.rarity(rarity);
        return this;
    }

    public PffItemSettings fireproof()
    {
        return this;
    }
   // public PffItemSettings food(PffFoodComponent pffFoodComponent)
   // {
        //settings.isFood(pffFoodComponent.build());
      //  return this;
  //  }


    public PffItem build() {
    PffItem build = new PffItem();
       build.setMaxCount(maxCount);
       build.setItemGroup(itemGroup);
         if (MaxDamage_boolen) build.setMaxCount(MaxDamage);
         if (itemGroup != null) build.setItemGroup(itemGroup);
         if (recipeRemainder != null)  build.setRecipeRemainder(recipeRemainder);

        return build;
    }

    public PffBlockItem buildBlockItem(Block block) {
        PffBlockItem build = new PffBlockItem(block);
        build.setMaxCount(maxCount);
        build.setItemGroup(itemGroup);
        if (MaxDamage_boolen) build.setMaxCount(MaxDamage);
        if (itemGroup != null) build.setItemGroup(itemGroup);
        if (recipeRemainder != null)  build.setRecipeRemainder(recipeRemainder);

        return build;
    }

    public PffFoodItem buildFood(PffFoodComponent pffFoodComponent) {

        int Hunger = pffFoodComponent.getHunger();
        float SaturationModifier = pffFoodComponent.getSaturationModifier();
        Boolean Meat = pffFoodComponent.getMeat();

        PffFoodItem build = new PffFoodItem(Hunger,SaturationModifier,Meat);
        build.setMaxCount(maxCount);
        build.setItemGroup(itemGroup);
        if (MaxDamage_boolen) build.setMaxCount(MaxDamage);
        if (itemGroup != null) build.setItemGroup(itemGroup);
        if (recipeRemainder != null)  build.setRecipeRemainder(recipeRemainder);

        return build;
    }
}