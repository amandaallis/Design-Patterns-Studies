package com.designPatterns.patterns;

import com.designPatterns.patterns.Singleton.SingletonCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class PatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);

		System.out.println("Testes usando Singleton para utilização da mesma instancia");
		SingletonCache singletonCache1 = SingletonCache.getInstance();
		singletonCache1.setValueCache("Nome", "Amanda");

		SingletonCache singletonCache2 = SingletonCache.getInstance();
		System.out.println(singletonCache2.getValueCacheByKey("Nome"));
		System.out.println("///////////////////////////////////");
	}

}
