package com.company.varnaa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GalleryController {
	@RequestMapping("/Gallery")
	public String Contactdetails() {
	   return "Gallery";
	}
}
