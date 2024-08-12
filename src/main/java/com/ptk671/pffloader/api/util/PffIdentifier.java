package com.ptk671.pffloader.api.util;

import net.legacyfabric.fabric.api.util.Identifier;

public class PffIdentifier {
    public static net.legacyfabric.fabric.api.util.Identifier of(String MOD_ID, String path) {
        return new Identifier(MOD_ID, path);
    }
}