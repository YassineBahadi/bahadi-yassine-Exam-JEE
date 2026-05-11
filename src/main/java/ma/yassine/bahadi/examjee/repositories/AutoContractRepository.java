package ma.yassine.bahadi.examjee.repositories;

import ma.yassine.bahadi.examjee.entities.AutoContract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author pc
 **/
public interface AutoContractRepository extends JpaRepository<AutoContract, Long> {
    List<AutoContract> findByVehicleBrand(String brand);
}
