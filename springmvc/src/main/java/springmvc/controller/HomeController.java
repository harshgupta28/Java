package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/first") //if no present then we can direct call methods e.g. - /home
public class HomeController {

	@RequestMapping(path = "/home" , method = RequestMethod.GET) //browser uses GET method
	public String home(Model model) 
	{
		System.out.println("this is home url");
		
		//sending data from controller to view
		String s="Harsh KK";
		model.addAttribute("name",s);//key-value pair//data sending through model
		
	
		List<String> friends = new ArrayList<String>();
		friends.add("kk");
		friends.add("gauri");
		friends.add("gautam");
		friends.add("abhi");
		model.addAttribute("f",friends);//key-value pair	//sending data from controller to view
		
		return "index"; // returning name of view
	} 

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "about";
	}
	
	@RequestMapping("/help")
	//ModelAndView
	public ModelAndView help() {
		System.out.println("this is about help controller");
		
		ModelAndView modelAndView = new ModelAndView();
		
		String s="Harsh";
		modelAndView.addObject("name",s);	//sending data from controller to view
		
		s="krishna";
		modelAndView.addObject("nickname",s);	//sending data from controller to view
		
		List<String> cities = new ArrayList<String>();
		cities.add("kanpur");
		cities.add("hpp");
		cities.add("noida");
		modelAndView.addObject("ct",cities);	//sending data from controller to view
		
		modelAndView.setViewName("help");
		return modelAndView;
	}
}