package ma.yassine.bahadi.examjee.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.yassine.bahadi.examjee.enums.HousingType;

@Entity
@DiscriminatorValue("HOME")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HomeContract extends InsuranceContract {

    @Enumerated(EnumType.STRING)
    private HousingType housingType;

    private String address;

    private double area;
}