package dev.sfstudio.watchdog.journal;

import java.util.*;
public final class Journal { private final List<JournalEntry> entries=new ArrayList<>(); public void append(JournalEntry e){entries.add(e);} public List<JournalEntry> entries(){return List.copyOf(entries);} }
