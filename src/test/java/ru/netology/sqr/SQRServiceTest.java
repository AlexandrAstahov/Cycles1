package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void numberOfSquaresSmallRange() {
        SQRService sqrService = new SQRService();

        int expected = 3;
        int actual = sqrService.numberOfSquares(200, 300);

        assertEquals(expected,actual);

    }

    @Test
    void numberOfSquaresMediumRange() {
        SQRService sqrService = new SQRService();

        int expected = 40;
        int actual = sqrService.numberOfSquares(200, 3000);

        assertEquals(expected,actual);

    }

    @Test
    void numberOfSquaresLardRange() {
        SQRService sqrService = new SQRService();

        int expected = 85;
        int actual = sqrService.numberOfSquares(200, 30_000);

        assertEquals(expected,actual);

    }
}