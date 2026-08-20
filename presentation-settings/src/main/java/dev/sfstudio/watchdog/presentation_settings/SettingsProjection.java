package dev.sfstudio.watchdog.presentation_settings;

public record SettingsProjection(int version, boolean notificationsEnabled, boolean localOnly) {}
