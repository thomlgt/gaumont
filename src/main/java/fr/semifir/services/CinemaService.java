package fr.semifir.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.semifir.models.Cinema;
import fr.semifir.repositories.CinemaRepository;

@Service
public class CinemaService {
	
	@Autowired
	private CinemaRepository repository;
	
	public Iterable<Cinema> trouverTout() {
		return this.repository.findAll();
	}
	
	public Optional<Cinema> trouverParId(String id) {
		return this.repository.findById(id);
	}
	
	public void ajouter(Cinema cinema) {
		this.repository.save(cinema);
	}
	
	public void supprimmer(Cinema cinema) {
		this.repository.delete(cinema);
	}
	
	public void modifier(Cinema cinema) {
		this.repository.save(cinema);
	}

}
