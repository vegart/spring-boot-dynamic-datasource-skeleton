package com.ppcwiz.admin.core.configuration;

import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import com.zaxxer.hikari.HikariDataSource;
import com.ppcwiz.admin.core.component.datasource.DatasourceKr;
import com.ppcwiz.admin.core.component.datasource.DatasourceUs;
import com.ppcwiz.admin.core.util.MyRoutingDataSource;

@Configuration
public class ConfigurationDatasource {
	
	@Autowired
	DatasourceKr datasourceKr;
	
	@Autowired
	DatasourceUs datasourceUs;
	
	@Bean
	public  AbstractRoutingDataSource createRouterDatasource(){
		AbstractRoutingDataSource routingDataSource = new MyRoutingDataSource(); 
		Map<Object, Object> targetDataSources = new HashMap<>(); 
		targetDataSources.put(
				"current:kr", 
				createDataSource(
					datasourceKr.getJdbcUrl(),
					datasourceKr.getUsername(),
					datasourceKr.getPassword()
				)
		); 
		targetDataSources.put(
				"current:us", 
				createDataSource(
					datasourceUs.getJdbcUrl(),
					datasourceUs.getUsername(),
					datasourceUs.getPassword()
				)
		);
		routingDataSource.setTargetDataSources(targetDataSources); 
		return routingDataSource; 
	}
	
	private HikariDataSource createDataSource(String url, String user, String password) { 
		HikariDataSource dataSource = new com.zaxxer.hikari.HikariDataSource(); 
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUsername(user); 
		dataSource.setPassword(password); 
		dataSource.setJdbcUrl(url);
		return dataSource; 
	}
}
