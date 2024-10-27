package com.ptk671.pffloader.api.item;

import com.ptk671.pffloader.api.block.PffBlock;

public class CompatiblePffItemSetting {

    public static PffItem of(PffItemSettings pffItemSettings)
    {
        PffItem build = pffItemSettings.build();
        return  build;
    }

    public static PffBlockItem of(PffBlock pffBlock, PffItemSettings pffItemSettings)
    {
        PffBlockItem buildBlockItem = pffItemSettings.buildBlockItem(pffBlock);
        return  buildBlockItem;
    }

    public static PffFoodItem ofFood(PffFoodComponent pffFoodComponent,PffItemSettings pffItemSettings)
    {
        PffFoodItem build = pffItemSettings.buildFood(pffFoodComponent);
        return build;
    }
}