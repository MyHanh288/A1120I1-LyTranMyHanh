package com.example.demo.model.entity.customer;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @Column
    private String customerId;

    @Column
    private String customerName;

    @Column
//    nếu @Column mà chị ko đặt tên thì ko cần @Column á chị.hấn ko bắt buộc ấy

    private String dateOfBirth;

    @Column
    private int gender;

    @Column
    private int idCard;

    @Column
    private String telNum;

    @Column
    private String email;

    @Column
    private String address;


    @ManyToOne
    @JoinColumn(name = "customerTypeId", referencedColumnName = "customerTypeId")
    private CustomerType customerType;

    public Customer() {
    }

    public Customer(String customerId, String customerName, String dateOfBirth, int gender, int idCard, String telNum, String email, String address, CustomerType customerType) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.telNum = telNum;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
