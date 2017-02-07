package com.alex.api.service;

import com.alex.api.entity.data.jpa.Ticket;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * Function:景点服务类
 *
 * @author Alex
 * @date 2017/2/7
 */
public interface POIService {
    List<Ticket> count(String name);
}
