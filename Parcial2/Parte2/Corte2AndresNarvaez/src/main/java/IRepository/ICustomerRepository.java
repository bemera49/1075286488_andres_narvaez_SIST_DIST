package IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long>{

}
