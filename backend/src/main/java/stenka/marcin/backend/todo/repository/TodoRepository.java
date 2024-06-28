package stenka.marcin.backend.todo.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import stenka.marcin.backend.todo.model.Todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class TodoRepository {

    private final List<Todo> todos = new ArrayList<Todo>();

    public List<Todo> findAll() {
        return todos;
    }

    public Optional<Todo> findById(int id) {
        return todos.stream()
                .filter(todo -> todo.id() == id).findFirst();
    }

    @PostConstruct
    private void init() {
        todos.add(new Todo(1, "Test nazwy 1", "Test opisu 1", "red", new Date()));
        todos.add(new Todo(2, "Test nazwy 2", "Test opisu 2", "black", new Date()));
    }
}
