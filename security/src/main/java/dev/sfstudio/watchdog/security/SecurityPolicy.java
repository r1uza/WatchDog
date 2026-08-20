package dev.sfstudio.watchdog.security;

import dev.sfstudio.watchdog.core.DataClassification;
public final class SecurityPolicy { public SecurityDecision mayDisclose(DataClassification c){ return c==DataClassification.SECRET ? SecurityDecision.DENY : SecurityDecision.ALLOW; } public SecurityDecision mayExecute(boolean validated, boolean authorized){ return validated && authorized ? SecurityDecision.ALLOW : SecurityDecision.DENY; } }
