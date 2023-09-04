package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransmissionTest {
    Transmission transmission = new Transmission("BAR007", 10);
    @BeforeEach
    void inti(){
        transmission.setName("f");
        transmission.setWear_and_tear(35);
        transmission.setName("b");

    }
    @Test
    void getName() {
    assertEquals("b", transmission.getName());
    }

    @Test
    void setName() {
        transmission.setName("f");
        assertEquals("f", transmission.getName());
    }

    @Test
    void getWear_and_tear() {
        assertEquals(35, transmission.getWear_and_tear());
    }

    @Test
    void setWear_and_tear() {
        transmission.setWear_and_tear(15);
        assertEquals(15, transmission.getWear_and_tear());
    }
}