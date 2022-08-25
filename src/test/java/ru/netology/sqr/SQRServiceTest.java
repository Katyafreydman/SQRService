package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @Test
    public void countSquares() {

        SQRService service = new SQRService();
        //проверяем диапозон 200,300, тест проходит

        int actual = service.calculate(200, 300);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void countSquaresNearlimit() {
        SQRService service = new SQRService();
        //проверяем диапозон 199,301, тест  проходит
        int actual = service.calculate(199, 301);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void countSquaresUnderlimit() {
        SQRService service = new SQRService();
        //проверяем диапозон 150,350, тест не проходит

        int actual = service.calculate(150, 350);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void countSquaresBig() {
        SQRService service = new SQRService();
        //проверяем диапозон 7000, 15000, тест  не проходит
        int actual = service.calculate(7000, 15000);
        int expected = 3;
        assertEquals(expected, actual);
    }
}
