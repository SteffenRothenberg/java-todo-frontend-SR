package de.neuefische.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ToDoService {
    private final ToDoRepository todoRepository;

    public List<ToDo> listTodos() {
        return todoRepository.list();
    }

    public ToDo addTodo(ToDo toDo) {
        String id = UUID.randomUUID().toString();
        ToDo newTodo = new ToDo(id, toDo.description(), toDo.status());
        return todoRepository.add(newTodo);
    }

    public ToDo getToDoById(String id) {
       return todoRepository.getToDoById(id);
    }

    public ToDo changeToDoStatusById(ToDo todo, String id) {
        return todoRepository.changeToDoStatusById(todo, id);
    }
}
