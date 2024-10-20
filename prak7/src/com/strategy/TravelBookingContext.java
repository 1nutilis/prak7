package com.strategy;

public class TravelBookingContext {
    private ICostCalculationStrategy costStrategy;

    public void setCostStrategy(ICostCalculationStrategy strategy) {
        this.costStrategy = strategy;
    }

    public double calculateTripCost(double distance, int passengers, boolean discount) {
        if (costStrategy == null) {
            throw new IllegalStateException("Стратегия расчета не установлена.");
        }
        return costStrategy.calculateCost(distance, passengers, discount);
    }
}