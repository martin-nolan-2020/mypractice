package com.in28minutes.springboot.basics.springbootin10steps2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootIn10Steps2Controller {
	
	@GetMapping("/xyz")
	public String getXyz(){
		String a = "xyz";
		return "XYZ" + " " + a;
	}
}
