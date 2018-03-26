package com.narayana.Hypertonicity;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HypertonicityController {
	
	protected Logger logger = Logger
			.getLogger(HypertonicityController.class.getName());
	
	@Autowired
	HypertoncityRepository hypertoncityRepository;
	
	@RequestMapping("/Hypertonicity/{serumOsmol}")
	public String Hypertonicity(@PathVariable("serumOsmol") String serumOsmol) {
		logger.info("accounts-changed byId() invoked: " + serumOsmol);
		String retVal = hypertoncityRepository.gethypertonicity(serumOsmol);
		logger.info("accounts-microservice byId() found: " + retVal);
		return retVal;
	}

}
