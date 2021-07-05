package model;

public class AccompaniedService {
    private String accSerId;
    private String accSerName;
    private String unit;
    private int price;

    public AccompaniedService(String accSerId, String accSerName, String unit, int price) {
        this.accSerId = accSerId;
        this.accSerName = accSerName;
        this.unit = unit;
        this.price = price;
    }

    public String getAccSerId() {
        return accSerId;
    }

    public void setAccSerId(String accSerId) {
        this.accSerId = accSerId;
    }

    public String getAccSerName() {
        return accSerName;
    }

    public void setAccSerName(String accSerName) {
        this.accSerName = accSerName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
