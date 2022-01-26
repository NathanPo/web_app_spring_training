package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/todo")
public class TodoListController {
    private final TodoRepository repository;

    public TodoListController(TodoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public TodoEntity addTodo(@RequestBody TodoEntity todo) {
        return this.repository.save(todo);
    }

    @GetMapping
    public Iterable<TodoEntity> getTodoList() {
        return this.repository.findAll();
    }
}
