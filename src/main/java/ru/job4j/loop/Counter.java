package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; finish >= start; start++) {
            sum = sum + start;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; finish >= start; start++) {
            if (start % 2 == 0) {
                sum = sum + start;
            }
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

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}
