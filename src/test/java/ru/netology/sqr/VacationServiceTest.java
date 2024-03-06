package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {

    @ParameterizedTest
    @ParameterizedTest
    //      @CsvSource({
    //      " 10000,3000,20000, 3}
    //      "100000,60000,150000,2}

    //})
    @CsvFileSource(resources = "/params.csv")
    public void testCalculateVacationMonths(int income, int expenses, int threshold, int expectedMonths) {
        VacationServiceTest vacationService = new VacationServiceTest();
        int actualMonths = vacationService.calculateVacationMonths(income, expenses, threshold);
        assertEquals(expectedMonths, actualMonths);
    }
}



