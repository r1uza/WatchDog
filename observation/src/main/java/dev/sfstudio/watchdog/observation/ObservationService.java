package dev.sfstudio.watchdog.observation;

public final class ObservationService { private final ObservationProvider provider; public ObservationService(ObservationProvider provider){this.provider=provider;} public Observation execute(ObservationRequest request){ return provider.observe(request); } }
