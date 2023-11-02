package service.serviceImpl;

import DTO.ManagerDTO;
import lombok.RequiredArgsConstructor;
import mapper.ManagerMapper;
import org.springframework.stereotype.Service;
import repository.ManagerRepository;
import service.ManagerService;

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
