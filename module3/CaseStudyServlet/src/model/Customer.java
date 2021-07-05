package model;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerBir;
    private String gender;
    private int cusIdNum;
    private int cusTelNum;
    private String cusEmail;
    private String address;
    private CustomerType customerType;

    public Customer(int customerId, String customerName, String customerBir, String gender, int cusIdNum, int cusTelNum, String cusEmail, String address, CustomerType customerType) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerBir = customerBir;
        this.gender = gender;
        this.cusIdNum = cusIdNum;
        this.cusTelNum = cusTelNum;
        this.cusEmail = cusEmail;
        this.address = address;
        this.customerType = customerType;
    }

    public Customer(String customerName, String customerBir, String gender, int cusIdNum, int cusTelNum, String cusEmail, String address, CustomerType customerType) {
        this.customerName = customerName;
        this.customerBir = customerBir;
        this.gender = gender;
        this.cusIdNum = cusIdNum;
        this.cusTelNum = cusTelNum;
        this.cusEmail = cusEmail;
        this.address = address;
        this.customerType = customerType;
    }

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBir() {
        return customerBir;
    }

    public void setCustomerBir(String customerBir) {
        this.customerBir = customerBir;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCusIdNum() {
        return cusIdNum;
    }

    public void setCusIdNum(int cusIdNum) {
        this.cusIdNum = cusIdNum;
    }

    public int getCusTelNum() {
        return cusTelNum;
    }

    public void setCusTelNum(int cusTelNum) {
        this.cusTelNum = cusTelNum;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
