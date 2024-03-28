package com.cbre.loanapplication.service;


import com.cbre.loanapplication.entity.Application;
import com.cbre.loanapplication.entity.HomeLoanDTO;

public interface ILoanService {
    HomeLoanDTO calculateLoan(Application application);
}
