package dev.sfstudio.watchdog.application;

import dev.sfstudio.watchdog.alert.Alert; import dev.sfstudio.watchdog.health.HealthFinding; import dev.sfstudio.watchdog.snapshot.DeviceSnapshot; import java.util.List;
public record MonitoringRun(DeviceSnapshot snapshot, List<HealthFinding> findings, List<Alert> alerts) { public MonitoringRun { findings=List.copyOf(findings); alerts=List.copyOf(alerts); } }
