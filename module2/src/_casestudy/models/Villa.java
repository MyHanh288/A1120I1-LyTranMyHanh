package _casestudy.models;

public class Villa extends Services {
    private String roomStandard;
    private String facilitiesDes;
    private int floors;
    private int poolArea;

    public Villa() {
    }

    public Villa(String roomStandard, String facilitiesDes, int floors, int poolArea) {
        this.roomStandard = roomStandard;
        this.facilitiesDes = facilitiesDes;
        this.floors = floors;
        this.poolArea = poolArea;
    }

    public Villa(String nameService, int usedArea, int cost, int maxMember, String rentType, String id, String plusServices, String roomStandard, String facilitiesDes, int floors, int poolArea) {
        super(nameService, usedArea, cost, maxMember, rentType, id, plusServices);
        this.roomStandard = roomStandard;
        this.facilitiesDes = facilitiesDes;
        this.floors = floors;
        this.poolArea = poolArea;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getFacilitiesDes() {
        return facilitiesDes;
    }

    public void setFacilitiesDes(String facilitiesDes) {
        this.facilitiesDes = facilitiesDes;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", facilitiesDes='" + facilitiesDes + '\'' +
                ", floors=" + floors +
                ", poolArea=" + poolArea +
                "nameService='" + getNameService() + '\'' +
                ", usedArea=" + getUsedArea() +
                ", cost=" + getCost() +
                ", maxMember=" + getMaxMember() +
                ", rentType='" + getRentType() + '\'' +
                ", id='" + getId() + '\'' +
                ", plusServices='" + getPlusServices() + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
}
