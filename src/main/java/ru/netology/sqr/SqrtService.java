package ru.netology.sqr;

public class SqrtService {
    public int calculateSqrtService(int firstNum, int secondNum) {
        int max = 99;
        int quantity = 0;

        for (int i = firstNum; i <= secondNum; i++) {
            if (firstNum <= i * i && i * i <= secondNum) ;
            {
                quantity = quantity + 1;
            }
        }
        return quantity;
    }
}
