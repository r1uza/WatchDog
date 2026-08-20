package dev.sfstudio.watchdog.diagnostics;

import java.util.Set;
public record DiagnosticExportPlan(Set<String> categories, boolean includeTechnicalTrace) { public DiagnosticExportPlan { categories=Set.copyOf(categories); } }
