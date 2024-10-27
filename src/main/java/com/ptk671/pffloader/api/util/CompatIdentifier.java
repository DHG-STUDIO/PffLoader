package com.ptk671.pffloader.api.util;



import net.minecraft.util.Identifier;

import java.util.Objects;

public class CompatIdentifier {

    private final String namespace; // ここ:path
    private final String path; // namespace:ここ

    public CompatIdentifier(String namespace, String path) {
        this.namespace = namespace;
        this.path = path;
    }

    public CompatIdentifier(String id) {
        String namespace, path = "";

        String[] strings = id.split(":");
        if (strings.length == 1) {
            namespace = "minecraft";
            path = id;
        } else {
            namespace = strings[0];
            path = strings[1];
        }

        this.namespace = namespace;
        this.path = path;
    }

    public CompatIdentifier(Identifier id) {
        this(id.getNamespace(), id.getPath());
    }

    public static CompatIdentifier of(String namespace, String path) {
        return new CompatIdentifier(namespace, path);
    }

    public static CompatIdentifier of(String id) {
        return new CompatIdentifier(id);
    }

    public String getNamespace() {
        return namespace;
    }

    public String getPath() {
        return path;
    }

    public net.minecraft.util.Identifier toMinecraft() {
        return Identifier.of(namespace, path);
    }

    @Override
    public String toString() {
        return namespace + ":" + path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Identifier)
            o = new CompatIdentifier((Identifier) o);

        if (o instanceof net.minecraft.util.Identifier)
            o = new CompatIdentifier((net.minecraft.util.Identifier) o);

        if (o == null || getClass() != o.getClass()) return false;
        CompatIdentifier that = (CompatIdentifier) o;
        return Objects.equals(namespace, that.namespace) && Objects.equals(path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, path);
    }
}
