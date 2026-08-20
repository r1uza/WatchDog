package dev.sfstudio.watchdog.device;

public record DeviceDescriptor(DeviceId id, String displayName) { public DeviceDescriptor { if(id==null) throw new IllegalArgumentException("id"); if(displayName==null || displayName.isBlank()) throw new IllegalArgumentException("displayName"); } }
