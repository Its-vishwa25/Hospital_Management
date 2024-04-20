package com.company.varnaa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServicesController {
	@RequestMapping("/Services")
	public String Servicesdetails() {
	   return "Services";
	}
}
