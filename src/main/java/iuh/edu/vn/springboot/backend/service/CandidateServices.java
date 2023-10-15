package iuh.edu.vn.springboot.backend.service;

import iuh.edu.vn.springboot.backend.entities.Candidate;
import iuh.edu.vn.springboot.backend.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class CandidateServices {
    @Autowired
    private CandidateRepository candidateRepository;

    public Page<Candidate> findAll(int pageNo, int pageSize, String sortBy,
                                   String sortDirection) {
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        return candidateRepository.findAll(pageable);//findFirst.../findTop...
    }
}
