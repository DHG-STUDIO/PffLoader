package com.ptk671.pffloader.api.util;

import net.minecraft.util.Identifier;

public class PffIdentifier {
    public static Identifier of(String MOD_ID, String path) {
        return new Identifier(MOD_ID, path);
    }
}