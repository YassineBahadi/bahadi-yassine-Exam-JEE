package ma.yassine.bahadi.examjee.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.yassine.bahadi.examjee.enums.HousingType;

/**
 * @author pc
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HomeContractDTO extends InsuranceContractDTO {
    private HousingType housingType;

    private String address;

    private double area;
}
