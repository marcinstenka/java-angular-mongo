package stenka.marcin.backend.todo.entity;

import java.util.Date;

public class Todo {
    public Todo(int id, String name, String description, String color, Date dateDeadline) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.color = color;
        this.dateDeadline = dateDeadline;
    }

    public Todo() {
    }

    private int id;
    private String name;
    private String description;
    private String color;
    private Date dateDeadline;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDate_deadline() {
        return dateDeadline;
    }

    public void setDate_deadline(Date dateDeadline) {
        this.dateDeadline = dateDeadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Todo todo = (Todo) o;
        return id == todo.id && name.equals(todo.name) && description.equals(todo.description) && color.equals(todo.color) && dateDeadline.equals(todo.dateDeadline);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + dateDeadline.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Todo {id = " + id + ", name = " + name + ", description = " + description + " }";
    }
}

