package iuh.edu.vn.springboot.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Company {
    @Id
    @Column(name = "comp_id")
    private long id;
    private String about;
    private String email;
    private String companyName;
    private String phone;
    private String webUrl;
    @ManyToOne()
    @JoinColumn(name = "address")
    private Address address;

}
