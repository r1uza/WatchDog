package dev.sfstudio.watchdog.release;

import java.util.List;
public record ReleaseManifest(String releaseId, String version, String protocol, List<Integer> includedCycles) { public ReleaseManifest { includedCycles=List.copyOf(includedCycles); } }
