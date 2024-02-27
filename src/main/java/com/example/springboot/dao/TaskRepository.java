package com.example.springboot.dao;

import com.example.springboot.dao.TaskDAO;
import com.example.springboot.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends TaskDAO<Task,Long> {

}