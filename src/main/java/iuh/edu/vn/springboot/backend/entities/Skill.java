package iuh.edu.vn.springboot.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Skill {
    @Id
    private long id;
    private String skillName;
    private String skillDescription;
    private Short type;
}
