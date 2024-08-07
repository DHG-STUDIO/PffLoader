package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.api.block.PffBlock;

public class CompatiblePffItemSetting {


    public static PffItem of(PffItemSettings pffItemSettings)
    {
        PffItem build = new PffItem(pffItemSettings);
        return  build;
    }

    public static PffBlockItem of(PffBlock pffBlockItem, PffItemSettings pffItemSettings)
    {
        PffBlockItem build = new PffBlockItem(pffBlockItem,pffItemSettings);
        return  build;
    }

    public static PffFoodItem ofFood(PffFoodComponent pffFoodComponent,PffItemSettings pffItemSettings)
    {
        PffFoodItem build = new PffFoodItem(pffItemSettings.food(pffFoodComponent));
        return  build;
    }


}