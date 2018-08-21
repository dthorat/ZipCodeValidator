package com.demo.zipcode.utils;

import java.util.Comparator;

import com.demo.zipcode.domain.Zipcode;

public class ZipcodeComparator implements Comparator<Zipcode> {
  public int compare(Zipcode interval1, Zipcode interval2) {
    if (interval1.getLowerBound() > interval2.getUpperBound())
      return 1;
    else
      return -1;
  }
}
