package fr.semifir.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Ticket {

	@Id
	private String id;
	
	@DBRef
	private Cinema cinema;
	
	@DBRef
	private Salle salle;
	
	@DBRef
	private Seance seance;
	
	public Ticket() {
		
	}

	public Ticket(String id, Cinema cinema, Salle salle, Seance seance) {
		super();
		this.id = id;
		this.cinema = cinema;
		this.salle = salle;
		this.seance = seance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Seance getSeance() {
		return seance;
	}

	public void setSeance(Seance seance) {
		this.seance = seance;
	}
}
