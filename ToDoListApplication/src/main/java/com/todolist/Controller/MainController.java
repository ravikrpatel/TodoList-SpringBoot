package com.todolist.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.todolist.services.AuthenticationClass;


@Controller
public class MainController {
	
	@Autowired
	private AuthenticationClass authenticate;
	
	@RequestMapping(value="log-in", method=RequestMethod.GET)
	public String loginpage() {

		return "loginpage";
	}
	
	@RequestMapping(value="welcom-to-loginpage", method=RequestMethod.POST)
	public String welcomeloginpage(ModelMap model, @RequestParam("uname") String username, @RequestParam("psw") String password) {
		model.addAttribute("name", username);
		
		if(authenticate.Authenticate(username, password)) {
			
			 return "welcom-to-loginpage";
		}
		model.addAttribute("invalidpassword", "Try again");
		return "loginpage";
		
	}

}
