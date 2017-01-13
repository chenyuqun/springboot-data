package com.alex.api.repository;

import com.alex.api.entity.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by alexchen on 2017/1/12.
 */
@Repository
public interface RequestRepository extends CrudRepository<Request,Long> {
    Request findOneByAccountSid(String accountSid);
}
