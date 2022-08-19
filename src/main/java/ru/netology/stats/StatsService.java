package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long allSales = 0;
        for (long i = 0; i < sales.length; i++) {
            allSales = allSales + sales[(int) i];
        }
        return allSales;
    }

    public long averageSales(long[] sales) {
        long sumSales = sumSales(sales);
        return sumSales / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth = maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth = minMonth + 1;
    }

    public int minAverageSales(long[] sales) {
        long averageSales = averageSales(sales);
        int n = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] < averageSales) {
                n++;
            }
        }
        return n;
    }

    public int maxAverageSales(long[] sales) {
        long averageSales = averageSales(sales);
        int n = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] > averageSales) {
                n++;
            }
        }
        return n;
    }
}


