package org.example.oop.park;

import java.sql.SQLOutput;

public class RollerCoaster extends Attraction {
    @Override
    public void care() {
        System.out.println("Нужна проверка безопасности");
    }
}
