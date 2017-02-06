package com.alex.api.controller;

import java.util.List;

import javax.validation.Valid;

import com.alex.api.entity.data.jpa.Todo;
import com.alex.api.repository.data.jpa.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @RequestMapping(value="/get",method = RequestMethod.GET)
    public List<Todo>getAllTodos(){
        return todoRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Todo createTodo(@Valid @RequestBody Todo todo){
        return todoRepository.save(todo);
    }

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public ResponseEntity<Todo> findOne(@PathVariable("id") Long id){
        Todo todo = todoRepository.findOne(id);
        if(todo == null){
            return new ResponseEntity<Todo>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Todo>(todo,HttpStatus.OK);
    }

    @RequestMapping(value="{id}", method = RequestMethod.PUT)
    public ResponseEntity<Todo> updateTodo(@Valid @RequestBody Todo todo, @PathVariable("id") Long id){
        Todo todoDb = todoRepository.findOne(id);
        if(todoDb == null){
            return new ResponseEntity<Todo>(HttpStatus.NOT_FOUND);
        }
        else{
            todoDb.setTitle(todo.getTitle());
            todoDb.setCompleted(todo.getCompleted());
            todoDb = todoRepository.save(todoDb);
            return new ResponseEntity<Todo>(todoDb,HttpStatus.OK);
        }
    }

    @RequestMapping(value="{id}", method = RequestMethod.DELETE)
    public void deleteTodo(@PathVariable("id") Long id) {
        todoRepository.delete(id);
    }
}
