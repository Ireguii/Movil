package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Usuario;
import dev.germantovar.springboot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CustomerService implements ICustomerService{

    @Autowired
    private CustomerRepository repository;



    @Override
    public List<Usuario> getAll(){

        return (List<Usuario>) repository.findAll();
    }
}
