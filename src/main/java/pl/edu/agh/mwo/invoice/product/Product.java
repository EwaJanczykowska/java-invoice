package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public abstract class Product {
	private final String name;

	private final BigDecimal price;

	private final BigDecimal taxPercent;

	protected Product(String name, BigDecimal price, BigDecimal tax) {
	    if (name == null || name.isEmpty()) {
	        throw new IllegalArgumentException("Name cannot be null nor empty");
        }
	    if (price == null || price.compareTo(BigDecimal.ZERO) < 0) {
	    	throw new IllegalArgumentException("Price cannot be null nor negative");
		}
		this.name = name;
		this.price = price;
		this.taxPercent = tax;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public BigDecimal getTaxPercent() {
		return taxPercent;
	}

	public BigDecimal getPriceWithTax() {
		BigDecimal tax = price.multiply(taxPercent);
		return price.add(tax);
	}
}
