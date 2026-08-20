package dev.sfstudio.watchdog.presentation_observability;

public record ObservabilityProjection(String runtimeHealth, int metricCount, int eventCount) {}
