package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public class FuelCanister extends ExciseProduct {

    protected FuelCanister(String name, BigDecimal price) {
        super(name, price, BigDecimal.ZERO);
    }

}
