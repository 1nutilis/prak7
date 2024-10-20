package com.observer;

public class TradingRobotObserver implements IObserver{
    @Override
    public void update(String stockSymbol, double stockPrice) {
        if (stockPrice > 100) {
            System.out.println("Торговый робот покупает акцию " + stockSymbol + " по цене " + stockPrice);
        } else {
            System.out.println("Торговый робот продает акцию " + stockSymbol + " по цене " + stockPrice);
        }
    }
}
