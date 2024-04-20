package com.company.varnaa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactUsServices {
	 @Autowired
	    private ContactUsRepository contactUsRepository;

	    public void Contactusmsg(contactus contactUsmsg) {
	        contactUsRepository.save(contactUsmsg);
	    }
}
