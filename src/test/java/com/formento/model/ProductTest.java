package com.formento.model;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    @Test
    public void shouldCreateAndConfigureProduct() {
        // given
        final String description = "Smartphone";
        final BigDecimal price = new BigDecimal(850);

        // when
        final Product smartphone = new Product(description, price);

        // then
        assertEquals(description, smartphone.getDescription());
        assertEquals(price, smartphone.getPrice());
    }

}
