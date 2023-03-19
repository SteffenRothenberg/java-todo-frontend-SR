package de.neuefische.backend.controller;

import de.neuefische.backend.product.ToDo;
import de.neuefische.backend.service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
@RequiredArgsConstructor
public class ToDoController {
    private final ToDoService todoService;

    @GetMapping
    public List<ToDo> getTodos() {
        return todoService.listTodos();
    }
    @PostMapping
    public ToDo addTodo(@RequestBody ToDo toDo) {
        return todoService.addTodo(toDo);
    }
    @GetMapping("/{id}")
    public ToDo getToDoById(@PathVariable String id){
        return todoService.getToDoById(id);
    }
    @PutMapping("/{id}")
    public ToDo changeToDoStatusById(@RequestBody ToDo todo, @PathVariable String id){
        return todoService.changeToDoStatusById(todo,id);
    }
    @DeleteMapping("/{id}")
    public ToDo deleteToDoById(@PathVariable String id){
        return todoService.deleteToDoById(id);
    }
}
