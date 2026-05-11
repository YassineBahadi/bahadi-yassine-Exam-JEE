package ma.yassine.bahadi.examjee.dtos;

import lombok.*;
import ma.yassine.bahadi.examjee.enums.PaymentType;

import java.time.LocalDate;

/**
 * @author pc
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PaymentDTO {
    private Long id;

    private LocalDate paymentDate;

    private double amount;

    private PaymentType paymentType;

    private Long contractId;
}
