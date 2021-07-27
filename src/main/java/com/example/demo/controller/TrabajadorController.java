package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TrabajadorDao;
import com.example.demo.entity.Trabajador;

@RestController
public class TrabajadorController {

	@Autowired
	TrabajadorDao trabajadorDao;

	@GetMapping("/trabajadores")
	public Iterable<Trabajador> obtenerTrabajadores() {
		return trabajadorDao.findAll();
	}

	@PostMapping()
	public Trabajador guardarTrabajador(@RequestBody Trabajador t) {
		return trabajadorDao.save(t);
	}

	@PutMapping()
	public Trabajador actualizarTrabajador(@RequestBody Trabajador t) {
		return trabajadorDao.save(t);
	}

	@DeleteMapping(path = "/{id}")
	public boolean eliminarTrabajador(@PathVariable("id") Long id) {
		try {
			trabajadorDao.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@GetMapping(path="/{id}")
	public Optional<Trabajador> obtenerTrabajador(@PathVariable("id")Long id) {
		return trabajadorDao.findById(id);
	}
	
}