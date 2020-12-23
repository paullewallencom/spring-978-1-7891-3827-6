package com.example.demo;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

	@Override
	public Health health()
	{
		return Health.up().withDetail("user", "Petra Simonis").build();
	}
}
