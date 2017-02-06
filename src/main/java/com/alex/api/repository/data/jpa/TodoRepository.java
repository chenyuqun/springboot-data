package com.alex.api.repository.data.jpa;

import com.alex.api.entity.data.jpa.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long>{

     List<Todo> findAll();
     Todo findOne(Long id);
     Todo save(Todo todo);
     void delete(Long id);

}