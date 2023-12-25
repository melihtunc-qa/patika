package oop.elevator;

public abstract class Elevator {
    protected int currentFloor;
    protected int[] destinationFloors;
    protected boolean doorOpen;
    public abstract void moveUp();

    public abstract void moveDown();

    public void openDoor() {
        // Asansör kapılarını aç
    }

    public void closeDoor() {
        // Asansör kapılarını kapat
    }

}
