package com.keller.ashley;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProductTests {
	private Product product;
	private final long EXPECTED_ID = 1234567l;
	private final String EXPECTED_NAME = "test name";
	private final double EXPECTED_VALUE = 0.50;
	private final CurrencyCode EXPECTED_CURRENCY_CODE = CurrencyCode.USD;
	private final Price EXPECTED_PRICE = new Price(EXPECTED_VALUE, EXPECTED_CURRENCY_CODE);
	
	@Before
	public void beforeEach() {
		product = new Product(EXPECTED_ID, EXPECTED_NAME, EXPECTED_PRICE);
	}
	
	
	@Test
	public void testGetSetId() {
		long actualId = product.getId();
		
		assertEquals(EXPECTED_ID, actualId);
	}
	
	@Test
	public void testGetSetName() {
		String actualName = product.getName();
		
		assertEquals(EXPECTED_NAME, actualName);
	}
	
	@Test
	public void testGetSetCurrentPrice() {
		Price actualPrice = product.getCurrentPrice();
		
		assertEquals(EXPECTED_PRICE.getCurrencyCode(), actualPrice.getCurrencyCode());
		assertEquals(EXPECTED_PRICE.getValue(), actualPrice.getValue());
	}
}
