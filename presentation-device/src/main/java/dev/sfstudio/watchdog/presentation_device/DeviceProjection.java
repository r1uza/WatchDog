package dev.sfstudio.watchdog.presentation_device;

public record DeviceProjection(String deviceId, String health, String freshness, String capabilityState) {}
