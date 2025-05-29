package org.example.oop.museum;

public class MuseumManager {
    private Exhibit exhibit;

    public void add(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void howToCare() {
        exhibit.care();
    }
}
