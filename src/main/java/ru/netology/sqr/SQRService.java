package ru.netology.sqr;

public class SQRService {
    public int numberOfSquares(int lowerRange, int upperRange) {
        int result = 0;

        for (int i = 10; i <= 99; i++) {
            int j = i * i;
            if (j >= lowerRange && j <= upperRange) {
                result++;
            }
        }
        return result;
    }
}
