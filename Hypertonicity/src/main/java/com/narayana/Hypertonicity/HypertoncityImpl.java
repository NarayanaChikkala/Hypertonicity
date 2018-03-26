package com.narayana.Hypertonicity;

import org.springframework.stereotype.Repository;

@Repository
public class HypertoncityImpl implements HypertoncityRepository {

	@Override
	public String gethypertonicity(String serumOsmol) {
		if(Integer.parseInt(serumOsmol)<295) {
			return "hypertonic";			
		}
		else {
			return "notHypertonic";
		}
	}

}
