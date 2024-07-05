package com.ptk671.pffloader;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class Add {

    public static RegistryKey<ItemGroup> PFF_CREATIVE_TAB;
    public static void SettingPPFItemGroup (String MOD_ID,String TAB_ID, Item pffItem,String DisplayName)
    {
         PFF_CREATIVE_TAB = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID,TAB_ID));
        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, TAB_ID), FabricItemGroup.builder()
                .displayName(Text.of(DisplayName))
                .icon(() -> new ItemStack(pffItem)).build());

    }


    public static PffItem AddPffItem(String MOD_ID, String ITEM_ID, int maxCount) {
        PffItem pffItem = Registry.register(Registries.ITEM, new Identifier(MOD_ID, ITEM_ID), new PffItem(new FabricItemSettings()
                .maxCount(maxCount)

        ));

        ItemGroupEvents.modifyEntriesEvent( PFF_CREATIVE_TAB).register(content -> {
            content.add(pffItem);
    });
        return pffItem;
    }

    public static PffItem AddPffHideItem(String MOD_ID, String ITEM_ID, int maxCount)
    {

        PffItem pffItem =  Registry.register(Registries.ITEM, new Identifier(MOD_ID,ITEM_ID),


                new PffItem (new FabricItemSettings()
                        .maxCount(maxCount)
                ));

        return pffItem;
    }

}