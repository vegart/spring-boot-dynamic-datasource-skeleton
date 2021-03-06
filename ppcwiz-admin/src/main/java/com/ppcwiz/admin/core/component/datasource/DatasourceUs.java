package com.ppcwiz.admin.core.component.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class DatasourceUs {
	
	@Value("${common-driver-class-name}")
	String driverClassName;
	
	@Value("${us-datasource-url}")
	String jdbcUrl;
	
	@Value("${common-datasource-username}")
	String username;
	
	@Value("${common-datasource-password}")
	String password;

	public String getDriverClassName() {
		return driverClassName;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	
}
