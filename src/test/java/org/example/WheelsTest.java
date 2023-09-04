package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WheelsTest {
    Wheels wheels=new Wheels("zero", 200, 100);
    @BeforeEach
    void init(){
        wheels.setName("x");
        wheels.setSize(900);
        wheels.setFriction_force(100);
    }
    @Test
    void getName() {
        assertEquals("x",wheels.getName());
    }

    @Test
    void setName() {
        wheels.setName("vv");
        assertEquals("vv", wheels.getName());
    }
    @Test
    void getFriction_force() {
       assertEquals(100, wheels.getFriction_force());
    }

    @Test
    void setFriction_force() {
        wheels.setFriction_force(100);
        assertEquals(100, wheels.getFriction_force());
    }

    @Test
    void getSize() {
        assertEquals(200, wheels.getSize());
    }

    @Test
    void setSize() {
        wheels.setSize(200);
        assertEquals(200, wheels.getSize());
    }


}