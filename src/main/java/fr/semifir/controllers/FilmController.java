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

import fr.semifir.models.Film;
import fr.semifir.services.FilmService;

@RestController
@RequestMapping("films")
public class FilmController {

	@Autowired
	private FilmService service;
	
	@GetMapping()
	public Iterable<Film> findAll() {
		return this.service.trouverTout();
	}
	
	@GetMapping("/{id}")
	public Optional<Film> findById(@PathVariable String id) {
		return this.service.trouverParId(id);
	}
	
	@PostMapping()
	public void save(@RequestBody Film film) {
		this.service.ajouter(film);
	}
	
	@DeleteMapping()
	public void delete(@RequestBody Film film) {
		this.service.supprimer(film);
	}
	
	@PutMapping()
	public void update(@RequestBody Film film) {
		this.service.modifier(film);
	}
}
