package com.nagp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.lang.StringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {
	
	@Fast
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@DisplayName("Add 2 numbers")
	@CsvSource({
			"0, 1, 1",
			"1, 2, 3",
			"49, 51, 100",
			"1, 100, 101"
	})
	void add(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}

	@ParameterizedTest
	@ValueSource(strings = { "racecar", "radar"})
	void palindromes(String candidate) {
	    assertEquals(StringUtils.reverse(candidate), candidate);
	}
	
}
