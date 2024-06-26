package stenka.marcin.backend.todo.model;

import java.util.Date;

public record Todo(int id, String name, String description, String color, Date dateDeadline) {

}

