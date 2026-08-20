package dev.sfstudio.watchdog.snapshot;

import dev.sfstudio.watchdog.device.DeviceId; import java.time.Instant; import java.util.Map;
public record DeviceSnapshot(String snapshotId, String observationId, DeviceId deviceId, Instant observedAt, Map<String,Long> metrics, String provenance) {
 public DeviceSnapshot { metrics=Map.copyOf(metrics); if(snapshotId==null||observationId==null||deviceId==null||observedAt==null||provenance==null) throw new IllegalArgumentException("snapshot fields required"); }
 public long metric(String key){ Long v=metrics.get(key); if(v==null) throw new IllegalArgumentException("missing metric: "+key); return v; }
}
