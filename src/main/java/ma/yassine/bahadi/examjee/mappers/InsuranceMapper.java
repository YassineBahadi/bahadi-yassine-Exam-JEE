package ma.yassine.bahadi.examjee.mappers;

import ma.yassine.bahadi.examjee.dtos.ClientDTO;
import ma.yassine.bahadi.examjee.dtos.PaymentDTO;
import ma.yassine.bahadi.examjee.entities.Client;
import ma.yassine.bahadi.examjee.entities.Payment;
import org.springframework.stereotype.Service;

/**
 * @author pc
 **/
@Service
public class InsuranceMapper {
    public ClientDTO fromClient(Client client) {

        return ClientDTO.builder()
                .id(client.getId())
                .name(client.getName())
                .email(client.getEmail())
                .build();
    }

    public Client fromClientDTO(ClientDTO dto) {

        return Client.builder()
                .id(dto.getId())
                .name(dto.getName())
                .email(dto.getEmail())
                .build();
    }


    public PaymentDTO fromPayment(Payment payment) {

        return PaymentDTO.builder()
                .id(payment.getId())
                .paymentDate(payment.getPaymentDate())
                .amount(payment.getAmount())
                .paymentType(payment.getPaymentType())
                .contractId(payment.getContract().getId())
                .build();
    }
}
