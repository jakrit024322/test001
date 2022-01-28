package nvc.it.test0001.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.it.test0001.model.Customer;
import nvc.it.test0001.repository.CustomerRepository;

@Service
public class CustomerService {
    
    @Autowired
    CustomerRepository customerRepository;

    // Gat All Customer 
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    // Get Customer By Id
    public Customer getById(int id){
        return customerRepository.getById(id);
    }

}
