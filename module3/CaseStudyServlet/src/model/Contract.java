package model;

public class Contract {
    private String contractId;
    private String beginDay;
    private String finishDay;
    private int deposit;
    private int totalPayment;
    private Employee employee;
    private Customer customer;
    private Service service;

    public Contract(String contractId, String beginDay, String finishDay, int deposit, int totalPayment, Employee employee, Customer customer, Service service) {
        this.contractId = contractId;
        this.beginDay = beginDay;
        this.finishDay = finishDay;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
        this.employee = employee;
        this.customer = customer;
        this.service = service;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getBeginDay() {
        return beginDay;
    }

    public void setBeginDay(String beginDay) {
        this.beginDay = beginDay;
    }

    public String getFinishDay() {
        return finishDay;
    }

    public void setFinishDay(String finishDay) {
        this.finishDay = finishDay;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
