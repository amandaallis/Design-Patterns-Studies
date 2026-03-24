package com.designPatterns.patterns.Singleton;

import java.util.HashMap;
import java.util.Map;

/* Um problema encontrado ao desenvolver o exemplo que foi usado o Singleton foi que estávamos quebrando o princípio S do SOLID da responsabilidade única, dado
que estavamos lidando com valores do cache e lidando com instancias diretamente na mesma classe. Uma forma de mitigarmos esse problema seria a utilização do padrão
Service Locator (esse não é da Gang Of Four)
* */

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
