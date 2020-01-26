package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	private Collection<Product> products = new ArrayList<>();

	public void addProduct(Product product) {
		products.add(product);
	}

	public void addProduct(Product product, Integer quantity) {
		// TODO: implement
	}

	public BigDecimal getSubtotal() {
		BigDecimal sum = BigDecimal.ZERO;
		for (Product product: products) {
			sum = sum.add(product.getPrice());
		}
		return sum;
	}

	public BigDecimal getTax() {
		BigDecimal sumTax = BigDecimal.ZERO;
		for (Product product : products) {
			sumTax = sumTax.add(product.getTaxValue());
		}
		return sumTax;
	}

	public BigDecimal getTotal() {
        BigDecimal sumTotal = BigDecimal.ZERO;
        for (Product product : products) {
            sumTotal = sumTotal.add(product.getPrice());
        }
        return sumTotal;
    }
}
