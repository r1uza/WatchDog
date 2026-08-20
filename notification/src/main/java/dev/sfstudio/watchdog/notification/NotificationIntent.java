package dev.sfstudio.watchdog.notification;

import dev.sfstudio.watchdog.alert.AlertSeverity;
public record NotificationIntent(String notificationId, String alertId, AlertSeverity severity, String deduplicationKey, boolean acknowledgeAction) {}
