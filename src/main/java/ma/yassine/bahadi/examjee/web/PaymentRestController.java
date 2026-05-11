package ma.yassine.bahadi.examjee.web;

import lombok.RequiredArgsConstructor;
import ma.yassine.bahadi.examjee.dtos.PaymentDTO;
import ma.yassine.bahadi.examjee.services.interfaces.InsuranceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author pc
 **/
@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
@CrossOrigin("*")
public class PaymentRestController {
    private final InsuranceService insuranceService;

    @GetMapping
    public List<PaymentDTO> getPayments() {

        return insuranceService.getAllPayments();
    }

    @PostMapping
    public PaymentDTO savePayment(
            @RequestBody PaymentDTO paymentDTO
    ) {

        return insuranceService.savePayment(paymentDTO);
    }
}
