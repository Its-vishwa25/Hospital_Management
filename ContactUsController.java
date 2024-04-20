package com.company.varnaa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ContactUsController {
	
	@RequestMapping("/ContactUs")
	public String Contactdetails() {
	   return "ContactUs";
	}
	
	
}
