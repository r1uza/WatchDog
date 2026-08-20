package dev.sfstudio.watchdog.health;

import dev.sfstudio.watchdog.snapshot.DeviceSnapshot; import java.util.*;
public final class HealthEngine {
 public List<HealthFinding> evaluate(DeviceSnapshot s){ List<HealthFinding> out=new ArrayList<>();
  if(s.metrics().containsKey("battery.percent") && s.metric("battery.percent") < 20) out.add(new HealthFinding("finding:battery:"+s.snapshotId(),s.snapshotId(),"BATTERY_LOW",HealthStatus.DEGRADED,s.metric("battery.percent")));
  if(s.metrics().containsKey("storage.used.percent") && s.metric("storage.used.percent") >= 90) out.add(new HealthFinding("finding:storage:"+s.snapshotId(),s.snapshotId(),"STORAGE_CRITICAL",HealthStatus.UNHEALTHY,s.metric("storage.used.percent")));
  if(out.isEmpty()) out.add(new HealthFinding("finding:healthy:"+s.snapshotId(),s.snapshotId(),"NO_FINDINGS",HealthStatus.HEALTHY,0)); return List.copyOf(out); }
}
