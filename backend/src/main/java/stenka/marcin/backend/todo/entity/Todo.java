package stenka.marcin.backend.todo.entity;

import java.util.Date;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class Todo {

    private int id;
    private String name;
    private String description;
    private String color;
    private Date date_deadline;

    @Override
    public String toString() {
        return "Todo {name = " + name + " description = " + description + " }";
    }
}

