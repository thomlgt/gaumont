package fr.semifir.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Film {
	
	@Id
	private String id;
	
	private String nom;
	
	private int duree;
	
	public Film() {
		
	}

	public Film(String id, String nom, int duree) {
		super();
		this.id = id;
		this.nom = nom;
		this.duree = duree;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	
}
