package fr.semifir.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.semifir.models.Cinema;

public interface CinemaRepository extends MongoRepository<Cinema, String>{

}
