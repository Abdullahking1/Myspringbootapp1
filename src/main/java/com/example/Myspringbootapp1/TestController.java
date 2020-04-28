package com.example.Myspringbootapp1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/welcome.html")
	public ModelAndView firstPage() {
		System.out.println("Springboot application");

		return new ModelAndView("welcome");
	}

}