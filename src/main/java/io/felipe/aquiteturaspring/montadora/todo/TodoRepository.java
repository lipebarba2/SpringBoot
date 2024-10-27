package io.felipe.aquiteturaspring.montadora.todo;

import io.felipe.aquiteturaspring.montadora.todo.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
}
