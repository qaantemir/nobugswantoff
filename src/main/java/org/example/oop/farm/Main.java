package org.example.oop.farm;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        farm.add(new Cow());
        farm.showActions();
    }
}
