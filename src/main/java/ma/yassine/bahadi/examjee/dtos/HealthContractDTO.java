package ma.yassine.bahadi.examjee.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.yassine.bahadi.examjee.enums.HealthCoverageLevel;

/**
 * @author pc
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HealthContractDTO extends InsuranceContractDTO {
    private HealthCoverageLevel coverageLevel;

    private int coveredPersons;
}
