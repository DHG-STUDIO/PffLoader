package com.ptk671.pffloader.api.itemgroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SettingPffItemGroup {

    public static ItemGroup PFF_CREATIVE_TAB;
    public static ItemGroup PFF_CREATIVE_TAB_2;

    public static ItemGroup setup(String MOD_ID, String TAB_ID, Item pffItem, String DisplayName) {
        ItemGroup itemGroup =    FabricItemGroupBuilder.build(
                new Identifier(MOD_ID, TAB_ID),
                () -> new ItemStack(pffItem)
                        .setCustomName(Text.of(DisplayName))
        );
        return itemGroup;
    }
}
