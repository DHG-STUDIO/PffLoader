package com.ptk671.pffloader.api.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class PffBlock extends  Block{
    public PffBlock(Material material, MaterialColor materialColor) {
        super(material, materialColor);
    }

    public PffBlock(Material material) {
        super(material);
    }
}
