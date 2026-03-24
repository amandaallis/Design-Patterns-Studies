package com.designPatterns.patterns.ServiceLocation;

import java.util.HashMap;
import java.util.Map;

public class CacheService implements Icache {
    private Map<String, String> valueCache;

    private CacheService() {
        valueCache = new HashMap<>();
    }

    public void setValueCache(String key, String value) {
        this.valueCache.put(key, value);
    }

    public String getValueCacheByKey(String key) {
        return valueCache.get(key);
    }
}
