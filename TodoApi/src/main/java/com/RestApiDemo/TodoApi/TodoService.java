package com.RestApiDemo.TodoApi;

import org.springframework.stereotype.Component;

@Component
//annotated the class with @component to be handled by spring. spring handles all classess which are anotated by @component
public class TodoService {

    public String doSomething(){
        return "something";
    }
}
