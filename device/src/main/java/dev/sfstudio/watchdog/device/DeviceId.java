package dev.sfstudio.watchdog.device;

import dev.sfstudio.watchdog.identity.WatchDogId;
public record DeviceId(WatchDogId value) { public static DeviceId local(String token) { return new DeviceId(WatchDogId.of("device", token)); } }
