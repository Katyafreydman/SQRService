package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @Test
    public void countSquares() {

        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void countSquaresNearlimit() {
        SQRService service = new SQRService();
        int actual = service.calculate(199, 301);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void countSquaresOverlimit() {
        SQRService service = new SQRService();

        int actual = service.calculate(201, 301);
        int expected = 3;
        assertEquals(expected, actual);
    }
}
