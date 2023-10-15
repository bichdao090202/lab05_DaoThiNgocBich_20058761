package iuh.edu.vn.springboot;

import com.neovisionaries.i18n.CountryCode;
import iuh.edu.vn.springboot.backend.entities.Address;
import iuh.edu.vn.springboot.backend.entities.Candidate;
import iuh.edu.vn.springboot.backend.repositories.AddressRepository;
import iuh.edu.vn.springboot.backend.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
public class Application {
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private CandidateRepository candidateRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner testAddress(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Random rnd =new Random();
                for (int i = 1; i < 100; i++) {
                    Address add = new Address("Quang Trung","HCM",CountryCode.VN,rnd.nextInt(1,1000)+"",
                            rnd.nextInt(70000,80000)+"" );
                    addressRepository.save(add);
                    Candidate can=new Candidate(
                            LocalDate.now().atStartOfDay(),"email_"+i+"@gmail.com", "Name #"+i,rnd.nextLong(1111111111L,9999999999L)+"",add);
                    candidateRepository.save(can);
                    System.out.println("Added: " +can);
                }
            }
        };
    }

}
