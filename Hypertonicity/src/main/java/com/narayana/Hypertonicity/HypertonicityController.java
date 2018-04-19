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
	
	@RequestMapping("/hypertonicity/{serumOsmol_hypertonicity}")
	public String Hypertonicity(@PathVariable("serumOsmol_hypertonicity") String serumOsmol_hypertonicity) {
		logger.info("accounts-changed byId() invoked: " + serumOsmol_hypertonicity);
		String retVal = hypertoncityRepository.gethypertonicity(serumOsmol_hypertonicity);
		logger.info("accounts-microservice byId() found: " + retVal);
		return retVal;
	}

}
