package com.rstontherun.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rstontherun.microservices.limitsservice.bean.Limits;
import com.rstontherun.microservices.limitsservice.configuration.LimitsConfiguration;

@RestController
public class LimitsController {
	
	@Autowired
	private LimitsConfiguration configuration;
	
	
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		
		//return new Limits(10,200);
		
		return new Limits(configuration.getMaximum(),configuration.getMinimum());	
	}

}
