package ru.dyankovskaya.multiplicationtable.service;

//1. Вывести таблицу умножения (для чисел от 2 до 5) в консоль используя циклы в виде: 2 x 2 = 4.
// (числа должны вычисляться)

public class MultiplicationTable {
    public static void multiply() {
        int num1 = 2;
        int num2 = 2;
        while (num2 <=5 ) {
            System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
            num2++;
        }
    }
}
