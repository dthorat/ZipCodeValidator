package com.demo.zipcode.domain;

public class Zipcode{
	private Integer lowerBound;
	private Integer upperBound;

	public Zipcode(Integer lowerBound, Integer upperBound) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}

	public Integer getLowerBound() {
		return lowerBound;
	}

	public void setLowerBound(Integer lowerBound) {
		this.lowerBound = lowerBound;
	}

	public Integer getUpperBound() {
		return upperBound;
	}

	public void setUpperBound(Integer upperBound) {
		this.upperBound = upperBound;
	}
}