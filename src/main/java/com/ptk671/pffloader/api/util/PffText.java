package com.ptk671.pffloader.api.util;

import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.KeyBindComponent;

public class PffText {
    public static Text literal(String string) {
        return new LiteralText(string);
    }

    public static Text translatable(String key) {
        return new TranslatableText(key);
    }

    public static Text translatable(String key, Object... args) {
        return new TranslatableText(key, args);
    }

    public static Text empty() {
        return literal("");
    }

    public static Text keybind(String string) {
        return new KeyBindComponent(string);
    }

    public static String get(Text text) {
        return text.toString();
    }
}
