package service;

import DTO.AgreementDTO;
import entities.Agreement;

import java.util.List;
import java.util.UUID;

public interface AgreementService {
    AgreementDTO getAgreementById(UUID id);

    AgreementDTO createNewAgreement(AgreementDTO agreementDTO);

    List<Agreement> getAllAgreements();

    boolean deleteAgreement(UUID uuid);
}
