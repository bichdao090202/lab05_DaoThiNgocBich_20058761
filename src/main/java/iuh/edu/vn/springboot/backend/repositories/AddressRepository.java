package iuh.edu.vn.springboot.backend.repositories;

import iuh.edu.vn.springboot.backend.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends JpaRepository<Address,Long>, CrudRepository<Address,Long> {

}
