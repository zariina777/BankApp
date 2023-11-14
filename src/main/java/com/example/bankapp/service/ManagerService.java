package com.example.bankapp.service;

import com.example.bankapp.DTO.ManagerDTO;

import java.util.UUID;

public interface ManagerService {
    ManagerDTO getManagerById(UUID id);

    ManagerDTO createManager(ManagerDTO managerDTO);

    void deleteManagerById(UUID uuid);
}
