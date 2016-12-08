package com.howtoprogram.junit5;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("service")
public class OrderServiceTest {

	@Test
	@Tag("slow")
	public void placeOrderTest() {
	}

	@Test
	@Tag("fast")
	public void checkout() {
	}

	@Test
	@Tag("slow")
	public void doPayment() {
	}

	@Test
	@Tag("fast")
	public void validateOrder() {
	}
}