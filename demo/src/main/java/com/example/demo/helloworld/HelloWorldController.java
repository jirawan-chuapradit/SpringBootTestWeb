package com.example.demo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	/**
	 * GET 
	 * URI -/hello-world
	 * method-"Hello World"
	 * @return Hello World
	 */
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	/**
	 * Hello World Bean
	 * @return 
	 * @return
	 */
	@GetMapping(path = "/hello-world-bean")
	public  HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping(path = "/hello-world-bean/path-variable/{name}")
	public  HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	
	
}
