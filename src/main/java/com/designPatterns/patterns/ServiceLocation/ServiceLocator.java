package com.designPatterns.patterns.ServiceLocation;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {
    private static ServiceLocator instance;
    private Map<String, Object> services;

    private ServiceLocator() {
        this.services = new HashMap<>();
    }

    public static ServiceLocator getInstance() {
        if(instance == null) {
            ServiceLocator.instance = new ServiceLocator();
        }
        return ServiceLocator.instance;
    }

    public <T> void register(String name, T service) {
        services.put(name, service);
    }

    public <T> T get(String name) {
        return (T) services.get(name);
    }
}
