package me.nagesh.controllers;

import me.nagesh.entities.Task;
import me.nagesh.services.TaskService;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lakinep on 7/3/17.
 */
@RestController
public class TaskRestController {

   @Autowired
   private TaskService taskService;

    @RequestMapping("/")
    public String greeting() {
        LogFactory.getLog(getClass()).info("In getAllTasks");
        return "Welcome to Eisenhower Box Service";
    }

    @RequestMapping("/tasks")
    public List<Task> getAllTask() {
        LogFactory.getLog(getClass()).info("In getAllTasks");
        List<Task> allTasks = taskService.getAllTasks();
        allTasks.forEach(a -> LogFactory.getLog(getClass()).info(a.toString()));
        return allTasks;
    }
}
