package com.designPatterns.patterns.ServiceLocation;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {
    private static ServiceLocator instance;
    private Map<String, String> services;

    private ServiceLocator() {
        this.services = new HashMap<>();
    }

    public static ServiceLocator getInstance() {
        if(instance == null) {
            ServiceLocator.instance = new ServiceLocator();
        }
        return ServiceLocator.instance;
    }
}
