package com.cbre.loanapplication.entity;

import jakarta.persistence.*;

@Entity
@Table(name="applications")
public class Application {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name="full_name")
    private String fullName;
    @Column(name="property_address")
    private String propertyAddress;
    @Column(name="age")
    private int age;
    @Column(name="salary")
    private long salary;
    @Column(name="other_Loans")
    private long otherLoans;
    @Column(name = "required_loan_amount")
    private long requiredLoanAmount;
    @Column(name = "property_value")
    private long propertyValue;
    @Column(name="pan_card")
    private String panCard;
    @Column(name="cibil_score")
    private int cibilScore;
    @Column(name="loan_type")
    private String loanType;

    public Application(long Id, String fullName, String propertyAddress, int age, long salary, long otherLoans, long requiredLoanAmount, long propertyValue, String panCard, int cibilScore) {
        this.Id = Id;
        this.fullName = fullName;
        this.propertyAddress = propertyAddress;
        this.age = age;
        this.salary = salary;
        this.otherLoans = otherLoans;
        this.requiredLoanAmount = requiredLoanAmount;
        this.propertyValue = propertyValue;
        this.panCard = panCard;
        this.cibilScore = cibilScore;
    }

    public Application() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }
    public String getfullName() {
        return fullName;
    }
    public void setfullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getOtherLoans() {
        return otherLoans;
    }

    public void setOtherLoans(long otherLoans) {
        this.otherLoans = otherLoans;
    }

    public long getRequiredLoanAmount() {
        return requiredLoanAmount;
    }

    public void setRequiredLoanAmount(long requiredLoanAmount) {
        this.requiredLoanAmount = requiredLoanAmount;
    }

    public long getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(long propertyValue) {
        this.propertyValue = propertyValue;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public int getCibilScore() {
        return cibilScore;
    }

    public void setCibilScore(int cibilScore) {
        this.cibilScore = cibilScore;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }
}
