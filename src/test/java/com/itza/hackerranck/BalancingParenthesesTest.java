package com.itza.hackerranck;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.itza.hackerrank.BalancingParentheses;

class BalancingParenthesesTest {

	BalancingParentheses balancingParentheses = new BalancingParentheses();

	@Test
	void testCase1() {
		String paranthesis = "(()))";
		assertEquals(1, balancingParentheses.getMinOperations(paranthesis));
	}

	
	@Test
	void testCase2() {
		String paranthesis = "()))";
		assertEquals(2, balancingParentheses.getMinOperations(paranthesis));
	}

	@Test
	void testCase3() {
		String paranthesis = "()()";
		assertEquals(0, balancingParentheses.getMinOperations(paranthesis));
	}
	
	@Test
	void testCase4() {
		String paranthesis = "()))))))))))))))))))))))()()))()))))))))()))))))()))()))))(()))))))))))))()))))))(()))))))))()()))))))))))))()))))(())()))))))(()))))()))))))()))()())))())))))))))))()))())(()()())()()())))))()))))())()))()))))))))))))))()())))()))))()))))))()))())()))())))(()))()))))))))())))())))(())()))))()((()))))))((((()())())())(())))))())())))))))())))))()(()))))()))))())))))()())())()))()))))))))()))))))))))()))))())))))(((()))))()))((())))())))))))())))()()())())))))())))())())))))(())())))))))())))()()))))))))))))(())())())))((()))))))(())))()())))()))))(())))(())))))))))))))(())))(())()))))(()))())())))))))()())(()(())())))))))))))))))))))))))((()())))())))())))((()())))()))())()))))())()())))))))))))(()))))))))))))))()))))))()))))))))))))))))(()(()))(()))()))))))()))()()))))))))))()))())()))))())))()()()))()))))(())))))))))))))()()))))(())))()))))))()))()())()))())()())())))()()(()())))))()())))))))())))())))(())))())))))))()))))))))()((()(())))))))))(())))())))())))))))))()())))()))))))))(";
		assertEquals(0, balancingParentheses.getMinOperations(paranthesis));
	}
}
