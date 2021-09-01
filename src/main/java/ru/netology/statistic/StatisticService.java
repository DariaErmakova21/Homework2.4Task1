package ru.netology.statistic;


public class StatisticService {

    public long calculateSum(long[] sales) {

        long sum = 0;
        for (long sale : sales) {
            sum += sale;

        }
        return sum;
    }

    public long calculateAverageAmount(long[] sales) {

        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum / 12;
    }

    public long monthMax(long[] sales) {

        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[maxMonth]) {
                maxMonth = month;

            }
            month = month + 1;
        }
        return maxMonth;

    }

    public long monthMin(long[] sales) {

        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long aboveAverageAmount(long[] sales) {
        int averageAmount = 15;
        int numbersOfMonth = 0;
        for (long sale:sales){
            if (sale < averageAmount){
                numbersOfMonth = numbersOfMonth+1;
            }
        }

        return numbersOfMonth;
    }

    public long overAverageAmount(long[] sales) {
        int averageAmount = 15;
        int numbersOfMonth = 0;
        for (long sale:sales){
            if (sale > averageAmount){
                numbersOfMonth = numbersOfMonth+1;
            }
        }

        return numbersOfMonth;
    }
}

