package dev.sfstudio.watchdog.observability;

import java.util.*;
public final class ObservabilityService { private final int maxSamples; private final Deque<MetricSample> samples=new ArrayDeque<>(); public ObservabilityService(int maxSamples){if(maxSamples<1)throw new IllegalArgumentException("maxSamples");this.maxSamples=maxSamples;} public void record(MetricSample s){if(samples.size()==maxSamples)samples.removeFirst();samples.addLast(s);} public List<MetricSample> snapshot(){return List.copyOf(samples);} }
