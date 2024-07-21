package com.ptk671.pffloader.api.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class PffBlockSetting {

    private final AbstractBlock.Settings settings;

    public PffBlockSetting() {
        this.settings = AbstractBlock.Settings.of(Material.STONE);
    }


    public PffBlockSetting copyOf(PffBlock pffBlock) {
        AbstractBlock.Settings.copy(pffBlock);
        return this;
    }

    public PffBlockSetting copyOf(PffBlockSetting pffBlockSetting) {
        FabricBlockSettings.copyOf(pffBlockSetting.build());
        return this;
    }

    public PffBlockSetting air() {
        settings.air();
        return this;
    }

    public PffBlockSetting blockVision(AbstractBlock.ContextPredicate predicate) {
        settings.blockVision(predicate);
        return this;
    }

    public PffBlockSetting postProcess(AbstractBlock.ContextPredicate predicate) {
        settings.postProcess(predicate);
        return this;
    }

    public PffBlockSetting solidBlock(AbstractBlock.ContextPredicate predicate) {
        settings.solidBlock(predicate);
        return this;
    }

    public PffBlockSetting suffocates(AbstractBlock.ContextPredicate predicate) {
        settings.suffocates(predicate);
        return this;
    }

    public PffBlockSetting mapColor(MapColor color) {
        settings.mapColor(color);
        return this;
    }

    public PffBlockSetting mapColor(DyeColor color) {
        settings.mapColor(color.getMapColor());
        return this;
    }

    @Deprecated
    public PffBlockSetting mapColor(Function<BlockState, MapColor> color) {
        return this;
    }

    public PffBlockSetting dropsLike(Block source) {
        settings.dropsLike(source);
        return this;
    }

    public PffBlockSetting breakInstantly() {
        settings.breakInstantly();
        return this;
    }

    public PffBlockSetting dropsNothing() {
        settings.dropsNothing();
        return this;
    }

    public PffBlockSetting dynamicBounds() {
        settings.dynamicBounds();
        return this;
    }

    public PffBlockSetting hardness(float hardness) {
        settings.hardness(hardness);
        return this;
    }

    public PffBlockSetting noBlockBreakParticles() {
        return this;
    }

    public PffBlockSetting requiresTool() {
        settings.requiresTool();
        return this;
    }

    public PffBlockSetting noCollision() {
        settings.noCollision();
        return this;
    }

    public PffBlockSetting nonOpaque() {
        settings.nonOpaque();
        return this;
    }

    public PffBlockSetting resistance(float resistance) {
        settings.resistance(resistance);
        return this;
    }

    public PffBlockSetting strength(Float strength) {
        settings.strength(strength);
        return this;
    }

    public PffBlockSetting strength(Float hardness,Float resistance) {
        settings.strength(hardness,resistance);
        return this;
    }


    public PffBlockSetting ticksRandomly() {
        settings.ticksRandomly();
        return this;
    }

    public PffBlockSetting sounds(BlockSoundGroup blockSoundGroup) {
        settings.sounds(blockSoundGroup);
        return this;
    }

    public PffBlockSetting luminance(ToIntFunction<BlockState> luminance) {
        settings.luminance(luminance);
        return this;
    }

    public PffBlockSetting jumpVelocityMultiplier(float jumpVelocityMultiplier) {
        settings.jumpVelocityMultiplier(jumpVelocityMultiplier);
        return this;
    }

    public PffBlockSetting slipperiness(float slipperiness) {
        settings.slipperiness(slipperiness);
        return this;
    }

    public PffBlockSetting velocityMultiplier(float velocityMultiplier) {
        settings.velocityMultiplier(velocityMultiplier);
        return this;
    }

    public PffBlockSetting emissiveLighting(AbstractBlock.ContextPredicate predicate) {
        settings.emissiveLighting(predicate);
        return this;
    }

    public PffBlockSetting offset(AbstractBlock.OffsetType offsetType) {
        return this;
    }

    public PffBlockSetting allowsSpawning(AbstractBlock.TypedContextPredicate<net.minecraft.entity.EntityType<?>> predicate) {
        settings.allowsSpawning(predicate);
        return this;
    }

    public AbstractBlock.Settings build() {
        return  settings;
    }
}