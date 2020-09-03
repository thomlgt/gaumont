package fr.semifir.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.semifir.models.Salle;

public interface SalleRepository extends MongoRepository<Salle, String>{

}
