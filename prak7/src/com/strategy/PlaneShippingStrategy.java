package com.strategy;

public class PlaneShippingStrategy implements ICostCalculationStrategy{
    @Override
    public double calculateCost(double distance, int passengers, boolean discount) {
        double cost = (distance * 0.3 + 100) * passengers;
        return discount ? cost * 0.9 : cost;
    }
}
