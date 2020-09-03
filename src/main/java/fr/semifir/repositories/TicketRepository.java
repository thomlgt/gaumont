package fr.semifir.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.semifir.models.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String>{

}
