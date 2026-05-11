package ma.yassine.bahadi.examjee.dtos;

import lombok.*;

/**
 * @author pc
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AutoContractDTO extends InsuranceContractDTO  {
    private String registrationNumber;

    private String vehicleBrand;

    private String vehicleModel;
}
