package dev.sfstudio.watchdog.integrity;

import dev.sfstudio.watchdog.core.Hashing;
public final class IntegrityVerifier { public IntegrityState verify(byte[] bytes, String expectedSha256){ return Hashing.sha256(bytes).equals(expectedSha256)?IntegrityState.VALID:IntegrityState.CORRUPTED; } }
