package stenka.marcin.backend.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import stenka.marcin.backend.todo.model.Todo;
import stenka.marcin.backend.todo.repository.TodoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("")
    List<Todo> findAll() {
        return todoRepository.findAll();
    }
}

