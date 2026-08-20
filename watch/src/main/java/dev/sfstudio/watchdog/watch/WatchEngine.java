package dev.sfstudio.watchdog.watch;

import dev.sfstudio.watchdog.health.HealthFinding;
public final class WatchEngine { public WatchEvaluation evaluate(WatchRule rule, HealthFinding finding){ boolean match=rule.enabled() && rule.reasonCode().equals(finding.reasonCode()); return new WatchEvaluation("eval:"+rule.watchRuleId()+":"+finding.findingId(),rule.watchRuleId(),rule.revision(),finding.findingId(),match); } }
