package org.example.oop.museum;

public class Sculpture implements Exhibit {
    @Override
    public void care() {
        System.out.println("Нужна частая реставрация");
    }
}
