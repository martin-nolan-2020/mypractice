package com.in28minutes.springboot.basics.springbootin10steps2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootIn10Steps2Controller {
	
	@GetMapping("/xyz")
	public String getXyz(){
		String a = "xyz";
		return "XYZ" + " " + a;
	}
	
	@GetMapping("abc")
	public String getAbc(){
		String x = "abc";
		return "ABC" + " " + x;
	}
	
	@GetMapping("castles")
	public List<Castle> getCastles(){
		return new ArrayList<Castle>(Arrays.asList(new Castle("big castle"), new Castle("small castle")));
	}
}
