package com.alex.api.repository;

import java.util.List;

import com.alex.api.entity.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long>{

    public List<Todo> findAll();
    public Todo findOne(Long id);
    public Todo save(Todo todo);
    public void delete(Long id);

}