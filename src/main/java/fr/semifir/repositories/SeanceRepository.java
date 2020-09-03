package fr.semifir.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.semifir.models.Seance;

public interface SeanceRepository extends MongoRepository<Seance, String>{

}
