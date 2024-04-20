package com.company.varnaa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationContoller {
	@RequestMapping("/Location")
	public String Locationdetails() {
	   return "Location";
	}

}
