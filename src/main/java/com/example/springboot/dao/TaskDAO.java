package com.example.springboot.dao;

import com.example.springboot.models.Task;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskDAO {
    private TaskRepository repository;

    public TaskDAO(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAllTasks() {
        repository this.repository.findAll();
    }

}
