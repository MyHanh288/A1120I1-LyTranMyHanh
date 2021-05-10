package _casestudy.models;

public abstract class Services {
    private String nameService;
    private int usedArea;
    private int cost;
    private int maxMember;
    private String rentType;
    private String id;
    private String plusServices;

    public Services() {
    }

    public Services(String nameService, int usedArea, int cost, int maxMember, String rentType, String id, String plusServices) {
        this.nameService = nameService;
        this.usedArea = usedArea;
        this.cost = cost;
        this.maxMember = maxMember;
        this.rentType = rentType;
        this.id = id;
        this.plusServices = plusServices;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(int usedArea) {
        this.usedArea = usedArea;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMaxMember() {
        return maxMember;
    }

    public void setMaxMember(int maxMember) {
        this.maxMember = maxMember;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlusServices() {
        return plusServices;
    }

    public void setPlusServices(String plusServices) {
        this.plusServices = plusServices;
    }

    @Override
    public String toString() {
        return "Services{" +
                "nameService='" + nameService + '\'' +
                ", usedArea=" + usedArea +
                ", cost=" + cost +
                ", maxMember=" + maxMember +
                ", rentType='" + rentType + '\'' +
                ", id='" + id + '\'' +
                ", plusServices='" + plusServices + '\'' +
                '}';
    }

    public abstract void showInfo();
}
