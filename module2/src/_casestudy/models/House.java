package _casestudy.models;

public class House extends Services{
    private String roomStandard;
    private String facilitiesDes;
    private int floors;

    public House() {
    }

    public House(String roomStandard, String facilitiesDes, int floors) {
        this.roomStandard = roomStandard;
        this.facilitiesDes = facilitiesDes;
        this.floors = floors;
    }

    public House(String nameService, int usedArea, int cost, int maxMember, String rentType, String id, String plusServices, String roomStandard, String facilitiesDes, int floors) {
        super(nameService, usedArea, cost, maxMember, rentType, id, plusServices);
        this.roomStandard = roomStandard;
        this.facilitiesDes = facilitiesDes;
        this.floors = floors;
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

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", facilitiesDes='" + facilitiesDes + '\'' +
                ", floors=" + floors +
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
