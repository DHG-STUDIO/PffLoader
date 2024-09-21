package com.ptk671.pffloader.api.util;

import net.legacyfabric.fabric.api.util.Identifier;

public class PffIdentifier {

    public static CompatIdentifier compatId(String namespace, String path) {
        return new CompatIdentifier(namespace, path);
    }


    public static net.legacyfabric.fabric.api.util.Identifier of(String MOD_ID, String path) {
        return new Identifier(MOD_ID, path);
    }
}