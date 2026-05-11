package ma.yassine.bahadi.examjee.entities;


import jakarta.persistence.*;
import lombok.*;
import ma.yassine.bahadi.examjee.enums.PaymentType;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate paymentDate;

    private double amount;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @ManyToOne
    private InsuranceContract contract;
}