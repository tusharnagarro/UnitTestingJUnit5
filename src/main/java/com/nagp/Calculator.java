package com.nagp;

/**
 * @author tusharkumar01
 *
 */
public class Calculator {

	/**
	 * @param a
	 * @param b
	 * @return a + b
	 */
	public int add(int a, int b) {
		return a + b;
	}

	/**
	 * @param a
	 * @param b
	 * @return a - b
	 */
	public int subtract(int a, int b) {
		return a - b;
	}

	/**
	 * @param a
	 * @param b
	 * @return a * b
	 */
	public int multiply(int a, int b) {
		return a * b;
	}

	/**
	 * @param a
	 * @param b
	 * @return a / b
	 */
	public double divide(int a, int b) {
		if (b != Double.valueOf(0)) {
			return (double) a / b;
		}
		return Double.POSITIVE_INFINITY;
	}
}
