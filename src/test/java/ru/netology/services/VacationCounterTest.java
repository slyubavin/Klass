package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationCounterTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dataForCalculation.csv")
    public void VacationCounterTest3(int income, int expenses, int threshold, int expected) {
        VacationCounter vacationCounter = new VacationCounter();
        int actual = vacationCounter.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

/*    @Test
    public void VacationCounterTest1() {
        VacationCounter vacationCounter = new VacationCounter();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;
        int actual = vacationCounter.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VacationCounterTest2() {
        VacationCounter vacationCounter = new VacationCounter();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;
        int actual = vacationCounter.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }*/
}