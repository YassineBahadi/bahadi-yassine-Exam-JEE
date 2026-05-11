package ma.yassine.bahadi.examjee.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.yassine.bahadi.examjee.enums.ContractStatus;

import java.time.LocalDate;

/**
 * @author pc
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class InsuranceContractDTO {
    private Long id;

    private LocalDate subscriptionDate;

    private ContractStatus status;

    private LocalDate validationDate;

    private double contributionAmount;

    private int duration;

    private double coverageRate;

    private Long clientId;
}
