package dev.sfstudio.watchdog.accessibility;

import java.util.List;
public record AccessibilityDescriptor(String semanticId, String role, String label, String state, List<String> actions) { public AccessibilityDescriptor { actions=List.copyOf(actions); if(label==null||label.isBlank()) throw new IllegalArgumentException("label required"); } }
