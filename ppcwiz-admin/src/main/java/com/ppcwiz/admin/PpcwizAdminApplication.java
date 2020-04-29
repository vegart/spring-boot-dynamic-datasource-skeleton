package com.ppcwiz.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.ppcwiz.admin.core.util.BeanNameGenerator;

@SpringBootApplication
public class PpcwizAdminApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		final SpringApplicationBuilder builder = new SpringApplicationBuilder(PpcwizAdminApplication.class);
		builder.beanNameGenerator(new BeanNameGenerator());
		builder.run(args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PpcwizAdminApplication.class);
	}
}
