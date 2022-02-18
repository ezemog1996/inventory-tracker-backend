package com.gomez.inventory_tracker_gateway;

import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.circuitbreaker.resilience4j.ReactiveResilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.context.annotation.Bean;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;

@SpringBootApplication
public class InventoryTrackerGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryTrackerGatewayApplication.class, args);
	}

	@Bean
	public Customizer<ReactiveResilience4JCircuitBreakerFactory> defaultCustomizer() {
		return factory -> factory.configureDefault(id -> new Resilience4JConfigBuilder(id)
			.circuitBreakerConfig(CircuitBreakerConfig.custom()
				.slidingWindowSize(10)
				.failureRateThreshold(66.6F)
				.slowCallDurationThreshold(Duration.ofMillis(200))
           		.slowCallRateThreshold(50.0F)
				.build())
			.timeLimiterConfig(TimeLimiterConfig.custom().timeoutDuration(Duration.ofMillis(500)).build()).build());
	}

}
