package com.cbre.loanapplication.service;

import com.cbre.loanapplication.entity.Application;
import com.cbre.loanapplication.entity.HomeLoanDTO;
import org.springframework.stereotype.Service;

@Service
public class FixedInterestLoanService implements ILoanService {
    private static final double EMI_PER_LAC = 650;
    private static final double LOAN_PERCENTAGE = 0.6;

    @Override
    public HomeLoanDTO calculateLoan(Application application) {
        double eligibleLoanAmount = application.getPropertyValue() * LOAN_PERCENTAGE;
        double netSalary = (double) application.getSalary()/2 - application.getOtherLoans();
        double netLoanAmount = netSalary > 0 ? (netSalary / EMI_PER_LAC) * 100000 : 0;
        double emi = netLoanAmount > 0 ? (netLoanAmount / 100000) * EMI_PER_LAC : 0;
        return new HomeLoanDTO(eligibleLoanAmount, netLoanAmount, emi);
    }
}
