package oop.flight;

public abstract class Airport {
    private String airportId;
    private String airportName;

    public Airport(String airportId, String airportName) {
        this.airportId = airportId;
        this.airportName = airportName;
    }

    public String getAirportId() {
        return airportId;
    }

    public void setAirportId(String airportId) {
        this.airportId = airportId;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
}
