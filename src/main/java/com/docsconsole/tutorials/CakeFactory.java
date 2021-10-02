package com.docsconsole.tutorials;

public class CakeFactory {
    public Cake makeCake (String cakeName) {
        Cake cake = null;
        if (cakeName.equalsIgnoreCase("BlackForest")) {
            cake = new BlackForest(600l);
            System.out.println("Ordered cake is: BlackForest and price is:" + cake.getCakePrice() + "$");
        } else if (cakeName.equalsIgnoreCase("StrawBerryCrush")) {
            cake = new StrawBerryCrush(500l);
            System.out.println("Ordered cake is: StrawBerryCrush and price is:" + cake.getCakePrice() + "$");
        } else if (cakeName.equalsIgnoreCase("ChocolateTruffle")) {
            cake = new ChocolateTruffle(650l);
            System.out.println("Ordered cake is: ChocolateTruffle and price is:" + cake.getCakePrice() + "$");
        } else {
            System.out.println("The order cake is not presented now.");
        }
        return cake;
    }
}
