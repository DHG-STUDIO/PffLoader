package com.ptk671.pffloader.api.block;

import com.ptk671.pffloader.api.util.CompatIdentifier;
import net.legacyfabric.fabric.api.util.Identifier;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.sound.BlockSoundGroup;

import java.util.Optional;
import java.util.function.ToIntFunction;

public class PffBlockSettings {

private boolean CopySetting = false;
private Block dropsLike;

private BlockSoundGroup blockSoundGroup;
private float slipperiness = 0;
    private final Identifier id;
    private final CompatIdentifier compatIdentifier;
    private boolean air = false;
    private Block dropLike = null;
    private boolean breakInstantly = false;
    private boolean dropsNothing = false;
    private boolean dynamicBounds = false;
    private boolean noBlockBreakParticles = false;
    private boolean requiresTool = false;
    private boolean noCollision = false;
    private boolean nonOpaque = false;
    private float hardness = 0;
    private float resistance = 0;
    private boolean ticksRandomly = false;
    private BlockSoundGroup sounds = null;
    private ToIntFunction<BlockState> luminance = null;
    private float jumpVelocityMultiplie = 0;
    private float velocityMultiplier = 0;

    public PffBlockSettings(CompatIdentifier compatIdentifier) {

        this.compatIdentifier = compatIdentifier;
        this.id = compatIdentifier.toLegacyFabric();

    }

    public PffBlockSettings copyOf(PffBlock pffBlock) {

       this.CopySetting = true;
        return this;
    }

    public PffBlockSettings copyOf(PffBlockSettings pffBlockSetting) {
        return this;
    }

    public PffBlockSettings air() {
    this.air = true;
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
        this.dropLike = source;
        return this;
    }

    public PffBlockSettings breakInstantly() {
        this.breakInstantly = true;
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
        this.requiresTool = true;
        return this;
    }

    public PffBlockSettings noCollision() {
        this.noCollision = true;
        return this;
    }

    public PffBlockSettings nonOpaque() {
    this.nonOpaque = true;
    return this;
    }

    public PffBlockSettings strength(float strength) {
        this.hardness = strength;
        this.resistance = 0.0F;
        return this;
    }

    public PffBlockSettings strength(float hardness, float resistance) {
        this.hardness = hardness;
        this.resistance = resistance;
        return this;
    }

    public PffBlockSettings ticksRandomly() {
    this.ticksRandomly = true;
    return this;
    }

    public PffBlockSettings sounds(BlockSoundGroup blockSoundGroup) {
        this.sounds(blockSoundGroup);
        return this;
    }

    public PffBlockSettings luminance(ToIntFunction<BlockState> luminance) {
        this.luminance = luminance;
        return this;
    }

    public PffBlockSettings jumpVelocityMultiplier(float jumpVelocityMultiplier) {
        this.jumpVelocityMultiplie = jumpVelocityMultiplier;
        return this;
    }

    public PffBlockSettings slipperiness(float slipperiness) {
        this.slipperiness(slipperiness);
        return this;
    }

    public PffBlockSettings velocityMultiplier(float velocityMultiplier) {
            this.velocityMultiplier = velocityMultiplier;
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


        PffBlock settings = new PffBlock(Material.STONE);
        if (this.hardness != 0) settings.setStrength(hardness);
        if (this.resistance != 0 ) settings.setResistance(resistance);
        if (this.blockSoundGroup != null) settings.setBlockSoundGroup(blockSoundGroup);
        //if (this.requiresTool) build.();
        return settings;
    }
    public Optional<CompatIdentifier> getCompatIdentifier() {
        return Optional.ofNullable(compatIdentifier);
    }
    public CompatIdentifier getCompatIdentifier2() {
        return this.compatIdentifier;
    }

    public Optional<Identifier> getIdentifier() {
        return Optional.ofNullable(id);
    }
}