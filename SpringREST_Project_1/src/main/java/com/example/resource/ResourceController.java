package com.example.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

	@RequestMapping(method=RequestMethod.GET,value="/first",produces = "text/plain")
	public String getMethod1()
	{
		return "This Is REST API";
	}
	@RequestMapping(method=RequestMethod.GET,value="/second",produces = "text/html")
	public String getMethod2()
	{
		return "<h1>This Is REST API</h2>";
	}
	@RequestMapping(method=RequestMethod.GET,value="/third/{na}",produces = "text/html")
	public String getMethod3(@PathVariable("na") String name)
	{
		return "<h1>"+name+"This Is REST API</h1>";
	}
	
}
