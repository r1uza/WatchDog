package dev.sfstudio.watchdog.observation;

import dev.sfstudio.watchdog.device.DeviceId; import java.time.Instant;
public record ObservationRequest(String requestId, DeviceId deviceId, Instant requestedAt) { public ObservationRequest { if(requestId==null||deviceId==null||requestedAt==null) throw new IllegalArgumentException("explicit request fields required"); } }
