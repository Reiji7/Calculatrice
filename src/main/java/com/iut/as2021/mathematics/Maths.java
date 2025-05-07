package com.iut.as2021.mathematics;

import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.interfaces.IMaths;

public class Maths implements IMaths {

	@Override
	public int addition(int a, int b) {
		return a + b;
	}

	@Override
	public int soustraction(int a, int b) {
		return a - b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}

	@Override
	public double division(int a, int b) throws MathsExceptions {
		if (b == 0) {
			throw new MathsExceptions("Division par zero impossible");
		}
		try {
			return a / b;
		} catch (Exception e) {
			throw new MathsExceptions(e.getMessage());
		}
	}

	@Override
	public int multiplicationParAddition(int a, int b) {
		if (b == 0) {
			return 0;
		} else if (b < 0) {
			return -multiplicationParAddition(a, -b);
		}else {
			return a + multiplicationParAddition(a, b=b-1);
		}
	}
}