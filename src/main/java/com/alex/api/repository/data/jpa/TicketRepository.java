package com.alex.api.repository.data.jpa;

import com.alex.api.entity.data.jpa.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends CrudRepository<Ticket,Integer> {
    List<Ticket> findAllByScenicPointContains(String scenicPoint);
}
