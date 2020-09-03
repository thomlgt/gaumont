package fr.semifir.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.semifir.models.Cinema;
import fr.semifir.services.CinemaService;

@RestController
@RequestMapping("cinemas")
public class CinemaController {

	@Autowired
	private CinemaService service;
	
	@GetMapping()
	public Iterable<Cinema> findAll() {
		return this.service.trouverTout();
	}
	
	@GetMapping("/{id}")
	public Optional<Cinema> findById(@PathVariable String id) {
		return this.service.trouverParId(id);
	}
	
	@PostMapping()
	public void save(@RequestBody Cinema cinema) {
		this.service.ajouter(cinema);
	}
	
	@DeleteMapping()
	public void delete(@RequestBody Cinema cinema) {
		this.service.supprimmer(cinema);
	}
	
	@PutMapping()
	public void update(@RequestBody Cinema cinema) {
		this.service.modifier(cinema);
	}
}
