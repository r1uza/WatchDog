package dev.sfstudio.watchdog.persistence;

import dev.sfstudio.watchdog.alert.Alert; import dev.sfstudio.watchdog.journal.JournalEntry; import dev.sfstudio.watchdog.snapshot.DeviceSnapshot; import java.util.*;
public interface WatchDogRepository { void saveSnapshot(DeviceSnapshot snapshot); void saveAlert(Alert alert); void appendJournal(JournalEntry entry); Optional<Alert> alert(String id); List<JournalEntry> journal(); }
