package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double result = amount * percent / 100 + amount;
        while (result >= salary) {
            result = result - salary;
            year++;
        }
        return year;
    }
}
