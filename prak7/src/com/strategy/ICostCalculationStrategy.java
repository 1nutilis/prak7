package com.strategy;

public interface ICostCalculationStrategy {
    double calculateCost(double distance, int passengers, boolean discount);
}
