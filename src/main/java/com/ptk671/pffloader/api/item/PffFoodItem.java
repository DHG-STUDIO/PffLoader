package com.ptk671.pffloader.api.item;


public class PffFoodItem  extends PffItem implements IPffItem {

    private PffItemSettings settings;

    public PffFoodItem(PffItemSettings settings) {
        super(settings);
        this.settings = settings;
    }

    public PffFoodItem(PffItemSettings settings, int hunger, float saturation, boolean meat) {
        super(settings);
    }

    @Override
    public PffItemSettings getSettings() {
        return settings;
    }
}
