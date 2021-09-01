package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticServiceTest {
    @Test

    void calculateSum(){
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual  = service.calculateSum(sales);

        assertEquals(expected,actual);

    }
    @Test
    void calculateAverageAmount(){
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverageAmount(sales);

        assertEquals(expected,actual);
    }
    @Test
    void monthMax(){

        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.monthMax(sales);

        assertEquals(expected,actual);
    }

    @Test
    void monthMin(){

        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.monthMin(sales);

        assertEquals(expected,actual);
    }

    @Test
    void aboveAverageAmount(){

        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.aboveAverageAmount(sales);

        assertEquals(expected,actual);
    }

    @Test
    void overAverageAmount(){

        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.aboveAverageAmount(sales);

        assertEquals(expected,actual);
    }
    }

