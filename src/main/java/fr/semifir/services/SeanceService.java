package fr.semifir.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.semifir.models.Seance;
import fr.semifir.repositories.SeanceRepository;

@Service
public class SeanceService {

	@Autowired
	private SeanceRepository repository;
	
	public Iterable<Seance> trouverTout() {
		return this.repository.findAll();
	}
	
	public Optional<Seance> trouverParId(String id) {
		return this.repository.findById(id);
	}
	
	public void ajouter(Seance seance) {
		this.repository.save(seance);
	}
	
	public void supprimer(Seance seance) {
		this.repository.delete(seance);
	}
	
	public void modifier(Seance seance) {
		this.repository.save(seance);
	}
}
