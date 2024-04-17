package com.RestApiDemo.TodoApi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {

    private static List<Todo> todolist;


    public TodoController(){
        todolist=new ArrayList<>();
        todolist.add(new Todo(1,"Todo 1",1,false));
        todolist.add(new Todo(2,"Todo 2",2,true));
    }

    @GetMapping
    public List<Todo> getTodos(){
        return todolist;
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo newTodo){
            todolist.add(newTodo);
            return newTodo;
    }
    @GetMapping("/{todoid}")
    public ResponseEntity<Todo> getTodoById(@PathVariable int todoid){
        for(Todo t:todolist){
            if(t.getId()==todoid){
                return ResponseEntity.ok(t);
            }
        }
        return ResponseEntity.notFound().build();
    }
}
