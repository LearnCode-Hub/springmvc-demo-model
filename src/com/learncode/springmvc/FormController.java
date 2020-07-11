package com.learncode.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class FormController {
	
	@RequestMapping("/name")
	public String form(HttpServletRequest request,Model model) {
			
		String name = request.getParameter("name");
		model.addAttribute("name", name);
		return "name-page";
		
		
	}

}
