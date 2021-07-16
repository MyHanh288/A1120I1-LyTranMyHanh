package model;

public class House {
    private String houseId;
    private String houseName;
    private String houseStandard;
    private String houseDescribe;
    private int floorNum;
    private Service service;

    public House(String houseId, String houseName, String houseStandard, String houseDescribe, int floorNum, Service service) {
        this.houseId = houseId;
        this.houseName = houseName;
        this.houseStandard = houseStandard;
        this.houseDescribe = houseDescribe;
        this.floorNum = floorNum;
        this.service = service;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseStandard() {
        return houseStandard;
    }

    public void setHouseStandard(String houseStandard) {
        this.houseStandard = houseStandard;
    }

    public String getHouseDescribe() {
        return houseDescribe;
    }

    public void setHouseDescribe(String houseDescribe) {
        this.houseDescribe = houseDescribe;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
