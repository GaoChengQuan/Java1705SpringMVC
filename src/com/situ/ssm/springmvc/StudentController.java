package com.situ.ssm.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.situ.ssm.entity.Student;

@Controller
@RequestMapping(value="/student")
public class StudentController {
	
	@RequestMapping(value="/add")
	public ModelAndView add(Student student) {
		System.out.println(student);
		ModelAndView modelAndView = new ModelAndView();
		//request.setAttribute();
		modelAndView.addObject("student", student);
		//req.getRerquestDispatcher().forward();
		modelAndView.setViewName("/student_info.jsp");
		return modelAndView;
	}
	
	@RequestMapping(value="/add1")
	public ModelAndView add1(Student student) {
		System.out.println(student);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("student", student);
		//modelAndView.setViewName("/WEB-INF/jsp/student_info.jsp");
		modelAndView.setViewName("student_info");
		return modelAndView;
	}
}
