package service.serviceImpl;

import DTO.AccountDTO;
import DTO.AgreementDTO;
import entities.Agreement;
import lombok.RequiredArgsConstructor;
import mapper.AccountMapper;
import mapper.AgreementMapper;
import org.springframework.stereotype.Service;
import repository.AccountRepository;
import repository.AgreementRepository;
import service.AgreementService;

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
