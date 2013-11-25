/**
 * 
 */
package com.studygroup.cms.controllers;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.studygroup.cms.interfaces.ILoginService;
import com.studygroup.cms.views.UserLoginViewBean;

@Controller
public class IndexController {
	
	
	@Resource(name="loginService")
	private ILoginService loginService;	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
    public ModelAndView loginToCMS(@Valid @ModelAttribute("subscriber") UserLoginViewBean user, BindingResult result, Model model) {
		
		
		if(result.hasErrors()){ 
			System.out.println("------- Has errors .... " + result.getErrorCount());
			System.out.println("------- Has errors .... " + result.getAllErrors().get(0));
			//model.addAttribute("subscriber", subscriber);
			
			return new ModelAndView("index");
		} else {
			
			loginService.validateLogin(user.getUsername(), user.getPassword());
			System.out.println("------- No errors ....");
		}
       return new ModelAndView("home");
    }
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
    public String indexCMS(Model m) {
    	m.addAttribute("subscriber", new UserLoginViewBean());
        return "index";
    }
	
	@RequestMapping("/register")
    public ModelAndView registerCMS() {
        return new ModelAndView("registration");
    }
	
	@RequestMapping("/registrationSuccess")
    public ModelAndView showRegistrationSuccessScreen() {
 
        String message = "Registration Successfully Completed!!!";
        return new ModelAndView("registrationSuccess", "message", message);
    }
}


