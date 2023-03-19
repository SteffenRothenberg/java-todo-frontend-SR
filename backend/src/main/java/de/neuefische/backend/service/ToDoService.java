package de.neuefische.backend.service;

import de.neuefische.backend.repo.ToDoRepository;
import lombok.RequiredArgsConstructor;
import de.neuefische.backend.product.ToDo;
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
        return todoRepository.addTodo(newTodo);
    }

    public ToDo getToDoById(String id) {
        return todoRepository.getToDoById(id);
    }

    public ToDo changeToDoStatusById(ToDo todo, String id) {
        return todoRepository.changeToDoStatusById(todo, id);
    }

    public ToDo deleteToDoById(String id) {
        return todoRepository.deleteToDoById(id);
    }
}
