package com.ppcwiz.admin.common.controller.view;


import org.springframework.web.servlet.ModelAndView;

import com.ppcwiz.admin.common.constant.ViewConst;

public class CommonController {
	public String getModuleName() {
		String controllerName = this.getClass().getName();
		String sub_module = ((controllerName.split(ViewConst.MODULE_DIR)[1]).split("[.]"))[1];
		System.out.println("sub_module : " + sub_module);
		return sub_module;
	}
	
	public void viewModule(ModelAndView mav) {
		mav.addObject("sub_module", getModuleName());
	}
	
	public void viewTop(ModelAndView mav,String top) {
		mav.addObject("top", top);
	}
	
	public void viewLeft(ModelAndView mav,String left) {
		mav.addObject("left", left);
	}
	
	public void viewBody(ModelAndView mav,String body) {
		mav.addObject("body", body);
	}
	
	public void viewDefault(ModelAndView mav) {
		mav.addObject("sub_module", getModuleName());
		mav.addObject("body", "body");
		mav.addObject("top", "top");
		mav.addObject("left", "left");
		mav.setViewName("index");
	}
}
