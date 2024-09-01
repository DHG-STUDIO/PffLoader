package com.ptk671.pffloader.api.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.sound.BlockSoundGroup;

import java.util.function.ToIntFunction;

public class PffBlockSettings {

private boolean CopySetting = false;
private Block dropsLike;
private boolean breakInstantly = false;
private boolean dropsNothing = false;
private boolean dynamicBounds = false;
private boolean noBlockBreakParticles = false;
private boolean requiresTool = false;
private float hardness = 0;
private float resistance = 0;
private BlockSoundGroup blockSoundGroup;
private float slipperiness = 0;

    public PffBlockSettings() {

    }

    public PffBlockSettings copyOf(PffBlock pffBlock) {

       this.CopySetting = true;
        return this;
    }

    public PffBlockSettings copyOf(PffBlockSettings pffBlockSetting) {
        return this;
    }

    public PffBlockSettings air() {
        //not support
        return this;
    }

/*
    public PffBlockSettings blockVision(AbstractBlock.ContextPredicate predicate) {
        settings.blockVision(predicate);
        return this;
    }

    public PffBlockSettings postProcess(AbstractBlock.ContextPredicate predicate) {
        settings.postProcess(predicate);
        return this;
    }

    public PffBlockSettings solidBlock(AbstractBlock.ContextPredicate predicate) {
        settings.solidBlock(predicate);
        return this;
    }

    public PffBlockSettings suffocates(AbstractBlock.ContextPredicate predicate) {
        settings.suffocates(predicate);
        return this;
    }

    @Deprecated
    public PffBlockSettings MaterialColor(Function<BlockState, MaterialColor> color) {
        return this;
    }
*/
    public PffBlockSettings dropsLike(Block source) {
        dropsLike = source;
        return this;
    }

    public PffBlockSettings breakInstantly() {
        breakInstantly = true;
        return this;
    }

    public PffBlockSettings dropsNothing() {
        this.dropsNothing = true;
        return this;
    }

    public PffBlockSettings dynamicBounds() {
        this.dynamicBounds = true;
        return this;
    }

    public PffBlockSettings noBlockBreakParticles() {
        this.noBlockBreakParticles = true;
        return this;
    }

    public PffBlockSettings requiresTool() {
        requiresTool = true;
        return this;
    }

    public PffBlockSettings noCollision() {

        return this;
    }

    public PffBlockSettings nonOpaque() {
        //not support
        return this;
    }

    public PffBlockSettings strength(Float strength) {
        this.resistance = strength;
        this.hardness = strength;
        return this;
    }

    public PffBlockSettings strength(Float hardness, Float resistance) {
        this.hardness = hardness;
        this.resistance = resistance;
        return this;
    }


    public PffBlockSettings ticksRandomly() {
        //settings.ticksRandomly();
        return this;
    }

    public PffBlockSettings sounds(BlockSoundGroup blockSoundGroup) {
        this.blockSoundGroup = blockSoundGroup;
        return this;
    }

    public PffBlockSettings luminance(ToIntFunction<BlockState> luminance) {
        //not support
        return this;
    }

    public PffBlockSettings jumpVelocityMultiplier(float jumpVelocityMultiplier) {
        //not support
        return this;
    }

    public PffBlockSettings slipperiness(float slipperiness) {
        this.slipperiness = slipperiness;
        return this;
    }

    public PffBlockSettings velocityMultiplier(float velocityMultiplier) {
        //not support
        return this;
    }

    /*

    public PffBlockSettings emissiveLighting(AbstractBlock.ContextPredicate predicate) {
        //not support
        return this;
    }

    public PffBlockSettings allowsSpawning(FabricBlockSettings.TypedContextPredicate<net.minecraft.entity.EntityType<?>> predicate) {
        //not support
        return this;
    }
*/
    public PffBlock build() {


        PffBlock build = new PffBlock(Material.STONE);
        if (this.hardness != 0) build.setStrength(hardness);
        if (this.resistance != 0 ) build.setResistance(resistance);
        if (this.blockSoundGroup != null) build.setBlockSoundGroup(blockSoundGroup);
        if (this.requiresTool) build.requiresSilkTouch();
        return build;
    }
}