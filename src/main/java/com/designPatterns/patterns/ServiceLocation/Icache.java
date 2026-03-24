package com.designPatterns.patterns.ServiceLocation;

public interface Icache {
    void setValueCache(String key, String value);
    String getValueCacheByKey(String key);
}
