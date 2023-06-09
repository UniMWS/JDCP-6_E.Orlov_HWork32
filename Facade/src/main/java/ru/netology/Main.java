package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("JDCP-6, Евгений Орлов, ДЗ-32: " +
                "\"Структурные шаблоны. Proxy, Decorator, Adapter\"");
        System.out.println("Задача №2. “Двоичный фасад” (необязательна к выполнению)\n");

        BinOps bins = new BinOps();
        //ввод и преобразование в двоичный вид двух чисел
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        String firstBinary = Integer.toBinaryString(a);
        System.out.println("Первое число в двоичной системе: " + normalBinary(firstBinary));
        String secondBinary = Integer.toBinaryString(b);
        System.out.println("Второе число в двоичной системе: " + normalBinary(secondBinary));

        //расчёты с шаблоном Facade
        String sum = bins.sum(firstBinary, secondBinary);
        System.out.printf("\n\"%d+%d = %d\"\tв бинарном виде: %s\n", a, b, (a + b), normalBinary(sum));
        String mult = bins.mult(firstBinary, secondBinary);
        System.out.printf("\"%d*%d=%d\"\tв бинарном виде: %s\n", a, b, (a * b), normalBinary(mult));
    }

    //Нормализуем длину строки кратно 4
    private static String normalBinary(String str) {
        while (str.length() % 4 != 0) {
            StringBuilder strBins = new StringBuilder();
            strBins.append(0);
            strBins.append(str);
            str = String.valueOf(strBins);
        }
        return splitBinary(str);
    }

    //делим строку по 4 символа
    private static String splitBinary(String str) {
        char[] array = str.toCharArray();
        StringBuilder strBins = new StringBuilder();
        int cut = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((strBins.length() - cut) % 4 == 0 && strBins.length() != 0) {
                strBins.append(' ');
                cut++;
            }
            strBins.append(array[i]);
        }
        return String.valueOf(strBins);
    }
}