package me.nagesh.services;

import me.nagesh.entities.Task;
import me.nagesh.repos.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lakinep on 7/3/17.
 */
@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task getTask(long Id) {
        return taskRepository.findOne(Id);
    }

    public void addTask(Task task) {
        taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
