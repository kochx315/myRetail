package com.keller.ashley;

public class Price {
	private final double value;
	private final CurrencyCode currencyCode;
	
	public Price(double value, CurrencyCode currencyCode) {
		this.value = value;
		this.currencyCode = currencyCode;
	}

	public double getValue() {
		return value;
	}

	public CurrencyCode getCurrencyCode() {
		return currencyCode;
	}
}
