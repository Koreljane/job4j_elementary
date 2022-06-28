package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (; finish >= start; start++) {
            sum = sum + start;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(-2, 9));
        System.out.println(sum(1, 1));
        System.out.println(sum(-10, 2));
        System.out.println(sum(2, 15));
        System.out.println(sum(6, 4));
    }
}