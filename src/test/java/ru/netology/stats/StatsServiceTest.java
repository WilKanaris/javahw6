package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    public void shouldCalcSumOfSales() {

        int actual = service.sumOfSales(sales);
        int expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAverageSumOfSales() {

        int actual = service.averageSumOfSales(sales);
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcNumMonthOfMaxSales() {

        int actual = service.numMonthOfMaxSales(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcNumMonthOfMinSales() {

        int actual = service.numMonthOfMinSales(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCountMonthOfSalesBelowAverage() {

        int actual = service.countMonthOfSalesBelowAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCountMonthOfSalesAboveAverage() {

        int actual = service.countMonthOfSalesAboveAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

}