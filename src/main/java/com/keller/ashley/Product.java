package com.keller.ashley;

public class Product {

		private final long id;
		private final String name;
		private final Price currentPrice;

		public Product(long id, String name, Price currentPrice) {
			this.id = id;
			this.name = name;
			this.currentPrice = currentPrice;
		}

		public long getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public Price getCurrentPrice() {
			return currentPrice;
		}
}
