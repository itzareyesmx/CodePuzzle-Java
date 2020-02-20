package com.itza.hackerrank;

import java.util.List;

public class MiniumStartValue {

	public Integer minDiff(List<Integer> arr) {
		int x = 1;
		int sum = 0;
		int start = 0;
		while (sum < 1) {
			start = x;
			sum = start;
			for (int numero : arr) {
				sum = sum + numero;
				if (sum < 1)
					break;
			}
			x++;
		}
		return x - 1;
	}
}
