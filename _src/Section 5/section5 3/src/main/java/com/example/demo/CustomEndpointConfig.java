package com.example.demo;

import org.springframework.boot.actuate.autoconfigure.web.ManagementContextConfiguration;
import org.springframework.context.annotation.Bean;

@ManagementContextConfiguration
public class CustomEndpointConfig {

	@Bean
	public CustomEndpoint getCustomEndpoint()
	{
		return new CustomEndpoint();
	}
}
