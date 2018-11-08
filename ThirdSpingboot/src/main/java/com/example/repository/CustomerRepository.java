package com.example.repository;

import com.example.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


@Repository
public class CustomerRepository {
    private  final ConcurrentHashMap<Integer, Customer> concurrentHashMap = new ConcurrentHashMap<>();

    public List<Customer> findAll(){
        return new ArrayList<> (concurrentHashMap.values());
    }

    public Customer findOne(Integer id){
         return concurrentHashMap.get(id);
    }

    public Customer save(Customer customer){
        return concurrentHashMap.put(customer.getId(),customer);
    }

    public void delete(Integer id){
        concurrentHashMap.remove(id);
    }
}
