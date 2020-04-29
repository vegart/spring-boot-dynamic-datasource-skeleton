package com.ppcwiz.admin.core.util;

import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class MyRoutingDataSource extends AbstractRoutingDataSource {
	   @Override
	   protected Object determineCurrentLookupKey() {
	      HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
	      String server = request.getSession().getAttribute("server").toString().toLowerCase();
	      return "current:" + (server.length() == 0 ? "kr" : server);
	   }
	}
