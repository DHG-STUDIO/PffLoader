package com.ptk671.pffloader.api.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.CommonI18n;

public class PffItem extends Item {
    public PffItem(PffItemSettings settings) {
    }

    @Override
    public String getDisplayName(ItemStack stack) {
        return CommonI18n.translate(stack.getTranslationKey().intern());
    }

    public PffItem(){

    }
}
