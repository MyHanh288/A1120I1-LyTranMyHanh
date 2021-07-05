package model;

public class Room {
    private String roomId;
    private String roomName;
    private String freeServiceName;
    private Service service;

    public Room(String roomId, String roomName, String freeServiceName, Service service) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.freeServiceName = freeServiceName;
        this.service = service;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getFreeServiceName() {
        return freeServiceName;
    }

    public void setFreeServiceName(String freeServiceName) {
        this.freeServiceName = freeServiceName;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
