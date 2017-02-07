package com.alex.api.controller;

import com.alex.api.repository.data.jpa.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
