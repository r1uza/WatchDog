package dev.sfstudio.watchdog.journal;

import java.time.Instant;
public record JournalEntry(String entryId, JournalEventType type, Instant occurredAt, String sourceId, String correlationId, String summary) { public JournalEntry { if(entryId==null||type==null||occurredAt==null||sourceId==null||correlationId==null||summary==null) throw new IllegalArgumentException("journal entry"); } }
