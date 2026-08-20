package dev.sfstudio.watchdog.diagnostics;

import java.util.Map;
public record DiagnosticManifest(String exportId, Map<String,String> artifactSha256) { public DiagnosticManifest { artifactSha256=Map.copyOf(artifactSha256); } }
