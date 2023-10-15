package iuh.edu.vn.springboot.backend.entities;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String street;
    private String city;
//    private Country country;
    private CountryCode country;
    private String number;
    private String zipCode;


    public Address(String street, String city, CountryCode country, String number, String zipCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.number = number;
        this.zipCode = zipCode;
    }
}
