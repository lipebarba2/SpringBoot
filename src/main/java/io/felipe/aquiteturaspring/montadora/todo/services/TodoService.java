package io.felipe.aquiteturaspring.montadora.todo.services;


import io.felipe.aquiteturaspring.montadora.todo.TodoRepository;
import io.felipe.aquiteturaspring.montadora.todo.entity.TodoEntity;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository todoRepository) {
        this.repository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity novoTodo) {
        return repository.save(novoTodo);
    }
}
