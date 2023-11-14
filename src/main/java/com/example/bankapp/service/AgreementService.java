package com.example.bankapp.service;

import com.example.bankapp.DTO.AgreementDTO;
import com.example.bankapp.entities.Agreement;

import java.util.List;
import java.util.UUID;

public interface AgreementService {
    AgreementDTO getAgreementById(UUID id);

    AgreementDTO createNewAgreement(AgreementDTO agreementDTO);

    List<Agreement> getAllAgreements();

    boolean deleteAgreement(UUID uuid);
}
