package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm()
	{
		System.out.println("contact contoller called contact");
		return "contact";
	}
	
	@RequestMapping(path = "/processform" , method = RequestMethod.POST)
	public String processform()
	{
		System.out.println("contact contoller called process form");
		return "contact";
	}
}