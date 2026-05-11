package ma.yassine.bahadi.examjee.repositories;

import ma.yassine.bahadi.examjee.entities.HealthContract;
import ma.yassine.bahadi.examjee.enums.HealthCoverageLevel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author pc
 **/
public interface HealthContractRepository extends JpaRepository<HealthContract, Long> {
    List<HealthContract> findByCoverageLevel(
            HealthCoverageLevel coverageLevel
    );
}
