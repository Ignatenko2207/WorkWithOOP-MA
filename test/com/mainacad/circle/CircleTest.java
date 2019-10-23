package com.mainacad.circle;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @org.junit.jupiter.api.Test
    void getArea() {
        Circle circle = new Circle(10);
        assertEquals(314.15926, circle.getArea(), 0.00001);
        assertTrue(circle.getArea() > 314.15925 && circle.getArea() < 314.15927);
    }
}