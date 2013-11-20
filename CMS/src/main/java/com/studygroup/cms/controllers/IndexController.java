/**
 * 
 */
package com.studygroup.cms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@RequestMapping("/login")
    public ModelAndView loginToCMS() {
        return new ModelAndView("home");
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


