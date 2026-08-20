package dev.sfstudio.watchdog.migration;

import java.util.List;
public record MigrationPlan(String migrationId, int sourceVersion, int targetVersion, List<String> orderedSteps, boolean rollbackSupported) { public MigrationPlan { orderedSteps=List.copyOf(orderedSteps); if(sourceVersion>=targetVersion) throw new IllegalArgumentException("target must advance source"); } }
