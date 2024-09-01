package com.ptk671.pffloader.api.util;

import net.minecraft.util.Identifier;

public class PffIdentifier {
    public static Identifier of(String MOD_ID, String path) {
        return Identifier.of(MOD_ID, path);
    }
}