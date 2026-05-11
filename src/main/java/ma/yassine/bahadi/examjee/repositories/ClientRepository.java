package ma.yassine.bahadi.examjee.repositories;

import ma.yassine.bahadi.examjee.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author pc
 **/
public interface ClientRepository extends JpaRepository<Client,Long> {
    Optional<Client> findByEmail(String email);
}
