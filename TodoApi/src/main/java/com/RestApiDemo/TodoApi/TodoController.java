package com.RestApiDemo.TodoApi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    private static List<Todo> todolist;


    public TodoController(){
        todolist=new ArrayList<>();
        todolist.add(new Todo(1,"Todo 1",1,false));
        todolist.add(new Todo(2,"Todo 2",2,true));
    }

    @GetMapping("/todos")
    public List<Todo> getTodos(){
        return todolist;
    }

    @PostMapping("/createTodo")
    public Todo createTodo(@RequestBody Todo newTodo){
            todolist.add(newTodo);
            return newTodo;
    }
    @GetMapping("/todos/{todoid}")
    public ResponseEntity<Todo> getTodoById(@PathVariable int todoid){
        for(Todo t:todolist){
            if(t.getId()==todoid){
                return ResponseEntity.ok(t);
            }
        }
        return ResponseEntity.notFound().build();
    }
}
