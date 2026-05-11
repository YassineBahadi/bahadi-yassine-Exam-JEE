package ma.yassine.bahadi.examjee.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("AUTO")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AutoContract extends InsuranceContract {

    private String registrationNumber;

    private String vehicleBrand;

    private String vehicleModel;
}