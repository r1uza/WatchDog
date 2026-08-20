package dev.sfstudio.watchdog.snapshot;

import dev.sfstudio.watchdog.observation.Observation;
public final class SnapshotFactory { public DeviceSnapshot from(String snapshotId, Observation o){ return new DeviceSnapshot(snapshotId,o.observationId(),o.deviceId(),o.observedAt(),o.metrics(),o.provenance()); } }
