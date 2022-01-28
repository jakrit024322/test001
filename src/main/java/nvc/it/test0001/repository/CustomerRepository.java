package nvc.it.test0001.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.test0001.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{
    
}
