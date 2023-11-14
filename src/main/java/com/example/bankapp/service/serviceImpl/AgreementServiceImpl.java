package com.example.bankapp.service.serviceImpl;

import com.example.bankapp.DTO.AgreementDTO;
import com.example.bankapp.entities.Agreement;
import lombok.RequiredArgsConstructor;
import com.example.bankapp.mapper.AgreementMapper;
import org.springframework.stereotype.Service;
import com.example.bankapp.repository.AgreementRepository;
import com.example.bankapp.service.AgreementService;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AgreementServiceImpl implements AgreementService {
    private final AgreementRepository agreementRepository;
    private final AgreementMapper agreementMapper;

    @Override
    public AgreementDTO getAgreementById(UUID id) {
        return null;
    }

    @Override
    public AgreementDTO createNewAgreement(AgreementDTO agreementDTO) {
        return null;
    }

    @Override
    public List<Agreement> getAllAgreements() {
        return null;
    }

    @Override
    public boolean deleteAgreement(UUID uuid) {
        return false;
    }
}
