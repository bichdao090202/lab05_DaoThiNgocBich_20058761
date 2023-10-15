package iuh.edu.vn.springboot.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Job {
    @Id
    private long id;
    private String jobDescription;
    private String jobName;
    @ManyToOne()
    @JoinColumn(name = "company")
    private Company company;
}
