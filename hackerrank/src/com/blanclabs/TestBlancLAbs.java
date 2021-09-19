package com.blanclabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * brunolima on Sep 9, 2021
 * 
 */

public class TestBlancLAbs {

	public static void main(String[] args) {

		List<String> ls = Arrays.asList("A", "AAA", "a", "aaa", "aba");
		System.out.println(checkStringsV1(ls));
		System.out.println(checkStringsV2(ls));

	}

	public static List<String> checkStringsV1(List<String> ls) {
		if (ls.size() == 0 || ls == null) {
			return Arrays.asList("");
		}

		List<String> lsReturn = new ArrayList<>();

		for (String st : ls) {
			if (st.startsWith("a") && st.length() == 3) {
				lsReturn.add(st);
			}
		}

		return lsReturn;
	}

	public static List<String> checkStringsV2(List<String> ls) {
		if (ls.size() == 0 || ls == null) {
			return Arrays.asList("");
		}

		List<String> lsFiltered = ls.stream()
										.filter(f -> f.startsWith("a"))
										.filter(f -> f.length() == 3)
										.collect(Collectors.toList());

		return lsFiltered;
	}

}
