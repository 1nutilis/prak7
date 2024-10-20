package com.observer;

public class TraderObserver implements IObserver{
    private String traderName;

    public TraderObserver(String name) {
        this.traderName = name;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println(traderName + " получил обновление по акции " + stockSymbol + ": новая цена = " + stockPrice);
    }
}


