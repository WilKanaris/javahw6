package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldCalcSumOfSales() {

        int expected = 180;
        long actual = service.sumOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAverageSumOfSales() {

        int expected = 15;
        long actual = service.averageSumOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcNumMonthOfMaxSales() {

        int expected = 8;
        long actual = service.numMonthOfMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcNumMonthOfMinSales() {

        int expected = 9;
        int actual = service.numMonthOfMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCountMonthOfSalesBelowAverage() {

        int expected = 5;
        long actual = service.countMonthOfSalesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCountMonthOfSalesAboveAverage() {

        int expected = 5;
        long actual = service.countMonthOfSalesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

}