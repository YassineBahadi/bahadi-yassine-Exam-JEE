package ma.yassine.bahadi.examjee.dtos;

import lombok.*;
import ma.yassine.bahadi.examjee.enums.HousingType;

/**
 * @author pc
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class HomeContractDTO extends InsuranceContractDTO {
    private HousingType housingType;

    private String address;

    private double area;
}
