package de.codevibe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void getters() {
        // given
        long id = 123_456;
        String name = "Some name";

        // when
        Product p = new Product(id, name);
        long actualId = p.getId();
        String actualName = p.getName();

        // then
        Assertions.assertEquals(id, actualId);
        Assertions.assertEquals(name, actualName);
    }

}