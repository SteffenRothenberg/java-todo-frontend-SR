package de.neuefische.backend.repo;

import de.neuefische.backend.product.ToDo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class ToDoRepository {
    private final Map<String, ToDo> todos;

    public ToDoRepository() {

        todos = new HashMap<>();
    }
    public List<ToDo> list() {
        return new ArrayList<>(todos.values());
    }

    public ToDo get(String id) {
        return todos.get(id);
    }
    public ToDo addTodo(ToDo todo){
        todos.put(todo.id(), todo);
        return todo;
    }

    public ToDo getToDoById(String id) {
    return todos.get(id);
    }

    public ToDo changeToDoStatusById(ToDo todo, String id) {
        todos.put(id, todo);
        return todos.get(id);
    }

    public ToDo deleteToDoById(String id) {
        todos.remove (id);
        return null;
    }
}
