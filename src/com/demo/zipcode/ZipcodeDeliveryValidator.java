package com.demo.zipcode;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.demo.zipcode.domain.Zipcode;
import com.demo.zipcode.utils.ZipcodeComparator;
import com.demo.zipcode.utils.ZipcodeUtil;

public class ZipcodeDeliveryValidator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String zipCodes = scanner.nextLine();

		ZipcodeUtil zipCodeUtil = new ZipcodeUtil(zipCodes);
		List<Zipcode> zipCodeList = zipCodeUtil.validateZipCode();
		Collections.sort(zipCodeList, new ZipcodeComparator());

		List<Zipcode> outputList = zipCodeUtil.getValidSolution(zipCodeList);

		for (Zipcode zipcode : outputList) {
			System.out.print("[" + zipcode.getLowerBound() + "," + zipcode.getUpperBound() + "] ");
		}
		scanner.close();
	}
}
