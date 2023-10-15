package iuh.edu.vn.springboot.backend.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime dob;
    private String email;
    private  String fullName;
    private  String phone;
    @ManyToOne()
    @JoinColumn(name = "address")
    private  Address address;

    public Candidate(long id) {
        this.id = id;
    }

    public Candidate(LocalDateTime dob, String email, String fullName, String phone, Address address) {
        this.dob = dob;
        this.email = email;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
    }

}