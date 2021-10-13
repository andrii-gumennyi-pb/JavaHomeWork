package com.pb.gumennyi.hw2;

import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {

        int a = 0, b = 14, d = 15, e = 35, f = 36, g = 50, k = 51, n = 100, m = -1;

        System.out.print("Проверка попадания числа в интервал от 0 до 100" + "\n" + "Введите число: ");

        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        if (i >= a && i <= b) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + a + " до " + b + "\n");
        } else if (i >= d && i <= e) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + d + " до " + e + "\n");
        } else if (i >= f && i <= g) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + f + " до " + g + "\n");
        } else if (i >= k && i <= n) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + k + " до " + n + "\n");
        } else if (i >= n) {
            System.out.print("Ваше число " + i + " не попадает ни в один интервал");
        } else if (i <= m) {
            System.out.print("Ваше число " + i + " является отрицательным");
        }
    }
}
