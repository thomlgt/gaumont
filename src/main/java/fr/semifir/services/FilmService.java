package fr.semifir.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.semifir.models.Film;
import fr.semifir.repositories.FilmRepository;

@Service
public class FilmService {

	@Autowired
	private FilmRepository repository;
	
	public Iterable<Film> trouverTout() {
		return this.repository.findAll();
	}
	
	public Optional<Film> trouverParId(String id) {
		return this.repository.findById(id);
	}
	
	public void ajouter(Film film) {
		this.repository.save(film);
	}
	
	public void supprimer(Film film) {
		this.repository.delete(film);
	}
	
	public void modifier(Film film) {
		this.repository.save(film);
	}
}
