package fr.semifir.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.semifir.models.Seance;
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
	
	public String monTicket(String id) {
		//Set de result à null si l'id ne correspond pas à un ticket
		String result = "null";
		
		//Tenter de récupérer le ticket
		Optional<Ticket> optionalTicket = this.repository.findById(id);
		
		//Si le ticket est récupéré, traitement
		if(optionalTicket.isPresent()) {
			Ticket ticket = optionalTicket.get();
			Seance seance = ticket.getSeance();
			result = "Commande : " + ticket.getId() +
					"\nCinema : " + seance.getSalle().getCinema().getNom() +
					"\nFilm  : " + seance.getFilm().getNom() +
					"\nDate de début: " + seance.getDate() +
					"\nDate de fin: " + seance.getDate().plusMinutes(seance.getFilm().getDuree()) +
					"\nSalle : " + seance.getSalle().getNumero();
		}
		return result.toString();
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
