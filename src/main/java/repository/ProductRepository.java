package repository;

import entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository  extends JpaRepository<Account, String> {
}
