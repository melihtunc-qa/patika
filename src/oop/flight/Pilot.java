package oop.flight;

public abstract class Pilot {
    private String pilotName;
    private int experienceLevel;

    public Pilot(String pilotName, int experienceLevel) {
        this.pilotName = pilotName;
        this.experienceLevel = experienceLevel;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(int experienceLevel) {
        this.experienceLevel = experienceLevel;
    }
}
