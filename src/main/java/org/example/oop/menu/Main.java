package org.example.oop.menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.add(new HotDish(15));
        menu.add(new Drink(2));

        menu.printMenu();
    }
}
