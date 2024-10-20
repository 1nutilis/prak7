package com.strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TravelBookingContext context = new TravelBookingContext();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип транспорта: 1 - Самолет, 2 - Поезд, 3 - Автобус");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                context.setCostStrategy(new PlaneShippingStrategy());
                break;
            case 2:
                context.setCostStrategy(new TrainShippingStrategy());
                break;
            case 3:
                context.setCostStrategy(new BusShippingStrategy());
                break;
            default:
                System.out.println("Неверный выбор.");
                return;
        }

        System.out.println("Введите расстояние (в км):");
        double distance = scanner.nextDouble();

        System.out.println("Введите количество пассажиров:");
        int passengers = scanner.nextInt();

        System.out.println("Есть ли скидка? (true/false):");
        boolean discount = scanner.nextBoolean();

        double cost = context.calculateTripCost(distance, passengers, discount);
        System.out.println("Стоимость поездки: $" + cost);
    }
}