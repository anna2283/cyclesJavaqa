package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SqrtServiceTest {

    @ParameterizedTest
  //      @CsvSource({
  //      "10000,3000,20000, true",
  //      "100000,60000,150000, false"
  //})
    @CsvFileSource(resources = "/params.csv")


    public void testRegisteredUnderLimit (int expected, int income, int expenses, int threshold) {
        SqrtService service = new SqrtService();

        int actual = service.calculateSqrtService(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}








