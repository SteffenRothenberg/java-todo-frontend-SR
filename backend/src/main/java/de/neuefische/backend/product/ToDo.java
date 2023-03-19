package de.neuefische.backend.product;

public record ToDo (
        String id,
        String description,
        ToDoStatus status
){
    public ToDoStatus getStatus(){
        return status;
    }
}