package com.ptk671.pffloader.api.item;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.CommonI18n;


public class PffBlockItem extends BlockItem implements IPffItem {
    private PffItemSettings settings = null;

    public PffBlockItem(Block block) {
        super(block);
    }

    public PffBlockItem(PffItemSettings settings, Block block) {
        super(block);
        this.settings = settings;
    }

    @Override
    public String getDisplayName(ItemStack stack) {
        return CommonI18n.translate(  "block." + stack.getTranslationKey().intern());
    }

    @Override
    public PffItemSettings getSettings() {
        return settings;
    }
}
