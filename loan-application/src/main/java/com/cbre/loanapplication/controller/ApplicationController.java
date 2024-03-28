package com.cbre.loanapplication.controller;

import com.cbre.loanapplication.entity.Application;
import com.cbre.loanapplication.entity.HomeLoanDTO;
import com.cbre.loanapplication.exception.ResourceNotFoundException;
import com.cbre.loanapplication.repository.ApplicationRepository;
import com.cbre.loanapplication.service.FixedInterestLoanService;
import com.cbre.loanapplication.service.VariableInterestLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/applications")
public class ApplicationController {
    @Autowired
    private ApplicationRepository applicationRepository;
    @Autowired
    private FixedInterestLoanService fixedInterestLoanService;
    @Autowired
    private VariableInterestLoanService variableInterestLoanService;

    @GetMapping
    public List<Application> getAllApplications(){return applicationRepository.findAll();}

    @GetMapping("/{id}/loan-info")
    public HomeLoanDTO getLoanInfo(@PathVariable long id) {
        Application application = applicationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Application not found: " + id));

        if ("FixedInterestLoan".equals(application.getLoanType())) {
            return fixedInterestLoanService.calculateLoan(application);
        } else if ("VariableInterestLoan".equals(application.getLoanType())) {
            return variableInterestLoanService.calculateLoan(application);
        } else {
            throw new IllegalArgumentException("Unknown loan type: " + application.getLoanType());
        }
    }

    @PostMapping
    public Application createApplication(@RequestBody Application application){ return (applicationRepository.save(application));}

    //Update Application
    @PutMapping
    public ResponseEntity<Application> getApplicationById(@PathVariable long Id,
                                                          @RequestBody Application applicationDetails){
        Application updatedApplication = applicationRepository.findById(Id)
                .orElseThrow(() -> new ResourceNotFoundException("Id Doesn't Exist: " + Id));

        updatedApplication.setfullName(applicationDetails.getfullName());
        updatedApplication.setPropertyAddress(applicationDetails.getPropertyAddress());
        updatedApplication.setAge(applicationDetails.getAge());
        updatedApplication.setSalary(applicationDetails.getSalary());
        updatedApplication.setOtherLoans(applicationDetails.getOtherLoans());
        updatedApplication.setRequiredLoanAmount(applicationDetails.getRequiredLoanAmount());
        updatedApplication.setPropertyValue(applicationDetails.getPropertyValue());
        updatedApplication.setPanCard(applicationDetails.getPanCard());
        updatedApplication.setCibilScore(applicationDetails.getCibilScore());

        return ResponseEntity.ok(updatedApplication);
    }

    //Delete Application
    @DeleteMapping("{Id}")
    public ResponseEntity<HttpStatus> deleteApplications(@PathVariable long Id){
        Application application = applicationRepository.findById(Id)
                .orElseThrow(()-> new ResourceNotFoundException("Id Doesn't Exist: " + Id));

        applicationRepository.delete(application);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
