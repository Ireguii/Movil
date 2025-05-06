package dev.germantovar.springboot.controllers;


import dev.germantovar.springboot.entities.Usuario;
import dev.germantovar.springboot.repository.CustomerRepository;
import dev.germantovar.springboot.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private ICustomerService service;

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("lista")
    public List<Usuario> getAll() {return service.getAll();}

}
