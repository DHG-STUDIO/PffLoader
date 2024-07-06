package com.ptk671.pffloader.api.itemgroup;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SettingPffItemGroup {
    public static RegistryKey<ItemGroup> PFF_CREATIVE_TAB;
    public static RegistryKey<ItemGroup> PFF_CREATIVE_TAB_2;

    public static RegistryKey<ItemGroup> setup(String MOD_ID, String TAB_ID, Item pffItem, String DisplayName) {
        RegistryKey<ItemGroup> itemgroup = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, TAB_ID));
        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, TAB_ID), FabricItemGroup.builder()
                .displayName(Text.translatable(DisplayName))
                .icon(() -> new ItemStack(pffItem)).build());

        return itemgroup;
    }
}
