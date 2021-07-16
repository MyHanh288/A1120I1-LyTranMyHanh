package model;

public class Service {
    private String serviceId;
    private String serviceName;
    private int useArea;
    private int rentalPrice;
    private int maxPeople;
    private RentalType rentalType;

    public Service(String serviceId, String serviceName, int useArea, int rentalPrice, int maxPeople, RentalType rentalType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.rentalPrice = rentalPrice;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUseArea() {
        return useArea;
    }

    public void setUseArea(int useArea) {
        this.useArea = useArea;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentalType getRentalType() {
        return rentalType;
    }

    public void setRentalType(RentalType rentalType) {
        this.rentalType = rentalType;
    }
}
