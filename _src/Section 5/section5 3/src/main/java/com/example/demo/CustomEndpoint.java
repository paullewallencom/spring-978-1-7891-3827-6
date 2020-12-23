package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;

import com.example.demo.CustomEndpoint.Person;

@Endpoint(id="custom")
public class CustomEndpoint{
	private final HashMap<String, Person> map = new HashMap<String, Person>();
	
	public CustomEndpoint()
	{
		map.put("petra", new Person("Petra Simonis"));
		map.put("vivek", new Person("Vivek Gupta"));
		map.put("avinash", new Person("Avinash Jain"));
	}
	
	@ReadOperation
	public List<Person> getOperation()
	{
		return new ArrayList<Person>(map.values());
	}
	
	@WriteOperation
	public String writeOperation()
	{
		return "write";
	}
	
	@DeleteOperation
	public String deleteOperation()
	{
		return "delete";
	}
	
	public static class Person {
		private String name;
		
		public Person(String name)
		{
			this.setName(name);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}
}

