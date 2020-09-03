package fr.semifir.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Ticket {

	@Id
	private String id;
	
	@DBRef
	private Seance seance;
	
	public Ticket() {
		
	}

	public Ticket(String id, Seance seance) {
		super();
		this.id = id;
		this.seance = seance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Seance getSeance() {
		return seance;
	}

	public void setSeance(Seance seance) {
		this.seance = seance;
	}
}
