package ru.netology.sqr;

public class VacationPlannerService {

    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= expenses) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                if (money >= threshold) { // проверяем порог для отдыха
                    money = money - (expenses * 3); // траты на отдых
                } else {
                    money = money + income; // работаем
                }
            } else {
                money = money + income; // работаем
            }
        }
        return count;
    }
}










