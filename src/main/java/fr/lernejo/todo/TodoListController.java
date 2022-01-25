package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController()
@RequestMapping("/api/todo")
public class TodoListController {
    private ArrayList<Todo> todoList = new ArrayList<Todo>();

    @PostMapping
    public void addTodo(@RequestBody Todo todo) {
        this.todoList.add(todo);
    }

    @GetMapping
    public ArrayList<Todo> getTodoList() {
        return this.todoList;
    }
}
