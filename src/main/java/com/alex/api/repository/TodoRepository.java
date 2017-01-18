package com.alex.api.repository;

import com.alex.api.entity.Todo;
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