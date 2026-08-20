package dev.sfstudio.watchdog.watch;

public record WatchEvaluation(String evaluationId, String watchRuleId, int revision, String findingId, boolean matched) {}
