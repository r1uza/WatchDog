package dev.sfstudio.watchdog.observability;

import java.time.Instant;
public record MetricSample(String metricId, long value, String unit, Instant sampledAt, String component) {}
