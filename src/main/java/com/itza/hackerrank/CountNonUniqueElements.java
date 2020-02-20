package com.itza.hackerrank;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountNonUniqueElements {

	public static int countNonUnique(List<Integer> numbers) {
		Set<Integer> setNoRepetidos = new HashSet<Integer>();
		numbers.sort((o1, o2) -> o1.compareTo(o2));
		setNoRepetidos.addAll(numbers);

		int repeticiones = 0;
		int counter = 0;

		for (Integer s : setNoRepetidos) {
			counter = 0;
			for (Integer n : numbers) {
				if (n.intValue() == s.intValue())
					counter = counter + 1;
			}
			if (counter > 1)
				repeticiones = repeticiones + 1;
		}
		return repeticiones;
	}
}
