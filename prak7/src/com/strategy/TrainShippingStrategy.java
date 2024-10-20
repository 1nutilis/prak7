package com.strategy;

public class TrainShippingStrategy implements ICostCalculationStrategy{
    @Override
    public double calculateCost(double distance, int passengers, boolean discount) {
        double cost = (distance * 0.15 + 30) * passengers;
        return discount ? cost * 0.85 : cost;
    }
}
