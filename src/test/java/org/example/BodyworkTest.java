package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyworkTest {
    Bodywork bodywork = new Bodywork("Fiat", 350);

    @BeforeEach
    void init() {
        bodywork.setName("c");
        bodywork.setSize(450);
    }

    @Test
    void getName() {
        assertEquals("c", bodywork.getName());
    }

    @Test
    void setName() {
        bodywork.setName("ss");
        assertEquals("ss", bodywork.getName());
    }

    @Test
    void getSize() {
        assertEquals(450, bodywork.getSize());
    }

    @Test
    void setSize() {
        bodywork.setSize(450);
        assertEquals(450, bodywork.getSize());
    }
}