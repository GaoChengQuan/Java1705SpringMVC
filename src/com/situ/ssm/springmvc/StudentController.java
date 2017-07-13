package com.situ.ssm.springmvc;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.situ.ssm.entity.Bean;
import com.situ.ssm.entity.BeanStuVO;
import com.situ.ssm.entity.Student;
import com.situ.ssm.entity.Teacher;

@Controller
@RequestMapping(value="/student")
public class StudentController {
	@InitBinder  
	public void initBinder(WebDataBinder binder) {  
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
		dateFormat.setLenient(false);  
		binder.registerCustomEditor(Date.class, 
				new CustomDateEditor(dateFormat, true));
	}

	
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
	
	//只支持GET,如果请求是 post提交会报：HTTP Status 405 - Request method 'POST' not supported
//	@RequestMapping(value="/register1", method=RequestMethod.GET)
	//及支持GET又支持POST
	@RequestMapping(value="/register1", method={RequestMethod.GET, RequestMethod.POST})
	public ModelAndView register1(String name, String age) {
		//String name = req.getParameter("name");
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", name);
		modelAndView.addObject("age", age);
		modelAndView.setViewName("student_info");
		return modelAndView;
	}
	
	@RequestMapping(value="/register2", method={RequestMethod.GET, RequestMethod.POST})
	public void register2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		
		request.getRequestDispatcher("/WEB-INF/jsp/student_info.jsp").forward(request, response);
	}
	
	@RequestMapping(value="/register", method={RequestMethod.GET, RequestMethod.POST})
	public ModelAndView register(/*Date birthday,*/ Student student) {
		System.out.println(student);
//		System.out.println(birthday);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("student", student);
		modelAndView.setViewName("/student_info.jsp");
		return modelAndView;
	}
	
	@RequestMapping(value="/delete")
	public String delete(int id) {
		System.out.println(id);
		return "student_info";
	}
	
	@RequestMapping(value="/add2")
	public String add2(Student student, Model model) {
		System.out.println(student);
		model.addAttribute("student", student);
		return "student_info";
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
	
	@RequestMapping(value="/registerStudent")
	public ModelAndView registerStudent(Student student) {
		System.out.println(student);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("student", student);
		modelAndView.setViewName("/add.jsp");
		return modelAndView;
	}
	
	@RequestMapping(value="/registerTeacher")
	public ModelAndView registerTeacher(Teacher teacher) {
		System.out.println(teacher);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("teacher", teacher);
		modelAndView.setViewName("/add.jsp");
		return modelAndView;
	}
	
	@RequestMapping(value="/registerAll1")
	public ModelAndView registerAll1(Student student, Teacher teacher) {
		System.out.println(teacher);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("student", student);
		modelAndView.addObject("teacher", teacher);
		modelAndView.setViewName("/add2.jsp");
		return modelAndView;
	}
	
	@RequestMapping(value="/registerAll")
	public ModelAndView registerAll(Bean bean) {
		Student student = bean.getStudent();
		Teacher teacher = bean.getTeacher();
		System.out.println(student);
		System.out.println(teacher);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("student", student);
		modelAndView.addObject("teacher", teacher);
		modelAndView.setViewName("/add2.jsp");
		return modelAndView;
	}
	
	
	@RequestMapping(value="/deleteAll")
	public String deleteAll(int[] ids) {
		for (int id : ids) {
			System.out.println(id);
		}
		
		return "/deleteAll.jsp";
	}
	
	@RequestMapping(value="/addAll")
	public String addAll(BeanStuVO bean) {
		List<Student> list = bean.getList();
		for (Student student : list) {
			System.out.println(student);
		}
		return "/addAll.jsp";
	}
}
