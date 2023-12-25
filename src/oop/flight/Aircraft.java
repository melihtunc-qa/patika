package oop.flight;

import java.util.List;

public abstract class Aircraft {
    private String aircraftType;
    private boolean isOperational;
    private String aircraftId;
    private int requiredPilotCount;
    private List<Pilot> pilots;

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public boolean isOperational() {
        return isOperational;
    }

    public void setOperational(boolean operational) {
        isOperational = operational;
    }

    public String getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(String aircraftId) {
        this.aircraftId = aircraftId;
    }

    public int getRequiredPilotCount() {
        return requiredPilotCount;
    }

    public void setRequiredPilotCount(int requiredPilotCount) {
        this.requiredPilotCount = requiredPilotCount;
    }

    public List<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(List<Pilot> pilots) {
        this.pilots = pilots;
    }

    public Aircraft(String aircraftType, boolean isOperational, String aircraftId, int requiredPilotCount, List<Pilot> pilots) {
        this.aircraftType = aircraftType;
        this.isOperational = isOperational;
        this.aircraftId = aircraftId;
        this.requiredPilotCount = requiredPilotCount;
        this.pilots = pilots;
    }
}
