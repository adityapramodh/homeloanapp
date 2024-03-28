package com.cbre.loanapplication.repository;

import com.cbre.loanapplication.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
