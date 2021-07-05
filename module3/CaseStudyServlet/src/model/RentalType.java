package model;

public class RentalType {
    private String rentalTypeId;
    private String rentalTypeName;

    public RentalType(String rentalTypeId, String rentalTypeName) {
        this.rentalTypeId = rentalTypeId;
        this.rentalTypeName = rentalTypeName;
    }

    public String getRentalTypeId() {
        return rentalTypeId;
    }

    public void setRentalTypeId(String rentalTypeId) {
        this.rentalTypeId = rentalTypeId;
    }

    public String getRentalTypeName() {
        return rentalTypeName;
    }

    public void setRentalTypeName(String rentalTypeName) {
        this.rentalTypeName = rentalTypeName;
    }
}
