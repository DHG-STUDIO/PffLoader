package com.ptk671.pffloader.api.item;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.CommonI18n;


public class PffBlockItem extends BlockItem {
    public PffBlockItem(Block block) {
        super(block);
    }

    @Override
    public String getDisplayName(ItemStack stack) {
        return CommonI18n.translate(  "block." + stack.getTranslationKey().intern());
    }
}
