package dev.sfstudio.watchdog.watch;

public record WatchRule(String watchRuleId, int revision, String reasonCode, boolean enabled) { public WatchRule { if(watchRuleId==null||reasonCode==null||revision<1) throw new IllegalArgumentException("watch rule"); } }
