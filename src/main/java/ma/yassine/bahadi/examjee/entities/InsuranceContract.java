package ma.yassine.bahadi.examjee.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import ma.yassine.bahadi.examjee.enums.ContractStatus;

import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "contract_type")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class InsuranceContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate subscriptionDate;

    @Enumerated(EnumType.STRING)
    private ContractStatus status;

    private LocalDate validationDate;

    private double contributionAmount;

    private int duration;

    private double coverageRate;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "contract")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Payment> payments;
}