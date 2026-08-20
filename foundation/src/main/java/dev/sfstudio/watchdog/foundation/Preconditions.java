package dev.sfstudio.watchdog.foundation;

public final class Preconditions {
    private Preconditions() {}
    public static <T> T requireNonNull(T value, String name) { if (value == null) throw new IllegalArgumentException(name + " is required"); return value; }
    public static String requireToken(String value, String name) { requireNonNull(value,name); String v=value.trim(); if(v.isEmpty() || !v.matches("[a-zA-Z0-9._:-]+")) throw new IllegalArgumentException(name+" is not canonical"); return v; }
}
