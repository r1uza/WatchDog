package dev.sfstudio.watchdog.core;

import java.nio.charset.StandardCharsets;
public final class CanonicalText { private CanonicalText() {} public static byte[] bytes(String text) { return text.replace("\r\n","\n").getBytes(StandardCharsets.UTF_8); } }
