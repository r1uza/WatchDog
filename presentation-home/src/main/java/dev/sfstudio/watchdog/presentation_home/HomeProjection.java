package dev.sfstudio.watchdog.presentation_home;

public record HomeProjection(String deviceHealth, int openAlerts, String backgroundState, String freshness) {}
