package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задача 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задача 2

        int clientDeviceYear = 2014;
        if (clientOS == 1);
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else
            if (clientOS == 0);
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        if (clientOS == 0);
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else
            if (clientOS == 0);
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        // Задача 3
        int year = 2022;
        if ((year % 4 == 0) && ((year % 100 != 0) && year % 400 == 0)) {
            System.out.println(year + " - год является високосным");
        } else {
            System.out.println(year + " - год не является високосным");
        }

        //Задача 4
        int deliveryDistance = 95;
        int result = 1;
        if (deliveryDistance > 20) {
            result++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            result++;
        }
        System.out.println("Потребуется дней:" + result);

        //Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }


    }
}
