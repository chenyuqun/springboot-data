package com.alex.api.repository.data.jpa;

import com.alex.api.entity.data.jpa.HotelDetail;
import org.springframework.data.repository.CrudRepository;

public interface HotelDetailRepository extends CrudRepository<HotelDetail,Integer> {
}
