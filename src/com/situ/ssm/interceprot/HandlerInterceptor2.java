package com.situ.ssm.interceprot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class HandlerInterceptor2 implements HandlerInterceptor{

	//Controller调用前调用这个方法
	//返回true继承执行，返回false终止执行
	//用户权限拦截，登陆验证可以放在这里
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		System.out.println("preHandle 2");
		return false;
	}
	
	//Controller执行后调用这个方法,但是为返回ModelAndView之前
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		System.out.println("postHandle 2");
	}
	
	//Controller执行后且ModelAndView视图已经返回
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("afterCompletion 2");
	}
}
