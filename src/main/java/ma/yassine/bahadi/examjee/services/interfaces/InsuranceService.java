package ma.yassine.bahadi.examjee.services.interfaces;

import ma.yassine.bahadi.examjee.dtos.ClientDTO;
import ma.yassine.bahadi.examjee.dtos.PaymentDTO;
import ma.yassine.bahadi.examjee.exceptions.ClientNotFoundException;

import java.util.List;

/**
 * @author pc
 **/
public interface InsuranceService {
    ClientDTO saveClient(ClientDTO clientDTO);

    List<ClientDTO> getAllClients();

    ClientDTO getClientById(Long id)
            throws ClientNotFoundException;

    void deleteClient(Long id);


    PaymentDTO savePayment(PaymentDTO paymentDTO);

    List<PaymentDTO> getAllPayments();
}
