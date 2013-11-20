/**
 * 
 */
package com.studygroup.cms.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.studygroup.cms.interfaces.ILoginService;

@Controller
public class IndexController {
	
	@Resource(name="loginService")
	private ILoginService loginService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
    public ModelAndView loginToCMS(@RequestParam(value="usesrname", required=true) String userName, @RequestParam(value="password", required=true) String password) {
		loginService.validateLogin(userName, password);
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


