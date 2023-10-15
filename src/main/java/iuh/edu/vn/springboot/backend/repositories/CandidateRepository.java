package iuh.edu.vn.springboot.backend.repositories;

import iuh.edu.vn.springboot.backend.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long>, CrudRepository<Candidate,Long> {
}
