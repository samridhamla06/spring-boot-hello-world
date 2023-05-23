package com.javatpoint.ratelimiter.model;

import com.javatpoint.ratelimiter.util.GenerateTime;

public class RateLimiter implements IRateLimiter{

    private GenerateTime generateTime = new GenerateTime();
    private IRequestTracker requestTracker = new RequestTracker();
    @Override
    public boolean rateLimit(int customerId) {
        int currTimeInSecs = generateTime.generateCurrentTimeInSeconds();
        return requestTracker.isLimitLeft(customerId, currTimeInSecs);
    }
}
