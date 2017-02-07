package com.alex.api.service.impl;

import com.alex.api.entity.data.jpa.Ticket;
import com.alex.api.repository.data.jpa.TicketRepository;
import com.alex.api.service.POIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Function:POI服务实现类
 *
 * @author Alex
 * @date 2017/2/7
 */
@Repository
public class POIServiceImpl implements POIService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> count(String name) {
        return ticketRepository.findAllByScenicPointContains(name);
    }

}
