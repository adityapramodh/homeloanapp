package com.cbre.loanapplication.entity;

public class HomeLoanDTO {
    private double eligibleLoanAmount;
    private double netLoanAmount;
    private double emi;

    public HomeLoanDTO(double eligibleLoanAmount, double netLoanAmount, double emi) {
        this.eligibleLoanAmount = eligibleLoanAmount;
        this.netLoanAmount = netLoanAmount;
        this.emi = emi;
    }

    public double getEligibleLoanAmount() {
        return eligibleLoanAmount;
    }

    public void setEligibleLoanAmount(double eligibleLoanAmount) {
        this.eligibleLoanAmount = eligibleLoanAmount;
    }

    public double getNetLoanAmount() {
        return netLoanAmount;
    }

    public void setNetLoanAmount(double netLoanAmount) {
        this.netLoanAmount = netLoanAmount;
    }

    public double getEmi() {
        return emi;
    }

    public void setEmi(double emi) {
        this.emi = emi;
    }

    @Override
    public String toString() {
        return " " + netLoanAmount;
    }
}
