package com.demo.zipcode.utils;

import java.util.ArrayList;
import java.util.List;

import com.demo.zipcode.domain.Zipcode;

public class ZipcodeUtil {

	private String zipCode;

	public ZipcodeUtil(String zipCode) {
		this.zipCode = zipCode;
	}

	public List<Zipcode> validateZipCode() {
		String[] zipCodeRange = zipCode.split(" ");
		List<Zipcode> zipCodes = new ArrayList<Zipcode>();
		for (String zipCode : zipCodeRange) {
			zipCodes.add(getValidZipcodeRange(zipCode));
		}
		return zipCodes;
	}

	private Zipcode getValidZipcodeRange(String zipcode) {
		String[] zipCode = zipcode.replaceAll("\\[|\\]", "").split(",");
		if (zipCode.length != 2)
		      throw new IllegalArgumentException("Zipcode should have lower and upper bounds");
		
		String lower_bound = zipCode[0];
		String upper_bound = zipCode[1];
		if(String.valueOf(lower_bound).length()<5 || String.valueOf(upper_bound).length()<5)
			throw new IllegalArgumentException("Zipcode should be 5 digits");
		
		Integer lowerBound = Integer.parseInt(lower_bound);
		Integer upperBound = Integer.parseInt(upper_bound);
		
		if(lowerBound > upperBound)
			throw new IllegalArgumentException("Zipcode lower bound should be less than upper bound");
			
		return new Zipcode(lowerBound, upperBound);
	}
	
	public List<Zipcode> getValidSolution(List<Zipcode> zipCodeList){
		List<Zipcode> outputList = new ArrayList<Zipcode>();
		Zipcode zipCode = null;
		if (null != zipCodeList) {
			for (Zipcode zip : zipCodeList) {
				if (null == zipCode) {
					zipCode = zip;
				} else {
					if (zipCode.getUpperBound() >= zip.getLowerBound()) {
						zipCode.setUpperBound(zip.getUpperBound());
					} else {
						outputList.add(zipCode);
						zipCode = zip;
					}
				}
			}
			outputList.add(zipCode);
		}
		return outputList;
	}
}
