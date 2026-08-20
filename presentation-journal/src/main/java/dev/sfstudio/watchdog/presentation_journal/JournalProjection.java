package dev.sfstudio.watchdog.presentation_journal;

public record JournalProjection(String entryId, String eventType, String occurredAt, String summary) {}
