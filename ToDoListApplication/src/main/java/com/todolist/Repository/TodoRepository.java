package com.todolist.Repository;

import com.todolist.Model.TodoClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<TodoClass, Integer> {
    public List<TodoClass> findByUsername(String ravikrpatel);
}
