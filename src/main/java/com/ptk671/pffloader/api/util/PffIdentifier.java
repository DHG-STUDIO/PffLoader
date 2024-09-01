package com.ptk671.pffloader.api.util;


public class PffIdentifier {

    public static CompatIdentifier of(String namespace, String path) {
        return new CompatIdentifier(namespace, path);
    }
}