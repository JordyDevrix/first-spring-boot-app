package com.example.springboot.utils;

import com.example.springboot.dao.TaskRepository;
import com.example.springboot.models.Task;
import org.springframework.context.event.ContextRefreshedEvent;

public class Seeder {

    private TaskRepository taskRepository;

    public Seeder (TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void seed(ContextRefreshedEvent event) {
        this.seedTasks();
    }

    private void  seedTasks() {
        this.taskRepository.save(new Task("Angular videos kijken", "Week 1 en week 2"));
    }

}
