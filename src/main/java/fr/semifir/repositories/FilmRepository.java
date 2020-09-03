package fr.semifir.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.semifir.models.Film;

public interface FilmRepository extends MongoRepository<Film, String>{

}
