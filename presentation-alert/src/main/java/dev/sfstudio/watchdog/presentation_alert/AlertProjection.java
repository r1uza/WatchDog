package dev.sfstudio.watchdog.presentation_alert;

public record AlertProjection(String alertId, String status, String severity, String reasonCode, boolean canAcknowledge) {}
