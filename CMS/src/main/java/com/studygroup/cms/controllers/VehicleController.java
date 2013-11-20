/**
 * 
 */
package com.studygroup.cms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VehicleController {
	private String actionVar="";

	@RequestMapping("/viewVehicles")
    public ModelAndView viewAllVehicles() {
		actionVar="viewVehicles";
        return new ModelAndView("searchVehicle");
    }
	
	@RequestMapping("/addVehicle")
    public ModelAndView addVehicle() {
        return new ModelAndView("addEditVehicle");
    }
	
	@RequestMapping("/editVehicle")
    public ModelAndView editVehicle() {
		if("viewVehicles".equalsIgnoreCase(actionVar)) {
			String message = "Vehicle Details Goes Here!!!";
	        return new ModelAndView("viewVehicles", "message", message);
		} else
			return new ModelAndView("addEditVehicle");
    }
	
	
	@RequestMapping("/searchVehicle")
    public ModelAndView searchVehicle() {
		actionVar="editVehicle";
        return new ModelAndView("searchVehicle");
    }
	
	@RequestMapping("/displayVehicles")
    public ModelAndView displayVehicles() {
        return new ModelAndView("viewVehicles");
    }
}
