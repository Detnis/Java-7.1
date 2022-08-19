package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldCalcSumSales () {
        StatsService service= new StatsService();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long expected = 180;
        long actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAverageSales () {
        StatsService service = new StatsService();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long expected = 15;
        long actual = service.averageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxMonth () {
        StatsService service = new StatsService();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMinMonth () {
        StatsService service = new StatsService();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMonthUnderAverageSales () {
        StatsService service = new StatsService();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 5;
        int actual = service.minAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMonthAboveAverageSales () {
        StatsService service = new StatsService();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 5;
        int actual = service.maxAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
