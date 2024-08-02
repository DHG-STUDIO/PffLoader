package com.ptk671.pffloader.api.util;

import net.minecraft.text.MutableText;
import net.minecraft.text.Text;

public class PffText {
    public static MutableText literal(String string) {
        return Text.literal(string);
    }

    public static MutableText translatable(String key) {
        return Text.translatable(key);
    }

    public static MutableText translatable(String key, Object... args) {
        return Text.translatable(key, args);
    }

    public static MutableText empty() {
        return literal("");
    }

    public static MutableText keybind(String string) {
        return Text.keybind(string);
    }

    public static String get(Text text) {
        return text.getString();
    }
}
