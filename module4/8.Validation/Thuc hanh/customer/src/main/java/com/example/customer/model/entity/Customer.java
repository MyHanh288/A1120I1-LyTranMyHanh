package com.example.customer.model.entity;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "customer")
public class Customer implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "format name")
    @Size(min = 5,max = 10,message = "5-10")
    private String name;
    @NotNull(message = "format phone")
    private String telNum;

    public Customer() {
    }

    public Customer(Integer id, String name, String telNum) {
        this.id = id;
        this.name = name;
        this.telNum = telNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer)target;
        if(!customer.getTelNum().matches("(03||05||07||08||09)+[0-9]{8,9}+")){
            errors.rejectValue("telNum",null,"So dien thoai bi sai");
        }

    }
}
