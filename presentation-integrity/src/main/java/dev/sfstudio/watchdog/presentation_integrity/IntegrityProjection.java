package dev.sfstudio.watchdog.presentation_integrity;

public record IntegrityProjection(String state, long checked, long violations, long quarantined) {}
