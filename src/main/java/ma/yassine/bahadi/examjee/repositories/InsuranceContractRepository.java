package ma.yassine.bahadi.examjee.repositories;

import ma.yassine.bahadi.examjee.entities.InsuranceContract;
import ma.yassine.bahadi.examjee.enums.ContractStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author pc
 **/
public interface InsuranceContractRepository extends JpaRepository<InsuranceContract,Long> {
    List<InsuranceContract> findByStatus(ContractStatus status);
}
