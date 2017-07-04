package me.nagesh;

import me.nagesh.entities.Task;
import me.nagesh.repos.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



    @Bean
    CommandLineRunner init(TaskRepository taskRepository) {
		return args -> {
			taskRepository.save(new Task("Task1", "This is task1 desription", new Date()));
			taskRepository.save(new Task("Task2", "This is task2 desription", new Date()));
		};
	}

}
