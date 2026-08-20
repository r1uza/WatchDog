package dev.sfstudio.watchdog.identity;

import dev.sfstudio.watchdog.foundation.Preconditions;
public record WatchDogId(String value) {
    public WatchDogId { value = Preconditions.requireToken(value, "value"); if(!value.startsWith("watchdog:")) throw new IllegalArgumentException("WatchDog IDs must use watchdog: namespace"); }
    public static WatchDogId of(String scope, String token) { return new WatchDogId("watchdog:" + Preconditions.requireToken(scope,"scope") + ":" + Preconditions.requireToken(token,"token")); }
}
