package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationPlannerServiceTest {
    @ParameterizedTest
    @CsvSource({
            "11, 10000, 3000, 20000",
            "9, 100000, 60000, 150000"
    })
    public void testCalculateVacationMonths(int expected, int income, int expenses, int threshold) {
        VacationPlannerService planner = new VacationPlannerService();
        int result = planner.calculateVacationMonths(income, expenses, threshold);
        assertEquals(expected, result);
    }
}

















