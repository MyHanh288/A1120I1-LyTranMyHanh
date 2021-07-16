package model;

public class DetailContract {
    private String detailContractId;
    private String accSerId;
    private int quantity;
    private Contract contract;

    public DetailContract(String detailContractId, String accSerId, int quantity, Contract contract) {
        this.detailContractId = detailContractId;
        this.accSerId = accSerId;
        this.quantity = quantity;
        this.contract = contract;
    }

    public String getDetailContractId() {
        return detailContractId;
    }

    public void setDetailContractId(String detailContractId) {
        this.detailContractId = detailContractId;
    }

    public String getAccSerId() {
        return accSerId;
    }

    public void setAccSerId(String accSerId) {
        this.accSerId = accSerId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
