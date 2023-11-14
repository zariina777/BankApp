package com.example.bankapp.service.serviceImpl;

import com.example.bankapp.DTO.ManagerDTO;
import lombok.RequiredArgsConstructor;
import com.example.bankapp.mapper.ManagerMapper;
import org.springframework.stereotype.Service;
import com.example.bankapp.repository.ManagerRepository;
import com.example.bankapp.service.ManagerService;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService {
    private final ManagerRepository managerRepository;
    private final ManagerMapper managerMapper;

    @Override
    public ManagerDTO getManagerById(UUID id) {
        return null;
    }

    @Override
    public ManagerDTO createManager(ManagerDTO managerDTO) {
        return null;
    }

    @Override
    public void deleteManagerById(UUID uuid) {

    }
}
