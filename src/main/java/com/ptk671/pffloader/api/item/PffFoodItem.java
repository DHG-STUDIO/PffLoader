package com.ptk671.pffloader.api.item;

import net.minecraft.item.FoodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.CommonI18n;

public class PffFoodItem  extends FoodItem implements IPffItem {

    private PffItemSettings settings = null;

    public PffFoodItem(int i, float f, boolean bl) {
        super(i, f, bl);
    }

    public PffFoodItem(int i, boolean bl) {
        super(i, bl);
    }

    public PffFoodItem(PffItemSettings settings, int hunger, float saturation, boolean meat) {
        this(hunger, saturation, meat);
        this.settings = settings;
    }

    @Override
    public String getDisplayName(ItemStack stack) {
        return CommonI18n.translate(stack.getTranslationKey().intern());
    }

    @Override
    public PffItemSettings getSettings() {
        return settings;
    }
}
