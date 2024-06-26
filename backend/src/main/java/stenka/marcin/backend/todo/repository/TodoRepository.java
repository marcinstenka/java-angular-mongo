package stenka.marcin.backend.todo.repository;

import org.springframework.stereotype.Repository;
import stenka.marcin.backend.todo.model.Todo;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {

    private List<Todo> todos = new ArrayList<Todo>();

}
