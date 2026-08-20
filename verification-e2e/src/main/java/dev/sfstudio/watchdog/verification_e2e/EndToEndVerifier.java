package dev.sfstudio.watchdog.verification_e2e;

import java.util.List; public final class EndToEndVerifier { public boolean verified(List<VerificationScenarioResult> required){ return !required.isEmpty() && required.stream().allMatch(v -> v==VerificationScenarioResult.PASS); } }
