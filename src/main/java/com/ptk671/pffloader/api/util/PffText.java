package com.ptk671.pffloader.api.util;

import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

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
        return translatable(string);
    }

    public static String get(Text text) {
        return text.toString();
    }
}
