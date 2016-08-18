package com.formento.model;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    @Test
    public void shouldCreateAndConfigureProduct() {
        // given
        String description = "Smartphone";
        BigDecimal price = new BigDecimal(800);

        // when
        Product smartphone = new Product(description, price);

        // then
        assertEquals(description, smartphone.getDescription());
        assertEquals(price, smartphone.getPrice());
    }

}
