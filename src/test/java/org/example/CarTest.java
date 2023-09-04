package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car = new Car("Niva",  145);
    @BeforeEach
    void init(){
        car.setName("z");
        car.setPower(1600);
    }
    @Test
    void getName() {

     assertEquals("z",car.getName() );
    }

    @Test
    void setName() {
        car.setName("qq");
    assertEquals("qq", car.getName());
    }
    @Test
    void getPower() {
        assertEquals(0, 0);

    }

    @Test
    void setPower() {
        assertEquals(0, 0);
    }

}