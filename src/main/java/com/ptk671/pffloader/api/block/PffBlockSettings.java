package com.ptk671.pffloader.api.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import java.util.function.ToIntFunction;

public class PffBlockSettings {

    private final FabricBlockSettings settings;

    public PffBlockSettings() {
        this.settings = FabricBlockSettings.of(Material.STONE);
    }

    public PffBlockSettings copyOf(PffBlock pffBlock) {
        FabricBlockSettings.copy(pffBlock);
        return this;
    }

    public PffBlockSettings copyOf(PffBlockSettings pffBlockSetting) {
        FabricBlockSettings.copyOf(pffBlockSetting.build());
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
        settings.dropsLike(source);
        return this;
    }

    public PffBlockSettings breakInstantly() {
        settings.breakInstantly();
        return this;
    }

    public PffBlockSettings dropsNothing() {
        settings.dropsNothing();
        return this;
    }

    public PffBlockSettings dynamicBounds() {
        settings.dynamicBounds();
        return this;
    }

    public PffBlockSettings noBlockBreakParticles() {
        return this;
    }

    public PffBlockSettings requiresTool() {
        settings.requiresTool();
        return this;
    }

    public PffBlockSettings noCollision() {
        settings.noCollision();
        return this;
    }

    public PffBlockSettings nonOpaque() {
        //not support
        return this;
    }

    public PffBlockSettings strength(Float strength) {
        settings.strength(strength);
        return this;
    }

    public PffBlockSettings strength(Float hardness, Float resistance) {
        settings.strength(hardness,resistance);
        return this;
    }


    public PffBlockSettings ticksRandomly() {
        settings.ticksRandomly();
        return this;
    }

    public PffBlockSettings sounds(BlockSoundGroup blockSoundGroup) {
        settings.sounds(blockSoundGroup);
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
        settings.slipperiness(slipperiness);
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
    public FabricBlockSettings build() {
        return settings;
    }
}