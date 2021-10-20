package com.pb.gumennyi.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Угадайте задуманное число в диапазоне от 0 до 100.");
        System.out.println("Для выхода из программы введите - exit.");

        final int MAX_ATTEMPT = 101; // Допустимое количество попыток.
        int attempt = 0;           // Счетчик попыток.
        String number = "56";      // Задуманное число.
        Scanner in = new Scanner(System.in);

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            String value = in.next();

            if (value.equals("exit")) {
                break;

            }

            if (!value.equals(number)) {
                continue;
            }

            System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
            break;
        }

        System.out.println("Конец игры!");
    }
}
