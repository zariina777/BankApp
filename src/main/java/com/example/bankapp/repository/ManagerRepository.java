package com.example.bankapp.repository;

import com.example.bankapp.entities.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository  extends JpaRepository<Manager, String> {
}
