package com.ptk671.pffloader.api.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.CommonI18n;

public class PffItem extends Item implements IPffItem {

    private PffItemSettings settings;

    @Deprecated
    public PffItem(PffItemSettings settings) {
        this.settings = settings;
    }

    @Override
    public String getDisplayName(ItemStack stack) {
        return CommonI18n.translate(stack.getTranslationKey().intern());
    }

    public PffItem(){
        settings = null;
    }

    @Override
    public PffItemSettings getSettings() {
        return settings;
    }
}
