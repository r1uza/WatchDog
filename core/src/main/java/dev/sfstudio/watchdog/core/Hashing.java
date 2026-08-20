package dev.sfstudio.watchdog.core;

import java.security.MessageDigest;
import java.util.HexFormat;
public final class Hashing {
    private Hashing() {}
    public static String sha256(byte[] bytes) { try { return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(bytes)); } catch(Exception e) { throw new IllegalStateException(e); } }
}
