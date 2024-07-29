package com.ptk671.pffloader.api.util;

import net.minecraft.text.*;

public class PffText {
    public static MutableText literal(String string) {
        return new LiteralText(string);
    }

    public static MutableText translatable(String key) {
        return new TranslatableText(key);
    }

    public static MutableText translatable(String key, Object... args) {
        return new TranslatableText(key, args);
    }

    public static MutableText empty() {
        return literal("");
    }

    public static MutableText keybind(String string) {
        return new KeybindText(string);
    }

    public static String get(Text text) {
        return text.getString();
    }
}
