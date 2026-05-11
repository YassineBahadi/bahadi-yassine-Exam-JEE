package ma.yassine.bahadi.examjee.security.repositories;

import ma.yassine.bahadi.examjee.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author pc
 **/
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByUsername(String username);
}
