package tech.getarrays.bankmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.bankmanager.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
}
