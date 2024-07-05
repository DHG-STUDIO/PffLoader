package com.ptk671.pffloader;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Add {

    public static ItemGroup PFF_CREATIVE_TAB;
    public static void SettingPPFItemGroup  (String MOD_ID,String TAB_ID, Item pffItem,String DisplayName)
    {
      PFF_CREATIVE_TAB =  FabricItemGroupBuilder.build(
                new Identifier(TAB_ID),
                () -> new ItemStack(pffItem)
                        .setCustomName(Text.of(DisplayName))
      );
    }


    public static void AddPffItem(String MOD_ID,String ITEM_ID,int maxCount)
    {
        Registry.register(Registry.ITEM, new Identifier( MOD_ID,ITEM_ID),new PffItem (new FabricItemSettings()
                .maxCount(maxCount)
                .group(PFF_CREATIVE_TAB)
        ));
    }

    public static PffItem AddPffHideItem(String MOD_ID, String ITEM_ID, int maxCount)
    {

        PffItem pffItem =  Registry.register(Registry.ITEM, new Identifier(MOD_ID,ITEM_ID),


                new PffItem (new FabricItemSettings()
        .maxCount(maxCount)
        ));

        return pffItem;
    }

}
