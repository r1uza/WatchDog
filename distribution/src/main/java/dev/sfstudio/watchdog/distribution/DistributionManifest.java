package dev.sfstudio.watchdog.distribution;

import java.util.Map;
public record DistributionManifest(String distributionId, String version, String channel, String applicationId, int versionCode, Map<String,String> artifactHashes, ProductionReadiness readiness) { public DistributionManifest { artifactHashes=Map.copyOf(artifactHashes); } }
