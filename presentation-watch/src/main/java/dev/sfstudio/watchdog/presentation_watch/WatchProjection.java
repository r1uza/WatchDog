package dev.sfstudio.watchdog.presentation_watch;

public record WatchProjection(String watchRuleId, int revision, boolean enabled, String validationState) {}
