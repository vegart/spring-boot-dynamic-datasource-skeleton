package com.ppcwiz.admin.modules.performance.controller.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ppcwiz.admin.common.controller.view.CommonController;
import com.ppcwiz.admin.modules.home.serviceImpl.UserServiceImpl;

@Controller
public class IndexController extends CommonController{
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@RequestMapping("/view/performance")
	public ModelAndView view(ModelAndView mav) {
		viewDefault(mav);
		return mav;
	}
}
