package org.example.oop.garden;

public class Garden {
    private Plant plant;

    public void add(Plant plant) {
        this.plant = plant;
    }

    public void showActions() {
        plant.care();
    }
}
