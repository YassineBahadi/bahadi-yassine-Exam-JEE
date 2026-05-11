package ma.yassine.bahadi.examjee;

import ma.yassine.bahadi.examjee.entities.*;
import ma.yassine.bahadi.examjee.enums.ContractStatus;
import ma.yassine.bahadi.examjee.enums.HealthCoverageLevel;
import ma.yassine.bahadi.examjee.enums.HousingType;
import ma.yassine.bahadi.examjee.enums.PaymentType;
import ma.yassine.bahadi.examjee.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

//import org.springframework.boot.security.autoconfigure.SecurityAutoConfiguration;
//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@SpringBootApplication()
public class ExamJeeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExamJeeApplication.class, args);
    }
    @Bean
    CommandLineRunner start(
            ClientRepository clientRepository,
            AutoContractRepository autoContractRepository,
            HomeContractRepository homeContractRepository,
            HealthContractRepository healthContractRepository,
            PaymentRepository paymentRepository
    ) {

        return args -> {

            Client client1 = Client.builder()
                    .name("Yassine Bahadi")
                    .email("yassine@gmail.com")
                    .build();

            Client client2 = Client.builder()
                    .name("Ahmed Alaoui")
                    .email("ahmed@gmail.com")
                    .build();

            clientRepository.save(client1);
            clientRepository.save(client2);


            AutoContract autoContract = new AutoContract();

            autoContract.setSubscriptionDate(LocalDate.now());
            autoContract.setStatus(ContractStatus.VALIDATED);
            autoContract.setValidationDate(LocalDate.now());
            autoContract.setContributionAmount(4500);
            autoContract.setDuration(12);
            autoContract.setCoverageRate(85);

            autoContract.setRegistrationNumber("AA-123-BB");
            autoContract.setVehicleBrand("BMW");
            autoContract.setVehicleModel("X6");

            autoContract.setClient(client1);

            autoContractRepository.save(autoContract);


            HomeContract homeContract = new HomeContract();

            homeContract.setSubscriptionDate(LocalDate.now());
            homeContract.setStatus(ContractStatus.IN_PROGRESS);
            homeContract.setContributionAmount(3000);
            homeContract.setDuration(24);
            homeContract.setCoverageRate(70);

            homeContract.setHousingType(HousingType.APARTMENT);
            homeContract.setAddress("Casablanca");
            homeContract.setArea(120);

            homeContract.setClient(client2);

            homeContractRepository.save(homeContract);


            HealthContract healthContract = new HealthContract();

            healthContract.setSubscriptionDate(LocalDate.now());
            healthContract.setStatus(ContractStatus.VALIDATED);
            healthContract.setValidationDate(LocalDate.now());
            healthContract.setContributionAmount(2500);
            healthContract.setDuration(12);
            healthContract.setCoverageRate(90);

            healthContract.setCoverageLevel(
                    HealthCoverageLevel.PREMIUM
            );

            healthContract.setCoveredPersons(4);

            healthContract.setClient(client1);

            healthContractRepository.save(healthContract);


            Payment payment1 = Payment.builder()
                    .paymentDate(LocalDate.now())
                    .amount(1500)
                    .paymentType(PaymentType.MONTHLY)
                    .contract(autoContract)
                    .build();

            Payment payment2 = Payment.builder()
                    .paymentDate(LocalDate.now())
                    .amount(2500)
                    .paymentType(PaymentType.ANNUAL)
                    .contract(healthContract)
                    .build();

            paymentRepository.save(payment1);
            paymentRepository.save(payment2);

            System.out.println("========= CLIENTS =========");

            clientRepository.findAll().forEach(client -> {
                System.out.println(client.getName());
            });

            System.out.println("========= CONTRACTS =========");

            autoContractRepository.findAll().forEach(contract -> {
                System.out.println(contract.getVehicleBrand());
            });

            System.out.println("========= PAYMENTS =========");

            paymentRepository.findAll().forEach(payment -> {
                System.out.println(payment.getAmount());
            });

        };
    }


}
