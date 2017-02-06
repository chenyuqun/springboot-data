package com.alex.api.repository.data.jpa;

import com.alex.api.entity.data.jpa.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by alexchen on 2017/1/12.
 */
@Repository
public interface RequestRepository extends CrudRepository<Request,Long> {
    Request findOneByAccountSid(String accountSid);
}
