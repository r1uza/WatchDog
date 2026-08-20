package dev.sfstudio.watchdog.accessibility;

public final class CriticalStateDescriptor { public AccessibilityDescriptor describe(String id, String label){ return new AccessibilityDescriptor(id,"ALERT",label,"CRITICAL",java.util.List.of()); } }
