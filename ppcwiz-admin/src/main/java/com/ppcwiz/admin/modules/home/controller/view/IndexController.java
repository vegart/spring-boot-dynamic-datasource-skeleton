package com.ppcwiz.admin.modules.home.controller.view;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ppcwiz.admin.common.controller.view.CommonController;
import com.ppcwiz.admin.modules.home.domain.UserVO;
import com.ppcwiz.admin.modules.home.serviceImpl.UserServiceImpl;

@Controller
public class IndexController extends CommonController{
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@RequestMapping("/")
	public ModelAndView index(HttpSession session,ModelAndView mav) {
		ArrayList<UserVO> users = userServiceImpl.list();
		session.setAttribute("server", "kr");
		viewDefault(mav);
		return mav;
	}
	
}
