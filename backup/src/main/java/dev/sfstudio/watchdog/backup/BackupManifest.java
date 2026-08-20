package dev.sfstudio.watchdog.backup;

import java.time.Instant; import java.util.Map;
public record BackupManifest(String backupId, String sourceRelease, Instant createdAt, Map<String,String> artifacts) { public BackupManifest { artifacts=Map.copyOf(artifacts); } }
