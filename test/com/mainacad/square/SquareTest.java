package com.mainacad.square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getArea() {
        Square square = new Square(10);
        assertEquals(100.0, square.getArea(), 0.1);
    }
}