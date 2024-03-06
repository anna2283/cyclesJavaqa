package ru.netology.sqr;

public class SqrtService {
    public int calculateSqrtService(int income, int expenses,int threshold) {
        int months = 0; // счётчик месяцев отдыха
        int savings = 0; // количество денег на счету
        for (int i = 1; i <= 12; i++)
        {
            if (savings < threshold)
            {
                savings += income - expenses;
                if (savings >= threshold) {
                    months++;
                    savings -= expenses * 3;
                }
            }

            months++;
            savings -=expenses * 3;

        }

        return months;
    }

}


