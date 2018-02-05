package com.liudehuang.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.ModelAndView;

public class CarInterceptor extends HandlerInterceptorAdapter{


	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object obj) throws Exception {
		String url = req.getRequestURI();//绝对路径
		String context = req.getContextPath();//项目名
		String url3 = req.getServletPath();//servlet路径名
		url = url.substring(context.length());
		System.out.println(url);
		System.out.println(context);
		System.out.println(url3);
		return false;
	}


}
