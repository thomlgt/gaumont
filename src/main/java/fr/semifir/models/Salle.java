package fr.semifir.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Salle {

	@Id
	private String id;
	
	@DBRef
	private List<Seance> seances;
	
	private int numero;
	private int nbplace;
	
	public Salle() {
		
	}

	public Salle(String id, List<Seance> seances, int numero, int nbplace) {
		super();
		this.id = id;
		this.seances = seances;
		this.numero = numero;
		this.nbplace = nbplace;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Seance> getSeances() {
		return seances;
	}

	public void setSeance(List<Seance> seances) {
		this.seances = seances;
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
