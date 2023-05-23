package com.javatpoint.ratelimiter.model;

/**
 *
 */
public interface IRateLimiter {
    int NO_OF_REQUESTS = 10;
    int TIME_LIMIT_IN_SECS = 5;
    boolean rateLimit(int customerId);
}
