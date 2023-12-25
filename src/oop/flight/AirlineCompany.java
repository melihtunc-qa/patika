package oop.flight;

import java.util.List;

public abstract class AirlineCompany {

    private String companyId;
    private String companyName;
    private List<Aircraft> aircrafts;

    public AirlineCompany(String companyId, String companyName, List<Aircraft> aircrafts) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.aircrafts = aircrafts;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public void setAircrafts(List<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }
}
