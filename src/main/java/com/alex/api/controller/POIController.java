package com.alex.api.controller;

import com.alex.api.entity.data.jpa.Request;
import com.alex.api.entity.data.jpa.Ticket;
import com.alex.api.repository.data.jpa.TicketRepository;
import com.alex.api.service.POIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Function:POI控制器
 *
 * @author Alex
 * @date 2017/2/7
 */
@RestController
@RequestMapping("/api/poi")
public class POIController {
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private POIService poiService;

    @GetMapping("/find")
    public List<Ticket> getRequest(@RequestParam String name){
        //List<Ticket> ticketList=ticketRepository.findAllByScenicPointContains(name);
        return poiService.count(name);
    }

}
