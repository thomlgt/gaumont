package fr.semifir.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Salle {

	@Id
	private String id;
	
	@DBRef
	private Cinema cinema;
	
	private int numero;
	private int nbplace;
	
	public Salle() {
		
	}

	public Salle(String id, Cinema cinema, int numero, int nbplace) {
		super();
		this.id = id;
		this.cinema = cinema;
		this.numero = numero;
		this.nbplace = nbplace;
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNbplace() {
		return nbplace;
	}

	public void setNbplace(int nbplace) {
		this.nbplace = nbplace;
	}
	
	
}
