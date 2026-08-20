package dev.sfstudio.watchdog.presentation_resilience;

public record ResilienceProjection(String recoveryState, int quarantined, String runtimeReadiness) {}
