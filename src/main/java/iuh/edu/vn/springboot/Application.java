package iuh.edu.vn.springboot;

import ch.qos.logback.core.net.SyslogOutputStream;
import iuh.edu.vn.springboot.entities.Address;
import iuh.edu.vn.springboot.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    @Autowired
    private AddressRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner testAddress(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Address address = new Address();
                address.setId(1);
                repository.save(address);
                System.out.println("address = " + repository.findById(1L));

            }
        };
    }

}
