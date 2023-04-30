package ru.netology;

public class Main {
    public static void main(String[] args) {
        System.out.println("JDCP-6, Евгений Орлов, ДЗ-32: " +
                "\"Структурные шаблоны. Proxy, Decorator, Adapter\"");
        System.out.println("Задача №1. “Калькулятор” (обязательная)\n");

        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(2, 2));
        System.out.println(calc.sum(10, 22));
        System.out.println(calc.pow(2, 10));
    }
}