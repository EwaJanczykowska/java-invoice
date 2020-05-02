package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public abstract class ExciseProduct extends Product {

    private BigDecimal excise = new BigDecimal("5.56");

    protected ExciseProduct(String name, BigDecimal price, BigDecimal tax) {
        super(name, price, tax);
    }

    @Override
    public BigDecimal getPriceWithTax() {
        return super.getPriceWithTax().add(excise);
    }
}