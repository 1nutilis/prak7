package com.observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StockExchange implements ISubject {
    private Map<String, Set<IObserver>> stockObservers;
    private Map<String, Double> stockPrices;

    public StockExchange() {
        stockObservers = new HashMap<>();
        stockPrices = new HashMap<>();
    }

    @Override
    public void registerObserver(IObserver observer, String stockSymbol) {
        stockObservers.computeIfAbsent(stockSymbol, k -> new HashSet<>()).add(observer);
    }

    @Override
    public void removeObserver(IObserver observer, String stockSymbol) {
        Set<IObserver> observers = stockObservers.get(stockSymbol);
        if (observers != null) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers(String stockSymbol, double newPrice) {
        Set<IObserver> observers = stockObservers.get(stockSymbol);
        if (observers != null) {
            for (IObserver observer : observers) {
                observer.update(stockSymbol, newPrice);
            }
        }
    }

    public void setStockPrice(String stockSymbol, double newPrice) {
        stockPrices.put(stockSymbol, newPrice);
        notifyObservers(stockSymbol, newPrice);
    }
}