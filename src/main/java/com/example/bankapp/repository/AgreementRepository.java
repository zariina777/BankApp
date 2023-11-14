package com.example.bankapp.repository;

import com.example.bankapp.entities.Agreement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgreementRepository  extends JpaRepository<Agreement, String> {
}
