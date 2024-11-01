package com.ptk671.pffloader.api.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PffBlock extends  Block{
    private String translationKey;
    private PffBlockSettings settings;
    public PffBlock(Material material, MaterialColor materialColor) {
        super(material, materialColor);
    }

    public PffBlock(Material material) {
        super(material);
    }

    public PffBlock(Material material,PffBlockSettings pffBlockSettings) {
        super(material);
        settings = pffBlockSettings;
    }

    @Override
    public Block setStrength(float strength) {
        return super.setStrength(strength);
    }

    @Override
    public Block setBlockSoundGroup(BlockSoundGroup blockSoundGroup) {
        return super.setBlockSoundGroup(blockSoundGroup);
    }

    @Override
    public Block disableStats() {
        return super.disableStats();
    }

    @Override
    public Block setOpacity(int opacity) {
        return super.setOpacity(opacity);
    }

    @Override
    public Block setResistance(float resistance) {
        return super.setResistance(resistance);
    }

    @Override
    public Block setLightLevel(float lightLevel) {
        return super.setLightLevel(lightLevel);
    }

    @Override
    public Block setUnbreakable() {
        return super.setUnbreakable();
    }

    @Override
    public Block setTickRandomly(boolean tickRandomly) {
        return super.setTickRandomly(tickRandomly);
    }


    @Override
    public boolean requiresSilkTouch() {
        return super.requiresSilkTouch();
    }

    @Override
    public ItemStack createStackFromBlock(BlockState state) {
        return super.createStackFromBlock(state);
    }

    @Override
    public StateManager appendProperties() {
        return super.appendProperties();
    }

    @Override
    public void dropExperience(World world, BlockPos pos, int size) {
        super.dropExperience(world, pos, size);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public Block setTranslationKey(String key) {
        this.translationKey = key;
        return this;
    }

    public String getTranslationKey() {
        return this.translationKey;
    }


    public PffBlockSettings getBlockSettings() {
        return settings;
    }
}

