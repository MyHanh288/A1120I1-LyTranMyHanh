package model;

public class Regency {
    private String regencyId;
    private String regencyName;

    public Regency(String regencyId, String regencyName) {
        this.regencyId = regencyId;
        this.regencyName = regencyName;
    }

    public String getRegencyId() {
        return regencyId;
    }

    public void setRegencyId(String regencyId) {
        this.regencyId = regencyId;
    }

    public String getRegencyName() {
        return regencyName;
    }

    public void setRegencyName(String regencyName) {
        this.regencyName = regencyName;
    }
}
