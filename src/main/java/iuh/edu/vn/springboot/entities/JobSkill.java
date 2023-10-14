package iuh.edu.vn.springboot.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "job_skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class JobSkill {
    private String moreInformation;
    private Short skillLevel;
    @Id
    @ManyToOne()
    @JoinColumn(name = "job")
    private Job job;
    @Id
    @ManyToOne()
    @JoinColumn(name = "skill")
    private Skill skill;
}
