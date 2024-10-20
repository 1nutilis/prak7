package com.observer;

public class Main {
    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();


        TraderObserver trader1 = new TraderObserver("Трейдер 1");
        TradingRobotObserver robot = new TradingRobotObserver();


        stockExchange.registerObserver(trader1, "AAPL");
        stockExchange.registerObserver(robot, "AAPL");


        stockExchange.setStockPrice("AAPL", 120.0);
        stockExchange.setStockPrice("AAPL", 95.0);


        stockExchange.removeObserver(trader1, "AAPL");
        stockExchange.setStockPrice("AAPL", 130.0);
    }
}
