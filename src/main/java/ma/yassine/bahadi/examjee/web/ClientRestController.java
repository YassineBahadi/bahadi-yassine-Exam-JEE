package ma.yassine.bahadi.examjee.web;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import ma.yassine.bahadi.examjee.dtos.ClientDTO;
import ma.yassine.bahadi.examjee.exceptions.ClientNotFoundException;
import ma.yassine.bahadi.examjee.services.interfaces.InsuranceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author pc
 **/
@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ClientRestController {
    private final InsuranceService insuranceService;

    @GetMapping
    public List<ClientDTO> getClients() {

        return insuranceService.getAllClients();
    }


    @GetMapping("/{id}")
    public ClientDTO getClient(
            @PathVariable Long id
    ) throws ClientNotFoundException {

        return insuranceService.getClientById(id);
    }

    @PostMapping
    public ClientDTO saveClient(
            @Valid @RequestBody ClientDTO clientDTO
    ) {

        return insuranceService.saveClient(clientDTO);
    }


    @DeleteMapping("/{id}")
    public void deleteClient(
            @PathVariable Long id
    ) {

        insuranceService.deleteClient(id);
    }

}
