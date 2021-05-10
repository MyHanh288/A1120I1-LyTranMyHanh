package _casestudy.models;

public class Room extends Services{
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String nameService, int usedArea, int cost, int maxMember, String rentType, String id, String plusServices, String freeService) {
        super(nameService, usedArea, cost, maxMember, rentType, id, plusServices);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
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
