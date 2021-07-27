package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Trabajador;

public interface TrabajadorDao extends CrudRepository<Trabajador, Long> {

}
