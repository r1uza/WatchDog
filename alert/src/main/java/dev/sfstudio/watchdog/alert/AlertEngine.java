package dev.sfstudio.watchdog.alert;

import dev.sfstudio.watchdog.health.HealthFinding; import dev.sfstudio.watchdog.watch.*; import java.time.Instant;
public final class AlertEngine { public Alert create(String id, WatchRule rule, WatchEvaluation e, HealthFinding f, Instant at){ if(!e.matched()) throw new IllegalArgumentException("evaluation did not match"); AlertSeverity sev=f.status()==dev.sfstudio.watchdog.health.HealthStatus.UNHEALTHY?AlertSeverity.CRITICAL:AlertSeverity.WARNING; return new Alert(id,rule.watchRuleId(),rule.revision(),f.findingId(),f.reasonCode(),sev,AlertStatus.OPEN,at); } }
