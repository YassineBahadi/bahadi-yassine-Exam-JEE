package ma.yassine.bahadi.examjee.security.repositories;

import ma.yassine.bahadi.examjee.security.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author pc
 **/
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    Optional<RoleEntity> findByRoleName(String roleName);

}
