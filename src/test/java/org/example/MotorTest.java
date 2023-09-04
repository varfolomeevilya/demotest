package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorTest {
    Motor motor = new Motor("V16", 1300);
    @BeforeEach()
       void init(){
        motor.setName("z");
        motor.setPower(120);
    }

    @Test
    void getName() {

        assertEquals("z", motor.getName());
    }

    @Test
    void setName() {
        motor.setName("vc");
        assertEquals("vc",motor.getName());
    }

    @Test
    void getPower() {
        assertEquals(120, motor.getPower());
    }

    @Test
    void setPower() {
        motor.setPower(1500);
        assertEquals(1500, motor.getPower());
    }
}