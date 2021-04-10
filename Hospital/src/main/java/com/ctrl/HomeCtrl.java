package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl 
{
	@RequestMapping("/welcome")
	public String welcome(Model model)
	{
		return "welcome";
	}
}
