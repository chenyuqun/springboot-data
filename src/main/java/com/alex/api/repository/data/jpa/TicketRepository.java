package com.alex.api.repository.data.jpa;

import com.alex.api.entity.data.jpa.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<Ticket,Integer> {
}
