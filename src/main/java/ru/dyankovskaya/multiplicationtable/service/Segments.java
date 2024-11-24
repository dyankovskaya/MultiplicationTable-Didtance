package ru.dyankovskaya.multiplicationtable.service;

//2. Ввести с клавиатуры координаты первой точки A (x1, y1) и координаты второй точки B (x2, y2).
// (т.е. с клавиатуры было введено 4 числа, по 2 на каждую точку).
// Вычислить и вывести в консоль длину отрезка AB на плоскости.

import java.util.Scanner;

public class Segments {
    public static void distance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите коодринаты первой точки.");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Введите коодринаты второй точки.");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));
        System.out.println("Длина отрезка равна " + distance);
    }
}
