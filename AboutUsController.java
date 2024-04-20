package com.company.varnaa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutUsController {
	@RequestMapping("/AboutUs")
	public String defectDetails() {
	   return "AboutUs";
	}
}
