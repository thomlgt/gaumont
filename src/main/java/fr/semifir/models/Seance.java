package fr.semifir.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Seance {

	@Id
	private String id;
	
	@DBRef
	private Film film;
	
	@DBRef
	private Salle salle;
	
	private Date date;
	
	public Seance() {
		
	}

	public Seance(String id, Film film, Salle salle, Date date) {
		super();
		this.id = id;
		this.salle = salle;
		this.film = film;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Date getDate() {
		return date;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
