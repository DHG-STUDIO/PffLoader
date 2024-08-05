package com.ptk671.pffloader.api.item;

public class CompatiblePffItemSetting {


    public static PffItem of(PffItemSettings pffItemSettings)
    {
        PffItem build = new PffItem(pffItemSettings);
        return  build;
    }

    public static PffFoodItem ofFood(PffFoodComponent pffFoodComponent,PffItemSettings pffItemSettings)
    {
        PffFoodItem build = new PffFoodItem(pffItemSettings.food(pffFoodComponent));
        return  build;
    }


}