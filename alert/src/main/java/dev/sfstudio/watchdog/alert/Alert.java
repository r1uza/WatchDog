package dev.sfstudio.watchdog.alert;

import java.time.Instant;
public record Alert(String alertId, String watchRuleId, int watchRuleRevision, String findingId, String reasonCode, AlertSeverity severity, AlertStatus status, Instant createdAt) {
 public Alert { if(alertId==null||watchRuleId==null||findingId==null||reasonCode==null||severity==null||status==null||createdAt==null) throw new IllegalArgumentException("alert fields"); }
 public Alert acknowledge(){ return status==AlertStatus.OPEN ? new Alert(alertId,watchRuleId,watchRuleRevision,findingId,reasonCode,severity,AlertStatus.ACKNOWLEDGED,createdAt) : this; }
}
