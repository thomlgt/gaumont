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

import fr.semifir.models.Salle;
import fr.semifir.services.SalleService;

@RestController
@RequestMapping("salles")
public class SalleController {

	@Autowired
	private SalleService service;
	
	@GetMapping()
	public Iterable<Salle> findAll() {
		return this.service.trouverTout();
	}
	
	@GetMapping("/{id}")
	public Optional<Salle> findById(@PathVariable String id) {
		return this.service.trouverParId(id);
	}
	
	@PostMapping()
	public void save(@RequestBody Salle salle) {
		this.service.ajouter(salle);
	}
	
	@DeleteMapping()
	public void delete(@RequestBody Salle salle) {
		this.service.supprimer(salle);
	}
	
	@PutMapping()
	public void update(@RequestBody Salle salle) {
		this.service.modifier(salle);
	}
}
