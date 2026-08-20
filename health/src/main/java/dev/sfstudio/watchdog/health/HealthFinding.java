package dev.sfstudio.watchdog.health;

public record HealthFinding(String findingId, String snapshotId, String reasonCode, HealthStatus status, long evidenceValue) { public HealthFinding { if(findingId==null||snapshotId==null||reasonCode==null||status==null) throw new IllegalArgumentException("finding fields required"); } }
