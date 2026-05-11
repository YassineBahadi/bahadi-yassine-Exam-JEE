package ma.yassine.bahadi.examjee.repositories;

import ma.yassine.bahadi.examjee.entities.Payment;
import ma.yassine.bahadi.examjee.enums.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author pc
 **/
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByPaymentType(PaymentType paymentType);
}
