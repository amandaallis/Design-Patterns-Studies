package com.designPatterns.patterns.Singleton;

import java.util.HashMap;
import java.util.Map;

public class SingletonCache {
    private static SingletonCache instance;
    private Map<String, String> valueCache;

    private SingletonCache() {
        valueCache = new HashMap<>();
    }

    public static SingletonCache getInstance() {
        if(instance == null) {
            instance = new SingletonCache();
        }
        return instance;
    }

    public void setValueCache(String key, String value) {
        this.valueCache.put(key, value);
    }

    public String getValueCacheByKey(String key) {
        return valueCache.get(key);
    }
}
