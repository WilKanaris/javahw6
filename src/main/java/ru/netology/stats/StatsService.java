package ru.netology.stats;

public class StatsService {

    public long sumOfSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageSumOfSales(long[] sales) {
        long sum = sumOfSales(sales);
        return sum / sales.length;
    }

    public int numMonthOfMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int numMonthOfMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public long countMonthOfSalesBelowAverage(long[] sales) {
        long count = 0;
        long averageSum = averageSumOfSales(sales);
        for (long sale : sales) {
            if (sale < averageSum) {
                count++;
            }
        }
        return count;
    }

    public long countMonthOfSalesAboveAverage(long[] sales) {
        long count = 0;
        long averageSum = averageSumOfSales(sales);
        for (long sale : sales) {
            if (sale > averageSum) {
                count++;
            }
        }
        return count;
    }
}