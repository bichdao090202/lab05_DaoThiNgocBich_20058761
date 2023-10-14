package iuh.edu.vn.springboot.repositories;

import iuh.edu.vn.springboot.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRopository extends JpaRepository<Candidate, Long> {

}
