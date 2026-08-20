package dev.sfstudio.watchdog.presentation_migration;

public record MigrationProjection(int sourceSchema, int targetSchema, String compatibility, String state) {}
