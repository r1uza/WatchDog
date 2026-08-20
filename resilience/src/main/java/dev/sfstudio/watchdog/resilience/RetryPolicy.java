package dev.sfstudio.watchdog.resilience;

public final class RetryPolicy { private final int maxAttempts; public RetryPolicy(int maxAttempts){if(maxAttempts<1)throw new IllegalArgumentException("maxAttempts");this.maxAttempts=maxAttempts;} public RetryDecision decide(boolean retrySafe, int attempts){ return retrySafe && attempts<maxAttempts ? RetryDecision.RETRY : RetryDecision.DENY; } }
