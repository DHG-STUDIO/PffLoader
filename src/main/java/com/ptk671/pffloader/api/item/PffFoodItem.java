package com.ptk671.pffloader.api.item;

import net.minecraft.item.FoodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.CommonI18n;

public class PffFoodItem  extends FoodItem {
    public PffFoodItem(int i, float f, boolean bl) {
        super(i, f, bl);
    }

    public PffFoodItem(int i, boolean bl) {
        super(i, bl);
    }

    @Override
    public String getDisplayName(ItemStack stack) {
        return CommonI18n.translate(stack.getTranslationKey().intern());
    }
}
