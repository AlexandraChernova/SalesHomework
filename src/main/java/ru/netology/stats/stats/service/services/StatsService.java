package ru.netology.stats.stats.service.services;

public class StatsService {

    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;

        }
        return result;
    }

    public long average(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result / sales.length;
    }

    public int minimum(long[] sales) {
        int minMonth = 0;
        long minSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minSale = sales[i];
                minMonth = i;
            }
        }

        return minMonth + 1;

    }

    public int lowAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
