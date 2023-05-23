package com.javatpoint.ratelimiter.model;

import java.util.HashMap;
import java.util.Map;

public class RequestTracker implements IRequestTracker{
    Map<Integer, Map<Long, Integer>> clientLimiterMapping = new HashMap<>();

    @Override
    public void trackRequest(int clientId, long secs) {
        clientLimiterMapping.putIfAbsent(clientId, new HashMap<Long, Integer> ());
        Map<Long, Integer> limiterMappingPerClient = clientLimiterMapping.get(clientId);
        long windowNumber = secs - (secs % Constants.TIME_LIMIT_IN_SECS); // secs : 507,, y = 5,
        //windowNumber : 500
        if(limiterMappingPerClient.containsKey(windowNumber)){
            // increment the count
            limiterMappingPerClient.put(windowNumber , limiterMappingPerClient.get(windowNumber) + 1);
        }else{
            limiterMappingPerClient = new HashMap<>();
            limiterMappingPerClient.put(windowNumber, 1);
        }
    }

    public boolean isLimitLeft(int clientId, long secs){
        clientLimiterMapping.putIfAbsent(clientId, new HashMap<Long, Integer> ());
        Map<Long, Integer> limiterMappingPerClient = clientLimiterMapping.get(clientId);
        long windowNumber = secs - (secs % Constants.TIME_LIMIT_IN_SECS);
        if(limiterMappingPerClient.containsKey(windowNumber)){
            return limiterMappingPerClient.get(windowNumber) < Constants.NO_OF_REQUESTS;
        }else{
            return true;
        }
    }
}
