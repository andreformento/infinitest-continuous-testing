package com.formento.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable {

    private final String description;
    private final BigDecimal price;

    public Product(String description, BigDecimal price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
