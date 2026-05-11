package ma.yassine.bahadi.examjee.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.yassine.bahadi.examjee.enums.HealthCoverageLevel;

@Entity
@DiscriminatorValue("HEALTH")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HealthContract extends InsuranceContract {

    @Enumerated(EnumType.STRING)
    private HealthCoverageLevel coverageLevel;

    private int coveredPersons;
}