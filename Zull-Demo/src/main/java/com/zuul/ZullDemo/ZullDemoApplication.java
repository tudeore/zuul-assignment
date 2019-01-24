package com.zuul.ZullDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.zuul.ZullDemo.filters.ErrorFilter;
import com.zuul.ZullDemo.filters.PostFilter;
import com.zuul.ZullDemo.filters.PreFilter;
import com.zuul.ZullDemo.filters.RouteFilter;


@SpringBootApplication
@EnableZuulProxy
public class ZullDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZullDemoApplication.class, args);
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
