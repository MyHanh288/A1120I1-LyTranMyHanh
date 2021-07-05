package model;

public class Villa {
    private String villaId;
    private String villaName;
    private String villaStandard;
    private String villaDescribe;
    private int poolArea;
    private int floorNum;
    private Service service;

    public Villa(String villaId, String villaName, String villaStandard, String villaDescribe, int poolArea, int floorNum, Service service) {
        this.villaId = villaId;
        this.villaName = villaName;
        this.villaStandard = villaStandard;
        this.villaDescribe = villaDescribe;
        this.poolArea = poolArea;
        this.floorNum = floorNum;
        this.service = service;
    }

    public String getVillaId() {
        return villaId;
    }

    public void setVillaId(String villaId) {
        this.villaId = villaId;
    }

    public String getVillaName() {
        return villaName;
    }

    public void setVillaName(String villaName) {
        this.villaName = villaName;
    }

    public String getVillaStandard() {
        return villaStandard;
    }

    public void setVillaStandard(String villaStandard) {
        this.villaStandard = villaStandard;
    }

    public String getVillaDescribe() {
        return villaDescribe;
    }

    public void setVillaDescribe(String villaDescribe) {
        this.villaDescribe = villaDescribe;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
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
