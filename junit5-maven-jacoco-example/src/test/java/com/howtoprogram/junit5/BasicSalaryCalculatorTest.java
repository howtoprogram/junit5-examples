package com.howtoprogram.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicSalaryCalculatorTest {
	private BasicSalaryCalculator salaryCalculator;

	@BeforeEach
	void init() {
		salaryCalculator = new BasicSalaryCalculator();
	}

	@Test
	void calculateWithValidSalaryTest() {
		double basicSalary = 4000;
		salaryCalculator.setBasicSalary(basicSalary);

		double expBasicSalary = basicSalary * 0.25;
		assertEquals(expBasicSalary, salaryCalculator.getSocialInsurance());

		double expAddBonus = basicSalary * 0.1;
		assertEquals(expAddBonus, salaryCalculator.getAdditionalBonus());

		double expGross = basicSalary + expBasicSalary + expAddBonus;
		assertEquals(expGross, salaryCalculator.getGrossSalary());

	}

	@Test
	void calculateWithInValidSalaryTest() {

		double basicSalary = -100;
		assertThrows(IllegalArgumentException.class, () -> {
			salaryCalculator.setBasicSalary(basicSalary);
		});

	}

	@AfterEach
	void tearDown() {
		salaryCalculator = null;
	}
}
