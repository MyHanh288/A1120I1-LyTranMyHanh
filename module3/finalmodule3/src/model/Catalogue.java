package model;

public class Catalogue {
    private String calatogueId;
    private String calatogueName;

    public Catalogue(String calatogueId, String calatogueName) {
        this.calatogueId = calatogueId;
        this.calatogueName = calatogueName;
    }

    public Catalogue(String catalogueId) {
    }

    public String getCalatogueId() {
        return calatogueId;
    }

    public void setCalatogueId(String calatogueId) {
        this.calatogueId = calatogueId;
    }

    public String getCalatogueName() {
        return calatogueName;
    }

    public void setCalatogueName(String calatogueName) {
        this.calatogueName = calatogueName;
    }
}
