package dev.sfstudio.watchdog.observation;

import dev.sfstudio.watchdog.device.DeviceId; import java.time.Instant; import java.util.Map;
public record Observation(String observationId, DeviceId deviceId, Instant observedAt, Map<String,Long> metrics, String provenance) {
 public Observation { metrics = Map.copyOf(metrics); if(observationId==null||deviceId==null||observedAt==null||provenance==null) throw new IllegalArgumentException("observation fields required"); }
 public long metric(String key) { Long v=metrics.get(key); if(v==null) throw new IllegalArgumentException("missing metric: "+key); return v; }
}
