package fr.semifir.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.semifir.models.Salle;
import fr.semifir.repositories.SalleRepository;

@Service
public class SalleService {

	@Autowired
	private SalleRepository repository;
	
	public Iterable<Salle> trouverTout() {
		return this.repository.findAll();
	}
	
	public Optional<Salle> trouverParId(String id) {
		return this.repository.findById(id);
	}
	
	public void ajouter(Salle salle) {
		this.repository.save(salle);
	}
	
	public void supprimer(Salle salle) {
		this.repository.delete(salle);
	}
	
	public void modifier(Salle salle) {
		this.repository.save(salle);
	}
}
