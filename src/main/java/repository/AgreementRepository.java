package repository;

import entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AgreementRepository  extends JpaRepository<Account, String> {
}
