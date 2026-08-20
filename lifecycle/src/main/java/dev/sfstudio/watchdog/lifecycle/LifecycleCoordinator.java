package dev.sfstudio.watchdog.lifecycle;

public final class LifecycleCoordinator { public ApplicationLifecycleState startup(boolean requiredChecksPass, boolean degradableChecksPass){ if(!requiredChecksPass)return ApplicationLifecycleState.BLOCKED; return degradableChecksPass?ApplicationLifecycleState.READY:ApplicationLifecycleState.DEGRADED; } public ApplicationLifecycleState foreground(ApplicationLifecycleState state){ return state; } }
