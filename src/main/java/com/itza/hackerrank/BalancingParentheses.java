package com.itza.hackerrank;

public class BalancingParentheses {

	public int getMinOperations(String s) {
		int left = 0;
		int right = 0;
		for (char c : s.toCharArray()) {
			if (c == '(') {
				left++;
			} else {
				right++;
			}
		}
		return getDifference(left, right);
	}

	public static int getDifference(int left, int right) {
		if (right > left) {
			return right - left;
		} else
			return left - right;
	}
}
