package com.ptk671.pffloader;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Add {


    public static Item item(ItemGroup itemGroup)
    {
      Item item = new Item(new FabricItemSettings().group(itemGroup));
        return item;
    }





    public static ItemGroup itemGroup(String MOD_ID, String TabId, Item item)
    {

       FabricItemGroupBuilder fabricItemGroupBuilder = FabricItemGroupBuilder.create(new Identifier(MOD_ID,TabId))
               .icon(() -> new ItemStack(item));
      return fabricItemGroupBuilder.build();

    }

}
