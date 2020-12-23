package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@Controller
public class IndexController {
	private Counter mycounter;
	
	public IndexController(MeterRegistry registry)
	{
		mycounter = Counter.builder("mycustommetric")
					.description("My custom metric")
					.register(registry);
	}
	
	
	@RequestMapping("/")
	public String index()
	{
		mycounter.increment();
		return "index";
	}
}
