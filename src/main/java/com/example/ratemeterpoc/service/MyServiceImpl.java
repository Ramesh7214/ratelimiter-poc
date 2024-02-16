package com.example.ratemeterpoc.service;

import org.springframework.stereotype.Service;

import io.github.resilience4j.ratelimiter.RequestNotPermitted;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@Service
public class MyServiceImpl implements MyServiceInf{
	
	@Override
	@RateLimiter(name = "simpleRateLimit")	
	public String processRequest() {
		System.out.println("service called");
		return "success";
	}
	
	public String rateLimiterFallback(RequestNotPermitted requestNotPermitted) {
		System.out.println("fallback called");
		return "failed";
	}

}
