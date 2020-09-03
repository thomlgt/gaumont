package fr.semifir.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cinema {
	
	@Id
	private String id;
	
	@DBRef
	private List<Salle> salles;
	
	private String name;
	
	public Cinema() {
		
	}

	public Cinema(String id, List<Salle> salles, String name) {
		super();
		this.id = id;
		this.salles = salles;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Salle> getSalles() {
		return salles;
	}

	public void setSalles(List<Salle> salles) {
		this.salles = salles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
