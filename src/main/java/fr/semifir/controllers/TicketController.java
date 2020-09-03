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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.semifir.models.Ticket;
import fr.semifir.services.TicketService;

@RestController
@RequestMapping("tickets")
public class TicketController {

	@Autowired
	private TicketService service;
	
	@GetMapping()
	public Iterable<Ticket> findAll() {
		return this.service.trouverTout();
	}
	
	@GetMapping("/{id}")
	public Optional<Ticket> findById(@RequestParam String id) {
		return this.service.trouverParId(id);
	}
	
	@GetMapping("/myticket/{id}")
	public String getMyTicket(@PathVariable String id) {
		return this.service.monTicket(id);
	}
	
	@PostMapping()
	public void save(@RequestBody Ticket ticket) {
		this.service.ajouter(ticket);
	}
	
	@DeleteMapping()
	public void delete(@RequestBody Ticket ticket) {
		this.service.supprimer(ticket);
	}
	
	@PutMapping()
	public void update(@RequestBody Ticket ticket) {
		this.service.modifier(ticket);
	}
}
