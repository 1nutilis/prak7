package com.observer;

public interface IObserver {
    void update(String stockSymbol, double stockPrice);
}
