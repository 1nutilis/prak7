package com.strategy;

public class BusShippingStrategy implements ICostCalculationStrategy {
    @Override
    public double calculateCost(double distance, int passengers, boolean discount) {
        double cost = (distance * 0.1 + 10) * passengers;
        return discount ? cost * 0.8 : cost;
    }
}