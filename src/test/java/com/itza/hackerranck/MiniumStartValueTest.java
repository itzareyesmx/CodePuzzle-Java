package com.itza.hackerranck;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.itza.hackerrank.MiniumStartValue;

class MiniumStartValueTest {

	MiniumStartValue miniumStartValue = new MiniumStartValue();

	@Test
	void testCase1() {
		Integer numeros[] = { -2, 3, 1, -5 };
		assertEquals(4, miniumStartValue.minDiff(Arrays.asList(numeros)));
	}

	@Test
	void testCase2() {
		Integer numeros[] = { -5, 4, -2, 3, 1, -1, -6, -1, 0, 5 };
		assertEquals(8, miniumStartValue.minDiff(Arrays.asList(numeros)));
	}

	@Test
	void testCase3() {
		Integer numeros[] = { -5, 4, -2, 3, 1 };
		assertEquals(6, miniumStartValue.minDiff(Arrays.asList(numeros)));
	}

}
