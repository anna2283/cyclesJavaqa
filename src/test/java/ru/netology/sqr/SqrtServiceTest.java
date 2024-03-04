package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SqrtServiceTest {

    @ParameterizedTest
  //      @CsvSource({
  //      "10,99,90,
  //      "120,220,90,
    //    "500,1000,90,

  //})
    @CsvFileSource(resources = "/params.csv")


    public void testRegisteredUnderLimit (int firstNum, int secondNum) {

        SqrtService service = new SqrtService();

        int quantity = service.calculateSqrtService (firstNum, secondNum);

        Assertions.assertEquals(firstNum, secondNum, quantity);
    }
}








