/**
 * 
 */
package com.studygroup.cms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
    public ModelAndView viewHomeScreen() {
 
        String message = "Company Details Goes Here!!!";
        return new ModelAndView("home", "message", message);
    }
}
