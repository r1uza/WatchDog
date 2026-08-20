package dev.sfstudio.watchdog.presentation_backup;

public record BackupProjection(String backupId, String integrity, String restoreState) {}
