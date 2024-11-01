package com.ptk671.pffloader.api.item;

import net.minecraft.item.Item;

public class PffItem extends Item implements IPffItem {

    private PffItemSettings settings;

    @Deprecated
    public PffItem(PffItemSettings pffItemSettings) {
        super(pffItemSettings.build());
        this.settings = pffItemSettings;
    }
    public PffItem(){
        super(null);
        settings = null;
    }

    @Override
    public PffItemSettings getSettings() {
        return settings;
    }
}
