package dev.sfstudio.watchdog.notification;

import dev.sfstudio.watchdog.alert.Alert; import dev.sfstudio.watchdog.settings.WatchDogSettingsSnapshot;
public final class NotificationPolicyEvaluator { public boolean eligible(Alert alert, WatchDogSettingsSnapshot settings, boolean alreadyDelivered){ return settings.notificationsEnabled() && !alreadyDelivered && alert.status()==dev.sfstudio.watchdog.alert.AlertStatus.OPEN; } }
