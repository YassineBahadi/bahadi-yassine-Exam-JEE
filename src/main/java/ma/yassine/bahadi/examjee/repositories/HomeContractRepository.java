package ma.yassine.bahadi.examjee.repositories;

import ma.yassine.bahadi.examjee.entities.HomeContract;
import ma.yassine.bahadi.examjee.enums.HousingType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author pc
 **/
public interface HomeContractRepository extends JpaRepository<HomeContract, Long> {
    List<HomeContract> findByHousingType(HousingType housingType);
}
