package com.keller.ashley;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PriceTests {
	private Price price;
	private final double EXPECTED_VALUE = 0.50;
	private final CurrencyCode EXPECTED_CURRENCY_CODE = CurrencyCode.USD;
	
	@Before
	public void beforeEach() {
		price = new Price(EXPECTED_VALUE, EXPECTED_CURRENCY_CODE);
	}
	
	
	@Test
	public void testGetSetValue() {
		double actualValue = price.getValue();
		
		assertEquals(EXPECTED_VALUE, actualValue);
	}

	@Test
	public void testGetSetCurrencyCode() {
		CurrencyCode actualCurrencyCode = price.getCurrencyCode();
		
		assertEquals(EXPECTED_CURRENCY_CODE, actualCurrencyCode);
	}
}
