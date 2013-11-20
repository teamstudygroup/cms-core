/**
 * 
 */
package com.studygroup.cms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	private String actionVar="";

	@RequestMapping("/viewEmployees")
    public ModelAndView viewAllEmployees() {
		actionVar="viewEmployees";
        return new ModelAndView("searchEmployee");
    }
	
	@RequestMapping("/addEmployee")
    public ModelAndView addEmployee() {
        return new ModelAndView("addEditEmployee");
    }
	
	@RequestMapping("/editEmployee")
    public ModelAndView editEmployee() {
		if("viewEmployees".equalsIgnoreCase(actionVar)) {
			String message = "Employee Details Goes Here!!!";
	        return new ModelAndView("viewEmployees", "message", message);
		} else
			return new ModelAndView("addEditEmployee");
    }
	
	
	@RequestMapping("/searchEmployee")
    public ModelAndView searchEmployee() {
		actionVar="editEmployee";
        return new ModelAndView("searchEmployee");
    }
	
	@RequestMapping("/displayEmployees")
    public ModelAndView displayEmployees() {
        return new ModelAndView("viewEmployees");
    }
}
