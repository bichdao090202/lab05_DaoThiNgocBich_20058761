package iuh.edu.vn.springboot.backend.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "candidate_skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class CandidateSkill {
    private Short skillLevel;
    private String moreInfomation;
    @Id
    @ManyToOne()
    @JoinColumn(name = "candidate")
    private Candidate candidate;
    @Id
    @ManyToOne()
    @JoinColumn(name = "skill")
    private Skill skill;
}
