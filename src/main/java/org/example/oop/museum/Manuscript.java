package org.example.oop.museum;

public class Manuscript implements Exhibit {
    @Override
    public void care() {
        System.out.println("Нужно контроллировать влажность");
    }
}
