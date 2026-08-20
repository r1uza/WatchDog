package dev.sfstudio.watchdog.presentation_lifecycle;

public record LifecycleProjection(String state, String startupPhase, int blockedRequirements) {}
