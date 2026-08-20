package dev.sfstudio.watchdog.background;

public final class BackgroundMonitor { private BackgroundState state=BackgroundState.DISABLED; public BackgroundState state(){return state;} public void scheduled(){state=BackgroundState.SCHEDULED;} public void running(){state=BackgroundState.RUNNING;} public void completed(){state=BackgroundState.COMPLETED;} public void failed(){state=BackgroundState.FAILED;} }
