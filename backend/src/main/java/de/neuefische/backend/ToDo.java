package de.neuefische.backend;

public record ToDo (
        String id,
        String description,
        ToDoStatus status
){
}