package com.javatpoint.ratelimiter.model;

public interface IRequestTracker {
    void trackRequest(int clientId, long secs);
    boolean isLimitLeft(int clientId, long secs);
}
