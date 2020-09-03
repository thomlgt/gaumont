package fr.semifir.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.semifir.models.Ticket;
import fr.semifir.repositories.TicketRepository;

@Service
public class TicketService {

	@Autowired
	private TicketRepository repository;
	
	public Iterable<Ticket> trouverTout() {
		return this.repository.findAll();
	}
	
	public Optional<Ticket> trouverParId(String id) {
		return this.repository.findById(id);
	}
	
	public void ajouter(Ticket ticket) {
		this.repository.save(ticket);
	}
	
	public void supprimer(Ticket ticket) {
		this.repository.delete(ticket);
	}
	
	public void modifier(Ticket ticket) {
		this.repository.save(ticket);
	}
	
	
}
