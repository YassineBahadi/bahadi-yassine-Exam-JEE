package ma.yassine.bahadi.examjee.services.implementations;

import lombok.AllArgsConstructor;
import ma.yassine.bahadi.examjee.dtos.ClientDTO;
import ma.yassine.bahadi.examjee.dtos.PaymentDTO;
import ma.yassine.bahadi.examjee.entities.Client;
import ma.yassine.bahadi.examjee.entities.InsuranceContract;
import ma.yassine.bahadi.examjee.entities.Payment;
import ma.yassine.bahadi.examjee.exceptions.ClientNotFoundException;
import ma.yassine.bahadi.examjee.mappers.InsuranceMapper;
import ma.yassine.bahadi.examjee.repositories.ClientRepository;
import ma.yassine.bahadi.examjee.repositories.InsuranceContractRepository;
import ma.yassine.bahadi.examjee.repositories.PaymentRepository;
import ma.yassine.bahadi.examjee.services.interfaces.InsuranceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pc
 **/
@Service
@AllArgsConstructor
public class InsuranceServiceImpl implements InsuranceService {
    private final ClientRepository clientRepository;

    private final PaymentRepository paymentRepository;

    private final InsuranceContractRepository contractRepository;

    private final InsuranceMapper mapper;


    @Override
    public ClientDTO saveClient(ClientDTO clientDTO) {

        Client client = mapper.fromClientDTO(clientDTO);

        Client savedClient = clientRepository.save(client);

        return mapper.fromClient(savedClient);
    }

    @Override
    public List<ClientDTO> getAllClients() {

        return clientRepository.findAll()
                .stream()
                .map(mapper::fromClient)
                .collect(Collectors.toList());
    }

    @Override
    public ClientDTO getClientById(Long id)
            throws ClientNotFoundException {

        Client client = clientRepository.findById(id)
                .orElseThrow(() ->
                        new ClientNotFoundException(
                                "Client not found"
                        )
                );

        return mapper.fromClient(client);
    }

    @Override
    public void deleteClient(Long id) {

        clientRepository.deleteById(id);
    }


    @Override
    public PaymentDTO savePayment(PaymentDTO paymentDTO) {

        InsuranceContract contract =
                contractRepository.findById(
                        paymentDTO.getContractId()
                ).orElseThrow();

        Payment payment = Payment.builder()
                .paymentDate(paymentDTO.getPaymentDate())
                .amount(paymentDTO.getAmount())
                .paymentType(paymentDTO.getPaymentType())
                .contract(contract)
                .build();

        Payment savedPayment =
                paymentRepository.save(payment);

        return mapper.fromPayment(savedPayment);
    }

    @Override
    public List<PaymentDTO> getAllPayments() {

        return paymentRepository.findAll()
                .stream()
                .map(mapper::fromPayment)
                .collect(Collectors.toList());
    }
}
