package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Usuario;

import java.util.List;

public interface ICustomerService {
    List<Usuario> getAll();

}

