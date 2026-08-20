package dev.sfstudio.watchdog.settings;

import java.time.Duration;
public record WatchDogSettingsSnapshot(int version, boolean notificationsEnabled, Duration freshnessThreshold, boolean localDataOnly, boolean diagnosticExportAllowed) { public WatchDogSettingsSnapshot { if(version<1||freshnessThreshold==null||freshnessThreshold.isNegative()) throw new IllegalArgumentException("settings"); } }
