package oop.elevator;

public class ElevatorShaft {
    private int floorNumber;
    private boolean arrivalBell;
    private boolean signalLight;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public boolean isArrivalBell() {
        return arrivalBell;
    }

    public void setArrivalBell(boolean arrivalBell) {
        this.arrivalBell = arrivalBell;
    }

    public boolean isSignalLight() {
        return signalLight;
    }

    public void setSignalLight(boolean signalLight) {
        this.signalLight = signalLight;
    }
}
