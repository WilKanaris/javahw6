package ru.netology.stats;

public class StatsService {

    public int sumOfSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSumOfSales(long[] sales) {
        int sum = 0;
        int averageSum = 0;
        for (long sale : sales) {
            sum += sale;
            averageSum = (sum / sales.length);
        }
        return averageSum;
    }

    public int numMonthOfMaxSales(long[] sales) {
        int maxMonth = 0;
        int index = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = index;
            }
            index = index + 1;
        }
        return maxMonth + 1;
    }

    public int numMonthOfMinSales(long[] sales) {
        int minMonth = 0;
        int index = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = index;
            }
            index = index + 1;
        }
        return minMonth + 1;
    }

    public int countMonthOfSalesBelowAverage(long[] sales) {
        int count = 0;
        int averageSum = averageSumOfSales(sales);
        for (long sale : sales) {
            if (sale > averageSum) {
                count++;
            }
        }
        return count;
    }

    public int countMonthOfSalesAboveAverage(long[] sales) {
        int count = 0;
        int averageSum = averageSumOfSales(sales);
        for (long sale : sales) {
            if (sale < averageSum) {
                count++;
            }
        }
        return count;
    }
}