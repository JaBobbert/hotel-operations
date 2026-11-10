package com.pluralsight;

public class Room {
    private int getNumberOfBeds;
    private double getPrice;
    private boolean isDirty;
    private boolean isOccupied;

    public Room(int getNumberOfBeds, double getPrice){
        this.getNumberOfBeds = getNumberOfBeds;
        this.getPrice = getPrice;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return getNumberOfBeds;
    }

    public double getPrice() {
        return getPrice;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }
}
