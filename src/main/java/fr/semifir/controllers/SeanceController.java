package fr.semifir.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.semifir.models.Seance;
import fr.semifir.services.SeanceService;

@RestController
@RequestMapping("seances")
public class SeanceController {

	@Autowired
	private SeanceService service;
	
	@GetMapping()
	public Iterable<Seance> findAll() {
		return this.service.trouverTout();
	}
	
	@GetMapping("/{id}")
	public Optional<Seance> findById(@RequestParam String id) {
		return this.service.trouverParId(id);
	}
	
	@PostMapping()
	public void save(@RequestBody Seance seance) {
		this.service.ajouter(seance);
	}
	
	@DeleteMapping()
	public void delete(@RequestBody Seance seance) {
		this.service.supprimer(seance);
	}
	
	@PutMapping()
	public void update(@RequestBody Seance seance) {
		this.service.modifier(seance);
	}
}
