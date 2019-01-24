package com.mmbank.zuulmmbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.mmbank.zuulmmbank.filters.ErrorFilter;
import com.mmbank.zuulmmbank.filters.PostFilter;
import com.mmbank.zuulmmbank.filters.PreFilter;
import com.mmbank.zuulmmbank.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulMmbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulMmbankApplication.class, args);
	}
	
	
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}

